package com.fcfb.fcfb_deoxys.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.fcfb.fcfb_deoxys.domain.entities.RotomUsersEntity;

@Repository
public interface RotomUsersRepository extends CrudRepository<RotomUsersEntity, String> {
    Optional<RotomUsersEntity> findByRedditUsername(String redditUsername);
    Optional<RotomUsersEntity> findByDiscordId(String discordId);
    int deleteByDiscordId(String discordId);
}
