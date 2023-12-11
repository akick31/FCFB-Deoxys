package com.fcfb.fcfb_deoxys.repositories;

import com.fcfb.fcfb_deoxys.entities.ProcessedCommentsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcessedCommentsRepository extends CrudRepository<ProcessedCommentsEntity, String> {
    Optional<ProcessedCommentsEntity> findByCommentId(String commentId);
    int deleteByCommentId(String commentId);
}
