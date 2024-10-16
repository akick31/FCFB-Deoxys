package com.fcfb.fcfb_deoxys.api.repositories;

import com.fcfb.fcfb_deoxys.domain.TeamStatsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeamStatsRepository extends CrudRepository<TeamStatsEntity, String> {

    @Query(value = "SELECT * FROM team_stats WHERE name = ?1 AND season = ?2", nativeQuery = true)
    Optional<TeamStatsEntity> findByNameAndSeason(String teamName, String season);
}

