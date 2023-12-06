package com.fcfb.fcfb_deoxys.controllers;

import com.fcfb.fcfb_deoxys.domain.entities.RotomUsersEntity;
import com.fcfb.fcfb_deoxys.domain.repositories.RotomUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/deoxys/rotom_users")
public class RotomUsersController {

    @Autowired
    RotomUsersRepository rotomUsersRepository;

    /**
     * Get a user by discord id
     * @param discordId
     * @return
     */
    @GetMapping("/discord_id/{discord_id}")
    public ResponseEntity<String> getUserByDiscordId(@PathVariable("id") String discordId) {
        Optional<RotomUsersEntity> userData = rotomUsersRepository.findByDiscordId(discordId);

        if (userData.isPresent()) {
            return new ResponseEntity<>(userData.get().toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Get a user by reddit username
     * @param reddit_username
     * @return
     */
    @GetMapping("/reddit_username/{reddit_username}")
    public ResponseEntity<String> getUserByRedditUsername(@PathVariable("reddit_username") String reddit_username) {
        Optional<RotomUsersEntity> userData = rotomUsersRepository.findByRedditUsername(reddit_username);

        if (userData.isPresent()) {
            return new ResponseEntity<>(userData.get().toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Get all users
     * @return
     */
    @GetMapping("")
    public ResponseEntity<String> getAllUsers() {
        Iterable<RotomUsersEntity> userData = rotomUsersRepository.findAll();

        if (userData.iterator().hasNext()) {
            // Convert the Iterable to a String representation
            StringBuilder stringBuilder = new StringBuilder();
            userData.forEach(user -> stringBuilder.append(user.toString()).append("\n"));
            return new ResponseEntity<>(stringBuilder.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No users found", HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Create a new yser
     * @param discordId
     * @param discordUsername
     * @param redditUsername
     * @return
     */
    @PostMapping("/create/{discord_id}/{discord_username}/{reddit_username}")
    public ResponseEntity<String> createUser(@PathVariable("discord_id") String discordId,
                                             @PathVariable("discord_username") String discordUsername,
                                             @PathVariable("reddit_username") String redditUsername) {
        try {
            if (discordUsername.contains("%23")) {
                discordUsername = discordUsername.replace("%23", "#");
            }
            RotomUsersEntity newUser = rotomUsersRepository.save(new RotomUsersEntity(
                    discordId,
                    discordUsername,
                    redditUsername
            ));
            return new ResponseEntity<>(newUser.toString(), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Update a user
     * @param discordId
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable("discord_id") String discordId,
                                             @RequestBody RotomUsersEntity user) {
        Optional<RotomUsersEntity> userData = rotomUsersRepository.findByDiscordId(discordId);

        if (userData.isPresent()) {
            RotomUsersEntity _user = userData.get();
            _user.setDiscordId(user.getDiscordId());
            _user.setDiscordUsername(user.getDiscordUsername());
            _user.setRedditUsername(user.getRedditUsername());
            rotomUsersRepository.save(_user);
            return new ResponseEntity<>(_user.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    /**
     *
     * @param discordId
     * @return
     */
    @Transactional
    @DeleteMapping("/{discord_id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("discord_id") String discordId) {
        try {
            rotomUsersRepository.deleteByDiscordId(discordId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
