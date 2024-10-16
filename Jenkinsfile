pipeline {
    agent any

    environment {
        IMAGE_NAME = 'fcfb-deoxys'
        CONTAINER_NAME = 'FCFB-Deoxys'
        DOCKERFILE = 'Dockerfile'
        APP_PROPERTIES = './src/main/resources/application.properties'
        DB_URL = credentials('DB_URL')
        DB_USERNAME = credentials('DB_USERNAME')
        DB_PASSWORD = credentials('DB_PASSWORD')
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out the Deoxys project...'
                checkout scm
            }
        }
        stage('Get Version') {
            steps {
                script {
                    // Get the latest Git tag
                    def latestTag = sh(script: "git describe --tags --abbrev=0", returnStdout: true).trim()

                    // If there are no tags, default to 1.0.0
                    if (!latestTag) {
                        latestTag = '1.0.0'
                    }

                    // Print the version
                    echo "Current Version: ${latestTag}"

                    // Set the version to an environment variable for use in later stages
                    env.VERSION = latestTag

                    // Set the build description
                    currentBuild.description = "Version: ${env.VERSION}"
                    currentBuild.displayName = "Build #${env.BUILD_NUMBER} - Version: ${env.VERSION}"
                }
            }
        }
        stage('Stop and Remove Existing Bot') {
            steps {
                script {
                    echo 'Stopping and removing the existing Deoxys instance...'
                    sh """
                        docker stop ${CONTAINER_NAME} || echo "Deoxys is not running."
                        docker rm ${CONTAINER_NAME} || echo "No old Deoxys instance to remove."
                    """
                }
            }
        }

        stage('Build') {
            steps {
                echo 'Creating the properties file...'
                script {
                    def propertiesContent = """
                        # Spring Boot configuration
                        spring.datasource.url=jdbc:mariadb://51.81.32.234:3306/deoxys
                        spring.datasource.username=${env.DB_USERNAME}
                        spring.datasource.password=${env.DB_PASSWORD}
                        spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
                        spring.jpa.hibernate.ddl-auto=update
                        spring.jpa.show-sql=true
                        server.port=1213
                        management.security.enabled=false
                    """.stripIndent()

                    writeFile file: "${env.APP_PROPERTIES}", text: propertiesContent
                }

                echo 'Building the Deoxys project...'
                sh 'mvn clean install'
            }
        }

        stage('Build New Docker Image') {
            steps {
                script {
                    echo 'Building the new Deoxys Docker image...'
                    sh """
                        docker build -t ${IMAGE_NAME}:${DOCKERFILE} .
                    """
                }
            }
        }

        stage('Run New Deoxys Container') {
            steps {
                script {
                    echo 'Starting the new Deoxys container...'
                    sh """
                        docker run -d --restart=always --name ${CONTAINER_NAME} \\
                            --env-file ${APP_PROPERTIES} \\
                            ${IMAGE_NAME}:${DOCKERFILE}
                    """
                }
            }
        }

        stage('Cleanup Docker System') {
            steps {
                script {
                    echo 'Pruning unused Docker resources...'
                    sh 'docker system prune -a --force'
                }
            }
        }
    }

    post {
        success {
            echo 'Deoxys has been successfully deployed!'
        }
        failure {
            echo 'An error occurred during the Deoxys deployment.'
        }
    }
}
