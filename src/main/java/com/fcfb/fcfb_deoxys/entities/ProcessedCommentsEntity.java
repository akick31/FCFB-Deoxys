package com.fcfb.fcfb_deoxys.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "processed_comments", schema = "deoxys")
public class ProcessedCommentsEntity {
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "comment_id")
    private String commentId;
    @Basic
    @Column(name = "submission_id")
    private String submissionId;

    public ProcessedCommentsEntity(String commentId, String submissionId) {
        this.commentId = commentId;
        this.submissionId = submissionId;
    }
    public ProcessedCommentsEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"id\": \"" + id + "\",\n" +
                "\"commentId\": \"" + commentId + "\",\n" +
                "\"submissionId\": \"" + submissionId + "\"\n" +
                "}";
    }

}
