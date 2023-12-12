package com.fcfb.fcfb_deoxys.api.repositories;

import com.fcfb.fcfb_deoxys.domain.GameDatesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameDatesRepository extends CrudRepository<GameDatesEntity, String> {
    Optional<GameDatesEntity> findBySeasonNumber(int seasonNumber);
}


