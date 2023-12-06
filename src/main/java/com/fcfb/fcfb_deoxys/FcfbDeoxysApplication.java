package com.fcfb.fcfb_deoxys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})
public class FcfbDeoxysApplication {

    public static void main(String[] args) {
        SpringApplication.run(FcfbDeoxysApplication.class, args);
    }

}
