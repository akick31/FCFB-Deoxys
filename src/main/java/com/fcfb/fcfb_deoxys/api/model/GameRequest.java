package com.fcfb.fcfb_deoxys.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fcfb.fcfb_deoxys.utils.ReplaceEnDashDeserializer;

public class GameRequest {
    @JsonProperty("quarter")
    private Integer quarter;

    @JsonProperty("thread")
    private String thread;

    @JsonProperty("home_score")
    private Integer homeScore;

    @JsonProperty("away_score")
    private Integer awayScore;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("game_id")
    private String gameId;

    @JsonProperty("home_team")
    @JsonDeserialize(using = ReplaceEnDashDeserializer.class)
    private String homeTeam;

    @JsonProperty("away_team")
    @JsonDeserialize(using = ReplaceEnDashDeserializer.class)
    private String awayTeam;

    @JsonProperty("home_coach")
    private String homeCoach;

    @JsonProperty("away_coach")
    private String awayCoach;

    @JsonProperty("home_offensive_playbook")
    private String homeOffensivePlaybook;

    @JsonProperty("away_offensive_playbook")
    private String awayOffensivePlaybook;

    @JsonProperty("home_defensive_playbook")
    private String homeDefensivePlaybook;

    @JsonProperty("away_defensive_playbook")
    private String awayDefensivePlaybook;

    @JsonProperty("ball_location")
    @JsonDeserialize(using = ReplaceEnDashDeserializer.class)
    private String ballLocation;

    @JsonProperty("possession")
    @JsonDeserialize(using = ReplaceEnDashDeserializer.class)
    private String possession;

    @JsonProperty("down")
    private Integer down;

    @JsonProperty("yards_to_go")
    private Integer yardsToGo;

    @JsonProperty("gist_link")
    private String gistLink;

    @JsonProperty("win_probability")
    private Double winProbability;

    @JsonProperty("game_length")
    private Integer gameLength;

    @JsonProperty("is_final")
    private Boolean isFinal;

    @JsonProperty("is_ot")
    private Boolean isOt;

    @JsonProperty("season")
    private Integer season;

    @JsonProperty("week")
    private Integer week;

    @JsonProperty("waiting_on")
    private String waitingOn;

    @JsonProperty("num_plays")
    private Integer numPlays;

    @JsonProperty("home_timeouts")
    private Integer homeTimeouts;

    @JsonProperty("away_timeouts")
    private Integer awayTimeouts;

    @JsonProperty("game_timer")
    private String gameTimer;

    @JsonProperty("home_total_yards")
    private Integer homeTotalYards;

    @JsonProperty("away_total_yards")
    private Integer awayTotalYards;

    @JsonProperty("home_passing_yards")
    private Integer homePassingYards;

    @JsonProperty("away_passing_yards")
    private Integer awayPassingYards;

    @JsonProperty("home_rushing_yards")
    private Integer homeRushingYards;

    @JsonProperty("away_rushing_yards")
    private Integer awayRushingYards;

    @JsonProperty("home_time_of_possession")
    private String homeTimeOfPossession;

    @JsonProperty("away_time_of_possession")
    private String awayTimeOfPossession;

    @JsonProperty("home_average_diff_on_offense")
    private Double homeAverageDiffOnOffense;

    @JsonProperty("away_average_diff_on_offense")
    private Double awayAverageDiffOnOffense;

    @JsonProperty("home_average_diff_on_defense")
    private Double homeAverageDiffOnDefense;

    @JsonProperty("away_average_diff_on_defense")
    private Double awayAverageDiffOnDefense;

    @JsonProperty("home_field_goal_attempts")
    private Integer homeFieldGoalAttempts;

    @JsonProperty("home_field_goal_makes")
    private Integer homeFieldGoalMakes;

    @JsonProperty("home_field_goal_percentage")
    private Double homeFieldGoalPercentage;

    @JsonProperty("away_field_goal_attempts")
    private Integer awayFieldGoalAttempts;

    @JsonProperty("away_field_goal_makes")
    private Integer awayFieldGoalMakes;

    @JsonProperty("away_field_goal_percentage")
    private Double awayFieldGoalPercentage;

    @JsonProperty("home_longest_field_goal")
    private Integer homeLongestFieldGoal;

    @JsonProperty("away_longest_field_goal")
    private Integer awayLongestFieldGoal;

    @JsonProperty("home_longest_touchdown")
    private Integer homeLongestTouchdown;

    @JsonProperty("away_longest_touchdown")
    private Integer awayLongestTouchdown;

    @JsonProperty("home_passing_attempts")
    private Integer homePassingAttempts;

    @JsonProperty("home_passing_completions")
    private Integer homePassingCompletions;

    @JsonProperty("home_passing_percentage")
    private Double homePassingPercentage;

    @JsonProperty("home_passing_touchdowns")
    private Integer homePassingTouchdowns;

    @JsonProperty("away_passing_attempts")
    private Integer awayPassingAttempts;

    @JsonProperty("away_passing_completions")
    private Integer awayPassingCompletions;

    @JsonProperty("away_passing_percentage")
    private Double awayPassingPercentage;

    @JsonProperty("away_passing_touchdowns")
    private Integer awayPassingTouchdowns;

    @JsonProperty("home_rushing_attempts")
    private Integer homeRushingAttempts;

    @JsonProperty("home_rushing_successes")
    private Integer homeRushingSuccesses;

    @JsonProperty("home_rushing_percentage")
    private Double homeRushingPercentage;

    @JsonProperty("home_rushing_touchdowns")
    private Integer homeRushingTouchdowns;

    @JsonProperty("away_rushing_attempts")
    private Integer awayRushingAttempts;

    @JsonProperty("away_rushing_successes")
    private Integer awayRushingSuccesses;

    @JsonProperty("away_rushing_percentage")
    private Double awayRushingPercentage;

    @JsonProperty("away_rushing_touchdowns")
    private Integer awayRushingTouchdowns;

    @JsonProperty("home_third_down_attempts")
    private Integer homeThirdDownAttempts;

    @JsonProperty("home_third_down_successes")
    private Integer homeThirdDownSuccesses;

    @JsonProperty("home_third_down_percentage")
    private Double homeThirdDownPercentage;

    @JsonProperty("away_third_down_attempts")
    private Integer awayThirdDownAttempts;

    @JsonProperty("away_third_down_successes")
    private Integer awayThirdDownSuccesses;

    @JsonProperty("away_third_down_percentage")
    private Double awayThirdDownPercentage;

    @JsonProperty("home_fourth_down_attempts")
    private Integer homeFourthDownAttempts;

    @JsonProperty("home_fourth_down_successes")
    private Integer homeFourthDownSuccesses;

    @JsonProperty("home_fourth_down_percentage")
    private Double homeFourthDownPercentage;

    @JsonProperty("away_fourth_down_attempts")
    private Integer awayFourthDownAttempts;

    @JsonProperty("away_fourth_down_successes")
    private Integer awayFourthDownSuccesses;

    @JsonProperty("away_fourth_down_percentage")
    private Double awayFourthDownPercentage;

    @JsonProperty("home_two_point_attempts")
    private Integer homeTwoPointAttempts;

    @JsonProperty("home_two_point_successes")
    private Integer homeTwoPointSuccesses;

    @JsonProperty("home_two_point_percentage")
    private Double homeTwoPointPercentage;

    @JsonProperty("away_two_point_attempts")
    private Integer awayTwoPointAttempts;

    @JsonProperty("away_two_point_successes")
    private Integer awayTwoPointSuccesses;

    @JsonProperty("away_two_point_percentage")
    private Double awayTwoPointPercentage;

    @JsonProperty("home_onside_kick_attempts")
    private Integer homeOnsideKickAttempts;

    @JsonProperty("home_onside_kick_successes")
    private Integer homeOnsideKickSuccesses;

    @JsonProperty("home_onside_kick_percentage")
    private Double homeOnsideKickPercentage;

    @JsonProperty("away_onside_kick_attempts")
    private Integer awayOnsideKickAttempts;

    @JsonProperty("away_onside_kick_successes")
    private Integer awayOnsideKickSuccesses;

    @JsonProperty("away_onside_kick_percentage")
    private Double awayOnsideKickPercentage;

    @JsonProperty("home_offensive_plays")
    private Integer homeOffensivePlays;

    @JsonProperty("home_defensive_plays")
    private Integer homeDefensivePlays;

    @JsonProperty("away_offensive_plays")
    private Integer awayOffensivePlays;

    @JsonProperty("away_defensive_plays")
    private Integer awayDefensivePlays;

    @JsonProperty("home_turnovers")
    private Integer homeTurnovers;

    @JsonProperty("home_fumbles")
    private Integer homeFumbles;

    @JsonProperty("home_interceptions")
    private Integer homeInterceptions;

    @JsonProperty("away_turnovers")
    private Integer awayTurnovers;

    @JsonProperty("away_fumbles")
    private Integer awayFumbles;

    @JsonProperty("away_interceptions")
    private Integer awayInterceptions;

    @JsonProperty("home_defensive_touchdowns")
    private Integer homeDefensiveTouchdowns;

    @JsonProperty("home_scoop_and_scores")
    private Integer homeScoopAndScores;

    @JsonProperty("home_pick_sixes")
    private Integer homePickSixes;

    @JsonProperty("home_kickoff_defensive_touchdowns")
    private Integer homeKickoffDefensiveTouchdowns;

    @JsonProperty("away_defensive_touchdowns")
    private Integer awayDefensiveTouchdowns;

    @JsonProperty("away_scoop_and_scores")
    private Integer awayScoopAndScores;

    @JsonProperty("away_pick_sixes")
    private Integer awayPickSixes;

    @JsonProperty("away_kickoff_defensive_touchdowns")
    private Integer awayKickoffDefensiveTouchdowns;

    @JsonProperty("thread_timestamp")
    private String threadTimestamp;

    @JsonProperty("spread")
    private Integer spread;

    @JsonProperty("home_safeties_forced")
    private Integer homeSafetiesForced;

    @JsonProperty("away_safeties_forced")
    private Integer awaySafetiesForced;

    public Integer getQuarter() {
        return quarter;
    }

    public String getThread() {
        return thread;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public String getClock() {
        return clock;
    }

    public String getGameId() {
        return gameId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getHomeCoach() {
        return homeCoach;
    }

    public String getAwayCoach() {
        return awayCoach;
    }

    public String getHomeOffensivePlaybook() {
        return homeOffensivePlaybook;
    }

    public String getAwayOffensivePlaybook() {
        return awayOffensivePlaybook;
    }

    public String getHomeDefensivePlaybook() {
        return homeDefensivePlaybook;
    }

    public String getAwayDefensivePlaybook() {
        return awayDefensivePlaybook;
    }

    public String getBallLocation() {
        return ballLocation;
    }

    public String getPossession() {
        return possession;
    }

    public Integer getDown() {
        return down;
    }

    public Integer getYardsToGo() {
        return yardsToGo;
    }

    public Integer getGameLength() {
        return gameLength;
    }

    public Boolean getIsFinal() {
        return isFinal;
    }

    public Boolean getIsOt() {
        return isOt;
    }

    public Integer getSeason() {
        return season;
    }

    public Integer getWeek() {
        return week;
    }

    public String getWaitingOn() {
        return waitingOn;
    }

    public String getGistLink() {
        return gistLink;
    }

    public Integer getNumPlays() {
        return numPlays;
    }

    public Integer getHomeTimeouts() {
        return homeTimeouts;
    }

    public Integer getAwayTimeouts() {
        return awayTimeouts;
    }

    public String getGameTimer() {
        return gameTimer;
    }

    public Integer getHomeTotalYards() {
        return homeTotalYards;
    }

    public Integer getAwayTotalYards() {
        return awayTotalYards;
    }

    public Integer getHomePassingYards() {
        return homePassingYards;
    }

    public Integer getAwayPassingYards() {
        return awayPassingYards;
    }

    public Integer getHomeRushingYards() {
        return homeRushingYards;
    }

    public Integer getAwayRushingYards() {
        return awayRushingYards;
    }

    public String getHomeTimeOfPossession() {
        return homeTimeOfPossession;
    }

    public String getAwayTimeOfPossession() {
        return awayTimeOfPossession;
    }

    public Double getHomeAverageDiffOnOffense() {
        return homeAverageDiffOnOffense;
    }

    public Double getAwayAverageDiffOnOffense() {
        return awayAverageDiffOnOffense;
    }

    public Double getHomeAverageDiffOnDefense() {
        return homeAverageDiffOnDefense;
    }

    public Double getAwayAverageDiffOnDefense() {
        return awayAverageDiffOnDefense;
    }

    public Integer getHomeFieldGoalAttempts() {
        return homeFieldGoalAttempts;
    }

    public Integer getHomeFieldGoalMakes() {
        return homeFieldGoalMakes;
    }

    public Double getHomeFieldGoalPercentage() {
        return homeFieldGoalPercentage;
    }

    public Integer getAwayFieldGoalAttempts() {
        return awayFieldGoalAttempts;
    }

    public Integer getAwayFieldGoalMakes() {
        return awayFieldGoalMakes;
    }

    public Double getAwayFieldGoalPercentage() {
        return awayFieldGoalPercentage;
    }

    public Integer getHomeLongestFieldGoal() {
        return homeLongestFieldGoal;
    }

    public Integer getAwayLongestFieldGoal() {
        return awayLongestFieldGoal;
    }

    public Integer getHomeLongestTouchdown() {
        return homeLongestTouchdown;
    }

    public Integer getAwayLongestTouchdown() {
        return awayLongestTouchdown;
    }

    public Integer getHomePassingAttempts() {
        return homePassingAttempts;
    }

    public Integer getHomePassingCompletions() {
        return homePassingCompletions;
    }

    public Double getHomePassingPercentage() {
        return homePassingPercentage;
    }

    public Integer getHomePassingTouchdowns() {
        return homePassingTouchdowns;
    }

    public Integer getAwayPassingAttempts() {
        return awayPassingAttempts;
    }

    public Integer getAwayPassingCompletions() {
        return awayPassingCompletions;
    }

    public Double getAwayPassingPercentage() {
        return awayPassingPercentage;
    }

    public Integer getAwayPassingTouchdowns() {
        return awayPassingTouchdowns;
    }

    public Integer getHomeRushingAttempts() {
        return homeRushingAttempts;
    }

    public Integer getHomeRushingSuccesses() {
        return homeRushingSuccesses;
    }

    public Double getHomeRushingPercentage() {
        return homeRushingPercentage;
    }

    public Integer getHomeRushingTouchdowns() {
        return homeRushingTouchdowns;
    }

    public Integer getAwayRushingAttempts() {
        return awayRushingAttempts;
    }

    public Integer getAwayRushingSuccesses() {
        return awayRushingSuccesses;
    }

    public Double getAwayRushingPercentage() {
        return awayRushingPercentage;
    }

    public Integer getAwayRushingTouchdowns() {
        return awayRushingTouchdowns;
    }

    public Integer getHomeThirdDownAttempts() {
        return homeThirdDownAttempts;
    }

    public Integer getHomeThirdDownSuccesses() {
        return homeThirdDownSuccesses;
    }

    public Double getHomeThirdDownPercentage() {
        return homeThirdDownPercentage;
    }

    public Integer getAwayThirdDownAttempts() {
        return awayThirdDownAttempts;
    }

    public Integer getAwayThirdDownSuccesses() {
        return awayThirdDownSuccesses;
    }

    public Double getAwayThirdDownPercentage() {
        return awayThirdDownPercentage;
    }

    public Integer getHomeFourthDownAttempts() {
        return homeFourthDownAttempts;
    }

    public Integer getHomeFourthDownSuccesses() {
        return homeFourthDownSuccesses;
    }

    public Double getHomeFourthDownPercentage() {
        return homeFourthDownPercentage;
    }

    public Integer getAwayFourthDownAttempts() {
        return awayFourthDownAttempts;
    }

    public Integer getAwayFourthDownSuccesses() {
        return awayFourthDownSuccesses;
    }

    public Double getAwayFourthDownPercentage() {
        return awayFourthDownPercentage;
    }

    public Integer getHomeTwoPointAttempts() {
        return homeTwoPointAttempts;
    }

    public Integer getHomeTwoPointSuccesses() {
        return homeTwoPointSuccesses;
    }

    public Double getHomeTwoPointPercentage() {
        return homeTwoPointPercentage;
    }

    public Integer getAwayTwoPointAttempts() {
        return awayTwoPointAttempts;
    }

    public Integer getAwayTwoPointSuccesses() {
        return awayTwoPointSuccesses;
    }

    public Double getAwayTwoPointPercentage() {
        return awayTwoPointPercentage;
    }

    public Integer getHomeOnsideKickAttempts() {
        return homeOnsideKickAttempts;
    }

    public Integer getHomeOnsideKickSuccesses() {
        return homeOnsideKickSuccesses;
    }

    public Double getHomeOnsideKickPercentage() {
        return homeOnsideKickPercentage;
    }

    public Integer getAwayOnsideKickAttempts() {
        return awayOnsideKickAttempts;
    }

    public Integer getAwayOnsideKickSuccesses() {
        return awayOnsideKickSuccesses;
    }

    public Double getAwayOnsideKickPercentage() {
        return awayOnsideKickPercentage;
    }

    public Integer getHomeOffensivePlays() {
        return homeOffensivePlays;
    }

    public Integer getHomeDefensivePlays() {
        return homeDefensivePlays;
    }

    public Integer getAwayOffensivePlays() {
        return awayOffensivePlays;
    }

    public Integer getAwayDefensivePlays() {
        return awayDefensivePlays;
    }

    public Integer getHomeTurnovers() {
        return homeTurnovers;
    }

    public Integer getHomeFumbles() {
        return homeFumbles;
    }

    public Integer getHomeInterceptions() {
        return homeInterceptions;
    }

    public Integer getAwayTurnovers() {
        return awayTurnovers;
    }

    public Integer getAwayFumbles() {
        return awayFumbles;
    }

    public Integer getAwayInterceptions() {
        return awayInterceptions;
    }

    public Integer getHomeDefensiveTouchdowns() {
        return homeDefensiveTouchdowns;
    }

    public Integer getHomeScoopAndScores() {
        return homeScoopAndScores;
    }

    public Integer getHomePickSixes() {
        return homePickSixes;
    }

    public Integer getHomeKickoffDefensiveTouchdowns() {
        return homeKickoffDefensiveTouchdowns;
    }

    public Integer getAwayDefensiveTouchdowns() {
        return awayDefensiveTouchdowns;
    }

    public Integer getAwayScoopAndScores() {
        return awayScoopAndScores;
    }

    public Integer getAwayPickSixes() {
        return awayPickSixes;
    }

    public Integer getAwayKickoffDefensiveTouchdowns() {
        return awayKickoffDefensiveTouchdowns;
    }

    public Double getWinProbability() {
        return winProbability;
    }

    public String getThreadTimestamp() {
        return threadTimestamp;
    }

    public Integer getSpread() {
        return spread;
    }

    public Integer getHomeSafetiesForced() {
        return homeSafetiesForced;
    }

    public Integer getAwaySafetiesForced() {
        return awaySafetiesForced;
    }
}
