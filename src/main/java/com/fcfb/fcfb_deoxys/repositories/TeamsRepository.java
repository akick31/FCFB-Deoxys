package com.fcfb.fcfb_deoxys.repositories;

import com.fcfb.fcfb_deoxys.entities.TeamsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeamsRepository extends CrudRepository<TeamsEntity, String> {
    Optional<TeamsEntity> findByTeamName(String teamName);
}

