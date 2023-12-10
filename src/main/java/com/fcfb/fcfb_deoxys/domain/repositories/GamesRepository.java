package com.fcfb.fcfb_deoxys.domain.repositories;

import com.fcfb.fcfb_deoxys.domain.entities.GamesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface GamesRepository extends CrudRepository<GamesEntity, String> {
    Optional<GamesEntity> findByGameId(String gameId);
    Optional<GamesEntity> findByThread(String thread);
}
