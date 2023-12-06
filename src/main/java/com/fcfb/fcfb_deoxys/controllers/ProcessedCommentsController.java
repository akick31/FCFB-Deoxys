package com.fcfb.fcfb_deoxys.controllers;

import com.fcfb.fcfb_deoxys.domain.entities.ProcessedCommentsEntity;
import com.fcfb.fcfb_deoxys.domain.repositories.ProcessedCommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/deoxys/processed_comments")
public class ProcessedCommentsController {

    @Autowired
    ProcessedCommentsRepository processedCommentsRepository;

    /**
     * Get a processed comment by comment id
     * @param commentId
     * @return
     */
    @GetMapping("/comment_id/{comment_id}")
    public ResponseEntity<String> getProcessedCommentByCommentId(@PathVariable("comment_id") String commentId) {
        Optional<ProcessedCommentsEntity> processedCommentData = processedCommentsRepository.findByCommentId(commentId);

        if (processedCommentData.isPresent()) {
            return new ResponseEntity<>(processedCommentData.get().toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Get all processed comments
     * @return
     */
    @GetMapping("")
    public ResponseEntity<String> getAllUsers() {
        Iterable<ProcessedCommentsEntity> processedCommentData = processedCommentsRepository.findAll();

        if (processedCommentData.iterator().hasNext()) {
            // Convert the Iterable to a String representation
            StringBuilder stringBuilder = new StringBuilder();
            processedCommentData.forEach(processedComment -> stringBuilder.append(processedComment.toString()).append("\n"));
            return new ResponseEntity<>(stringBuilder.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No processed comment found", HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Create a new processed comment
     * @param commentId
     * @param submissionId
     * @return
     */
    @PostMapping("/create/{comment_id}/{submission_id}")
    public ResponseEntity<String> createProcessedComment(@PathVariable("comment_id") String commentId,
                                                         @PathVariable("submission_id") String submissionId) {
        try {
            ProcessedCommentsEntity newProcessedComment = processedCommentsRepository.save(new ProcessedCommentsEntity(
                    commentId,
                    submissionId
            ));
            return new ResponseEntity<>(newProcessedComment.toString(), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     *
     * @param commentId
     * @return
     */
    @Transactional
    @DeleteMapping("/{comment_id}")
    public ResponseEntity<HttpStatus> deleteProcessedComment(@PathVariable("comment_id") String commentId) {
        try {
            processedCommentsRepository.deleteByCommentId(commentId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
