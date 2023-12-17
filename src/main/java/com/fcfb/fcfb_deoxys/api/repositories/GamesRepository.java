package com.fcfb.fcfb_deoxys.api.repositories;

import com.fcfb.fcfb_deoxys.domain.GamesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GamesRepository extends CrudRepository<GamesEntity, String> {
    Optional<GamesEntity> findByGameId(String gameId);

    @Query(value = "SELECT * FROM games WHERE is_final IS false", nativeQuery = true)
    List<GamesEntity> findUnfinishedGames();
}
