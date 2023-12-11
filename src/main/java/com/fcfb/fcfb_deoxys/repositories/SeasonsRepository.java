package com.fcfb.fcfb_deoxys.repositories;

import com.fcfb.fcfb_deoxys.entities.SeasonsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeasonsRepository extends CrudRepository<SeasonsEntity, String> {
}


