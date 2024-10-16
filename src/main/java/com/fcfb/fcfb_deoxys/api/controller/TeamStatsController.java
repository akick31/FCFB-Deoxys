package com.fcfb.fcfb_deoxys.api.controller;

import com.fcfb.fcfb_deoxys.api.repositories.TeamStatsRepository;
import com.fcfb.fcfb_deoxys.domain.TeamStatsEntity;
import com.fcfb.fcfb_deoxys.api.model.TeamStatsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/deoxys/team_stats")
public class TeamStatsController {

    @Autowired
    TeamStatsRepository teamStatsRepository;

    /**
     * Get a team's stats by their name
     *
     * @param teamName
     * @return
     */
    @GetMapping("/{team_name}/{season}")
    public ResponseEntity<TeamStatsEntity> getTeamStats(@PathVariable("team_name") String teamName,
                                                        @PathVariable("season") String season) {
        Optional<TeamStatsEntity> teamData = teamStatsRepository.findByNameAndSeason(teamName, season);

        if (teamData.isPresent()) {
            TeamStatsEntity team = teamData.get();
            return new ResponseEntity<>(team, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/create/{team_name}/{season}")
    public ResponseEntity<TeamStatsEntity> createTeamStats(@PathVariable("team_name") String teamName,
                                                           @PathVariable("season") String season,
                                                           @RequestBody TeamStatsRequest teamStatsRequest) {
        Optional<TeamStatsEntity> teamData = teamStatsRepository.findByNameAndSeason(teamName, season);
        if (teamData.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.CONFLICT);
        } else {
            TeamStatsEntity team = new TeamStatsEntity(
                    teamName,
                    season,
                    teamStatsRequest.getNumPlays(),
                    teamStatsRequest.getTotalYards(),
                    teamStatsRequest.getPassingYards(),
                    teamStatsRequest.getRushingYards(),
                    teamStatsRequest.getTimeOfPossession(),
                    teamStatsRequest.getAverageDiffOnOffense(),
                    teamStatsRequest.getAverageDiffOnDefense(),
                    teamStatsRequest.getFieldGoalAttempts(),
                    teamStatsRequest.getFieldGoalMakes(),
                    teamStatsRequest.getFieldGoalPercentage(),
                    teamStatsRequest.getLongestFieldGoal(),
                    teamStatsRequest.getLongestTouchdown(),
                    teamStatsRequest.getPassingAttempts(),
                    teamStatsRequest.getPassingCompletions(),
                    teamStatsRequest.getPassingPercentage(),
                    teamStatsRequest.getPassingTouchdowns(),
                    teamStatsRequest.getRushingAttempts(),
                    teamStatsRequest.getRushingSuccesses(),
                    teamStatsRequest.getRushingPercentage(),
                    teamStatsRequest.getRushingTouchdowns(),
                    teamStatsRequest.getThirdDownAttempts(),
                    teamStatsRequest.getThirdDownSuccesses(),
                    teamStatsRequest.getThirdDownPercentage(),
                    teamStatsRequest.getFourthDownAttempts(),
                    teamStatsRequest.getFourthDownSuccesses(),
                    teamStatsRequest.getFourthDownPercentage(),
                    teamStatsRequest.getTwoPointAttempts(),
                    teamStatsRequest.getTwoPointSuccesses(),
                    teamStatsRequest.getTwoPointPercentage(),
                    teamStatsRequest.getOnsideKickAttempts(),
                    teamStatsRequest.getOnsideKickSuccesses(),
                    teamStatsRequest.getOnsideKickPercentage(),
                    teamStatsRequest.getOffensivePlays(),
                    teamStatsRequest.getDefensivePlays(),
                    teamStatsRequest.getTurnovers(),
                    teamStatsRequest.getFumbles(),
                    teamStatsRequest.getInterceptions(),
                    teamStatsRequest.getDefensiveTouchdowns(),
                    teamStatsRequest.getScoopAndScores(),
                    teamStatsRequest.getPickSixes(),
                    teamStatsRequest.getKickoffDefensiveTouchdowns(),
                    teamStatsRequest.getSafetiesForced(),
                    teamStatsRequest.getSafetiesAllowed(),
                    //TODO: get averages
                    teamStatsRequest.getAverageYardsPerGame(),
                    teamStatsRequest.getAverageYardsAllowedPerGame(),
                    teamStatsRequest.getAverageRushingYardsAllowedPerGame(),
                    teamStatsRequest.getAveragePassingYardsAllowedPerGame(),
                    teamStatsRequest.getAverageTouchdownsPerGame(),
                    teamStatsRequest.getAverageTouchdownsAllowedPerGame(),
                    teamStatsRequest.getAveragePointsPerGame(),
                    teamStatsRequest.getAveragePointsAllowedPerGame(),
                    teamStatsRequest.getPassingYardsAgainst(),
                    teamStatsRequest.getRushingYardsAgainst(),
                    teamStatsRequest.getTimeOfPossessionAgainst()
            );
            teamStatsRepository.save(team);
            return new ResponseEntity<>(team, HttpStatus.CREATED);
        }
    }

    /**
     * Update a team's stats
     * @param teamName
     */
    @PutMapping("/update/{team_name}/{season}")
    public ResponseEntity<TeamStatsEntity> updateTeamStats(@PathVariable("team_name") String teamName,
                                                           @PathVariable("season") String season,
                                                           @RequestBody TeamStatsRequest teamStatsRequest) {
        Optional<TeamStatsEntity> teamData = teamStatsRepository.findByNameAndSeason(teamName, season);

        if (teamData.isPresent()) {
            TeamStatsEntity team = teamData.get();
            team.setNumPlays(teamStatsRequest.getNumPlays());
            team.setTotalYards(teamStatsRequest.getTotalYards());
            team.setPassingYards(teamStatsRequest.getPassingYards());
            team.setRushingYards(teamStatsRequest.getRushingYards());
            team.setTimeOfPossession(teamStatsRequest.getTimeOfPossession());
            team.setAverageDiffOnOffense(teamStatsRequest.getAverageDiffOnOffense());
            team.setAverageDiffOnDefense(teamStatsRequest.getAverageDiffOnDefense());
            team.setFieldGoalAttempts(teamStatsRequest.getFieldGoalAttempts());
            team.setFieldGoalMakes(teamStatsRequest.getFieldGoalMakes());
            team.setFieldGoalPercentage(teamStatsRequest.getFieldGoalPercentage());
            team.setLongestFieldGoal(teamStatsRequest.getLongestFieldGoal());
            team.setLongestTouchdown(teamStatsRequest.getLongestTouchdown());
            team.setPassingAttempts(teamStatsRequest.getPassingAttempts());
            team.setPassingCompletions(teamStatsRequest.getPassingCompletions());
            team.setPassingPercentage(teamStatsRequest.getPassingPercentage());
            team.setPassingTouchdowns(teamStatsRequest.getPassingTouchdowns());
            team.setRushingAttempts(teamStatsRequest.getRushingAttempts());
            team.setRushingSuccesses(teamStatsRequest.getRushingSuccesses());
            team.setRushingPercentage(teamStatsRequest.getRushingPercentage());
            team.setRushingTouchdowns(teamStatsRequest.getRushingTouchdowns());
            team.setThirdDownAttempts(teamStatsRequest.getThirdDownAttempts());
            team.setThirdDownSuccesses(teamStatsRequest.getThirdDownSuccesses());
            team.setThirdDownPercentage(teamStatsRequest.getThirdDownPercentage());
            team.setFourthDownAttempts(teamStatsRequest.getFourthDownAttempts());
            team.setFourthDownSuccesses(teamStatsRequest.getFourthDownSuccesses());
            team.setFourthDownPercentage(teamStatsRequest.getFourthDownPercentage());
            team.setTwoPointAttempts(teamStatsRequest.getTwoPointAttempts());
            team.setTwoPointSuccesses(teamStatsRequest.getTwoPointSuccesses());
            team.setTwoPointPercentage(teamStatsRequest.getTwoPointPercentage());
            team.setOnsideKickAttempts(teamStatsRequest.getOnsideKickAttempts());
            team.setOnsideKickSuccesses(teamStatsRequest.getOnsideKickSuccesses());
            team.setOnsideKickPercentage(teamStatsRequest.getOnsideKickPercentage());
            team.setOffensivePlays(teamStatsRequest.getOffensivePlays());
            team.setDefensivePlays(teamStatsRequest.getDefensivePlays());
            team.setTurnovers(teamStatsRequest.getTurnovers());
            team.setFumbles(teamStatsRequest.getFumbles());
            team.setInterceptions(teamStatsRequest.getInterceptions());
            team.setDefensiveTouchdowns(teamStatsRequest.getDefensiveTouchdowns());
            team.setScoopAndScores(teamStatsRequest.getScoopAndScores());
            team.setPickSixes(teamStatsRequest.getPickSixes());
            team.setKickoffDefensiveTouchdowns(teamStatsRequest.getKickoffDefensiveTouchdowns());
            team.setSafetiesForced(teamStatsRequest.getSafetiesForced());
            team.setSafetiesAllowed(teamStatsRequest.getSafetiesAllowed());
            team.setPassingYardsAgainst(teamStatsRequest.getPassingYardsAgainst());
            team.setRushingYardsAgainst(teamStatsRequest.getRushingYardsAgainst());
            team.setTimeOfPossessionAgainst(teamStatsRequest.getTimeOfPossessionAgainst());
            team.setFieldGoalAttemptsAgainst(teamStatsRequest.getFieldGoalAttemptsAgainst());
            team.setFieldGoalMakesAgainst(teamStatsRequest.getFieldGoalMakesAgainst());
            team.setFieldGoalPercentageAgainst(teamStatsRequest.getFieldGoalPercentageAgainst());
            team.setLongestFieldGoalAgainst(teamStatsRequest.getLongestFieldGoalAgainst());
            team.setLongestTouchdownAgainst(teamStatsRequest.getLongestTouchdownAgainst());
            team.setPassingAttemptsAgainst(teamStatsRequest.getPassingAttemptsAgainst());
            team.setPassingCompletionsAgainst(teamStatsRequest.getPassingCompletionsAgainst());
            team.setPassingPercentageAgainst(teamStatsRequest.getPassingPercentageAgainst());
            team.setPassingTouchdownsAgainst(teamStatsRequest.getPassingTouchdownsAgainst());
            team.setRushingAttemptsAgainst(teamStatsRequest.getRushingAttemptsAgainst());
            team.setRushingSuccessesAgainst(teamStatsRequest.getRushingSuccessesAgainst());
            team.setRushingPercentageAgainst(teamStatsRequest.getRushingPercentageAgainst());
            team.setRushingTouchdownsAgainst(teamStatsRequest.getRushingTouchdownsAgainst());
            team.setThirdDownAttemptsAgainst(teamStatsRequest.getThirdDownAttemptsAgainst());
            team.setThirdDownSuccessesAgainst(teamStatsRequest.getThirdDownSuccessesAgainst());
            team.setThirdDownPercentageAgainst(teamStatsRequest.getThirdDownPercentageAgainst());
            team.setFourthDownAttemptsAgainst(teamStatsRequest.getFourthDownAttemptsAgainst());
            team.setFourthDownSuccessesAgainst(teamStatsRequest.getFourthDownSuccessesAgainst());
            team.setFourthDownPercentageAgainst(teamStatsRequest.getFourthDownPercentageAgainst());
            team.setTwoPointAttemptsAgainst(teamStatsRequest.getTwoPointAttemptsAgainst());
            team.setTwoPointSuccessesAgainst(teamStatsRequest.getTwoPointSuccessesAgainst());
            team.setTwoPointPercentageAgainst(teamStatsRequest.getTwoPointPercentageAgainst());
            team.setOnsideKickAttemptsAgainst(teamStatsRequest.getOnsideKickAttemptsAgainst());
            team.setOnsideKickSuccessesAgainst(teamStatsRequest.getOnsideKickSuccessesAgainst());
            team.setOnsideKickPercentageAgainst(teamStatsRequest.getOnsideKickPercentageAgainst());
            team.setTurnoversForced(teamStatsRequest.getTurnoversForced());
            team.setFumblesForced(teamStatsRequest.getFumblesForced());
            team.setInterceptionsForced(teamStatsRequest.getInterceptionsForced());
            team.setDefensiveTouchdownsAgainst(teamStatsRequest.getDefensiveTouchdownsAgainst());
            team.setScoopAndScoresAgainst(teamStatsRequest.getScoopAndScoresAgainst());
            team.setPickSixesAgainst(teamStatsRequest.getPickSixesAgainst());
            team.setBlockedFieldGoals(teamStatsRequest.getBlockedFieldGoals());
            team.setBlockedFieldGoalsAgainst(teamStatsRequest.getBlockedFieldGoalsAgainst());
            team.setKickSixes(teamStatsRequest.getKickSixes());
            team.setKickSixesAgainst(teamStatsRequest.getKickSixesAgainst());
            team.setPatAttempts(teamStatsRequest.getPatAttempts());
            team.setPatSuccesses(teamStatsRequest.getPatSuccesses());
            team.setPatPercentage(teamStatsRequest.getPatPercentage());
            team.setPatTwoPointReturn(teamStatsRequest.getPatTwoPointReturn());
            team.setPatAttemptsAgainst(teamStatsRequest.getPatAttemptsAgainst());
            team.setPatSuccessesAgainst(teamStatsRequest.getPatSuccessesAgainst());
            team.setPatPercentageAgainst(teamStatsRequest.getPatPercentageAgainst());
            team.setPatTwoPointReturnAgainst(teamStatsRequest.getPatTwoPointReturnAgainst());
            team.setTotalPunts(teamStatsRequest.getTotalPunts());
            team.setTotalPuntsAgainst(teamStatsRequest.getTotalPuntsAgainst());
            team.setLongestPunt(teamStatsRequest.getLongestPunt());
            team.setLongestPuntAgainst(teamStatsRequest.getLongestPuntAgainst());
            team.setAveragePunt(teamStatsRequest.getAveragePunt());
            team.setAveragePuntAgainst(teamStatsRequest.getAveragePuntAgainst());
            team.setPuntTouchbacks(teamStatsRequest.getPuntTouchbacks());
            team.setPuntTouchbacksAgainst(teamStatsRequest.getPuntTouchbacksAgainst());
            team.setPuntReturnTouchdowns(teamStatsRequest.getPuntReturnTouchdowns());
            team.setPuntReturnTouchdownsAgainst(teamStatsRequest.getPuntReturnTouchdownsAgainst());
            team.setMuffedPuntsRecovered(teamStatsRequest.getMuffedPuntsRecovered());
            team.setMuffedPuntsRecoveredAgainst(teamStatsRequest.getMuffedPuntsRecoveredAgainst());
            team.setKickoffs(teamStatsRequest.getKickoffs());
            team.setKickoffsAgainst(teamStatsRequest.getKickoffsAgainst());
            team.setKickoffTouchbacks(teamStatsRequest.getKickoffTouchbacks());
            team.setKickoffTouchbacksAgainst(teamStatsRequest.getKickoffTouchbacksAgainst());
            team.setKickoffMuffRecoveries(teamStatsRequest.getKickoffMuffRecoveries());
            team.setKickoffMuffRecoveriesAgainst(teamStatsRequest.getKickoffMuffRecoveriesAgainst());
            team.setWins(teamStatsRequest.getCurrentWins());
            team.setLosses(teamStatsRequest.getCurrentLosses());
            team.setConferenceWins(teamStatsRequest.getCurrentConferenceWins());
            team.setConferenceLosses(teamStatsRequest.getCurrentConferenceLosses());

            //TODO: get averages
            teamStatsRepository.save(team);
            return new ResponseEntity<>(team, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}