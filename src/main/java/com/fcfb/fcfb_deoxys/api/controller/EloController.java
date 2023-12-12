package com.fcfb.fcfb_deoxys.api.controller;

import com.fcfb.fcfb_deoxys.api.repositories.EloRepository;
import com.fcfb.fcfb_deoxys.domain.EloEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/deoxys/elo")
public class EloController {

    @Autowired
    EloRepository eloRepository;

    /**
     * Get the elo of a team at a certain week and season
     *
     * @param team
     * @param week
     * @param season
     * @return
     */
    @GetMapping("/get/{team}/{week}/{season}")
    public ResponseEntity<Double> getElo(@PathVariable("team") String team,
                                          @PathVariable("week") String week,
                                          @PathVariable("season") String season) {
        Optional<EloEntity> elo = eloRepository.findbyTeamWeekSeason(team, Integer.parseInt(week), Integer.parseInt(season));

        if (elo.isPresent()) {
            EloEntity eloData = elo.get();
            return new ResponseEntity<>(eloData.getElo(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(1500.0, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Get the elo of a team at a certain week and season
     *
     * @param team
     * @param week
     * @param season
     * @return
     */

    @PostMapping("/add/{team}/{week}/{season}/{elo}")
    public ResponseEntity<String> getElo(@PathVariable("team") String team,
                                          @PathVariable("week") String week,
                                          @PathVariable("season") String season,
                                          @PathVariable("elo") String elo) {
        EloEntity eloEntity = new EloEntity(
            team,
            Integer.parseInt(week),
            Integer.parseInt(season),
            Double.parseDouble(elo)
        );

        eloRepository.save(eloEntity);
        return new ResponseEntity<>(eloEntity.toString(), HttpStatus.OK);
    }
}