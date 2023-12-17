package com.fcfb.fcfb_deoxys.api.controller;

import com.fcfb.fcfb_deoxys.api.repositories.TeamsRepository;
import com.fcfb.fcfb_deoxys.domain.TeamsEntity;
import com.fcfb.fcfb_deoxys.api.model.TeamStatsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/deoxys/teams")
public class TeamsController {

    @Autowired
    TeamsRepository teamsRepository;

    /**
     * Get a team by their name
     *
     * @param teamName
     * @return
     */
    @GetMapping("/{team_name}")
    public ResponseEntity<TeamsEntity> getTeam(@PathVariable("team_name") String teamName) {
        Optional<TeamsEntity> teamData = teamsRepository.findByName(teamName);

        if (teamData.isPresent()) {
            TeamsEntity team = teamData.get();
            return new ResponseEntity<>(team, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Update a team's stats
     * @param teamName
     */
    @PutMapping("/update_record/{team_name}/{overall_wins}/{overall_losses}/{overall_conference_wins}/{overall_conference_losses}")
    public ResponseEntity<TeamsEntity> updateTeamStats(@PathVariable("team_name") String teamName,
                                                       @PathVariable("overall_wins") int overallWins,
                                                       @PathVariable("overall_losses") int overallLosses,
                                                       @PathVariable("overall_conference_wins") int overallConferenceWins,
                                                       @PathVariable("overall_conference_losses") int overallConferenceLosses) {
        Optional<TeamsEntity> teamData = teamsRepository.findByName(teamName);

        if (teamData.isPresent()) {
            TeamsEntity team = teamData.get();
            team.setOverallWins(overallWins);
            team.setOverallLosses(overallLosses);
            team.setOverallConferenceWins(overallConferenceWins);
            team.setOverallConferenceLosses(overallConferenceLosses);
            teamsRepository.save(team);
            return new ResponseEntity<>(team, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}