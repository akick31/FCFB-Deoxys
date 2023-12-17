package com.fcfb.fcfb_deoxys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teams", schema = "deoxys", catalog = "")
public class TeamsEntity {
    @Basic
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "logo")
    private String logo;
    @Basic
    @Column(name = "coach")
    private String coach;
    @Basic
    @Column(name = "coaches_poll_ranking")
    private Integer coachesPollRanking;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "playoff_committee_ranking")
    private Integer playoffCommitteeRanking;
    @Basic
    @Column(name = "primary_color")
    private String primaryColor;
    @Basic
    @Column(name = "secondary_color")
    private String secondaryColor;
    @Basic
    @Column(name = "subdivision")
    private String subdivision;
    @Basic
    @Column(name = "offensive_playbook")
    private String offensivePlaybook;
    @Basic
    @Column(name = "defensive_playbook")
    private String defensivePlaybook;
    @Basic
    @Column(name = "conference")
    private String conference;
    @Basic
    @Column(name = "current_wins")
    private Integer currentWins;
    @Basic
    @Column(name = "current_losses")
    private Integer currentLosses;
    @Basic
    @Column(name = "overall_wins")
    private Integer overallWins;
    @Basic
    @Column(name = "overall_losses")
    private Integer overallLosses;
    @Basic
    @Column(name = "current_conference_wins")
    private Integer currentConferenceWins;
    @Basic
    @Column(name = "current_conference_losses")
    private Integer currentConferenceLosses;
    @Basic
    @Column(name = "overall_conference_wins")
    private Integer overallConferenceWins;
    @Basic
    @Column(name = "overall_conference_losses")
    private Integer overallConferenceLosses;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Integer getCoachesPollRanking() {
        return coachesPollRanking;
    }

    public void setCoachesPollRanking(Integer coachesPollRanking) {
        this.coachesPollRanking = coachesPollRanking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayoffCommitteeRanking() {
        return playoffCommitteeRanking;
    }

    public void setPlayoffCommitteeRanking(Integer playoffCommitteeRanking) {
        this.playoffCommitteeRanking = playoffCommitteeRanking;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public String getOffensivePlaybook() {
        return offensivePlaybook;
    }

    public void setOffensivePlaybook(String offensivePlaybook) {
        this.offensivePlaybook = offensivePlaybook;
    }

    public String getDefensivePlaybook() {
        return defensivePlaybook;
    }

    public void setDefensivePlaybook(String defensivePlaybook) {
        this.defensivePlaybook = defensivePlaybook;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public Integer getCurrentWins() {
        return currentWins;
    }

    public void setCurrentWins(Integer currentWins) {
        this.currentWins = currentWins;
    }

    public Integer getCurrentLosses() {
        return currentLosses;
    }

    public void setCurrentLosses(Integer currentLosses) {
        this.currentLosses = currentLosses;
    }

    public Integer getOverallWins() {
        return overallWins;
    }

    public void setOverallWins(Integer overallWins) {
        this.overallWins = overallWins;
    }

    public Integer getOverallLosses() {
        return overallLosses;
    }

    public void setOverallLosses(Integer overallLosses) {
        this.overallLosses = overallLosses;
    }

    public Integer getCurrentConferenceWins() {
        return currentConferenceWins;
    }

    public void setCurrentConferenceWins(Integer currentConferenceWins) {
        this.currentConferenceWins = currentConferenceWins;
    }

    public Integer getCurrentConferenceLosses() {
        return currentConferenceLosses;
    }

    public void setCurrentConferenceLosses(Integer currentConferenceLosses) {
        this.currentConferenceLosses = currentConferenceLosses;
    }

    public Integer getOverallConferenceWins() {
        return overallConferenceWins;
    }

    public void setOverallConferenceWins(Integer overallConferenceWins) {
        this.overallConferenceWins = overallConferenceWins;
    }

    public Integer getOverallConferenceLosses() {
        return overallConferenceLosses;
    }

    public void setOverallConferenceLosses(Integer overallConferenceLosses) {
        this.overallConferenceLosses = overallConferenceLosses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamsEntity that = (TeamsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(logo, that.logo) && Objects.equals(coach, that.coach) && Objects.equals(coachesPollRanking, that.coachesPollRanking) && Objects.equals(name, that.name) && Objects.equals(playoffCommitteeRanking, that.playoffCommitteeRanking) && Objects.equals(primaryColor, that.primaryColor) && Objects.equals(secondaryColor, that.secondaryColor) && Objects.equals(subdivision, that.subdivision) && Objects.equals(offensivePlaybook, that.offensivePlaybook) && Objects.equals(defensivePlaybook, that.defensivePlaybook) && Objects.equals(conference, that.conference) && Objects.equals(currentWins, that.currentWins) && Objects.equals(currentLosses, that.currentLosses) && Objects.equals(overallWins, that.overallWins) && Objects.equals(overallLosses, that.overallLosses) && Objects.equals(currentConferenceWins, that.currentConferenceWins) && Objects.equals(currentConferenceLosses, that.currentConferenceLosses) && Objects.equals(overallConferenceWins, that.overallConferenceWins) && Objects.equals(overallConferenceLosses, that.overallConferenceLosses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, logo, coach, coachesPollRanking, name, playoffCommitteeRanking, primaryColor, secondaryColor, subdivision, offensivePlaybook, defensivePlaybook, conference, currentWins, currentLosses, overallWins, overallLosses, currentConferenceWins, currentConferenceLosses, overallConferenceWins, overallConferenceLosses);
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
}
