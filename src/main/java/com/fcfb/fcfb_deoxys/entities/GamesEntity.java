package com.fcfb.fcfb_deoxys.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "games", schema = "deoxys")
public class GamesEntity {
    @Basic
    @Column(name = "game_id")
    private String gameId;
    @Basic
    @Column(name = "home_team")
    private String homeTeam;
    @Basic
    @Column(name = "away_team")
    private String awayTeam;
    @Basic
    @Column(name = "home_coach")
    private String homeCoach;
    @Basic
    @Column(name = "away_coach")
    private String awayCoach;
    @Basic
    @Column(name = "home_offensive_playbook")
    private String homeOffensivePlaybook;
    @Basic
    @Column(name = "away_offensive_playbook")
    private String awayOffensivePlaybook;
    @Basic
    @Column(name = "home_defensive_playbook")
    private String homeDefensivePlaybook;
    @Basic
    @Column(name = "away_defensive_playbook")
    private String awayDefensivePlaybook;
    @Basic
    @Column(name = "home_score")
    private Integer homeScore;
    @Basic
    @Column(name = "away_score")
    private Integer awayScore;
    @Basic
    @Column(name = "possession")
    private String possession;
    @Basic
    @Column(name = "quarter")
    private Integer quarter;
    @Basic
    @Column(name = "clock")
    private String clock;
    @Basic
    @Column(name = "ball_location")
    private String ballLocation;
    @Basic
    @Column(name = "down")
    private Integer down;
    @Basic
    @Column(name = "yards_to_go")
    private Integer yardsToGo;
    @Basic
    @Column(name = "home_wins")
    private Integer homeWins;
    @Basic
    @Column(name = "home_losses")
    private Integer homeLosses;
    @Basic
    @Column(name = "away_wins")
    private Integer awayWins;
    @Basic
    @Column(name = "away_losses")
    private Integer awayLosses;
    @Basic
    @Column(name = "scorebug")
    private String scorebug;
    @Basic
    @Column(name = "subdivision")
    private String subdivision;
    @Basic
    @Column(name = "thread")
    private String thread;
    @Basic
    @Column(name = "gist_link")
    private String gistLink;
    @Basic
    @Column(name = "win_probability")
    private Double winProbability;
    @Basic
    @Column(name = "is_final")
    private Byte isFinal;
    @Basic
    @Column(name = "is_ot")
    private Byte isOt;
    @Basic
    @Column(name = "season")
    private Integer season;
    @Basic
    @Column(name = "waiting_on")
    private String waitingOn;
    @Basic
    @Column(name = "win_probability_plot")
    private String winProbabilityPlot;
    @Basic
    @Column(name = "score_plot")
    private String scorePlot;
    @Basic
    @Column(name = "num_plays")
    private Integer numPlays;
    @Basic
    @Column(name = "home_timeouts")
    private Integer homeTimeouts;
    @Basic
    @Column(name = "away_timeouts")
    private Integer awayTimeouts;
    @Basic
    @Column(name = "game_timer")
    private String gameTimer;
    @Basic
    @Column(name = "home_total_yards")
    private Integer homeTotalYards;
    @Basic
    @Column(name = "away_total_yards")
    private Integer awayTotalYards;
    @Basic
    @Column(name = "home_passing_yards")
    private Integer homePassingYards;
    @Basic
    @Column(name = "away_passing_yards")
    private Integer awayPassingYards;
    @Basic
    @Column(name = "home_rushing_yards")
    private Integer homeRushingYards;
    @Basic
    @Column(name = "away_rushing_yards")
    private Integer awayRushingYards;
    @Basic
    @Column(name = "home_time_of_possession")
    private String homeTimeOfPossession;
    @Basic
    @Column(name = "away_time_of_possession")
    private String awayTimeOfPossession;
    @Basic
    @Column(name = "home_average_diff_on_offense")
    private Double homeAverageDiffOnOffense;
    @Basic
    @Column(name = "home_average_diff_on_defense")
    private Double homeAverageDiffOnDefense;
    @Basic
    @Column(name = "away_average_diff_on_offense")
    private Double awayAverageDiffOnOffense;
    @Basic
    @Column(name = "away_average_diff_on_defense")
    private Double awayAverageDiffOnDefense;
    @Basic
    @Column(name = "home_field_goal_attempts")
    private Integer homeFieldGoalAttempts;
    @Basic
    @Column(name = "home_field_goal_makes")
    private Integer homeFieldGoalMakes;
    @Basic
    @Column(name = "home_field_goal_percentage")
    private Double homeFieldGoalPercentage;
    @Basic
    @Column(name = "away_field_goal_attempts")
    private Integer awayFieldGoalAttempts;
    @Basic
    @Column(name = "away_field_goal_makes")
    private Integer awayFieldGoalMakes;
    @Basic
    @Column(name = "away_field_goal_percentage")
    private Double awayFieldGoalPercentage;
    @Basic
    @Column(name = "home_longest_field_goal")
    private Integer homeLongestFieldGoal;
    @Basic
    @Column(name = "away_longest_field_goal")
    private Integer awayLongestFieldGoal;
    @Basic
    @Column(name = "home_longest_touchdown")
    private Integer homeLongestTouchdown;
    @Basic
    @Column(name = "away_longest_touchdown")
    private Integer awayLongestTouchdown;
    @Basic
    @Column(name = "home_passing_attempts")
    private Integer homePassingAttempts;
    @Basic
    @Column(name = "home_passing_completions")
    private Integer homePassingCompletions;
    @Basic
    @Column(name = "home_passing_percentage")
    private Double homePassingPercentage;
    @Basic
    @Column(name = "away_passing_attempts")
    private Integer awayPassingAttempts;
    @Basic
    @Column(name = "away_passing_completions")
    private Integer awayPassingCompletions;
    @Basic
    @Column(name = "away_passing_percentage")
    private Double awayPassingPercentage;
    @Basic
    @Column(name = "home_rushing_attempts")
    private Integer homeRushingAttempts;
    @Basic
    @Column(name = "home_rushing_successes")
    private Integer homeRushingSuccesses;
    @Basic
    @Column(name = "home_rushing_percentage")
    private Double homeRushingPercentage;
    @Basic
    @Column(name = "away_rushing_attempts")
    private Integer awayRushingAttempts;
    @Basic
    @Column(name = "away_rushing_successes")
    private Integer awayRushingSuccesses;
    @Basic
    @Column(name = "away_rushing_percentage")
    private Double awayRushingPercentage;
    @Basic
    @Column(name = "home_third_down_attempts")
    private Integer homeThirdDownAttempts;
    @Basic
    @Column(name = "home_third_down_successes")
    private Integer homeThirdDownSuccesses;
    @Basic
    @Column(name = "home_third_down_percentage")
    private Double homeThirdDownPercentage;
    @Basic
    @Column(name = "away_third_down_attempts")
    private Integer awayThirdDownAttempts;
    @Basic
    @Column(name = "away_third_down_successes")
    private Integer awayThirdDownSuccesses;
    @Basic
    @Column(name = "away_third_down_percentage")
    private Double awayThirdDownPercentage;
    @Basic
    @Column(name = "home_fourth_down_attempts")
    private Integer homeFourthDownAttempts;
    @Basic
    @Column(name = "home_fourth_down_successes")
    private Integer homeFourthDownSuccesses;
    @Basic
    @Column(name = "home_fourth_down_percentage")
    private Double homeFourthDownPercentage;
    @Basic
    @Column(name = "away_fourth_down_attempts")
    private Integer awayFourthDownAttempts;
    @Basic
    @Column(name = "away_fourth_down_successes")
    private Integer awayFourthDownSuccesses;
    @Basic
    @Column(name = "away_fourth_down_percentage")
    private Double awayFourthDownPercentage;
    @Basic
    @Column(name = "home_two_point_attempts")
    private Integer homeTwoPointAttempts;
    @Basic
    @Column(name = "home_two_point_successes")
    private Integer homeTwoPointSuccesses;
    @Basic
    @Column(name = "home_two_point_percentage")
    private Double homeTwoPointPercentage;
    @Basic
    @Column(name = "away_two_point_attempts")
    private Integer awayTwoPointAttempts;
    @Basic
    @Column(name = "away_two_point_successes")
    private Integer awayTwoPointSuccesses;
    @Basic
    @Column(name = "away_two_point_percentage")
    private Double awayTwoPointPercentage;
    @Basic
    @Column(name = "home_onside_kick_attempts")
    private Integer homeOnsideKickAttempts;
    @Basic
    @Column(name = "home_onside_kick_successes")
    private Integer homeOnsideKickSuccesses;
    @Basic
    @Column(name = "home_onside_kick_percentage")
    private Double homeOnsideKickPercentage;
    @Basic
    @Column(name = "away_onside_kick_attempts")
    private Integer awayOnsideKickAttempts;
    @Basic
    @Column(name = "away_onside_kick_successes")
    private Integer awayOnsideKickSuccesses;
    @Basic
    @Column(name = "away_onside_kick_percentage")
    private Double awayOnsideKickPercentage;
    @Basic
    @Column(name = "home_offensive_plays")
    private Integer homeOffensivePlays;
    @Basic
    @Column(name = "home_defensive_plays")
    private Integer homeDefensivePlays;
    @Basic
    @Column(name = "away_offensive_plays")
    private Integer awayOffensivePlays;
    @Basic
    @Column(name = "away_defensive_plays")
    private Integer awayDefensivePlays;
    @Basic
    @Column(name = "home_turnovers")
    private Integer homeTurnovers;
    @Basic
    @Column(name = "home_fumbles")
    private Integer homeFumbles;
    @Basic
    @Column(name = "home_interceptions")
    private Integer homeInterceptions;
    @Basic
    @Column(name = "away_turnovers")
    private Integer awayTurnovers;
    @Basic
    @Column(name = "away_fumbles")
    private Integer awayFumbles;
    @Basic
    @Column(name = "away_interceptions")
    private Integer awayInterceptions;
    @Basic
    @Column(name = "home_defensive_touchdowns")
    private Integer homeDefensiveTouchdowns;
    @Basic
    @Column(name = "home_scoop_and_scores")
    private Integer homeScoopAndScores;
    @Basic
    @Column(name = "home_pick_sixes")
    private Integer homePickSixes;
    @Basic
    @Column(name = "home_kickoff_defensive_touchdowns")
    private Integer homeKickoffDefensiveTouchdowns;
    @Basic
    @Column(name = "away_defensive_touchdowns")
    private Integer awayDefensiveTouchdowns;
    @Basic
    @Column(name = "away_scoop_and_scores")
    private Integer awayScoopAndScores;
    @Basic
    @Column(name = "away_pick_sixes")
    private Integer awayPickSixes;
    @Basic
    @Column(name = "away_kickoff_defensive_touchdowns")
    private Integer awayKickoffDefensiveTouchdowns;
    @Basic
    @Column(name = "thread_timestamp")
    private String threadTimestamp;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    public GamesEntity() {
    }

    public GamesEntity(String gameId, String homeTeam, String awayTeam, String homeCoach, String awayCoach, String homeOffensivePlaybook, String awayOffensivePlaybook, String homeDefensivePlaybook, String awayDefensivePlaybook, Integer homeScore, Integer awayScore, String possession, Integer quarter, String clock, String ballLocation, Integer down, Integer yardsToGo, Integer homeWins, Integer homeLosses, Integer awayWins, Integer awayLosses, String scorebug, String subdivision, String thread, String gistLink, Double winProbability, Byte isFinal, Byte isOt, Integer season, String waitingOn, String winProbabilityPlot, String scorePlot, Integer numPlays, Integer homeTimeouts, Integer awayTimeouts, String gameTimer, Integer homeTotalYards, Integer awayTotalYards, Integer homePassingYards, Integer awayPassingYards, Integer homeRushingYards, Integer awayRushingYards, String homeTimeOfPossession, String awayTimeOfPossession, Double homeAverageDiffOnOffense, Double homeAverageDiffOnDefense, Double awayAverageDiffOnOffense, Double awayAverageDiffOnDefense, Integer homeFieldGoalAttempts, Integer homeFieldGoalMakes, Double homeFieldGoalPercentage, Integer awayFieldGoalAttempts, Integer awayFieldGoalMakes, Double awayFieldGoalPercentage, Integer homeLongestFieldGoal, Integer awayLongestFieldGoal, Integer homeLongestTouchdown, Integer awayLongestTouchdown, Integer homePassingAttempts, Integer homePassingCompletions, Double homePassingPercentage, Integer awayPassingAttempts, Integer awayPassingCompletions, Double awayPassingPercentage, Integer homeRushingAttempts, Integer homeRushingSuccesses, Double homeRushingPercentage, Integer awayRushingAttempts, Integer awayRushingSuccesses, Double awayRushingPercentage, Integer homeThirdDownAttempts, Integer homeThirdDownSuccesses, Double homeThirdDownPercentage, Integer awayThirdDownAttempts, Integer awayThirdDownSuccesses, Double awayThirdDownPercentage, Integer homeFourthDownAttempts, Integer homeFourthDownSuccesses, Double homeFourthDownPercentage, Integer awayFourthDownAttempts, Integer awayFourthDownSuccesses, Double awayFourthDownPercentage, Integer homeTwoPointAttempts, Integer homeTwoPointSuccesses, Double homeTwoPointPercentage, Integer awayTwoPointAttempts, Integer awayTwoPointSuccesses, Double awayTwoPointPercentage, Integer homeOnsideKickAttempts, Integer homeOnsideKickSuccesses, Double homeOnsideKickPercentage, Integer awayOnsideKickAttempts, Integer awayOnsideKickSuccesses, Double awayOnsideKickPercentage, Integer homeOffensivePlays, Integer homeDefensivePlays, Integer awayOffensivePlays, Integer awayDefensivePlays, Integer homeTurnovers, Integer homeFumbles, Integer homeInterceptions, Integer awayTurnovers, Integer awayFumbles, Integer awayInterceptions, Integer homeDefensiveTouchdowns, Integer homeScoopAndScores, Integer homePickSixes, Integer homeKickoffDefensiveTouchdowns, Integer awayDefensiveTouchdowns, Integer awayScoopAndScores, Integer awayPickSixes, Integer awayKickoffDefensiveTouchdowns, String threadTimestamp) {
        this.gameId = gameId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeCoach = homeCoach;
        this.awayCoach = awayCoach;
        this.homeOffensivePlaybook = homeOffensivePlaybook;
        this.awayOffensivePlaybook = awayOffensivePlaybook;
        this.homeDefensivePlaybook = homeDefensivePlaybook;
        this.awayDefensivePlaybook = awayDefensivePlaybook;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.possession = possession;
        this.quarter = quarter;
        this.clock = clock;
        this.ballLocation = ballLocation;
        this.down = down;
        this.yardsToGo = yardsToGo;
        this.homeWins = homeWins;
        this.homeLosses = homeLosses;
        this.awayWins = awayWins;
        this.awayLosses = awayLosses;
        this.scorebug = scorebug;
        this.subdivision = subdivision;
        this.thread = thread;
        this.gistLink = gistLink;
        this.winProbability = winProbability;
        this.isFinal = isFinal;
        this.isOt = isOt;
        this.season = season;
        this.waitingOn = waitingOn;
        this.winProbabilityPlot = winProbabilityPlot;
        this.scorePlot = scorePlot;
        this.numPlays = numPlays;
        this.homeTimeouts = homeTimeouts;
        this.awayTimeouts = awayTimeouts;
        this.gameTimer = gameTimer;
        this.homeTotalYards = homeTotalYards;
        this.awayTotalYards = awayTotalYards;
        this.homePassingYards = homePassingYards;
        this.awayPassingYards = awayPassingYards;
        this.homeRushingYards = homeRushingYards;
        this.awayRushingYards = awayRushingYards;
        this.homeTimeOfPossession = homeTimeOfPossession;
        this.awayTimeOfPossession = awayTimeOfPossession;
        this.homeAverageDiffOnOffense = homeAverageDiffOnOffense;
        this.homeAverageDiffOnDefense = homeAverageDiffOnDefense;
        this.awayAverageDiffOnOffense = awayAverageDiffOnOffense;
        this.awayAverageDiffOnDefense = awayAverageDiffOnDefense;
        this.homeFieldGoalAttempts = homeFieldGoalAttempts;
        this.homeFieldGoalMakes = homeFieldGoalMakes;
        this.homeFieldGoalPercentage = homeFieldGoalPercentage;
        this.awayFieldGoalAttempts = awayFieldGoalAttempts;
        this.awayFieldGoalMakes = awayFieldGoalMakes;
        this.awayFieldGoalPercentage = awayFieldGoalPercentage;
        this.homeLongestFieldGoal = homeLongestFieldGoal;
        this.awayLongestFieldGoal = awayLongestFieldGoal;
        this.homeLongestTouchdown = homeLongestTouchdown;
        this.awayLongestTouchdown = awayLongestTouchdown;
        this.homePassingAttempts = homePassingAttempts;
        this.homePassingCompletions = homePassingCompletions;
        this.homePassingPercentage = homePassingPercentage;
        this.awayPassingAttempts = awayPassingAttempts;
        this.awayPassingCompletions = awayPassingCompletions;
        this.awayPassingPercentage = awayPassingPercentage;
        this.homeRushingAttempts = homeRushingAttempts;
        this.homeRushingSuccesses = homeRushingSuccesses;
        this.homeRushingPercentage = homeRushingPercentage;
        this.awayRushingAttempts = awayRushingAttempts;
        this.awayRushingSuccesses = awayRushingSuccesses;
        this.awayRushingPercentage = awayRushingPercentage;
        this.homeThirdDownAttempts = homeThirdDownAttempts;
        this.homeThirdDownSuccesses = homeThirdDownSuccesses;
        this.homeThirdDownPercentage = homeThirdDownPercentage;
        this.awayThirdDownAttempts = awayThirdDownAttempts;
        this.awayThirdDownSuccesses = awayThirdDownSuccesses;
        this.awayThirdDownPercentage = awayThirdDownPercentage;
        this.homeFourthDownAttempts = homeFourthDownAttempts;
        this.homeFourthDownSuccesses = homeFourthDownSuccesses;
        this.homeFourthDownPercentage = homeFourthDownPercentage;
        this.awayFourthDownAttempts = awayFourthDownAttempts;
        this.awayFourthDownSuccesses = awayFourthDownSuccesses;
        this.awayFourthDownPercentage = awayFourthDownPercentage;
        this.homeTwoPointAttempts = homeTwoPointAttempts;
        this.homeTwoPointSuccesses = homeTwoPointSuccesses;
        this.homeTwoPointPercentage = homeTwoPointPercentage;
        this.awayTwoPointAttempts = awayTwoPointAttempts;
        this.awayTwoPointSuccesses = awayTwoPointSuccesses;
        this.awayTwoPointPercentage = awayTwoPointPercentage;
        this.homeOnsideKickAttempts = homeOnsideKickAttempts;
        this.homeOnsideKickSuccesses = homeOnsideKickSuccesses;
        this.homeOnsideKickPercentage = homeOnsideKickPercentage;
        this.awayOnsideKickAttempts = awayOnsideKickAttempts;
        this.awayOnsideKickSuccesses = awayOnsideKickSuccesses;
        this.awayOnsideKickPercentage = awayOnsideKickPercentage;
        this.homeOffensivePlays = homeOffensivePlays;
        this.homeDefensivePlays = homeDefensivePlays;
        this.awayOffensivePlays = awayOffensivePlays;
        this.awayDefensivePlays = awayDefensivePlays;
        this.homeTurnovers = homeTurnovers;
        this.homeFumbles = homeFumbles;
        this.homeInterceptions = homeInterceptions;
        this.awayTurnovers = awayTurnovers;
        this.awayFumbles = awayFumbles;
        this.awayInterceptions = awayInterceptions;
        this.homeDefensiveTouchdowns = homeDefensiveTouchdowns;
        this.homeScoopAndScores = homeScoopAndScores;
        this.homePickSixes = homePickSixes;
        this.homeKickoffDefensiveTouchdowns = homeKickoffDefensiveTouchdowns;
        this.awayDefensiveTouchdowns = awayDefensiveTouchdowns;
        this.awayScoopAndScores = awayScoopAndScores;
        this.awayPickSixes = awayPickSixes;
        this.awayKickoffDefensiveTouchdowns = awayKickoffDefensiveTouchdowns;
        this.threadTimestamp = threadTimestamp;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getHomeCoach() {
        return homeCoach;
    }

    public void setHomeCoach(String homeCoach) {
        this.homeCoach = homeCoach;
    }

    public String getAwayCoach() {
        return awayCoach;
    }

    public void setAwayCoach(String awayCoach) {
        this.awayCoach = awayCoach;
    }

    public String getHomeOffensivePlaybook() {
        return homeOffensivePlaybook;
    }

    public void setHomeOffensivePlaybook(String homeOffensivePlaybook) {
        this.homeOffensivePlaybook = homeOffensivePlaybook;
    }

    public String getAwayOffensivePlaybook() {
        return awayOffensivePlaybook;
    }

    public void setAwayOffensivePlaybook(String awayOffensivePlaybook) {
        this.awayOffensivePlaybook = awayOffensivePlaybook;
    }

    public String getHomeDefensivePlaybook() {
        return homeDefensivePlaybook;
    }

    public void setHomeDefensivePlaybook(String homeDefensivePlaybook) {
        this.homeDefensivePlaybook = homeDefensivePlaybook;
    }

    public String getAwayDefensivePlaybook() {
        return awayDefensivePlaybook;
    }

    public void setAwayDefensivePlaybook(String awayDefensivePlaybook) {
        this.awayDefensivePlaybook = awayDefensivePlaybook;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public String getPossession() {
        return possession;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getBallLocation() {
        return ballLocation;
    }

    public void setBallLocation(String ballLocation) {
        this.ballLocation = ballLocation;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Integer getYardsToGo() {
        return yardsToGo;
    }

    public void setYardsToGo(Integer yardsToGo) {
        this.yardsToGo = yardsToGo;
    }

    public Integer getHomeWins() {
        return homeWins;
    }

    public void setHomeWins(Integer homeWins) {
        this.homeWins = homeWins;
    }

    public Integer getHomeLosses() {
        return homeLosses;
    }

    public void setHomeLosses(Integer homeLosses) {
        this.homeLosses = homeLosses;
    }

    public Integer getAwayWins() {
        return awayWins;
    }

    public void setAwayWins(Integer awayWins) {
        this.awayWins = awayWins;
    }

    public Integer getAwayLosses() {
        return awayLosses;
    }

    public void setAwayLosses(Integer awayLosses) {
        this.awayLosses = awayLosses;
    }

    public String getScorebug() {
        return scorebug;
    }

    public void setScorebug(String scorebug) {
        this.scorebug = scorebug;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }

    public String getGistLink() {
        return gistLink;
    }

    public void setGistLink(String gistLink) {
        this.gistLink = gistLink;
    }

    public Double getWinProbability() {
        return winProbability;
    }

    public void setWinProbability(Double winProbability) {
        this.winProbability = winProbability;
    }

    public Byte getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(Byte isFinal) {
        this.isFinal = isFinal;
    }

    public Byte getIsOt() {
        return isOt;
    }

    public void setIsOt(Byte isOt) {
        this.isOt = isOt;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getWaitingOn() {
        return waitingOn;
    }

    public void setWaitingOn(String waitingOn) {
        this.waitingOn = waitingOn;
    }

    public String getWinProbabilityPlot() {
        return winProbabilityPlot;
    }

    public void setWinProbabilityPlot(String winProbabilityPlot) {
        this.winProbabilityPlot = winProbabilityPlot;
    }

    public String getScorePlot() {
        return scorePlot;
    }

    public void setScorePlot(String scorePlot) {
        this.scorePlot = scorePlot;
    }

    public Integer getNumPlays() {
        return numPlays;
    }

    public void setNumPlays(Integer numPlays) {
        this.numPlays = numPlays;
    }

    public Integer getHomeTimeouts() {
        return homeTimeouts;
    }

    public void setHomeTimeouts(Integer homeTimeouts) {
        this.homeTimeouts = homeTimeouts;
    }

    public Integer getAwayTimeouts() {
        return awayTimeouts;
    }

    public void setAwayTimeouts(Integer awayTimeouts) {
        this.awayTimeouts = awayTimeouts;
    }

    public String getGameTimer() {
        return gameTimer;
    }

    public void setGameTimer(String gameTimer) {
        this.gameTimer = gameTimer;
    }

    public Integer getHomeTotalYards() {
        return homeTotalYards;
    }

    public void setHomeTotalYards(Integer homeTotalYards) {
        this.homeTotalYards = homeTotalYards;
    }

    public Integer getAwayTotalYards() {
        return awayTotalYards;
    }

    public void setAwayTotalYards(Integer awayTotalYards) {
        this.awayTotalYards = awayTotalYards;
    }

    public Integer getHomePassingYards() {
        return homePassingYards;
    }

    public void setHomePassingYards(Integer homePassingYards) {
        this.homePassingYards = homePassingYards;
    }

    public Integer getAwayPassingYards() {
        return awayPassingYards;
    }

    public void setAwayPassingYards(Integer awayPassingYards) {
        this.awayPassingYards = awayPassingYards;
    }

    public Integer getHomeRushingYards() {
        return homeRushingYards;
    }

    public void setHomeRushingYards(Integer homeRushingYards) {
        this.homeRushingYards = homeRushingYards;
    }

    public Integer getAwayRushingYards() {
        return awayRushingYards;
    }

    public void setAwayRushingYards(Integer awayRushingYards) {
        this.awayRushingYards = awayRushingYards;
    }

    public String getHomeTimeOfPossession() {
        return homeTimeOfPossession;
    }

    public void setHomeTimeOfPossession(String homeTimeOfPossession) {
        this.homeTimeOfPossession = homeTimeOfPossession;
    }

    public String getAwayTimeOfPossession() {
        return awayTimeOfPossession;
    }

    public void setAwayTimeOfPossession(String awayTimeOfPossession) {
        this.awayTimeOfPossession = awayTimeOfPossession;
    }

    public Double getHomeAverageDiffOnOffense() {
        return homeAverageDiffOnOffense;
    }

    public void setHomeAverageDiffOnOffense(Double homeAverageDiffOnOffense) {
        this.homeAverageDiffOnOffense = homeAverageDiffOnOffense;
    }

    public Double getHomeAverageDiffOnDefense() {
        return homeAverageDiffOnDefense;
    }

    public void setHomeAverageDiffOnDefense(Double homeAverageDiffOnDefense) {
        this.homeAverageDiffOnDefense = homeAverageDiffOnDefense;
    }

    public Double getAwayAverageDiffOnOffense() {
        return awayAverageDiffOnOffense;
    }

    public void setAwayAverageDiffOnOffense(Double awayAverageDiffOnOffense) {
        this.awayAverageDiffOnOffense = awayAverageDiffOnOffense;
    }

    public Double getAwayAverageDiffOnDefense() {
        return awayAverageDiffOnDefense;
    }

    public void setAwayAverageDiffOnDefense(Double awayAverageDiffOnDefense) {
        this.awayAverageDiffOnDefense = awayAverageDiffOnDefense;
    }

    public Integer getHomeFieldGoalAttempts() {
        return homeFieldGoalAttempts;
    }

    public void setHomeFieldGoalAttempts(Integer homeFieldGoalAttempts) {
        this.homeFieldGoalAttempts = homeFieldGoalAttempts;
    }

    public Integer getHomeFieldGoalMakes() {
        return homeFieldGoalMakes;
    }

    public void setHomeFieldGoalMakes(Integer homeFieldGoalMakes) {
        this.homeFieldGoalMakes = homeFieldGoalMakes;
    }

    public Double getHomeFieldGoalPercentage() {
        return homeFieldGoalPercentage;
    }

    public void setHomeFieldGoalPercentage(Double homeFieldGoalPercentage) {
        this.homeFieldGoalPercentage = homeFieldGoalPercentage;
    }

    public Integer getAwayFieldGoalAttempts() {
        return awayFieldGoalAttempts;
    }

    public void setAwayFieldGoalAttempts(Integer awayFieldGoalAttempts) {
        this.awayFieldGoalAttempts = awayFieldGoalAttempts;
    }

    public Integer getAwayFieldGoalMakes() {
        return awayFieldGoalMakes;
    }

    public void setAwayFieldGoalMakes(Integer awayFieldGoalMakes) {
        this.awayFieldGoalMakes = awayFieldGoalMakes;
    }

    public Double getAwayFieldGoalPercentage() {
        return awayFieldGoalPercentage;
    }

    public void setAwayFieldGoalPercentage(Double awayFieldGoalPercentage) {
        this.awayFieldGoalPercentage = awayFieldGoalPercentage;
    }

    public Integer getHomeLongestFieldGoal() {
        return homeLongestFieldGoal;
    }

    public void setHomeLongestFieldGoal(Integer homeLongestFieldGoal) {
        this.homeLongestFieldGoal = homeLongestFieldGoal;
    }

    public Integer getAwayLongestFieldGoal() {
        return awayLongestFieldGoal;
    }

    public void setAwayLongestFieldGoal(Integer awayLongestFieldGoal) {
        this.awayLongestFieldGoal = awayLongestFieldGoal;
    }

    public Integer getHomeLongestTouchdown() {
        return homeLongestTouchdown;
    }

    public void setHomeLongestTouchdown(Integer homeLongestTouchdown) {
        this.homeLongestTouchdown = homeLongestTouchdown;
    }

    public Integer getAwayLongestTouchdown() {
        return awayLongestTouchdown;
    }

    public void setAwayLongestTouchdown(Integer awayLongestTouchdown) {
        this.awayLongestTouchdown = awayLongestTouchdown;
    }

    public Integer getHomePassingAttempts() {
        return homePassingAttempts;
    }

    public void setHomePassingAttempts(Integer homePassingAttempts) {
        this.homePassingAttempts = homePassingAttempts;
    }

    public Integer getHomePassingCompletions() {
        return homePassingCompletions;
    }

    public void setHomePassingCompletions(Integer homePassingCompletions) {
        this.homePassingCompletions = homePassingCompletions;
    }

    public Double getHomePassingPercentage() {
        return homePassingPercentage;
    }

    public void setHomePassingPercentage(Double homePassingPercentage) {
        this.homePassingPercentage = homePassingPercentage;
    }

    public Integer getAwayPassingAttempts() {
        return awayPassingAttempts;
    }

    public void setAwayPassingAttempts(Integer awayPassingAttempts) {
        this.awayPassingAttempts = awayPassingAttempts;
    }

    public Integer getAwayPassingCompletions() {
        return awayPassingCompletions;
    }

    public void setAwayPassingCompletions(Integer awayPassingCompletions) {
        this.awayPassingCompletions = awayPassingCompletions;
    }

    public Double getAwayPassingPercentage() {
        return awayPassingPercentage;
    }

    public void setAwayPassingPercentage(Double awayPassingPercentage) {
        this.awayPassingPercentage = awayPassingPercentage;
    }

    public Integer getHomeRushingAttempts() {
        return homeRushingAttempts;
    }

    public void setHomeRushingAttempts(Integer homeRushingAttempts) {
        this.homeRushingAttempts = homeRushingAttempts;
    }

    public Integer getHomeRushingSuccesses() {
        return homeRushingSuccesses;
    }

    public void setHomeRushingSuccesses(Integer homeRushingSuccesses) {
        this.homeRushingSuccesses = homeRushingSuccesses;
    }

    public Double getHomeRushingPercentage() {
        return homeRushingPercentage;
    }

    public void setHomeRushingPercentage(Double homeRushingPercentage) {
        this.homeRushingPercentage = homeRushingPercentage;
    }

    public Integer getAwayRushingAttempts() {
        return awayRushingAttempts;
    }

    public void setAwayRushingAttempts(Integer awayRushingAttempts) {
        this.awayRushingAttempts = awayRushingAttempts;
    }

    public Integer getAwayRushingSuccesses() {
        return awayRushingSuccesses;
    }

    public void setAwayRushingSuccesses(Integer awayRushingSuccesses) {
        this.awayRushingSuccesses = awayRushingSuccesses;
    }

    public Double getAwayRushingPercentage() {
        return awayRushingPercentage;
    }

    public void setAwayRushingPercentage(Double awayRushingPercentage) {
        this.awayRushingPercentage = awayRushingPercentage;
    }

    public Integer getHomeThirdDownAttempts() {
        return homeThirdDownAttempts;
    }

    public void setHomeThirdDownAttempts(Integer homeThirdDownAttempts) {
        this.homeThirdDownAttempts = homeThirdDownAttempts;
    }

    public Integer getHomeThirdDownSuccesses() {
        return homeThirdDownSuccesses;
    }

    public void setHomeThirdDownSuccesses(Integer homeThirdDownSuccesses) {
        this.homeThirdDownSuccesses = homeThirdDownSuccesses;
    }

    public Double getHomeThirdDownPercentage() {
        return homeThirdDownPercentage;
    }

    public void setHomeThirdDownPercentage(Double homeThirdDownPercentage) {
        this.homeThirdDownPercentage = homeThirdDownPercentage;
    }

    public Integer getAwayThirdDownAttempts() {
        return awayThirdDownAttempts;
    }

    public void setAwayThirdDownAttempts(Integer awayThirdDownAttempts) {
        this.awayThirdDownAttempts = awayThirdDownAttempts;
    }

    public Integer getAwayThirdDownSuccesses() {
        return awayThirdDownSuccesses;
    }

    public void setAwayThirdDownSuccesses(Integer awayThirdDownSuccesses) {
        this.awayThirdDownSuccesses = awayThirdDownSuccesses;
    }

    public Double getAwayThirdDownPercentage() {
        return awayThirdDownPercentage;
    }

    public void setAwayThirdDownPercentage(Double awayThirdDownPercentage) {
        this.awayThirdDownPercentage = awayThirdDownPercentage;
    }

    public Integer getHomeFourthDownAttempts() {
        return homeFourthDownAttempts;
    }

    public void setHomeFourthDownAttempts(Integer homeFourthDownAttempts) {
        this.homeFourthDownAttempts = homeFourthDownAttempts;
    }

    public Integer getHomeFourthDownSuccesses() {
        return homeFourthDownSuccesses;
    }

    public void setHomeFourthDownSuccesses(Integer homeFourthDownSuccesses) {
        this.homeFourthDownSuccesses = homeFourthDownSuccesses;
    }

    public Double getHomeFourthDownPercentage() {
        return homeFourthDownPercentage;
    }

    public void setHomeFourthDownPercentage(Double homeFourthDownPercentage) {
        this.homeFourthDownPercentage = homeFourthDownPercentage;
    }

    public Integer getAwayFourthDownAttempts() {
        return awayFourthDownAttempts;
    }

    public void setAwayFourthDownAttempts(Integer awayFourthDownAttempts) {
        this.awayFourthDownAttempts = awayFourthDownAttempts;
    }

    public Integer getAwayFourthDownSuccesses() {
        return awayFourthDownSuccesses;
    }

    public void setAwayFourthDownSuccesses(Integer awayFourthDownSuccesses) {
        this.awayFourthDownSuccesses = awayFourthDownSuccesses;
    }

    public Double getAwayFourthDownPercentage() {
        return awayFourthDownPercentage;
    }

    public void setAwayFourthDownPercentage(Double awayFourthDownPercentage) {
        this.awayFourthDownPercentage = awayFourthDownPercentage;
    }

    public Integer getHomeTwoPointAttempts() {
        return homeTwoPointAttempts;
    }

    public void setHomeTwoPointAttempts(Integer homeTwoPointAttempts) {
        this.homeTwoPointAttempts = homeTwoPointAttempts;
    }

    public Integer getHomeTwoPointSuccesses() {
        return homeTwoPointSuccesses;
    }

    public void setHomeTwoPointSuccesses(Integer homeTwoPointSuccesses) {
        this.homeTwoPointSuccesses = homeTwoPointSuccesses;
    }

    public Double getHomeTwoPointPercentage() {
        return homeTwoPointPercentage;
    }

    public void setHomeTwoPointPercentage(Double homeTwoPointPercentage) {
        this.homeTwoPointPercentage = homeTwoPointPercentage;
    }

    public Integer getAwayTwoPointAttempts() {
        return awayTwoPointAttempts;
    }

    public void setAwayTwoPointAttempts(Integer awayTwoPointAttempts) {
        this.awayTwoPointAttempts = awayTwoPointAttempts;
    }

    public Integer getAwayTwoPointSuccesses() {
        return awayTwoPointSuccesses;
    }

    public void setAwayTwoPointSuccesses(Integer awayTwoPointSuccesses) {
        this.awayTwoPointSuccesses = awayTwoPointSuccesses;
    }

    public Double getAwayTwoPointPercentage() {
        return awayTwoPointPercentage;
    }

    public void setAwayTwoPointPercentage(Double awayTwoPointPercentage) {
        this.awayTwoPointPercentage = awayTwoPointPercentage;
    }

    public Integer getHomeOnsideKickAttempts() {
        return homeOnsideKickAttempts;
    }

    public void setHomeOnsideKickAttempts(Integer homeOnsideKickAttempts) {
        this.homeOnsideKickAttempts = homeOnsideKickAttempts;
    }

    public Integer getHomeOnsideKickSuccesses() {
        return homeOnsideKickSuccesses;
    }

    public void setHomeOnsideKickSuccesses(Integer homeOnsideKickSuccesses) {
        this.homeOnsideKickSuccesses = homeOnsideKickSuccesses;
    }

    public Double getHomeOnsideKickPercentage() {
        return homeOnsideKickPercentage;
    }

    public void setHomeOnsideKickPercentage(Double homeOnsideKickPercentage) {
        this.homeOnsideKickPercentage = homeOnsideKickPercentage;
    }

    public Integer getAwayOnsideKickAttempts() {
        return awayOnsideKickAttempts;
    }

    public void setAwayOnsideKickAttempts(Integer awayOnsideKickAttempts) {
        this.awayOnsideKickAttempts = awayOnsideKickAttempts;
    }

    public Integer getAwayOnsideKickSuccesses() {
        return awayOnsideKickSuccesses;
    }

    public void setAwayOnsideKickSuccesses(Integer awayOnsideKickSuccesses) {
        this.awayOnsideKickSuccesses = awayOnsideKickSuccesses;
    }

    public Double getAwayOnsideKickPercentage() {
        return awayOnsideKickPercentage;
    }

    public void setAwayOnsideKickPercentage(Double awayOnsideKickPercentage) {
        this.awayOnsideKickPercentage = awayOnsideKickPercentage;
    }

    public Integer getHomeOffensivePlays() {
        return homeOffensivePlays;
    }

    public void setHomeOffensivePlays(Integer homeOffensivePlays) {
        this.homeOffensivePlays = homeOffensivePlays;
    }

    public Integer getHomeDefensivePlays() {
        return homeDefensivePlays;
    }

    public void setHomeDefensivePlays(Integer homeDefensivePlays) {
        this.homeDefensivePlays = homeDefensivePlays;
    }

    public Integer getAwayOffensivePlays() {
        return awayOffensivePlays;
    }

    public void setAwayOffensivePlays(Integer awayOffensivePlays) {
        this.awayOffensivePlays = awayOffensivePlays;
    }

    public Integer getAwayDefensivePlays() {
        return awayDefensivePlays;
    }

    public void setAwayDefensivePlays(Integer awayDefensivePlays) {
        this.awayDefensivePlays = awayDefensivePlays;
    }

    public Integer getHomeTurnovers() {
        return homeTurnovers;
    }

    public void setHomeTurnovers(Integer homeTurnovers) {
        this.homeTurnovers = homeTurnovers;
    }

    public Integer getHomeFumbles() {
        return homeFumbles;
    }

    public void setHomeFumbles(Integer homeFumbles) {
        this.homeFumbles = homeFumbles;
    }

    public Integer getHomeInterceptions() {
        return homeInterceptions;
    }

    public void setHomeInterceptions(Integer homeInterceptions) {
        this.homeInterceptions = homeInterceptions;
    }

    public Integer getAwayTurnovers() {
        return awayTurnovers;
    }

    public void setAwayTurnovers(Integer awayTurnovers) {
        this.awayTurnovers = awayTurnovers;
    }

    public Integer getAwayFumbles() {
        return awayFumbles;
    }

    public void setAwayFumbles(Integer awayFumbles) {
        this.awayFumbles = awayFumbles;
    }

    public Integer getAwayInterceptions() {
        return awayInterceptions;
    }

    public void setAwayInterceptions(Integer awayInterceptions) {
        this.awayInterceptions = awayInterceptions;
    }

    public Integer getHomeDefensiveTouchdowns() {
        return homeDefensiveTouchdowns;
    }

    public void setHomeDefensiveTouchdowns(Integer homeDefensiveTouchdowns) {
        this.homeDefensiveTouchdowns = homeDefensiveTouchdowns;
    }

    public Integer getHomeScoopAndScores() {
        return homeScoopAndScores;
    }

    public void setHomeScoopAndScores(Integer homeScoopAndScores) {
        this.homeScoopAndScores = homeScoopAndScores;
    }

    public Integer getHomePickSixes() {
        return homePickSixes;
    }

    public void setHomePickSixes(Integer homePickSixes) {
        this.homePickSixes = homePickSixes;
    }

    public Integer getHomeKickoffDefensiveTouchdowns() {
        return homeKickoffDefensiveTouchdowns;
    }

    public void setHomeKickoffDefensiveTouchdowns(Integer homeKickoffDefensiveTouchdowns) {
        this.homeKickoffDefensiveTouchdowns = homeKickoffDefensiveTouchdowns;
    }

    public Integer getAwayDefensiveTouchdowns() {
        return awayDefensiveTouchdowns;
    }

    public void setAwayDefensiveTouchdowns(Integer awayDefensiveTouchdowns) {
        this.awayDefensiveTouchdowns = awayDefensiveTouchdowns;
    }

    public Integer getAwayScoopAndScores() {
        return awayScoopAndScores;
    }

    public void setAwayScoopAndScores(Integer awayScoopAndScores) {
        this.awayScoopAndScores = awayScoopAndScores;
    }

    public Integer getAwayPickSixes() {
        return awayPickSixes;
    }

    public void setAwayPickSixes(Integer awayPickSixes) {
        this.awayPickSixes = awayPickSixes;
    }

    public Integer getAwayKickoffDefensiveTouchdowns() {
        return awayKickoffDefensiveTouchdowns;
    }

    public void setAwayKickoffDefensiveTouchdowns(Integer awayKickoffDefensiveTouchdowns) {
        this.awayKickoffDefensiveTouchdowns = awayKickoffDefensiveTouchdowns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThreadTimestamp() {
        return threadTimestamp;
    }

    public void setThreadTimestamp(String threadTimestamp) {
        this.threadTimestamp = threadTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamesEntity that = (GamesEntity) o;
        return id == that.id && Objects.equals(gameId, that.gameId) && Objects.equals(homeTeam, that.homeTeam) && Objects.equals(awayTeam, that.awayTeam) && Objects.equals(homeCoach, that.homeCoach) && Objects.equals(awayCoach, that.awayCoach) && Objects.equals(homeOffensivePlaybook, that.homeOffensivePlaybook) && Objects.equals(awayOffensivePlaybook, that.awayOffensivePlaybook) && Objects.equals(homeDefensivePlaybook, that.homeDefensivePlaybook) && Objects.equals(awayDefensivePlaybook, that.awayDefensivePlaybook) && Objects.equals(homeScore, that.homeScore) && Objects.equals(awayScore, that.awayScore) && Objects.equals(possession, that.possession) && Objects.equals(quarter, that.quarter) && Objects.equals(clock, that.clock) && Objects.equals(ballLocation, that.ballLocation) && Objects.equals(down, that.down) && Objects.equals(yardsToGo, that.yardsToGo) && Objects.equals(homeWins, that.homeWins) && Objects.equals(homeLosses, that.homeLosses) && Objects.equals(awayWins, that.awayWins) && Objects.equals(awayLosses, that.awayLosses) && Objects.equals(scorebug, that.scorebug) && Objects.equals(subdivision, that.subdivision) && Objects.equals(thread, that.thread) && Objects.equals(gistLink, that.gistLink) && Objects.equals(winProbability, that.winProbability) && Objects.equals(isFinal, that.isFinal) && Objects.equals(isOt, that.isOt) && Objects.equals(season, that.season) && Objects.equals(waitingOn, that.waitingOn) && Objects.equals(winProbabilityPlot, that.winProbabilityPlot) && Objects.equals(scorePlot, that.scorePlot) && Objects.equals(numPlays, that.numPlays) && Objects.equals(homeTimeouts, that.homeTimeouts) && Objects.equals(awayTimeouts, that.awayTimeouts) && Objects.equals(gameTimer, that.gameTimer) && Objects.equals(homeTotalYards, that.homeTotalYards) && Objects.equals(awayTotalYards, that.awayTotalYards) && Objects.equals(homePassingYards, that.homePassingYards) && Objects.equals(awayPassingYards, that.awayPassingYards) && Objects.equals(homeRushingYards, that.homeRushingYards) && Objects.equals(awayRushingYards, that.awayRushingYards) && Objects.equals(homeTimeOfPossession, that.homeTimeOfPossession) && Objects.equals(awayTimeOfPossession, that.awayTimeOfPossession) && Objects.equals(homeAverageDiffOnOffense, that.homeAverageDiffOnOffense) && Objects.equals(homeAverageDiffOnDefense, that.homeAverageDiffOnDefense) && Objects.equals(awayAverageDiffOnOffense, that.awayAverageDiffOnOffense) && Objects.equals(awayAverageDiffOnDefense, that.awayAverageDiffOnDefense) && Objects.equals(homeFieldGoalAttempts, that.homeFieldGoalAttempts) && Objects.equals(homeFieldGoalMakes, that.homeFieldGoalMakes) && Objects.equals(homeFieldGoalPercentage, that.homeFieldGoalPercentage) && Objects.equals(awayFieldGoalAttempts, that.awayFieldGoalAttempts) && Objects.equals(awayFieldGoalMakes, that.awayFieldGoalMakes) && Objects.equals(awayFieldGoalPercentage, that.awayFieldGoalPercentage) && Objects.equals(homeLongestFieldGoal, that.homeLongestFieldGoal) && Objects.equals(awayLongestFieldGoal, that.awayLongestFieldGoal) && Objects.equals(homeLongestTouchdown, that.homeLongestTouchdown) && Objects.equals(awayLongestTouchdown, that.awayLongestTouchdown) && Objects.equals(homePassingAttempts, that.homePassingAttempts) && Objects.equals(homePassingCompletions, that.homePassingCompletions) && Objects.equals(homePassingPercentage, that.homePassingPercentage) && Objects.equals(awayPassingAttempts, that.awayPassingAttempts) && Objects.equals(awayPassingCompletions, that.awayPassingCompletions) && Objects.equals(awayPassingPercentage, that.awayPassingPercentage) && Objects.equals(homeRushingAttempts, that.homeRushingAttempts) && Objects.equals(homeRushingSuccesses, that.homeRushingSuccesses) && Objects.equals(homeRushingPercentage, that.homeRushingPercentage) && Objects.equals(awayRushingAttempts, that.awayRushingAttempts) && Objects.equals(awayRushingSuccesses, that.awayRushingSuccesses) && Objects.equals(awayRushingPercentage, that.awayRushingPercentage) && Objects.equals(homeThirdDownAttempts, that.homeThirdDownAttempts) && Objects.equals(homeThirdDownSuccesses, that.homeThirdDownSuccesses) && Objects.equals(homeThirdDownPercentage, that.homeThirdDownPercentage) && Objects.equals(awayThirdDownAttempts, that.awayThirdDownAttempts) && Objects.equals(awayThirdDownSuccesses, that.awayThirdDownSuccesses) && Objects.equals(awayThirdDownPercentage, that.awayThirdDownPercentage) && Objects.equals(homeFourthDownAttempts, that.homeFourthDownAttempts) && Objects.equals(homeFourthDownSuccesses, that.homeFourthDownSuccesses) && Objects.equals(homeFourthDownPercentage, that.homeFourthDownPercentage) && Objects.equals(awayFourthDownAttempts, that.awayFourthDownAttempts) && Objects.equals(awayFourthDownSuccesses, that.awayFourthDownSuccesses) && Objects.equals(awayFourthDownPercentage, that.awayFourthDownPercentage) && Objects.equals(homeTwoPointAttempts, that.homeTwoPointAttempts) && Objects.equals(homeTwoPointSuccesses, that.homeTwoPointSuccesses) && Objects.equals(homeTwoPointPercentage, that.homeTwoPointPercentage) && Objects.equals(awayTwoPointAttempts, that.awayTwoPointAttempts) && Objects.equals(awayTwoPointSuccesses, that.awayTwoPointSuccesses) && Objects.equals(awayTwoPointPercentage, that.awayTwoPointPercentage) && Objects.equals(homeOnsideKickAttempts, that.homeOnsideKickAttempts) && Objects.equals(homeOnsideKickSuccesses, that.homeOnsideKickSuccesses) && Objects.equals(homeOnsideKickPercentage, that.homeOnsideKickPercentage) && Objects.equals(awayOnsideKickAttempts, that.awayOnsideKickAttempts) && Objects.equals(awayOnsideKickSuccesses, that.awayOnsideKickSuccesses) && Objects.equals(awayOnsideKickPercentage, that.awayOnsideKickPercentage) && Objects.equals(homeOffensivePlays, that.homeOffensivePlays) && Objects.equals(homeDefensivePlays, that.homeDefensivePlays) && Objects.equals(awayOffensivePlays, that.awayOffensivePlays) && Objects.equals(awayDefensivePlays, that.awayDefensivePlays) && Objects.equals(homeTurnovers, that.homeTurnovers) && Objects.equals(homeFumbles, that.homeFumbles) && Objects.equals(homeInterceptions, that.homeInterceptions) && Objects.equals(awayTurnovers, that.awayTurnovers) && Objects.equals(awayFumbles, that.awayFumbles) && Objects.equals(awayInterceptions, that.awayInterceptions) && Objects.equals(homeDefensiveTouchdowns, that.homeDefensiveTouchdowns) && Objects.equals(homeScoopAndScores, that.homeScoopAndScores) && Objects.equals(homePickSixes, that.homePickSixes) && Objects.equals(homeKickoffDefensiveTouchdowns, that.homeKickoffDefensiveTouchdowns) && Objects.equals(awayDefensiveTouchdowns, that.awayDefensiveTouchdowns) && Objects.equals(awayScoopAndScores, that.awayScoopAndScores) && Objects.equals(awayPickSixes, that.awayPickSixes) && Objects.equals(awayKickoffDefensiveTouchdowns, that.awayKickoffDefensiveTouchdowns) && Objects.equals(threadTimestamp, that.threadTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, homeTeam, awayTeam, homeCoach, awayCoach, homeOffensivePlaybook, awayOffensivePlaybook, homeDefensivePlaybook, awayDefensivePlaybook, homeScore, awayScore, possession, quarter, clock, ballLocation, down, yardsToGo, homeWins, homeLosses, awayWins, awayLosses, scorebug, subdivision, thread, gistLink, winProbability, isFinal, isOt, season, waitingOn, winProbabilityPlot, scorePlot, numPlays, homeTimeouts, awayTimeouts, gameTimer, homeTotalYards, awayTotalYards, homePassingYards, awayPassingYards, homeRushingYards, awayRushingYards, homeTimeOfPossession, awayTimeOfPossession, homeAverageDiffOnOffense, homeAverageDiffOnDefense, awayAverageDiffOnOffense, awayAverageDiffOnDefense, homeFieldGoalAttempts, homeFieldGoalMakes, homeFieldGoalPercentage, awayFieldGoalAttempts, awayFieldGoalMakes, awayFieldGoalPercentage, homeLongestFieldGoal, awayLongestFieldGoal, homeLongestTouchdown, awayLongestTouchdown, homePassingAttempts, homePassingCompletions, homePassingPercentage, awayPassingAttempts, awayPassingCompletions, awayPassingPercentage, homeRushingAttempts, homeRushingSuccesses, homeRushingPercentage, awayRushingAttempts, awayRushingSuccesses, awayRushingPercentage, homeThirdDownAttempts, homeThirdDownSuccesses, homeThirdDownPercentage, awayThirdDownAttempts, awayThirdDownSuccesses, awayThirdDownPercentage, homeFourthDownAttempts, homeFourthDownSuccesses, homeFourthDownPercentage, awayFourthDownAttempts, awayFourthDownSuccesses, awayFourthDownPercentage, homeTwoPointAttempts, homeTwoPointSuccesses, homeTwoPointPercentage, awayTwoPointAttempts, awayTwoPointSuccesses, awayTwoPointPercentage, homeOnsideKickAttempts, homeOnsideKickSuccesses, homeOnsideKickPercentage, awayOnsideKickAttempts, awayOnsideKickSuccesses, awayOnsideKickPercentage, homeOffensivePlays, homeDefensivePlays, awayOffensivePlays, awayDefensivePlays, homeTurnovers, homeFumbles, homeInterceptions, awayTurnovers, awayFumbles, awayInterceptions, homeDefensiveTouchdowns, homeScoopAndScores, homePickSixes, homeKickoffDefensiveTouchdowns, awayDefensiveTouchdowns, awayScoopAndScores, awayPickSixes, awayKickoffDefensiveTouchdowns, id, threadTimestamp);
    }
}
