package com.fcfb.fcfb_deoxys.api.repositories;

import com.fcfb.fcfb_deoxys.domain.TeamsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeamsRepository extends CrudRepository<TeamsEntity, String> {
    Optional<TeamsEntity> findByName(String teamName);
}

