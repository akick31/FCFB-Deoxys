package com.fcfb.fcfb_deoxys.api.controller;

import com.fcfb.fcfb_deoxys.api.model.GameRequest;
import com.fcfb.fcfb_deoxys.domain.GamesEntity;
import com.fcfb.fcfb_deoxys.domain.TeamsEntity;
import com.fcfb.fcfb_deoxys.api.repositories.GamesRepository;
import com.fcfb.fcfb_deoxys.api.repositories.GameDatesRepository;
import com.fcfb.fcfb_deoxys.api.repositories.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/deoxys/games")
public class GamesController {

    @Autowired
    GamesRepository gamesRepository;

    @Autowired
    TeamsRepository teamsRepository;

    @Autowired
    GameDatesRepository seasonsRepository;

    /**
     * Add a new game
     * @param gameRequest
     * @return
     */
    @PostMapping("/add")
    public ResponseEntity<String> addNewGame(@RequestBody GameRequest gameRequest) {
        Optional<GamesEntity> gameData = gamesRepository.findByGameId(gameRequest.getGameId());

        if (gameData.isPresent()) {
            return new ResponseEntity<>("Game already exists", HttpStatus.CONFLICT);
        } else {
            TeamsEntity homeTeam = teamsRepository.findByName(gameRequest.getHomeTeam()).get();
            TeamsEntity awayTeam = teamsRepository.findByName(gameRequest.getAwayTeam()).get();

            // If the coaches don't match, add them to the team
            if (homeTeam.getCoach() == null || !homeTeam.getCoach().contains(gameRequest.getHomeCoach())) {
                homeTeam.setCoach(gameRequest.getHomeCoach());
            }
            if (awayTeam.getCoach() == null || !awayTeam.getCoach().contains(gameRequest.getAwayCoach())) {
                awayTeam.setCoach(gameRequest.getAwayCoach());
            }

            // If the playbooks don't match, add them to the team
            if (homeTeam.getOffensivePlaybook() == null || !homeTeam.getOffensivePlaybook().contains(gameRequest.getHomeOffensivePlaybook())) {
                homeTeam.setOffensivePlaybook(gameRequest.getHomeOffensivePlaybook());
            }
            if (awayTeam.getOffensivePlaybook() == null || !awayTeam.getOffensivePlaybook().contains(gameRequest.getAwayOffensivePlaybook())) {
                awayTeam.setOffensivePlaybook(gameRequest.getAwayOffensivePlaybook());
            }
            if (homeTeam.getDefensivePlaybook() == null || !homeTeam.getDefensivePlaybook().contains(gameRequest.getHomeDefensivePlaybook())) {
                homeTeam.setDefensivePlaybook(gameRequest.getHomeDefensivePlaybook());
            }
            if (awayTeam.getDefensivePlaybook() == null || !awayTeam.getDefensivePlaybook().contains(gameRequest.getAwayDefensivePlaybook())) {
                awayTeam.setDefensivePlaybook(gameRequest.getAwayDefensivePlaybook());
            }
            teamsRepository.save(homeTeam);
            teamsRepository.save(awayTeam);

            GamesEntity newGame = new GamesEntity(
                    gameRequest.getGameId(),
                    gameRequest.getHomeTeam(),
                    gameRequest.getAwayTeam(),
                    gameRequest.getHomeCoach(),
                    gameRequest.getAwayCoach(),
                    gameRequest.getHomeOffensivePlaybook(),
                    gameRequest.getAwayOffensivePlaybook(),
                    gameRequest.getHomeDefensivePlaybook(),
                    gameRequest.getAwayDefensivePlaybook(),
                    gameRequest.getHomeScore(),
                    gameRequest.getAwayScore(),
                    gameRequest.getPossession(),
                    gameRequest.getQuarter(),
                    gameRequest.getClock(),
                    gameRequest.getBallLocation(),
                    gameRequest.getDown(),
                    gameRequest.getYardsToGo(),
                    homeTeam.getCurrentWins(),
                    homeTeam.getCurrentLosses(),
                    awayTeam.getCurrentWins(),
                    awayTeam.getCurrentLosses(),
                    gameRequest.getGameId() + "_scorebug.png",
                    homeTeam.getSubdivision(),
                    gameRequest.getThread(),
                    gameRequest.getGistLink(),
                    gameRequest.getWinProbability(),
                    gameRequest.getGameLength(),
                    gameRequest.getIsFinal(),
                    gameRequest.getIsOt(),
                    gameRequest.getSeason(),
                    gameRequest.getWeek(),
                    gameRequest.getWaitingOn(),
                    gameRequest.getGameId() + "winprobability.png",
                    gameRequest.getGameId() + "_scoreplot.png",
                    gameRequest.getNumPlays(),
                    gameRequest.getHomeTimeouts(),
                    gameRequest.getAwayTimeouts(),
                    gameRequest.getGameTimer(),
                    gameRequest.getHomeTotalYards(),
                    gameRequest.getAwayTotalYards(),
                    gameRequest.getHomePassingYards(),
                    gameRequest.getAwayPassingYards(),
                    gameRequest.getHomeRushingYards(),
                    gameRequest.getAwayRushingYards(),
                    gameRequest.getHomeTimeOfPossession(),
                    gameRequest.getAwayTimeOfPossession(),
                    gameRequest.getHomeAverageDiffOnOffense(),
                    gameRequest.getHomeAverageDiffOnDefense(),
                    gameRequest.getAwayAverageDiffOnOffense(),
                    gameRequest.getAwayAverageDiffOnDefense(),
                    gameRequest.getHomeFieldGoalAttempts(),
                    gameRequest.getHomeFieldGoalMakes(),
                    gameRequest.getHomeFieldGoalPercentage(),
                    gameRequest.getAwayFieldGoalAttempts(),
                    gameRequest.getAwayFieldGoalMakes(),
                    gameRequest.getAwayFieldGoalPercentage(),
                    gameRequest.getHomeLongestFieldGoal(),
                    gameRequest.getAwayLongestFieldGoal(),
                    gameRequest.getHomeLongestTouchdown(),
                    gameRequest.getAwayLongestTouchdown(),
                    gameRequest.getHomePassingAttempts(),
                    gameRequest.getHomePassingCompletions(),
                    gameRequest.getHomePassingPercentage(),
                    gameRequest.getAwayPassingAttempts(),
                    gameRequest.getAwayPassingCompletions(),
                    gameRequest.getAwayPassingPercentage(),
                    gameRequest.getHomeRushingAttempts(),
                    gameRequest.getHomeRushingSuccesses(),
                    gameRequest.getHomeRushingPercentage(),
                    gameRequest.getAwayRushingAttempts(),
                    gameRequest.getAwayRushingSuccesses(),
                    gameRequest.getAwayRushingPercentage(),
                    gameRequest.getHomeThirdDownAttempts(),
                    gameRequest.getHomeThirdDownSuccesses(),
                    gameRequest.getHomeThirdDownPercentage(),
                    gameRequest.getAwayThirdDownAttempts(),
                    gameRequest.getAwayThirdDownSuccesses(),
                    gameRequest.getAwayThirdDownPercentage(),
                    gameRequest.getHomeFourthDownAttempts(),
                    gameRequest.getHomeFourthDownSuccesses(),
                    gameRequest.getHomeFourthDownPercentage(),
                    gameRequest.getAwayFourthDownAttempts(),
                    gameRequest.getAwayFourthDownSuccesses(),
                    gameRequest.getAwayFourthDownPercentage(),
                    gameRequest.getHomeTwoPointAttempts(),
                    gameRequest.getHomeTwoPointSuccesses(),
                    gameRequest.getHomeTwoPointPercentage(),
                    gameRequest.getAwayTwoPointAttempts(),
                    gameRequest.getAwayTwoPointSuccesses(),
                    gameRequest.getAwayTwoPointPercentage(),
                    gameRequest.getHomeOnsideKickAttempts(),
                    gameRequest.getHomeOnsideKickSuccesses(),
                    gameRequest.getHomeOnsideKickPercentage(),
                    gameRequest.getAwayOnsideKickAttempts(),
                    gameRequest.getAwayOnsideKickSuccesses(),
                    gameRequest.getAwayOnsideKickPercentage(),
                    gameRequest.getHomeOffensivePlays(),
                    gameRequest.getHomeDefensivePlays(),
                    gameRequest.getAwayOffensivePlays(),
                    gameRequest.getAwayDefensivePlays(),
                    gameRequest.getHomeTurnovers(),
                    gameRequest.getHomeFumbles(),
                    gameRequest.getHomeInterceptions(),
                    gameRequest.getAwayTurnovers(),
                    gameRequest.getAwayFumbles(),
                    gameRequest.getAwayInterceptions(),
                    gameRequest.getHomeDefensiveTouchdowns(),
                    gameRequest.getHomeScoopAndScores(),
                    gameRequest.getHomePickSixes(),
                    gameRequest.getHomeKickoffDefensiveTouchdowns(),
                    gameRequest.getAwayDefensiveTouchdowns(),
                    gameRequest.getAwayScoopAndScores(),
                    gameRequest.getAwayPickSixes(),
                    gameRequest.getAwayKickoffDefensiveTouchdowns(),
                    gameRequest.getThreadTimestamp(),
                    gameRequest.getSpread()
            );
            gamesRepository.save(newGame);
            return new ResponseEntity<>("Game added", HttpStatus.OK);
        }
    }

    @GetMapping("/{game_id}")
    public ResponseEntity<String> getGameById(@PathVariable("game_id") String gameId) {
        Optional<GamesEntity> gameData = gamesRepository.findByGameId(gameId);

        if (gameData.isPresent()) {
            return new ResponseEntity<>(gameData.get().toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateGame(@RequestBody GameRequest gameRequest) {
        Optional<GamesEntity> gameData = gamesRepository.findByGameId(gameRequest.getGameId());

        if (gameData.isPresent()) {
            GamesEntity _game = gameData.get();
            _game.setHomeTeam(gameRequest.getHomeTeam());
            _game.setAwayTeam(gameRequest.getAwayTeam());
            _game.setHomeCoach(gameRequest.getHomeCoach());
            _game.setAwayCoach(gameRequest.getAwayCoach());
            _game.setHomeOffensivePlaybook(gameRequest.getHomeOffensivePlaybook());
            _game.setAwayOffensivePlaybook(gameRequest.getAwayOffensivePlaybook());
            _game.setHomeDefensivePlaybook(gameRequest.getHomeDefensivePlaybook());
            _game.setAwayDefensivePlaybook(gameRequest.getAwayDefensivePlaybook());
            _game.setHomeScore(gameRequest.getHomeScore());
            _game.setAwayScore(gameRequest.getAwayScore());
            _game.setPossession(gameRequest.getPossession());
            _game.setQuarter(gameRequest.getQuarter());
            _game.setClock(gameRequest.getClock());
            _game.setBallLocation(gameRequest.getBallLocation());
            _game.setDown(gameRequest.getDown());
            _game.setYardsToGo(gameRequest.getYardsToGo());
            _game.setThread(gameRequest.getThread());
            _game.setGistLink(gameRequest.getGistLink());
            _game.setWinProbability(gameRequest.getWinProbability());
            _game.setIsFinal(gameRequest.getIsFinal());
            _game.setIsOt(gameRequest.getIsOt());
            _game.setWaitingOn(gameRequest.getWaitingOn());
            _game.setNumPlays(gameRequest.getNumPlays());
            _game.setHomeTimeouts(gameRequest.getHomeTimeouts());
            _game.setAwayTimeouts(gameRequest.getAwayTimeouts());
            _game.setGameTimer(gameRequest.getGameTimer());
            _game.setHomeTotalYards(gameRequest.getHomeTotalYards());
            _game.setAwayTotalYards(gameRequest.getAwayTotalYards());
            _game.setHomePassingYards(gameRequest.getHomePassingYards());
            _game.setAwayPassingYards(gameRequest.getAwayPassingYards());
            _game.setHomeRushingYards(gameRequest.getHomeRushingYards());
            _game.setAwayRushingYards(gameRequest.getAwayRushingYards());
            _game.setHomeTimeOfPossession(gameRequest.getHomeTimeOfPossession());
            _game.setAwayTimeOfPossession(gameRequest.getAwayTimeOfPossession());
            _game.setHomeAverageDiffOnOffense(gameRequest.getHomeAverageDiffOnOffense());
            _game.setHomeAverageDiffOnDefense(gameRequest.getHomeAverageDiffOnDefense());
            _game.setAwayAverageDiffOnOffense(gameRequest.getAwayAverageDiffOnOffense());
            _game.setAwayAverageDiffOnDefense(gameRequest.getAwayAverageDiffOnDefense());
            _game.setHomeFieldGoalAttempts(gameRequest.getHomeFieldGoalAttempts());
            _game.setHomeFieldGoalMakes(gameRequest.getHomeFieldGoalMakes());
            _game.setHomeFieldGoalPercentage(gameRequest.getHomeFieldGoalPercentage());
            _game.setAwayFieldGoalAttempts(gameRequest.getAwayFieldGoalAttempts());
            _game.setAwayFieldGoalMakes(gameRequest.getAwayFieldGoalMakes());
            _game.setAwayFieldGoalPercentage(gameRequest.getAwayFieldGoalPercentage());
            _game.setHomeLongestFieldGoal(gameRequest.getHomeLongestFieldGoal());
            _game.setAwayLongestFieldGoal(gameRequest.getAwayLongestFieldGoal());
            _game.setHomeLongestTouchdown(gameRequest.getHomeLongestTouchdown());
            _game.setAwayLongestTouchdown(gameRequest.getAwayLongestTouchdown());
            _game.setHomePassingAttempts(gameRequest.getHomePassingAttempts());
            _game.setHomePassingCompletions(gameRequest.getHomePassingCompletions());
            _game.setHomePassingPercentage(gameRequest.getHomePassingPercentage());
            _game.setAwayPassingAttempts(gameRequest.getAwayPassingAttempts());
            _game.setAwayPassingCompletions(gameRequest.getAwayPassingCompletions());
            _game.setAwayPassingPercentage(gameRequest.getAwayPassingPercentage());
            _game.setHomeRushingAttempts(gameRequest.getHomeRushingAttempts());
            _game.setHomeRushingSuccesses(gameRequest.getHomeRushingSuccesses());
            _game.setHomeRushingPercentage(gameRequest.getHomeRushingPercentage());
            _game.setAwayRushingAttempts(gameRequest.getAwayRushingAttempts());
            _game.setAwayRushingSuccesses(gameRequest.getAwayRushingSuccesses());
            _game.setAwayRushingPercentage(gameRequest.getAwayRushingPercentage());
            _game.setHomeThirdDownAttempts(gameRequest.getHomeThirdDownAttempts());
            _game.setHomeThirdDownSuccesses(gameRequest.getHomeThirdDownSuccesses());
            _game.setHomeThirdDownPercentage(gameRequest.getHomeThirdDownPercentage());
            _game.setAwayThirdDownAttempts(gameRequest.getAwayThirdDownAttempts());
            _game.setAwayThirdDownSuccesses(gameRequest.getAwayThirdDownSuccesses());
            _game.setAwayThirdDownPercentage(gameRequest.getAwayThirdDownPercentage());
            _game.setHomeFourthDownAttempts(gameRequest.getHomeFourthDownAttempts());
            _game.setHomeFourthDownSuccesses(gameRequest.getHomeFourthDownSuccesses());
            _game.setHomeFourthDownPercentage(gameRequest.getHomeFourthDownPercentage());
            _game.setAwayFourthDownAttempts(gameRequest.getAwayFourthDownAttempts());
            _game.setAwayFourthDownSuccesses(gameRequest.getAwayFourthDownSuccesses());
            _game.setAwayFourthDownPercentage(gameRequest.getAwayFourthDownPercentage());
            _game.setHomeTwoPointAttempts(gameRequest.getHomeTwoPointAttempts());
            _game.setHomeTwoPointSuccesses(gameRequest.getHomeTwoPointSuccesses());
            _game.setHomeTwoPointPercentage(gameRequest.getHomeTwoPointPercentage());
            _game.setAwayTwoPointAttempts(gameRequest.getAwayTwoPointAttempts());
            _game.setAwayTwoPointSuccesses(gameRequest.getAwayTwoPointSuccesses());
            _game.setAwayTwoPointPercentage(gameRequest.getAwayTwoPointPercentage());
            _game.setHomeOnsideKickAttempts(gameRequest.getHomeOnsideKickAttempts());
            _game.setHomeOnsideKickSuccesses(gameRequest.getHomeOnsideKickSuccesses());
            _game.setHomeOnsideKickPercentage(gameRequest.getHomeOnsideKickPercentage());
            _game.setAwayOnsideKickAttempts(gameRequest.getAwayOnsideKickAttempts());
            _game.setAwayOnsideKickSuccesses(gameRequest.getAwayOnsideKickSuccesses());
            _game.setAwayOnsideKickPercentage(gameRequest.getAwayOnsideKickPercentage());
            _game.setHomeOffensivePlays(gameRequest.getHomeOffensivePlays());
            _game.setHomeDefensivePlays(gameRequest.getHomeDefensivePlays());
            _game.setAwayOffensivePlays(gameRequest.getAwayOffensivePlays());
            _game.setAwayDefensivePlays(gameRequest.getAwayDefensivePlays());
            _game.setHomeTurnovers(gameRequest.getHomeTurnovers());
            _game.setHomeFumbles(gameRequest.getHomeFumbles());
            _game.setHomeInterceptions(gameRequest.getHomeInterceptions());
            _game.setAwayTurnovers(gameRequest.getAwayTurnovers());
            _game.setAwayFumbles(gameRequest.getAwayFumbles());
            _game.setAwayInterceptions(gameRequest.getAwayInterceptions());
            _game.setHomeDefensiveTouchdowns(gameRequest.getHomeDefensiveTouchdowns());
            _game.setHomeScoopAndScores(gameRequest.getHomeScoopAndScores());
            _game.setHomePickSixes(gameRequest.getHomePickSixes());
            _game.setHomeKickoffDefensiveTouchdowns(gameRequest.getHomeKickoffDefensiveTouchdowns());
            _game.setAwayDefensiveTouchdowns(gameRequest.getAwayDefensiveTouchdowns());
            _game.setAwayScoopAndScores(gameRequest.getAwayScoopAndScores());
            _game.setAwayPickSixes(gameRequest.getAwayPickSixes());
            _game.setAwayKickoffDefensiveTouchdowns(gameRequest.getAwayKickoffDefensiveTouchdowns());
            _game.setThreadTimestamp(gameRequest.getThreadTimestamp());

            gamesRepository.save(_game);

            return new ResponseEntity<>("Game updated", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Game does not exist", HttpStatus.NOT_FOUND);
        }
    }
}
