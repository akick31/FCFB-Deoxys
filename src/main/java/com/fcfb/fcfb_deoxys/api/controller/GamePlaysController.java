package com.fcfb.fcfb_deoxys.api.controller;

import com.fcfb.fcfb_deoxys.domain.GamePlaysEntity;
import com.fcfb.fcfb_deoxys.api.repositories.GamePlaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/deoxys/game_plays")
public class GamePlaysController {

    @Autowired
    GamePlaysRepository gamePlaysRepository;

    /**
     * Get a processed comment by comment id
     * @param gameId
     * @return
     */
    @GetMapping("/game_id/{game_id}")
    public ResponseEntity<List<GamePlaysEntity>> getGamePlays(@PathVariable("game_id") String gameId) {
        List<GamePlaysEntity> gamePlaysData = gamePlaysRepository.findByGameId(gameId);

        if (!gamePlaysData.isEmpty()) {
            return new ResponseEntity<>(gamePlaysData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Create a new processed comment
     * @param homeScore
     * @param awayScore
     * @param quarter
     * @param clock
     * @param ballLocation
     * @param possession
     * @param down
     * @param yardsToGo
     * @param defensiveNumber
     * @param offensiveNumber
     * @param defensiveSubmitter
     * @param offensiveSubmitter
     * @param play
     * @param result
     * @param actualResult
     * @param yards
     * @param playTime
     * @param runoffTime
     * @param homeTeam
     * @param awayTeam
     * @param gameId
     * @param playNumber
     * @param winProbability
     * @return
     */
    @PostMapping("/add/home_score/{homeScore}/away_score/{awayScore}/quarter/{quarter}/clock/{clock}/ball_location" +
            "/{ballLocation}/possession/{possession}/down/{down}/yards_to_go/{yardsToGo}/defensive_number" +
            "/{defensiveNumber}/offensive_number/{offensiveNumber}/defensive_submitter/{defensiveSubmitter}" +
            "/offensive_submitter/{offensiveSubmitter}/play/{play}/result/{result}/actual_result/{actualResult}/yards" +
            "/{yards}/play_time/{playTime}/runoff_time/{runoffTime}/home_team/{homeTeam}/away_team/{awayTeam}/game_id" +
            "/{gameId}/play_number/{playNumber}/win_probability/{winProbability}")
    public ResponseEntity<String> addGamePlay(
            @PathVariable String homeScore,
            @PathVariable String awayScore,
            @PathVariable String quarter,
            @PathVariable String clock,
            @PathVariable String ballLocation,
            @PathVariable String possession,
            @PathVariable String down,
            @PathVariable String yardsToGo,
            @PathVariable String defensiveNumber,
            @PathVariable String offensiveNumber,
            @PathVariable String defensiveSubmitter,
            @PathVariable String offensiveSubmitter,
            @PathVariable String play,
            @PathVariable String result,
            @PathVariable String actualResult,
            @PathVariable String yards,
            @PathVariable String playTime,
            @PathVariable String runoffTime,
            @PathVariable String homeTeam,
            @PathVariable String awayTeam,
            @PathVariable String gameId,
            @PathVariable String playNumber,
            @PathVariable String winProbability) {

        try {
            Optional<GamePlaysEntity> existingRow = gamePlaysRepository.findByGameIdAndPlayNumber(gameId, Integer.parseInt(playNumber));
            if (existingRow.isPresent()) {
                // Row already exists, return some indication or ignore
                return new ResponseEntity<>("Play already exists, ignoring", HttpStatus.OK);
            }

            GamePlaysEntity newPlay = gamePlaysRepository.save(new GamePlaysEntity(
                    gameId,
                    homeTeam,
                    awayTeam,
                    homeScore,
                    awayScore,
                    quarter,
                    clock,
                    ballLocation,
                    possession,
                    down,
                    yardsToGo,
                    defensiveNumber,
                    offensiveNumber,
                    defensiveSubmitter,
                    offensiveSubmitter,
                    play,
                    result,
                    actualResult,
                    yards,
                    playTime,
                    runoffTime,
                    winProbability,
                    playNumber
            ));

            return new ResponseEntity<>(newPlay.toString(), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
