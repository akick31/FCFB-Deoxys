package com.fcfb.fcfb_deoxys.controllers;

import com.fcfb.fcfb_deoxys.entities.GameDatesEntity;
import com.fcfb.fcfb_deoxys.repositories.GameDatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/deoxys/game_dates")
public class GameDatesController {

    @Autowired
    GameDatesRepository gameDatesRepository;

    /**
     * Get the season of the game thread
     * @param threadTimestamp
     * @return
     */
    @GetMapping("/season/{thread_timestamp}")
    public ResponseEntity<Integer> getSeason(@PathVariable("thread_timestamp") String threadTimestamp) {
        Integer season = 0;
        Iterable<GameDatesEntity> seasons = gameDatesRepository.findAll();

        LocalDate threadDate = LocalDate.parse(threadTimestamp, java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        for (GameDatesEntity seasonData : seasons) {
            LocalDate startDate = LocalDate.parse(seasonData.getStartDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            LocalDate postseasonEndDate = (seasonData.getPostseasonEndDate() != null) ? LocalDate.parse(seasonData.getPostseasonEndDate(), java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy")) : null;

            if (threadDate.isAfter(startDate) && postseasonEndDate == null){
                season = seasonData.getSeasonNumber();
                break;
            }
            if (threadDate.isAfter(startDate) && threadDate.isBefore(postseasonEndDate)){
                season = seasonData.getSeasonNumber();
                break;
            }
        }

        if (season != 0) {
            return new ResponseEntity<>(season, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(season, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Get the season of the game thread
     *
     * @param threadTimestamp
     * @return
     */
    @GetMapping("/week/{thread_timestamp}/{season}")
    public int getWeek(@PathVariable("thread_timestamp") String threadTimestamp,
                       @PathVariable("season") Integer season) {

        Optional<GameDatesEntity> seasons = gameDatesRepository.findBySeasonNumber(season);
        return 1;

        //TODO get game week from thread timestamp
    }
}
