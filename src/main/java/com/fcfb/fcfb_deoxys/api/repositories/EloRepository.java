package com.fcfb.fcfb_deoxys.api.repositories;

import com.fcfb.fcfb_deoxys.domain.EloEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EloRepository extends CrudRepository<EloEntity, String> {
    @Query(value = "SELECT * FROM elo WHERE team = ?1 AND week = ?2 AND season = ?3", nativeQuery = true)
    Optional<EloEntity> findbyTeamWeekSeason(String team, int week, int season);
}