package com.fcfb.fcfb_deoxys.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fcfb.fcfb_deoxys.domain.entities.GamePlaysEntity;
import java.util.List;
import java.util.Optional;

@Repository
public interface GamePlaysRepository extends CrudRepository<GamePlaysEntity, String> {
    Optional<GamePlaysEntity> findByGameIdAndPlayNumber(String gameId, int playNumber);
    List<GamePlaysEntity> findByGameId(String gameId);
}
