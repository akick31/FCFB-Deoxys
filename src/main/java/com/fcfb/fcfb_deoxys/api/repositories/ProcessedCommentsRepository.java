package com.fcfb.fcfb_deoxys.api.repositories;

import com.fcfb.fcfb_deoxys.domain.ProcessedCommentsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcessedCommentsRepository extends CrudRepository<ProcessedCommentsEntity, String> {
    Optional<ProcessedCommentsEntity> findByCommentId(String commentId);
    int deleteByCommentId(String commentId);
}
