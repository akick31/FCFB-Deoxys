package com.fcfb.fcfb_deoxys.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "seasons", schema = "deoxys", catalog = "")
public class SeasonsEntity {
    @Basic
    @Column(name = "season_number")
    private Integer seasonNumber;
    @Basic
    @Column(name = "start_date")
    private String startDate;
    @Basic
    @Column(name = "regular_season_end_date")
    private String regularSeasonEndDate;
    @Basic
    @Column(name = "postseason_start_date")
    private String postseasonStartDate;
    @Basic
    @Column(name = "postseason_end_date")
    private String postseasonEndDate;

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getRegularSeasonEndDate() {
        return regularSeasonEndDate;
    }

    public void setRegularSeasonEndDate(String regularSeasonEndDate) {
        this.regularSeasonEndDate = regularSeasonEndDate;
    }

    public String getPostseasonStartDate() {
        return postseasonStartDate;
    }

    public void setPostseasonStartDate(String postseasonStartDate) {
        this.postseasonStartDate = postseasonStartDate;
    }

    public String getPostseasonEndDate() {
        return postseasonEndDate;
    }

    public void setPostseasonEndDate(String postseasonEndDate) {
        this.postseasonEndDate = postseasonEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeasonsEntity that = (SeasonsEntity) o;
        return Objects.equals(seasonNumber, that.seasonNumber) && Objects.equals(startDate, that.startDate) && Objects.equals(regularSeasonEndDate, that.regularSeasonEndDate) && Objects.equals(postseasonStartDate, that.postseasonStartDate) && Objects.equals(postseasonEndDate, that.postseasonEndDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seasonNumber, startDate, regularSeasonEndDate, postseasonStartDate, postseasonEndDate);
    }
}
