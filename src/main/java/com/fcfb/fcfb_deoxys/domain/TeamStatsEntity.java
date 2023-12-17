package com.fcfb.fcfb_deoxys.domain;

import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "team_stats", schema = "deoxys")
public class TeamStatsEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "season")
    private String season;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "wins")
    private Integer wins;
    @Basic
    @Column(name = "losses")
    private Integer losses;
    @Basic
    @Column(name = "conference_wins")
    private Integer conferenceWins;
    @Basic
    @Column(name = "conference_losses")
    private Integer conferenceLosses;
    @Basic
    @Column(name = "num_plays")
    private Integer numPlays;
    @Basic
    @Column(name = "total_yards")
    private Integer totalYards;
    @Basic
    @Column(name = "passing_yards")
    private Integer passingYards;
    @Basic
    @Column(name = "rushing_yards")
    private Integer rushingYards;
    @Basic
    @Column(name = "time_of_possession")
    private String timeOfPossession;
    @Basic
    @Column(name = "average_diff_on_offense")
    private Double averageDiffOnOffense;
    @Basic
    @Column(name = "average_diff_on_defense")
    private Double averageDiffOnDefense;
    @Basic
    @Column(name = "field_goal_attempts")
    private Integer fieldGoalAttempts;
    @Basic
    @Column(name = "field_goal_makes")
    private Integer fieldGoalMakes;
    @Basic
    @Column(name = "field_goal_percentage")
    private Double fieldGoalPercentage;
    @Basic
    @Column(name = "longest_field_goal")
    private Integer longestFieldGoal;
    @Basic
    @Column(name = "longest_touchdown")
    private Integer longestTouchdown;
    @Basic
    @Column(name = "passing_attempts")
    private Integer passingAttempts;
    @Basic
    @Column(name = "passing_completions")
    private Integer passingCompletions;
    @Basic
    @Column(name = "passing_percentage")
    private Double passingPercentage;
    @Basic
    @Column(name = "passing_touchdowns")
    private Integer passingTouchdowns;
    @Basic
    @Column(name = "rushing_attempts")
    private Integer rushingAttempts;
    @Basic
    @Column(name = "rushing_successes")
    private Integer rushingSuccesses;
    @Basic
    @Column(name = "rushing_percentage")
    private Double rushingPercentage;
    @Basic
    @Column(name = "rushing_touchdowns")
    private Integer rushingTouchdowns;
    @Basic
    @Column(name = "third_down_attempts")
    private Integer thirdDownAttempts;
    @Basic
    @Column(name = "third_down_successes")
    private Integer thirdDownSuccesses;
    @Basic
    @Column(name = "third_down_percentage")
    private Double thirdDownPercentage;
    @Basic
    @Column(name = "fourth_down_attempts")
    private Integer fourthDownAttempts;
    @Basic
    @Column(name = "fourth_down_successes")
    private Integer fourthDownSuccesses;
    @Basic
    @Column(name = "fourth_down_percentage")
    private Double fourthDownPercentage;
    @Basic
    @Column(name = "two_point_attempts")
    private Integer twoPointAttempts;
    @Basic
    @Column(name = "two_point_successes")
    private Integer twoPointSuccesses;
    @Basic
    @Column(name = "two_point_percentage")
    private Double twoPointPercentage;
    @Basic
    @Column(name = "onside_kick_attempts")
    private Integer onsideKickAttempts;
    @Basic
    @Column(name = "onside_kick_successes")
    private Integer onsideKickSuccesses;
    @Basic
    @Column(name = "onside_kick_percentage")
    private Double onsideKickPercentage;
    @Basic
    @Column(name = "offensive_plays")
    private Integer offensivePlays;
    @Basic
    @Column(name = "defensive_plays")
    private Integer defensivePlays;
    @Basic
    @Column(name = "turnovers")
    private Integer turnovers;
    @Basic
    @Column(name = "fumbles")
    private Integer fumbles;
    @Basic
    @Column(name = "interceptions")
    private Integer interceptions;
    @Basic
    @Column(name = "defensive_touchdowns")
    private Integer defensiveTouchdowns;
    @Basic
    @Column(name = "scoop_and_scores")
    private Integer scoopAndScores;
    @Basic
    @Column(name = "pick_sixes")
    private Integer pickSixes;
    @Basic
    @Column(name = "kickoff_defensive_touchdowns")
    private Integer kickoffDefensiveTouchdowns;
    @Basic
    @Column(name = "safeties_forced")
    private Integer safetiesForced;
    @Basic
    @Column(name = "safeties_allowed")
    private Integer safetiesAllowed;
    @Basic
    @Column(name = "average_yards_per_game")
    private Double averageYardsPerGame;
    @Basic
    @Column(name = "average_yards_allowed_per_game")
    private Double averageYardsAllowedPerGame;
    @Basic
    @Column(name = "average_rushing_yards_allowed_per_game")
    private Integer averageRushingYardsAllowedPerGame;
    @Basic
    @Column(name = "average_passing_yards_allowed_per_game")
    private Integer averagePassingYardsAllowedPerGame;
    @Basic
    @Column(name = "average_touchdowns_per_game")
    private Double averageTouchdownsPerGame;
    @Basic
    @Column(name = "average_touchdowns_allowed_per_game")
    private Double averageTouchdownsAllowedPerGame;
    @Basic
    @Column(name = "average_points_per_game")
    private Double averagePointsPerGame;
    @Basic
    @Column(name = "average_points_allowed_per_game")
    private Double averagePointsAllowedPerGame;
    @Basic
    @Column(name = "passing_yards_against")
    private Integer passingYardsAgainst;
    @Basic
    @Column(name = "rushing_yards_against")
    private Integer rushingYardsAgainst;
    @Basic
    @Column(name = "time_of_possession_against")
    private String timeOfPossessionAgainst;
    @Basic
    @Column(name = "field_goal_attempts_against")
    private Integer fieldGoalAttemptsAgainst;
    @Basic
    @Column(name = "field_goal_makes_against")
    private Integer fieldGoalMakesAgainst;
    @Basic
    @Column(name = "field_goal_percentage_against")
    private Double fieldGoalPercentageAgainst;
    @Basic
    @Column(name = "longest_field_goal_against")
    private Integer longestFieldGoalAgainst;
    @Basic
    @Column(name = "longest_touchdown_against")
    private Integer longestTouchdownAgainst;
    @Basic
    @Column(name = "passing_attempts_against")
    private Integer passingAttemptsAgainst;
    @Basic
    @Column(name = "passing_completions_against")
    private Integer passingCompletionsAgainst;
    @Basic
    @Column(name = "passing_percentage_against")
    private Double passingPercentageAgainst;
    @Basic
    @Column(name = "passing_touchdowns_against")
    private Integer passingTouchdownsAgainst;
    @Basic
    @Column(name = "rushing_attempts_against")
    private Integer rushingAttemptsAgainst;
    @Basic
    @Column(name = "rushing_successes_against")
    private Integer rushingSuccessesAgainst;
    @Basic
    @Column(name = "rushing_percentage_against")
    private Double rushingPercentageAgainst;
    @Basic
    @Column(name = "rushing_touchdowns_against")
    private Integer rushingTouchdownsAgainst;
    @Basic
    @Column(name = "third_down_attempts_against")
    private Integer thirdDownAttemptsAgainst;
    @Basic
    @Column(name = "third_down_successes_against")
    private Integer thirdDownSuccessesAgainst;
    @Basic
    @Column(name = "third_down_percentage_against")
    private Double thirdDownPercentageAgainst;
    @Basic
    @Column(name = "fourth_down_attempts_against")
    private Integer fourthDownAttemptsAgainst;
    @Basic
    @Column(name = "fourth_down_successes_against")
    private Integer fourthDownSuccessesAgainst;
    @Basic
    @Column(name = "fourth_down_percentage_against")
    private Double fourthDownPercentageAgainst;
    @Basic
    @Column(name = "two_point_attempts_against")
    private Integer twoPointAttemptsAgainst;
    @Basic
    @Column(name = "two_point_successes_against")
    private Integer twoPointSuccessesAgainst;
    @Basic
    @Column(name = "two_point_percentage_against")
    private Double twoPointPercentageAgainst;
    @Basic
    @Column(name = "onside_kick_attempts_against")
    private Integer onsideKickAttemptsAgainst;
    @Basic
    @Column(name = "onside_kick_successes_against")
    private Integer onsideKickSuccessesAgainst;
    @Basic
    @Column(name = "onside_kick_percentage_against")
    private Double onsideKickPercentageAgainst;
    @Basic
    @Column(name = "turnovers_forced")
    private Integer turnoversForced;
    @Basic
    @Column(name = "fumbles_forced")
    private Integer fumblesForced;
    @Basic
    @Column(name = "interceptions_forced")
    private Integer interceptionsForced;
    @Basic
    @Column(name = "defensive_touchdowns_against")
    private Integer defensiveTouchdownsAgainst;
    @Basic
    @Column(name = "scoop_and_scores_against")
    private Integer scoopAndScoresAgainst;
    @Basic
    @Column(name = "pick_sixes_against")
    private Integer pickSixesAgainst;
    @Basic
    @Column(name = "blocked_field_goals")
    private Integer blockedFieldGoals;
    @Basic
    @Column(name = "blocked_field_goals_against")
    private Integer blockedFieldGoalsAgainst;
    @Basic
    @Column(name = "kick_sixes")
    private Integer kickSixes;
    @Basic
    @Column(name = "kick_sixes_against")
    private Integer kickSixesAgainst;
    @Basic
    @Column(name = "pat_attempts")
    private Integer patAttempts;
    @Basic
    @Column(name = "pat_successes")
    private Integer patSuccesses;
    @Basic
    @Column(name = "pat_percentage")
    private Double patPercentage;
    @Basic
    @Column(name = "pat_two_point_return")
    private Integer patTwoPointReturn;
    @Basic
    @Column(name = "pat_attempts_against")
    private Integer patAttemptsAgainst;
    @Basic
    @Column(name = "pat_successes_against")
    private Integer patSuccessesAgainst;
    @Basic
    @Column(name = "pat_percentage_against")
    private Double patPercentageAgainst;
    @Basic
    @Column(name = "pat_two_point_return_against")
    private Integer patTwoPointReturnAgainst;
    @Basic
    @Column(name = "total_punts")
    private Integer totalPunts;
    @Basic
    @Column(name = "total_punts_against")
    private Integer totalPuntsAgainst;
    @Basic
    @Column(name = "longest_punt")
    private Integer longestPunt;
    @Basic
    @Column(name = "longest_punt_against")
    private Integer longestPuntAgainst;
    @Basic
    @Column(name = "average_punt")
    private Double averagePunt;
    @Basic
    @Column(name = "average_punt_against")
    private Double averagePuntAgainst;
    @Basic
    @Column(name = "punt_touchbacks")
    private Integer puntTouchbacks;
    @Basic
    @Column(name = "punt_touchbacks_against")
    private Integer puntTouchbacksAgainst;
    @Basic
    @Column(name = "punt_return_touchdowns")
    private Integer puntReturnTouchdowns;
    @Basic
    @Column(name = "punt_return_touchdowns_against")
    private Integer puntReturnTouchdownsAgainst;
    @Basic
    @Column(name = "muffed_punts_recovered")
    private Integer muffedPuntsRecovered;
    @Basic
    @Column(name = "muffed_punts_recovered_against")
    private Integer muffedPuntsRecoveredAgainst;
    @Basic
    @Column(name = "kickoffs")
    private Integer kickoffs;
    @Basic
    @Column(name = "kickoffs_against")
    private Integer kickoffsAgainst;
    @Basic
    @Column(name = "kickoff_touchbacks")
    private Integer kickoffTouchbacks;
    @Basic
    @Column(name = "kickoff_touchbacks_against")
    private Integer kickoffTouchbacksAgainst;
    @Basic
    @Column(name = "kickoff_muff_recoveries")
    private Integer kickoffMuffRecoveries;
    @Basic
    @Column(name = "kickoff_muff_recoveries_against")
    private Integer kickoffMuffRecoveriesAgainst;

    public TeamStatsEntity(String season, String name, Integer wins, Integer losses, Integer conferenceWins, Integer conferenceLosses, Integer numPlays, Integer totalYards, Integer passingYards, Integer rushingYards, String timeOfPossession, Double averageDiffOnOffense, Double averageDiffOnDefense, Integer fieldGoalAttempts, Integer fieldGoalMakes, Double fieldGoalPercentage, Integer longestFieldGoal, Integer longestTouchdown, Integer passingAttempts, Integer passingCompletions, Double passingPercentage, Integer passingTouchdowns, Integer rushingAttempts, Integer rushingSuccesses, Double rushingPercentage, Integer rushingTouchdowns, Integer thirdDownAttempts, Integer thirdDownSuccesses, Double thirdDownPercentage, Integer fourthDownAttempts, Integer fourthDownSuccesses, Double fourthDownPercentage, Integer twoPointAttempts, Integer twoPointSuccesses, Double twoPointPercentage, Integer onsideKickAttempts, Integer onsideKickSuccesses, Double onsideKickPercentage, Integer offensivePlays, Integer defensivePlays, Integer turnovers, Integer fumbles, Integer interceptions, Integer defensiveTouchdowns, Integer scoopAndScores, Integer pickSixes, Integer kickoffDefensiveTouchdowns, Integer safetiesForced, Integer safetiesAllowed, Double averageYardsPerGame, Double averageYardsAllowedPerGame, Integer averageRushingYardsAllowedPerGame, Integer averagePassingYardsAllowedPerGame, Double averageTouchdownsPerGame, Double averageTouchdownsAllowedPerGame, Double averagePointsPerGame, Double averagePointsAllowedPerGame, Integer passingYardsAgainst, Integer rushingYardsAgainst, String timeOfPossessionAgainst, Integer fieldGoalAttemptsAgainst, Integer fieldGoalMakesAgainst, Double fieldGoalPercentageAgainst, Integer longestFieldGoalAgainst, Integer longestTouchdownAgainst, Integer passingAttemptsAgainst, Integer passingCompletionsAgainst, Double passingPercentageAgainst, Integer passingTouchdownsAgainst, Integer rushingAttemptsAgainst, Integer rushingSuccessesAgainst, Double rushingPercentageAgainst, Integer rushingTouchdownsAgainst, Integer thirdDownAttemptsAgainst, Integer thirdDownSuccessesAgainst, Double thirdDownPercentageAgainst, Integer fourthDownAttemptsAgainst, Integer fourthDownSuccessesAgainst, Double fourthDownPercentageAgainst, Integer twoPointAttemptsAgainst, Integer twoPointSuccessesAgainst, Double twoPointPercentageAgainst, Integer onsideKickAttemptsAgainst, Integer onsideKickSuccessesAgainst, Double onsideKickPercentageAgainst, Integer turnoversForced, Integer fumblesForced, Integer interceptionsForced, Integer defensiveTouchdownsAgainst, Integer scoopAndScoresAgainst, Integer pickSixesAgainst, Integer blockedFieldGoals, Integer blockedFieldGoalsAgainst, Integer kickSixes, Integer kickSixesAgainst, Integer patAttempts, Integer patSuccesses, Double patPercentage, Integer patTwoPointReturn, Integer patAttemptsAgainst, Integer patSuccessesAgainst, Double patPercentageAgainst, Integer patTwoPointReturnAgainst, Integer totalPunts, Integer totalPuntsAgainst, Integer longestPunt, Integer longestPuntAgainst, Double averagePunt, Double averagePuntAgainst, Integer puntTouchbacks, Integer puntTouchbacksAgainst, Integer puntReturnTouchdowns, Integer puntReturnTouchdownsAgainst, Integer muffedPuntsRecovered, Integer muffedPuntsRecoveredAgainst, Integer kickoffs, Integer kickoffsAgainst, Integer kickoffTouchbacks, Integer kickoffTouchbacksAgainst, Integer kickoffMuffRecoveries, Integer kickoffMuffRecoveriesAgainst) {
        this.season = season;
        this.name = name;
        this.wins = wins;
        this.losses = losses;
        this.conferenceWins = conferenceWins;
        this.conferenceLosses = conferenceLosses;
        this.numPlays = numPlays;
        this.totalYards = totalYards;
        this.passingYards = passingYards;
        this.rushingYards = rushingYards;
        this.timeOfPossession = timeOfPossession;
        this.averageDiffOnOffense = averageDiffOnOffense;
        this.averageDiffOnDefense = averageDiffOnDefense;
        this.fieldGoalAttempts = fieldGoalAttempts;
        this.fieldGoalMakes = fieldGoalMakes;
        this.fieldGoalPercentage = fieldGoalPercentage;
        this.longestFieldGoal = longestFieldGoal;
        this.longestTouchdown = longestTouchdown;
        this.passingAttempts = passingAttempts;
        this.passingCompletions = passingCompletions;
        this.passingPercentage = passingPercentage;
        this.passingTouchdowns = passingTouchdowns;
        this.rushingAttempts = rushingAttempts;
        this.rushingSuccesses = rushingSuccesses;
        this.rushingPercentage = rushingPercentage;
        this.rushingTouchdowns = rushingTouchdowns;
        this.thirdDownAttempts = thirdDownAttempts;
        this.thirdDownSuccesses = thirdDownSuccesses;
        this.thirdDownPercentage = thirdDownPercentage;
        this.fourthDownAttempts = fourthDownAttempts;
        this.fourthDownSuccesses = fourthDownSuccesses;
        this.fourthDownPercentage = fourthDownPercentage;
        this.twoPointAttempts = twoPointAttempts;
        this.twoPointSuccesses = twoPointSuccesses;
        this.twoPointPercentage = twoPointPercentage;
        this.onsideKickAttempts = onsideKickAttempts;
        this.onsideKickSuccesses = onsideKickSuccesses;
        this.onsideKickPercentage = onsideKickPercentage;
        this.offensivePlays = offensivePlays;
        this.defensivePlays = defensivePlays;
        this.turnovers = turnovers;
        this.fumbles = fumbles;
        this.interceptions = interceptions;
        this.defensiveTouchdowns = defensiveTouchdowns;
        this.scoopAndScores = scoopAndScores;
        this.pickSixes = pickSixes;
        this.kickoffDefensiveTouchdowns = kickoffDefensiveTouchdowns;
        this.safetiesForced = safetiesForced;
        this.safetiesAllowed = safetiesAllowed;
        this.averageYardsPerGame = averageYardsPerGame;
        this.averageYardsAllowedPerGame = averageYardsAllowedPerGame;
        this.averageRushingYardsAllowedPerGame = averageRushingYardsAllowedPerGame;
        this.averagePassingYardsAllowedPerGame = averagePassingYardsAllowedPerGame;
        this.averageTouchdownsPerGame = averageTouchdownsPerGame;
        this.averageTouchdownsAllowedPerGame = averageTouchdownsAllowedPerGame;
        this.averagePointsPerGame = averagePointsPerGame;
        this.averagePointsAllowedPerGame = averagePointsAllowedPerGame;
        this.passingYardsAgainst = passingYardsAgainst;
        this.rushingYardsAgainst = rushingYardsAgainst;
        this.timeOfPossessionAgainst = timeOfPossessionAgainst;
        this.fieldGoalAttemptsAgainst = fieldGoalAttemptsAgainst;
        this.fieldGoalMakesAgainst = fieldGoalMakesAgainst;
        this.fieldGoalPercentageAgainst = fieldGoalPercentageAgainst;
        this.longestFieldGoalAgainst = longestFieldGoalAgainst;
        this.longestTouchdownAgainst = longestTouchdownAgainst;
        this.passingAttemptsAgainst = passingAttemptsAgainst;
        this.passingCompletionsAgainst = passingCompletionsAgainst;
        this.passingPercentageAgainst = passingPercentageAgainst;
        this.passingTouchdownsAgainst = passingTouchdownsAgainst;
        this.rushingAttemptsAgainst = rushingAttemptsAgainst;
        this.rushingSuccessesAgainst = rushingSuccessesAgainst;
        this.rushingPercentageAgainst = rushingPercentageAgainst;
        this.rushingTouchdownsAgainst = rushingTouchdownsAgainst;
        this.thirdDownAttemptsAgainst = thirdDownAttemptsAgainst;
        this.thirdDownSuccessesAgainst = thirdDownSuccessesAgainst;
        this.thirdDownPercentageAgainst = thirdDownPercentageAgainst;
        this.fourthDownAttemptsAgainst = fourthDownAttemptsAgainst;
        this.fourthDownSuccessesAgainst = fourthDownSuccessesAgainst;
        this.fourthDownPercentageAgainst = fourthDownPercentageAgainst;
        this.twoPointAttemptsAgainst = twoPointAttemptsAgainst;
        this.twoPointSuccessesAgainst = twoPointSuccessesAgainst;
        this.twoPointPercentageAgainst = twoPointPercentageAgainst;
        this.onsideKickAttemptsAgainst = onsideKickAttemptsAgainst;
        this.onsideKickSuccessesAgainst = onsideKickSuccessesAgainst;
        this.onsideKickPercentageAgainst = onsideKickPercentageAgainst;
        this.turnoversForced = turnoversForced;
        this.fumblesForced = fumblesForced;
        this.interceptionsForced = interceptionsForced;
        this.defensiveTouchdownsAgainst = defensiveTouchdownsAgainst;
        this.scoopAndScoresAgainst = scoopAndScoresAgainst;
        this.pickSixesAgainst = pickSixesAgainst;
        this.blockedFieldGoals = blockedFieldGoals;
        this.blockedFieldGoalsAgainst = blockedFieldGoalsAgainst;
        this.kickSixes = kickSixes;
        this.kickSixesAgainst = kickSixesAgainst;
        this.patAttempts = patAttempts;
        this.patSuccesses = patSuccesses;
        this.patPercentage = patPercentage;
        this.patTwoPointReturn = patTwoPointReturn;
        this.patAttemptsAgainst = patAttemptsAgainst;
        this.patSuccessesAgainst = patSuccessesAgainst;
        this.patPercentageAgainst = patPercentageAgainst;
        this.patTwoPointReturnAgainst = patTwoPointReturnAgainst;
        this.totalPunts = totalPunts;
        this.totalPuntsAgainst = totalPuntsAgainst;
        this.longestPunt = longestPunt;
        this.longestPuntAgainst = longestPuntAgainst;
        this.averagePunt = averagePunt;
        this.averagePuntAgainst = averagePuntAgainst;
        this.puntTouchbacks = puntTouchbacks;
        this.puntTouchbacksAgainst = puntTouchbacksAgainst;
        this.puntReturnTouchdowns = puntReturnTouchdowns;
        this.puntReturnTouchdownsAgainst = puntReturnTouchdownsAgainst;
        this.muffedPuntsRecovered = muffedPuntsRecovered;
        this.muffedPuntsRecoveredAgainst = muffedPuntsRecoveredAgainst;
        this.kickoffs = kickoffs;
        this.kickoffsAgainst = kickoffsAgainst;
        this.kickoffTouchbacks = kickoffTouchbacks;
        this.kickoffTouchbacksAgainst = kickoffTouchbacksAgainst;
        this.kickoffMuffRecoveries = kickoffMuffRecoveries;
        this.kickoffMuffRecoveriesAgainst = kickoffMuffRecoveriesAgainst;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getConferenceWins() {
        return conferenceWins;
    }

    public void setConferenceWins(Integer conferenceWins) {
        this.conferenceWins = conferenceWins;
    }

    public Integer getConferenceLosses() {
        return conferenceLosses;
    }

    public void setConferenceLosses(Integer conferenceLosses) {
        this.conferenceLosses = conferenceLosses;
    }

    public Integer getNumPlays() {
        return numPlays;
    }

    public void setNumPlays(Integer numPlays) {
        this.numPlays = numPlays;
    }

    public Integer getTotalYards() {
        return totalYards;
    }

    public void setTotalYards(Integer totalYards) {
        this.totalYards = totalYards;
    }

    public Integer getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(Integer passingYards) {
        this.passingYards = passingYards;
    }

    public Integer getRushingYards() {
        return rushingYards;
    }

    public void setRushingYards(Integer rushingYards) {
        this.rushingYards = rushingYards;
    }

    public String getTimeOfPossession() {
        return timeOfPossession;
    }

    public void setTimeOfPossession(String timeOfPossession) {
        this.timeOfPossession = timeOfPossession;
    }

    public Double getAverageDiffOnOffense() {
        return averageDiffOnOffense;
    }

    public void setAverageDiffOnOffense(Double averageDiffOnOffense) {
        this.averageDiffOnOffense = averageDiffOnOffense;
    }

    public Double getAverageDiffOnDefense() {
        return averageDiffOnDefense;
    }

    public void setAverageDiffOnDefense(Double averageDiffOnDefense) {
        this.averageDiffOnDefense = averageDiffOnDefense;
    }

    public Integer getFieldGoalAttempts() {
        return fieldGoalAttempts;
    }

    public void setFieldGoalAttempts(Integer fieldGoalAttempts) {
        this.fieldGoalAttempts = fieldGoalAttempts;
    }

    public Integer getFieldGoalMakes() {
        return fieldGoalMakes;
    }

    public void setFieldGoalMakes(Integer fieldGoalMakes) {
        this.fieldGoalMakes = fieldGoalMakes;
    }

    public Double getFieldGoalPercentage() {
        return fieldGoalPercentage;
    }

    public void setFieldGoalPercentage(Double fieldGoalPercentage) {
        this.fieldGoalPercentage = fieldGoalPercentage;
    }

    public Integer getLongestFieldGoal() {
        return longestFieldGoal;
    }

    public void setLongestFieldGoal(Integer longestFieldGoal) {
        this.longestFieldGoal = longestFieldGoal;
    }

    public Integer getLongestTouchdown() {
        return longestTouchdown;
    }

    public void setLongestTouchdown(Integer longestTouchdown) {
        this.longestTouchdown = longestTouchdown;
    }

    public Integer getPassingAttempts() {
        return passingAttempts;
    }

    public void setPassingAttempts(Integer passingAttempts) {
        this.passingAttempts = passingAttempts;
    }

    public Integer getPassingCompletions() {
        return passingCompletions;
    }

    public void setPassingCompletions(Integer passingCompletions) {
        this.passingCompletions = passingCompletions;
    }

    public Double getPassingPercentage() {
        return passingPercentage;
    }

    public void setPassingPercentage(Double passingPercentage) {
        this.passingPercentage = passingPercentage;
    }

    public Integer getPassingTouchdowns() {
        return passingTouchdowns;
    }

    public void setPassingTouchdowns(Integer passingTouchdowns) {
        this.passingTouchdowns = passingTouchdowns;
    }

    public Integer getRushingAttempts() {
        return rushingAttempts;
    }

    public void setRushingAttempts(Integer rushingAttempts) {
        this.rushingAttempts = rushingAttempts;
    }

    public Integer getRushingSuccesses() {
        return rushingSuccesses;
    }

    public void setRushingSuccesses(Integer rushingSuccesses) {
        this.rushingSuccesses = rushingSuccesses;
    }

    public Double getRushingPercentage() {
        return rushingPercentage;
    }

    public void setRushingPercentage(Double rushingPercentage) {
        this.rushingPercentage = rushingPercentage;
    }

    public Integer getRushingTouchdowns() {
        return rushingTouchdowns;
    }

    public void setRushingTouchdowns(Integer rushingTouchdowns) {
        this.rushingTouchdowns = rushingTouchdowns;
    }

    public Integer getThirdDownAttempts() {
        return thirdDownAttempts;
    }

    public void setThirdDownAttempts(Integer thirdDownAttempts) {
        this.thirdDownAttempts = thirdDownAttempts;
    }

    public Integer getThirdDownSuccesses() {
        return thirdDownSuccesses;
    }

    public void setThirdDownSuccesses(Integer thirdDownSuccesses) {
        this.thirdDownSuccesses = thirdDownSuccesses;
    }

    public Double getThirdDownPercentage() {
        return thirdDownPercentage;
    }

    public void setThirdDownPercentage(Double thirdDownPercentage) {
        this.thirdDownPercentage = thirdDownPercentage;
    }

    public Integer getFourthDownAttempts() {
        return fourthDownAttempts;
    }

    public void setFourthDownAttempts(Integer fourthDownAttempts) {
        this.fourthDownAttempts = fourthDownAttempts;
    }

    public Integer getFourthDownSuccesses() {
        return fourthDownSuccesses;
    }

    public void setFourthDownSuccesses(Integer fourthDownSuccesses) {
        this.fourthDownSuccesses = fourthDownSuccesses;
    }

    public Double getFourthDownPercentage() {
        return fourthDownPercentage;
    }

    public void setFourthDownPercentage(Double fourthDownPercentage) {
        this.fourthDownPercentage = fourthDownPercentage;
    }

    public Integer getTwoPointAttempts() {
        return twoPointAttempts;
    }

    public void setTwoPointAttempts(Integer twoPointAttempts) {
        this.twoPointAttempts = twoPointAttempts;
    }

    public Integer getTwoPointSuccesses() {
        return twoPointSuccesses;
    }

    public void setTwoPointSuccesses(Integer twoPointSuccesses) {
        this.twoPointSuccesses = twoPointSuccesses;
    }

    public Double getTwoPointPercentage() {
        return twoPointPercentage;
    }

    public void setTwoPointPercentage(Double twoPointPercentage) {
        this.twoPointPercentage = twoPointPercentage;
    }

    public Integer getOnsideKickAttempts() {
        return onsideKickAttempts;
    }

    public void setOnsideKickAttempts(Integer onsideKickAttempts) {
        this.onsideKickAttempts = onsideKickAttempts;
    }

    public Integer getOnsideKickSuccesses() {
        return onsideKickSuccesses;
    }

    public void setOnsideKickSuccesses(Integer onsideKickSuccesses) {
        this.onsideKickSuccesses = onsideKickSuccesses;
    }

    public Double getOnsideKickPercentage() {
        return onsideKickPercentage;
    }

    public void setOnsideKickPercentage(Double onsideKickPercentage) {
        this.onsideKickPercentage = onsideKickPercentage;
    }

    public Integer getOffensivePlays() {
        return offensivePlays;
    }

    public void setOffensivePlays(Integer offensivePlays) {
        this.offensivePlays = offensivePlays;
    }

    public Integer getDefensivePlays() {
        return defensivePlays;
    }

    public void setDefensivePlays(Integer defensivePlays) {
        this.defensivePlays = defensivePlays;
    }

    public Integer getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Integer turnovers) {
        this.turnovers = turnovers;
    }

    public Integer getFumbles() {
        return fumbles;
    }

    public void setFumbles(Integer fumbles) {
        this.fumbles = fumbles;
    }

    public Integer getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
    }

    public Integer getDefensiveTouchdowns() {
        return defensiveTouchdowns;
    }

    public void setDefensiveTouchdowns(Integer defensiveTouchdowns) {
        this.defensiveTouchdowns = defensiveTouchdowns;
    }

    public Integer getScoopAndScores() {
        return scoopAndScores;
    }

    public void setScoopAndScores(Integer scoopAndScores) {
        this.scoopAndScores = scoopAndScores;
    }

    public Integer getPickSixes() {
        return pickSixes;
    }

    public void setPickSixes(Integer pickSixes) {
        this.pickSixes = pickSixes;
    }

    public Integer getKickoffDefensiveTouchdowns() {
        return kickoffDefensiveTouchdowns;
    }

    public void setKickoffDefensiveTouchdowns(Integer kickoffDefensiveTouchdowns) {
        this.kickoffDefensiveTouchdowns = kickoffDefensiveTouchdowns;
    }

    public Integer getSafetiesForced() {
        return safetiesForced;
    }

    public void setSafetiesForced(Integer safetiesForced) {
        this.safetiesForced = safetiesForced;
    }

    public Integer getSafetiesAllowed() {
        return safetiesAllowed;
    }

    public void setSafetiesAllowed(Integer safetiesAllowed) {
        this.safetiesAllowed = safetiesAllowed;
    }

    public Double getAverageYardsPerGame() {
        return averageYardsPerGame;
    }

    public void setAverageYardsPerGame(Double averageYardsPerGame) {
        this.averageYardsPerGame = averageYardsPerGame;
    }

    public Double getAverageYardsAllowedPerGame() {
        return averageYardsAllowedPerGame;
    }

    public void setAverageYardsAllowedPerGame(Double averageYardsAllowedPerGame) {
        this.averageYardsAllowedPerGame = averageYardsAllowedPerGame;
    }

    public Integer getAverageRushingYardsAllowedPerGame() {
        return averageRushingYardsAllowedPerGame;
    }

    public void setAverageRushingYardsAllowedPerGame(Integer averageRushingYardsAllowedPerGame) {
        this.averageRushingYardsAllowedPerGame = averageRushingYardsAllowedPerGame;
    }

    public Integer getAveragePassingYardsAllowedPerGame() {
        return averagePassingYardsAllowedPerGame;
    }

    public void setAveragePassingYardsAllowedPerGame(Integer averagePassingYardsAllowedPerGame) {
        this.averagePassingYardsAllowedPerGame = averagePassingYardsAllowedPerGame;
    }

    public Double getAverageTouchdownsPerGame() {
        return averageTouchdownsPerGame;
    }

    public void setAverageTouchdownsPerGame(Double averageTouchdownsPerGame) {
        this.averageTouchdownsPerGame = averageTouchdownsPerGame;
    }

    public Double getAverageTouchdownsAllowedPerGame() {
        return averageTouchdownsAllowedPerGame;
    }

    public void setAverageTouchdownsAllowedPerGame(Double averageTouchdownsAllowedPerGame) {
        this.averageTouchdownsAllowedPerGame = averageTouchdownsAllowedPerGame;
    }

    public Double getAveragePointsPerGame() {
        return averagePointsPerGame;
    }

    public void setAveragePointsPerGame(Double averagePointsPerGame) {
        this.averagePointsPerGame = averagePointsPerGame;
    }

    public Double getAveragePointsAllowedPerGame() {
        return averagePointsAllowedPerGame;
    }

    public void setAveragePointsAllowedPerGame(Double averagePointsAllowedPerGame) {
        this.averagePointsAllowedPerGame = averagePointsAllowedPerGame;
    }

    public Integer getPassingYardsAgainst() {
        return passingYardsAgainst;
    }

    public void setPassingYardsAgainst(Integer passingYardsAgainst) {
        this.passingYardsAgainst = passingYardsAgainst;
    }

    public Integer getRushingYardsAgainst() {
        return rushingYardsAgainst;
    }

    public void setRushingYardsAgainst(Integer rushingYardsAgainst) {
        this.rushingYardsAgainst = rushingYardsAgainst;
    }

    public String getTimeOfPossessionAgainst() {
        return timeOfPossessionAgainst;
    }

    public void setTimeOfPossessionAgainst(String timeOfPossessionAgainst) {
        this.timeOfPossessionAgainst = timeOfPossessionAgainst;
    }

    public Integer getFieldGoalAttemptsAgainst() {
        return fieldGoalAttemptsAgainst;
    }

    public void setFieldGoalAttemptsAgainst(Integer fieldGoalAttemptsAgainst) {
        this.fieldGoalAttemptsAgainst = fieldGoalAttemptsAgainst;
    }

    public Integer getFieldGoalMakesAgainst() {
        return fieldGoalMakesAgainst;
    }

    public void setFieldGoalMakesAgainst(Integer fieldGoalMakesAgainst) {
        this.fieldGoalMakesAgainst = fieldGoalMakesAgainst;
    }

    public Double getFieldGoalPercentageAgainst() {
        return fieldGoalPercentageAgainst;
    }

    public void setFieldGoalPercentageAgainst(Double fieldGoalPercentageAgainst) {
        this.fieldGoalPercentageAgainst = fieldGoalPercentageAgainst;
    }

    public Integer getLongestFieldGoalAgainst() {
        return longestFieldGoalAgainst;
    }

    public void setLongestFieldGoalAgainst(Integer longestFieldGoalAgainst) {
        this.longestFieldGoalAgainst = longestFieldGoalAgainst;
    }

    public Integer getLongestTouchdownAgainst() {
        return longestTouchdownAgainst;
    }

    public void setLongestTouchdownAgainst(Integer longestTouchdownAgainst) {
        this.longestTouchdownAgainst = longestTouchdownAgainst;
    }

    public Integer getPassingAttemptsAgainst() {
        return passingAttemptsAgainst;
    }

    public void setPassingAttemptsAgainst(Integer passingAttemptsAgainst) {
        this.passingAttemptsAgainst = passingAttemptsAgainst;
    }

    public Integer getPassingCompletionsAgainst() {
        return passingCompletionsAgainst;
    }

    public void setPassingCompletionsAgainst(Integer passingCompletionsAgainst) {
        this.passingCompletionsAgainst = passingCompletionsAgainst;
    }

    public Double getPassingPercentageAgainst() {
        return passingPercentageAgainst;
    }

    public void setPassingPercentageAgainst(Double passingPercentageAgainst) {
        this.passingPercentageAgainst = passingPercentageAgainst;
    }

    public Integer getPassingTouchdownsAgainst() {
        return passingTouchdownsAgainst;
    }

    public void setPassingTouchdownsAgainst(Integer passingTouchdownsAgainst) {
        this.passingTouchdownsAgainst = passingTouchdownsAgainst;
    }

    public Integer getRushingAttemptsAgainst() {
        return rushingAttemptsAgainst;
    }

    public void setRushingAttemptsAgainst(Integer rushingAttemptsAgainst) {
        this.rushingAttemptsAgainst = rushingAttemptsAgainst;
    }

    public Integer getRushingSuccessesAgainst() {
        return rushingSuccessesAgainst;
    }

    public void setRushingSuccessesAgainst(Integer rushingSuccessesAgainst) {
        this.rushingSuccessesAgainst = rushingSuccessesAgainst;
    }

    public Double getRushingPercentageAgainst() {
        return rushingPercentageAgainst;
    }

    public void setRushingPercentageAgainst(Double rushingPercentageAgainst) {
        this.rushingPercentageAgainst = rushingPercentageAgainst;
    }

    public Integer getRushingTouchdownsAgainst() {
        return rushingTouchdownsAgainst;
    }

    public void setRushingTouchdownsAgainst(Integer rushingTouchdownsAgainst) {
        this.rushingTouchdownsAgainst = rushingTouchdownsAgainst;
    }

    public Integer getThirdDownAttemptsAgainst() {
        return thirdDownAttemptsAgainst;
    }

    public void setThirdDownAttemptsAgainst(Integer thirdDownAttemptsAgainst) {
        this.thirdDownAttemptsAgainst = thirdDownAttemptsAgainst;
    }

    public Integer getThirdDownSuccessesAgainst() {
        return thirdDownSuccessesAgainst;
    }

    public void setThirdDownSuccessesAgainst(Integer thirdDownSuccessesAgainst) {
        this.thirdDownSuccessesAgainst = thirdDownSuccessesAgainst;
    }

    public Double getThirdDownPercentageAgainst() {
        return thirdDownPercentageAgainst;
    }

    public void setThirdDownPercentageAgainst(Double thirdDownPercentageAgainst) {
        this.thirdDownPercentageAgainst = thirdDownPercentageAgainst;
    }

    public Integer getFourthDownAttemptsAgainst() {
        return fourthDownAttemptsAgainst;
    }

    public void setFourthDownAttemptsAgainst(Integer fourthDownAttemptsAgainst) {
        this.fourthDownAttemptsAgainst = fourthDownAttemptsAgainst;
    }

    public Integer getFourthDownSuccessesAgainst() {
        return fourthDownSuccessesAgainst;
    }

    public void setFourthDownSuccessesAgainst(Integer fourthDownSuccessesAgainst) {
        this.fourthDownSuccessesAgainst = fourthDownSuccessesAgainst;
    }

    public Double getFourthDownPercentageAgainst() {
        return fourthDownPercentageAgainst;
    }

    public void setFourthDownPercentageAgainst(Double fourthDownPercentageAgainst) {
        this.fourthDownPercentageAgainst = fourthDownPercentageAgainst;
    }

    public Integer getTwoPointAttemptsAgainst() {
        return twoPointAttemptsAgainst;
    }

    public void setTwoPointAttemptsAgainst(Integer twoPointAttemptsAgainst) {
        this.twoPointAttemptsAgainst = twoPointAttemptsAgainst;
    }

    public Integer getTwoPointSuccessesAgainst() {
        return twoPointSuccessesAgainst;
    }

    public void setTwoPointSuccessesAgainst(Integer twoPointSuccessesAgainst) {
        this.twoPointSuccessesAgainst = twoPointSuccessesAgainst;
    }

    public Double getTwoPointPercentageAgainst() {
        return twoPointPercentageAgainst;
    }

    public void setTwoPointPercentageAgainst(Double twoPointPercentageAgainst) {
        this.twoPointPercentageAgainst = twoPointPercentageAgainst;
    }

    public Integer getOnsideKickAttemptsAgainst() {
        return onsideKickAttemptsAgainst;
    }

    public void setOnsideKickAttemptsAgainst(Integer onsideKickAttemptsAgainst) {
        this.onsideKickAttemptsAgainst = onsideKickAttemptsAgainst;
    }

    public Integer getOnsideKickSuccessesAgainst() {
        return onsideKickSuccessesAgainst;
    }

    public void setOnsideKickSuccessesAgainst(Integer onsideKickSuccessesAgainst) {
        this.onsideKickSuccessesAgainst = onsideKickSuccessesAgainst;
    }

    public Double getOnsideKickPercentageAgainst() {
        return onsideKickPercentageAgainst;
    }

    public void setOnsideKickPercentageAgainst(Double onsideKickPercentageAgainst) {
        this.onsideKickPercentageAgainst = onsideKickPercentageAgainst;
    }

    public Integer getTurnoversForced() {
        return turnoversForced;
    }

    public void setTurnoversForced(Integer turnoversForced) {
        this.turnoversForced = turnoversForced;
    }

    public Integer getFumblesForced() {
        return fumblesForced;
    }

    public void setFumblesForced(Integer fumblesForced) {
        this.fumblesForced = fumblesForced;
    }

    public Integer getInterceptionsForced() {
        return interceptionsForced;
    }

    public void setInterceptionsForced(Integer interceptionsForced) {
        this.interceptionsForced = interceptionsForced;
    }

    public Integer getDefensiveTouchdownsAgainst() {
        return defensiveTouchdownsAgainst;
    }

    public void setDefensiveTouchdownsAgainst(Integer defensiveTouchdownsAgainst) {
        this.defensiveTouchdownsAgainst = defensiveTouchdownsAgainst;
    }

    public Integer getScoopAndScoresAgainst() {
        return scoopAndScoresAgainst;
    }

    public void setScoopAndScoresAgainst(Integer scoopAndScoresAgainst) {
        this.scoopAndScoresAgainst = scoopAndScoresAgainst;
    }

    public Integer getPickSixesAgainst() {
        return pickSixesAgainst;
    }

    public void setPickSixesAgainst(Integer pickSixesAgainst) {
        this.pickSixesAgainst = pickSixesAgainst;
    }

    public Integer getBlockedFieldGoals() {
        return blockedFieldGoals;
    }

    public void setBlockedFieldGoals(Integer blockedFieldGoals) {
        this.blockedFieldGoals = blockedFieldGoals;
    }

    public Integer getBlockedFieldGoalsAgainst() {
        return blockedFieldGoalsAgainst;
    }

    public void setBlockedFieldGoalsAgainst(Integer blockedFieldGoalsAgainst) {
        this.blockedFieldGoalsAgainst = blockedFieldGoalsAgainst;
    }

    public Integer getKickSixes() {
        return kickSixes;
    }

    public void setKickSixes(Integer kickSixes) {
        this.kickSixes = kickSixes;
    }

    public Integer getKickSixesAgainst() {
        return kickSixesAgainst;
    }

    public void setKickSixesAgainst(Integer kickSixesAgainst) {
        this.kickSixesAgainst = kickSixesAgainst;
    }

    public Integer getPatAttempts() {
        return patAttempts;
    }

    public void setPatAttempts(Integer patAttempts) {
        this.patAttempts = patAttempts;
    }

    public Integer getPatSuccesses() {
        return patSuccesses;
    }

    public void setPatSuccesses(Integer patSuccesses) {
        this.patSuccesses = patSuccesses;
    }

    public Double getPatPercentage() {
        return patPercentage;
    }

    public void setPatPercentage(Double patPercentage) {
        this.patPercentage = patPercentage;
    }

    public Integer getPatTwoPointReturn() {
        return patTwoPointReturn;
    }

    public void setPatTwoPointReturn(Integer patTwoPointReturn) {
        this.patTwoPointReturn = patTwoPointReturn;
    }

    public Integer getPatAttemptsAgainst() {
        return patAttemptsAgainst;
    }

    public void setPatAttemptsAgainst(Integer patAttemptsAgainst) {
        this.patAttemptsAgainst = patAttemptsAgainst;
    }

    public Integer getPatSuccessesAgainst() {
        return patSuccessesAgainst;
    }

    public void setPatSuccessesAgainst(Integer patSuccessesAgainst) {
        this.patSuccessesAgainst = patSuccessesAgainst;
    }

    public Double getPatPercentageAgainst() {
        return patPercentageAgainst;
    }

    public void setPatPercentageAgainst(Double patPercentageAgainst) {
        this.patPercentageAgainst = patPercentageAgainst;
    }

    public Integer getPatTwoPointReturnAgainst() {
        return patTwoPointReturnAgainst;
    }

    public void setPatTwoPointReturnAgainst(Integer patTwoPointReturnAgainst) {
        this.patTwoPointReturnAgainst = patTwoPointReturnAgainst;
    }

    public Integer getTotalPunts() {
        return totalPunts;
    }

    public void setTotalPunts(Integer totalPunts) {
        this.totalPunts = totalPunts;
    }

    public Integer getTotalPuntsAgainst() {
        return totalPuntsAgainst;
    }

    public void setTotalPuntsAgainst(Integer totalPuntsAgainst) {
        this.totalPuntsAgainst = totalPuntsAgainst;
    }

    public Integer getLongestPunt() {
        return longestPunt;
    }

    public void setLongestPunt(Integer longestPunt) {
        this.longestPunt = longestPunt;
    }

    public Integer getLongestPuntAgainst() {
        return longestPuntAgainst;
    }

    public void setLongestPuntAgainst(Integer longestPuntAgainst) {
        this.longestPuntAgainst = longestPuntAgainst;
    }

    public Double getAveragePunt() {
        return averagePunt;
    }

    public void setAveragePunt(Double averagePunt) {
        this.averagePunt = averagePunt;
    }

    public Double getAveragePuntAgainst() {
        return averagePuntAgainst;
    }

    public void setAveragePuntAgainst(Double averagePuntAgainst) {
        this.averagePuntAgainst = averagePuntAgainst;
    }

    public Integer getPuntTouchbacks() {
        return puntTouchbacks;
    }

    public void setPuntTouchbacks(Integer puntTouchbacks) {
        this.puntTouchbacks = puntTouchbacks;
    }

    public Integer getPuntTouchbacksAgainst() {
        return puntTouchbacksAgainst;
    }

    public void setPuntTouchbacksAgainst(Integer puntTouchbacksAgainst) {
        this.puntTouchbacksAgainst = puntTouchbacksAgainst;
    }

    public Integer getPuntReturnTouchdowns() {
        return puntReturnTouchdowns;
    }

    public void setPuntReturnTouchdowns(Integer puntReturnTouchdowns) {
        this.puntReturnTouchdowns = puntReturnTouchdowns;
    }

    public Integer getPuntReturnTouchdownsAgainst() {
        return puntReturnTouchdownsAgainst;
    }

    public void setPuntReturnTouchdownsAgainst(Integer puntReturnTouchdownsAgainst) {
        this.puntReturnTouchdownsAgainst = puntReturnTouchdownsAgainst;
    }

    public Integer getMuffedPuntsRecovered() {
        return muffedPuntsRecovered;
    }

    public void setMuffedPuntsRecovered(Integer muffedPuntsRecovered) {
        this.muffedPuntsRecovered = muffedPuntsRecovered;
    }

    public Integer getMuffedPuntsRecoveredAgainst() {
        return muffedPuntsRecoveredAgainst;
    }

    public void setMuffedPuntsRecoveredAgainst(Integer muffedPuntsRecoveredAgainst) {
        this.muffedPuntsRecoveredAgainst = muffedPuntsRecoveredAgainst;
    }

    public Integer getKickoffs() {
        return kickoffs;
    }

    public void setKickoffs(Integer kickoffs) {
        this.kickoffs = kickoffs;
    }

    public Integer getKickoffsAgainst() {
        return kickoffsAgainst;
    }

    public void setKickoffsAgainst(Integer kickoffsAgainst) {
        this.kickoffsAgainst = kickoffsAgainst;
    }

    public Integer getKickoffTouchbacks() {
        return kickoffTouchbacks;
    }

    public void setKickoffTouchbacks(Integer kickoffTouchbacks) {
        this.kickoffTouchbacks = kickoffTouchbacks;
    }

    public Integer getKickoffTouchbacksAgainst() {
        return kickoffTouchbacksAgainst;
    }

    public void setKickoffTouchbacksAgainst(Integer kickoffTouchbacksAgainst) {
        this.kickoffTouchbacksAgainst = kickoffTouchbacksAgainst;
    }

    public Integer getKickoffMuffRecoveries() {
        return kickoffMuffRecoveries;
    }

    public void setKickoffMuffRecoveries(Integer kickoffMuffRecoveries) {
        this.kickoffMuffRecoveries = kickoffMuffRecoveries;
    }

    public Integer getKickoffMuffRecoveriesAgainst() {
        return kickoffMuffRecoveriesAgainst;
    }

    public void setKickoffMuffRecoveriesAgainst(Integer kickoffMuffRecoveriesAgainst) {
        this.kickoffMuffRecoveriesAgainst = kickoffMuffRecoveriesAgainst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatsEntity that = (TeamStatsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(season, that.season) && Objects.equals(name, that.name) && Objects.equals(wins, that.wins) && Objects.equals(losses, that.losses) && Objects.equals(conferenceWins, that.conferenceWins) && Objects.equals(conferenceLosses, that.conferenceLosses) && Objects.equals(numPlays, that.numPlays) && Objects.equals(totalYards, that.totalYards) && Objects.equals(passingYards, that.passingYards) && Objects.equals(rushingYards, that.rushingYards) && Objects.equals(timeOfPossession, that.timeOfPossession) && Objects.equals(averageDiffOnOffense, that.averageDiffOnOffense) && Objects.equals(averageDiffOnDefense, that.averageDiffOnDefense) && Objects.equals(fieldGoalAttempts, that.fieldGoalAttempts) && Objects.equals(fieldGoalMakes, that.fieldGoalMakes) && Objects.equals(fieldGoalPercentage, that.fieldGoalPercentage) && Objects.equals(longestFieldGoal, that.longestFieldGoal) && Objects.equals(longestTouchdown, that.longestTouchdown) && Objects.equals(passingAttempts, that.passingAttempts) && Objects.equals(passingCompletions, that.passingCompletions) && Objects.equals(passingPercentage, that.passingPercentage) && Objects.equals(passingTouchdowns, that.passingTouchdowns) && Objects.equals(rushingAttempts, that.rushingAttempts) && Objects.equals(rushingSuccesses, that.rushingSuccesses) && Objects.equals(rushingPercentage, that.rushingPercentage) && Objects.equals(rushingTouchdowns, that.rushingTouchdowns) && Objects.equals(thirdDownAttempts, that.thirdDownAttempts) && Objects.equals(thirdDownSuccesses, that.thirdDownSuccesses) && Objects.equals(thirdDownPercentage, that.thirdDownPercentage) && Objects.equals(fourthDownAttempts, that.fourthDownAttempts) && Objects.equals(fourthDownSuccesses, that.fourthDownSuccesses) && Objects.equals(fourthDownPercentage, that.fourthDownPercentage) && Objects.equals(twoPointAttempts, that.twoPointAttempts) && Objects.equals(twoPointSuccesses, that.twoPointSuccesses) && Objects.equals(twoPointPercentage, that.twoPointPercentage) && Objects.equals(onsideKickAttempts, that.onsideKickAttempts) && Objects.equals(onsideKickSuccesses, that.onsideKickSuccesses) && Objects.equals(onsideKickPercentage, that.onsideKickPercentage) && Objects.equals(offensivePlays, that.offensivePlays) && Objects.equals(defensivePlays, that.defensivePlays) && Objects.equals(turnovers, that.turnovers) && Objects.equals(fumbles, that.fumbles) && Objects.equals(interceptions, that.interceptions) && Objects.equals(defensiveTouchdowns, that.defensiveTouchdowns) && Objects.equals(scoopAndScores, that.scoopAndScores) && Objects.equals(pickSixes, that.pickSixes) && Objects.equals(kickoffDefensiveTouchdowns, that.kickoffDefensiveTouchdowns) && Objects.equals(safetiesForced, that.safetiesForced) && Objects.equals(safetiesAllowed, that.safetiesAllowed) && Objects.equals(averageYardsPerGame, that.averageYardsPerGame) && Objects.equals(averageYardsAllowedPerGame, that.averageYardsAllowedPerGame) && Objects.equals(averageRushingYardsAllowedPerGame, that.averageRushingYardsAllowedPerGame) && Objects.equals(averagePassingYardsAllowedPerGame, that.averagePassingYardsAllowedPerGame) && Objects.equals(averageTouchdownsPerGame, that.averageTouchdownsPerGame) && Objects.equals(averageTouchdownsAllowedPerGame, that.averageTouchdownsAllowedPerGame) && Objects.equals(averagePointsPerGame, that.averagePointsPerGame) && Objects.equals(averagePointsAllowedPerGame, that.averagePointsAllowedPerGame) && Objects.equals(passingYardsAgainst, that.passingYardsAgainst) && Objects.equals(rushingYardsAgainst, that.rushingYardsAgainst) && Objects.equals(timeOfPossessionAgainst, that.timeOfPossessionAgainst) && Objects.equals(fieldGoalAttemptsAgainst, that.fieldGoalAttemptsAgainst) && Objects.equals(fieldGoalMakesAgainst, that.fieldGoalMakesAgainst) && Objects.equals(fieldGoalPercentageAgainst, that.fieldGoalPercentageAgainst) && Objects.equals(longestFieldGoalAgainst, that.longestFieldGoalAgainst) && Objects.equals(longestTouchdownAgainst, that.longestTouchdownAgainst) && Objects.equals(passingAttemptsAgainst, that.passingAttemptsAgainst) && Objects.equals(passingCompletionsAgainst, that.passingCompletionsAgainst) && Objects.equals(passingPercentageAgainst, that.passingPercentageAgainst) && Objects.equals(passingTouchdownsAgainst, that.passingTouchdownsAgainst) && Objects.equals(rushingAttemptsAgainst, that.rushingAttemptsAgainst) && Objects.equals(rushingSuccessesAgainst, that.rushingSuccessesAgainst) && Objects.equals(rushingPercentageAgainst, that.rushingPercentageAgainst) && Objects.equals(rushingTouchdownsAgainst, that.rushingTouchdownsAgainst) && Objects.equals(thirdDownAttemptsAgainst, that.thirdDownAttemptsAgainst) && Objects.equals(thirdDownSuccessesAgainst, that.thirdDownSuccessesAgainst) && Objects.equals(thirdDownPercentageAgainst, that.thirdDownPercentageAgainst) && Objects.equals(fourthDownAttemptsAgainst, that.fourthDownAttemptsAgainst) && Objects.equals(fourthDownSuccessesAgainst, that.fourthDownSuccessesAgainst) && Objects.equals(fourthDownPercentageAgainst, that.fourthDownPercentageAgainst) && Objects.equals(twoPointAttemptsAgainst, that.twoPointAttemptsAgainst) && Objects.equals(twoPointSuccessesAgainst, that.twoPointSuccessesAgainst) && Objects.equals(twoPointPercentageAgainst, that.twoPointPercentageAgainst) && Objects.equals(onsideKickAttemptsAgainst, that.onsideKickAttemptsAgainst) && Objects.equals(onsideKickSuccessesAgainst, that.onsideKickSuccessesAgainst) && Objects.equals(onsideKickPercentageAgainst, that.onsideKickPercentageAgainst) && Objects.equals(turnoversForced, that.turnoversForced) && Objects.equals(fumblesForced, that.fumblesForced) && Objects.equals(interceptionsForced, that.interceptionsForced) && Objects.equals(defensiveTouchdownsAgainst, that.defensiveTouchdownsAgainst) && Objects.equals(scoopAndScoresAgainst, that.scoopAndScoresAgainst) && Objects.equals(pickSixesAgainst, that.pickSixesAgainst) && Objects.equals(blockedFieldGoals, that.blockedFieldGoals) && Objects.equals(blockedFieldGoalsAgainst, that.blockedFieldGoalsAgainst) && Objects.equals(kickSixes, that.kickSixes) && Objects.equals(kickSixesAgainst, that.kickSixesAgainst) && Objects.equals(patAttempts, that.patAttempts) && Objects.equals(patSuccesses, that.patSuccesses) && Objects.equals(patPercentage, that.patPercentage) && Objects.equals(patTwoPointReturn, that.patTwoPointReturn) && Objects.equals(patAttemptsAgainst, that.patAttemptsAgainst) && Objects.equals(patSuccessesAgainst, that.patSuccessesAgainst) && Objects.equals(patPercentageAgainst, that.patPercentageAgainst) && Objects.equals(patTwoPointReturnAgainst, that.patTwoPointReturnAgainst) && Objects.equals(totalPunts, that.totalPunts) && Objects.equals(totalPuntsAgainst, that.totalPuntsAgainst) && Objects.equals(longestPunt, that.longestPunt) && Objects.equals(longestPuntAgainst, that.longestPuntAgainst) && Objects.equals(averagePunt, that.averagePunt) && Objects.equals(averagePuntAgainst, that.averagePuntAgainst) && Objects.equals(puntTouchbacks, that.puntTouchbacks) && Objects.equals(puntTouchbacksAgainst, that.puntTouchbacksAgainst) && Objects.equals(puntReturnTouchdowns, that.puntReturnTouchdowns) && Objects.equals(puntReturnTouchdownsAgainst, that.puntReturnTouchdownsAgainst) && Objects.equals(muffedPuntsRecovered, that.muffedPuntsRecovered) && Objects.equals(muffedPuntsRecoveredAgainst, that.muffedPuntsRecoveredAgainst) && Objects.equals(kickoffs, that.kickoffs) && Objects.equals(kickoffsAgainst, that.kickoffsAgainst) && Objects.equals(kickoffTouchbacks, that.kickoffTouchbacks) && Objects.equals(kickoffTouchbacksAgainst, that.kickoffTouchbacksAgainst) && Objects.equals(kickoffMuffRecoveries, that.kickoffMuffRecoveries) && Objects.equals(kickoffMuffRecoveriesAgainst, that.kickoffMuffRecoveriesAgainst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, season, name, wins, losses, conferenceWins, conferenceLosses, numPlays, totalYards, passingYards, rushingYards, timeOfPossession, averageDiffOnOffense, averageDiffOnDefense, fieldGoalAttempts, fieldGoalMakes, fieldGoalPercentage, longestFieldGoal, longestTouchdown, passingAttempts, passingCompletions, passingPercentage, passingTouchdowns, rushingAttempts, rushingSuccesses, rushingPercentage, rushingTouchdowns, thirdDownAttempts, thirdDownSuccesses, thirdDownPercentage, fourthDownAttempts, fourthDownSuccesses, fourthDownPercentage, twoPointAttempts, twoPointSuccesses, twoPointPercentage, onsideKickAttempts, onsideKickSuccesses, onsideKickPercentage, offensivePlays, defensivePlays, turnovers, fumbles, interceptions, defensiveTouchdowns, scoopAndScores, pickSixes, kickoffDefensiveTouchdowns, safetiesForced, safetiesAllowed, averageYardsPerGame, averageYardsAllowedPerGame, averageRushingYardsAllowedPerGame, averagePassingYardsAllowedPerGame, averageTouchdownsPerGame, averageTouchdownsAllowedPerGame, averagePointsPerGame, averagePointsAllowedPerGame, passingYardsAgainst, rushingYardsAgainst, timeOfPossessionAgainst, fieldGoalAttemptsAgainst, fieldGoalMakesAgainst, fieldGoalPercentageAgainst, longestFieldGoalAgainst, longestTouchdownAgainst, passingAttemptsAgainst, passingCompletionsAgainst, passingPercentageAgainst, passingTouchdownsAgainst, rushingAttemptsAgainst, rushingSuccessesAgainst, rushingPercentageAgainst, rushingTouchdownsAgainst, thirdDownAttemptsAgainst, thirdDownSuccessesAgainst, thirdDownPercentageAgainst, fourthDownAttemptsAgainst, fourthDownSuccessesAgainst, fourthDownPercentageAgainst, twoPointAttemptsAgainst, twoPointSuccessesAgainst, twoPointPercentageAgainst, onsideKickAttemptsAgainst, onsideKickSuccessesAgainst, onsideKickPercentageAgainst, turnoversForced, fumblesForced, interceptionsForced, defensiveTouchdownsAgainst, scoopAndScoresAgainst, pickSixesAgainst, blockedFieldGoals, blockedFieldGoalsAgainst, kickSixes, kickSixesAgainst, patAttempts, patSuccesses, patPercentage, patTwoPointReturn, patAttemptsAgainst, patSuccessesAgainst, patPercentageAgainst, patTwoPointReturnAgainst, totalPunts, totalPuntsAgainst, longestPunt, longestPuntAgainst, averagePunt, averagePuntAgainst, puntTouchbacks, puntTouchbacksAgainst, puntReturnTouchdowns, puntReturnTouchdownsAgainst, muffedPuntsRecovered, muffedPuntsRecoveredAgainst, kickoffs, kickoffsAgainst, kickoffTouchbacks, kickoffTouchbacksAgainst, kickoffMuffRecoveries, kickoffMuffRecoveriesAgainst);
    }
}
