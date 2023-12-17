package com.fcfb.fcfb_deoxys.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamStatsRequest {
    @JsonProperty("num_plays")
    private Integer numPlays;

    @JsonProperty("total_yards")
    private Integer totalYards;

    @JsonProperty("passing_yards")
    private Integer passingYards;

    @JsonProperty("rushing_yards")
    private Integer rushingYards;

    @JsonProperty("time_of_possession")
    private String timeOfPossession;

    @JsonProperty("average_diff_on_offense")
    private Double averageDiffOnOffense;

    @JsonProperty("average_diff_on_defense")
    private Double averageDiffOnDefense;

    @JsonProperty("field_goal_attempts")
    private Integer fieldGoalAttempts;

    @JsonProperty("field_goal_makes")
    private Integer fieldGoalMakes;

    @JsonProperty("field_goal_percentage")
    private Double fieldGoalPercentage;

    @JsonProperty("longest_field_goal")
    private Integer longestFieldGoal;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("passing_attempts")
    private Integer passingAttempts;

    @JsonProperty("passing_completions")
    private Integer passingCompletions;

    @JsonProperty("passing_percentage")
    private Double passingPercentage;

    @JsonProperty("passing_touchdowns")
    private Integer passingTouchdowns;

    @JsonProperty("rushing_attempts")
    private Integer rushingAttempts;

    @JsonProperty("rushing_successes")
    private Integer rushingSuccesses;

    @JsonProperty("rushing_percentage")
    private Double rushingPercentage;

    @JsonProperty("rushing_touchdowns")
    private Integer rushingTouchdowns;

    @JsonProperty("third_down_attempts")
    private Integer thirdDownAttempts;

    @JsonProperty("third_down_successes")
    private Integer thirdDownSuccesses;

    @JsonProperty("third_down_percentage")
    private Double thirdDownPercentage;

    @JsonProperty("fourth_down_attempts")
    private Integer fourthDownAttempts;

    @JsonProperty("fourth_down_successes")
    private Integer fourthDownSuccesses;

    @JsonProperty("fourth_down_percentage")
    private Double fourthDownPercentage;

    @JsonProperty("two_point_attempts")
    private Integer twoPointAttempts;

    @JsonProperty("two_point_successes")
    private Integer twoPointSuccesses;

    @JsonProperty("two_point_percentage")
    private Double twoPointPercentage;

    @JsonProperty("onside_kick_attempts")
    private Integer onsideKickAttempts;

    @JsonProperty("onside_kick_successes")
    private Integer onsideKickSuccesses;

    @JsonProperty("onside_kick_percentage")
    private Double onsideKickPercentage;

    @JsonProperty("offensive_plays")
    private Integer offensivePlays;

    @JsonProperty("defensive_plays")
    private Integer defensivePlays;

    @JsonProperty("turnovers")
    private Integer turnovers;

    @JsonProperty("fumbles")
    private Integer fumbles;

    @JsonProperty("interceptions")
    private Integer interceptions;

    @JsonProperty("defensive_touchdowns")
    private Integer defensiveTouchdowns;

    @JsonProperty("scoop_and_scores")
    private Integer scoopAndScores;

    @JsonProperty("pick_sixes")
    private Integer pickSixes;

    @JsonProperty("kickoff_defensive_touchdowns")
    private Integer kickoffDefensiveTouchdowns;

    @JsonProperty("safeties_forced")
    private Integer safetiesForced;

    @JsonProperty("safeties_allowed")
    private Integer safetiesAllowed;

    @JsonProperty("passing_yards_against")
    private Integer passingYardsAgainst;

    @JsonProperty("rushing_yards_against")
    private Integer rushingYardsAgainst;

    @JsonProperty("time_of_possession_against")
    private String timeOfPossessionAgainst;

    @JsonProperty("field_goal_attempts_against")
    private Integer fieldGoalAttemptsAgainst;

    @JsonProperty("field_goal_makes_against")
    private Integer fieldGoalMakesAgainst;

    @JsonProperty("field_goal_percentage_against")
    private Double fieldGoalPercentageAgainst;

    @JsonProperty("longest_field_goal_against")
    private Integer longestFieldGoalAgainst;

    @JsonProperty("longest_touchdown_against")
    private Integer longestTouchdownAgainst;

    @JsonProperty("passing_attempts_against")
    private Integer passingAttemptsAgainst;

    @JsonProperty("passing_completions_against")
    private Integer passingCompletionsAgainst;

    @JsonProperty("passing_percentage_against")
    private Double passingPercentageAgainst;

    @JsonProperty("passing_touchdowns_against")
    private Integer passingTouchdownsAgainst;

    @JsonProperty("rushing_attempts_against")
    private Integer rushingAttemptsAgainst;

    @JsonProperty("rushing_successes_against")
    private Integer rushingSuccessesAgainst;

    @JsonProperty("rushing_percentage_against")
    private Double rushingPercentageAgainst;

    @JsonProperty("rushing_touchdowns_against")
    private Integer rushingTouchdownsAgainst;

    @JsonProperty("third_down_attempts_against")
    private Integer thirdDownAttemptsAgainst;

    @JsonProperty("third_down_successes_against")
    private Integer thirdDownSuccessesAgainst;

    @JsonProperty("third_down_percentage_against")
    private Double thirdDownPercentageAgainst;

    @JsonProperty("fourth_down_attempts_against")
    private Integer fourthDownAttemptsAgainst;

    @JsonProperty("fourth_down_successes_against")
    private Integer fourthDownSuccessesAgainst;

    @JsonProperty("fourth_down_percentage_against")
    private Double fourthDownPercentageAgainst;

    @JsonProperty("two_point_attempts_against")
    private Integer twoPointAttemptsAgainst;

    @JsonProperty("two_point_successes_against")
    private Integer twoPointSuccessesAgainst;

    @JsonProperty("two_point_percentage_against")
    private Double twoPointPercentageAgainst;

    @JsonProperty("onside_kick_attempts_against")
    private Integer onsideKickAttemptsAgainst;

    @JsonProperty("onside_kick_successes_against")
    private Integer onsideKickSuccessesAgainst;

    @JsonProperty("onside_kick_percentage_against")
    private Double onsideKickPercentageAgainst;

    @JsonProperty("turnovers_forced")
    private Integer turnoversForced;

    @JsonProperty("fumbles_forced")
    private Integer fumblesForced;

    @JsonProperty("interceptions_forced")
    private Integer interceptionsForced;

    @JsonProperty("defensive_touchdowns_against")
    private Integer defensiveTouchdownsAgainst;

    @JsonProperty("scoop_and_scores_against")
    private Integer scoopAndScoresAgainst;

    @JsonProperty("pick_sixes_against")
    private Integer pickSixesAgainst;

    @JsonProperty("blocked_field_goals")
    private Integer blockedFieldGoals;

    @JsonProperty("blocked_field_goals_against")
    private Integer blockedFieldGoalsAgainst;

    @JsonProperty("kick_sixes")
    private Integer kickSixes;

    @JsonProperty("kick_sixes_against")
    private Integer kickSixesAgainst;

    @JsonProperty("pat_attempts")
    private Integer patAttempts;

    @JsonProperty("pat_successes")
    private Integer patSuccesses;

    @JsonProperty("pat_percentage")
    private Double patPercentage;

    @JsonProperty("pat_two_point_return")
    private Integer patTwoPointReturn;

    @JsonProperty("pat_attempts_against")
    private Integer patAttemptsAgainst;

    @JsonProperty("pat_successes_against")
    private Integer patSuccessesAgainst;

    @JsonProperty("pat_percentage_against")
    private Double patPercentageAgainst;

    @JsonProperty("pat_two_point_return_against")
    private Integer patTwoPointReturnAgainst;

    @JsonProperty("total_punts")
    private Integer totalPunts;

    @JsonProperty("total_punts_against")
    private Integer totalPuntsAgainst;

    @JsonProperty("longest_punt")
    private Integer longestPunt;

    @JsonProperty("longest_punt_against")
    private Integer longestPuntAgainst;

    @JsonProperty("average_punt")
    private Double averagePunt;

    @JsonProperty("average_punt_against")
    private Double averagePuntAgainst;

    @JsonProperty("punt_touchbacks")
    private Integer puntTouchbacks;

    @JsonProperty("punt_touchbacks_against")
    private Integer puntTouchbacksAgainst;

    @JsonProperty("punt_return_touchdowns")
    private Integer puntReturnTouchdowns;

    @JsonProperty("punt_return_touchdowns_against")
    private Integer puntReturnTouchdownsAgainst;

    @JsonProperty("muffed_punts_recovered")
    private Integer muffedPuntsRecovered;

    @JsonProperty("muffed_punts_recovered_against")
    private Integer muffedPuntsRecoveredAgainst;

    @JsonProperty("kickoffs")
    private Integer kickoffs;

    @JsonProperty("kickoffs_against")
    private Integer kickoffsAgainst;

    @JsonProperty("kickoff_touchbacks")
    private Integer kickoffTouchbacks;

    @JsonProperty("kickoff_touchbacks_against")
    private Integer kickoffTouchbacksAgainst;

    @JsonProperty("kickoff_muff_recoveries")
    private Integer kickoffMuffRecoveries;

    @JsonProperty("kickoff_muff_recoveries_against")
    private Integer kickoffMuffRecoveriesAgainst;

    @JsonProperty("current_wins")
    private Integer currentWins;

    @JsonProperty("overall_wins")
    private Integer overallWins;

    @JsonProperty("current_losses")
    private Integer currentLosses;

    @JsonProperty("overall_losses")
    private Integer overallLosses;

    @JsonProperty("current_conference_wins")
    private Integer currentConferenceWins;

    @JsonProperty("current_conference_losses")
    private Integer currentConferenceLosses;

    @JsonProperty("overall_conference_wins")
    private Integer overallConferenceWins;

    @JsonProperty("overall_conference_losses")
    private Integer overallConferenceLosses;

    public Integer getNumPlays() {
        return numPlays;
    }

    public Integer getTotalYards() {
        return totalYards;
    }

    public Integer getPassingYards() {
        return passingYards;
    }

    public Integer getRushingYards() {
        return rushingYards;
    }

    public String getTimeOfPossession() {
        return timeOfPossession;
    }

    public Integer getPassingYardsAgainst() {
        return passingYardsAgainst;
    }

    public Integer getRushingYardsAgainst() {
        return rushingYardsAgainst;
    }

    public String getTimeOfPossessionAgainst() {
        return timeOfPossessionAgainst;
    }

    public Integer getFieldGoalAttemptsAgainst() {
        return fieldGoalAttemptsAgainst;
    }

    public Integer getFieldGoalMakesAgainst() {
        return fieldGoalMakesAgainst;
    }

    public Double getFieldGoalPercentageAgainst() {
        return fieldGoalPercentageAgainst;
    }

    public Integer getLongestFieldGoalAgainst() {
        return longestFieldGoalAgainst;
    }

    public Integer getLongestTouchdownAgainst() {
        return longestTouchdownAgainst;
    }

    public Integer getPassingAttemptsAgainst() {
        return passingAttemptsAgainst;
    }

    public Integer getPassingCompletionsAgainst() {
        return passingCompletionsAgainst;
    }

    public Double getPassingPercentageAgainst() {
        return passingPercentageAgainst;
    }

    public Integer getPassingTouchdownsAgainst() {
        return passingTouchdownsAgainst;
    }

    public Integer getRushingAttemptsAgainst() {
        return rushingAttemptsAgainst;
    }

    public Integer getRushingSuccessesAgainst() {
        return rushingSuccessesAgainst;
    }

    public Double getRushingPercentageAgainst() {
        return rushingPercentageAgainst;
    }

    public Integer getRushingTouchdownsAgainst() {
        return rushingTouchdownsAgainst;
    }

    public Integer getThirdDownAttemptsAgainst() {
        return thirdDownAttemptsAgainst;
    }

    public Integer getThirdDownSuccessesAgainst() {
        return thirdDownSuccessesAgainst;
    }

    public Double getThirdDownPercentageAgainst() {
        return thirdDownPercentageAgainst;
    }

    public Integer getFourthDownAttemptsAgainst() {
        return fourthDownAttemptsAgainst;
    }

    public Integer getFourthDownSuccessesAgainst() {
        return fourthDownSuccessesAgainst;
    }

    public Double getFourthDownPercentageAgainst() {
        return fourthDownPercentageAgainst;
    }

    public Integer getTwoPointAttemptsAgainst() {
        return twoPointAttemptsAgainst;
    }

    public Integer getTwoPointSuccessesAgainst() {
        return twoPointSuccessesAgainst;
    }

    public Double getTwoPointPercentageAgainst() {
        return twoPointPercentageAgainst;
    }

    public Integer getOnsideKickAttemptsAgainst() {
        return onsideKickAttemptsAgainst;
    }

    public Integer getOnsideKickSuccessesAgainst() {
        return onsideKickSuccessesAgainst;
    }

    public Double getOnsideKickPercentageAgainst() {
        return onsideKickPercentageAgainst;
    }

    public Integer getTurnoversForced() {
        return turnoversForced;
    }

    public Integer getFumblesForced() {
        return fumblesForced;
    }

    public Integer getInterceptionsForced() {
        return interceptionsForced;
    }

    public Integer getDefensiveTouchdownsAgainst() {
        return defensiveTouchdownsAgainst;
    }

    public Integer getScoopAndScoresAgainst() {
        return scoopAndScoresAgainst;
    }

    public Integer getPickSixesAgainst() {
        return pickSixesAgainst;
    }

    public Integer getBlockedFieldGoals() {
        return blockedFieldGoals;
    }

    public Integer getBlockedFieldGoalsAgainst() {
        return blockedFieldGoalsAgainst;
    }

    public Integer getKickSixes() {
        return kickSixes;
    }

    public Integer getKickSixesAgainst() {
        return kickSixesAgainst;
    }

    public Integer getPatAttempts() {
        return patAttempts;
    }

    public Integer getPatSuccesses() {
        return patSuccesses;
    }

    public Double getPatPercentage() {
        return patPercentage;
    }

    public Integer getPatTwoPointReturn() {
        return patTwoPointReturn;
    }

    public Integer getPatAttemptsAgainst() {
        return patAttemptsAgainst;
    }

    public Integer getPatSuccessesAgainst() {
        return patSuccessesAgainst;
    }

    public Double getPatPercentageAgainst() {
        return patPercentageAgainst;
    }

    public Integer getPatTwoPointReturnAgainst() {
        return patTwoPointReturnAgainst;
    }

    public Integer getTotalPunts() {
        return totalPunts;
    }

    public Integer getTotalPuntsAgainst() {
        return totalPuntsAgainst;
    }

    public Integer getLongestPunt() {
        return longestPunt;
    }

    public Integer getLongestPuntAgainst() {
        return longestPuntAgainst;
    }

    public Double getAveragePunt() {
        return averagePunt;
    }

    public Double getAveragePuntAgainst() {
        return averagePuntAgainst;
    }

    public Integer getPuntTouchbacks() {
        return puntTouchbacks;
    }

    public Integer getPuntTouchbacksAgainst() {
        return puntTouchbacksAgainst;
    }

    public Integer getPuntReturnTouchdowns() {
        return puntReturnTouchdowns;
    }

    public Integer getPuntReturnTouchdownsAgainst() {
        return puntReturnTouchdownsAgainst;
    }

    public Integer getMuffedPuntsRecovered() {
        return muffedPuntsRecovered;
    }

    public Integer getMuffedPuntsRecoveredAgainst() {
        return muffedPuntsRecoveredAgainst;
    }

    public Integer getKickoffs() {
        return kickoffs;
    }

    public Integer getKickoffsAgainst() {
        return kickoffsAgainst;
    }

    public Integer getKickoffTouchbacks() {
        return kickoffTouchbacks;
    }

    public Integer getKickoffTouchbacksAgainst() {
        return kickoffTouchbacksAgainst;
    }

    public Integer getKickoffMuffRecoveries() {
        return kickoffMuffRecoveries;
    }

    public Integer getKickoffMuffRecoveriesAgainst() {
        return kickoffMuffRecoveriesAgainst;
    }

    public Double getAverageDiffOnOffense() {
        return averageDiffOnOffense;
    }

    public Double getAverageDiffOnDefense() {
        return averageDiffOnDefense;
    }

    public Integer getFieldGoalAttempts() {
        return fieldGoalAttempts;
    }

    public Integer getFieldGoalMakes() {
        return fieldGoalMakes;
    }

    public Double getFieldGoalPercentage() {
        return fieldGoalPercentage;
    }

    public Integer getLongestFieldGoal() {
        return longestFieldGoal;
    }

    public Integer getLongestTouchdown() {
        return longestTouchdown;
    }

    public Integer getPassingAttempts() {
        return passingAttempts;
    }

    public Integer getPassingCompletions() {
        return passingCompletions;
    }

    public Double getPassingPercentage() {
        return passingPercentage;
    }

    public Integer getPassingTouchdowns() {
        return passingTouchdowns;
    }

    public Integer getRushingAttempts() {
        return rushingAttempts;
    }

    public Integer getRushingSuccesses() {
        return rushingSuccesses;
    }

    public Double getRushingPercentage() {
        return rushingPercentage;
    }

    public Integer getRushingTouchdowns() {
        return rushingTouchdowns;
    }

    public Integer getThirdDownAttempts() {
        return thirdDownAttempts;
    }

    public Integer getThirdDownSuccesses() {
        return thirdDownSuccesses;
    }

    public Double getThirdDownPercentage() {
        return thirdDownPercentage;
    }

    public Integer getFourthDownAttempts() {
        return fourthDownAttempts;
    }

    public Integer getFourthDownSuccesses() {
        return fourthDownSuccesses;
    }

    public Double getFourthDownPercentage() {
        return fourthDownPercentage;
    }

    public Integer getTwoPointAttempts() {
        return twoPointAttempts;
    }

    public Integer getTwoPointSuccesses() {
        return twoPointSuccesses;
    }

    public Double getTwoPointPercentage() {
        return twoPointPercentage;
    }

    public Integer getOnsideKickAttempts() {
        return onsideKickAttempts;
    }

    public Integer getOnsideKickSuccesses() {
        return onsideKickSuccesses;
    }

    public Double getOnsideKickPercentage() {
        return onsideKickPercentage;
    }

    public Integer getOffensivePlays() {
        return offensivePlays;
    }

    public Integer getDefensivePlays() {
        return defensivePlays;
    }

    public Integer getTurnovers() {
        return turnovers;
    }

    public Integer getFumbles() {
        return fumbles;
    }

    public Integer getInterceptions() {
        return interceptions;
    }

    public Integer getDefensiveTouchdowns() {
        return defensiveTouchdowns;
    }

    public Integer getScoopAndScores() {
        return scoopAndScores;
    }

    public Integer getPickSixes() {
        return pickSixes;
    }

    public Integer getKickoffDefensiveTouchdowns() {
        return kickoffDefensiveTouchdowns;
    }

    public Integer getSafetiesForced() {
        return safetiesForced;
    }

    public Integer getSafetiesAllowed() {
        return safetiesAllowed;
    }

    public Integer getCurrentWins() {
        return currentWins;
    }

    public Integer getOverallWins() {
        return overallWins;
    }

    public Integer getCurrentLosses() {
        return currentLosses;
    }

    public Integer getOverallLosses() {
        return overallLosses;
    }

    public Integer getCurrentConferenceWins() {
        return currentConferenceWins;
    }

    public Integer getCurrentConferenceLosses() {
        return currentConferenceLosses;
    }

    public Integer getOverallConferenceWins() {
        return overallConferenceWins;
    }

    public Integer getOverallConferenceLosses() {
        return overallConferenceLosses;
    }
}
