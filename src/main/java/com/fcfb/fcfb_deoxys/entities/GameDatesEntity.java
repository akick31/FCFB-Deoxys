package com.fcfb.fcfb_deoxys.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "game_dates", schema = "deoxys", catalog = "")
public class GameDatesEntity {
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
    @Basic
    @Column(name = "week_one_start_date")
    private String weekOneStartDate;
    @Basic
    @Column(name = "week_one_end_date")
    private String weekOneEndDate;
    @Basic
    @Column(name = "week_two_start_date")
    private String weekTwoStartDate;
    @Basic
    @Column(name = "week_two_end_date")
    private String weekTwoEndDate;
    @Basic
    @Column(name = "week_three_start_date")
    private String weekThreeStartDate;
    @Basic
    @Column(name = "week_three_end_date")
    private String weekThreeEndDate;
    @Basic
    @Column(name = "week_four_start_date")
    private String weekFourStartDate;
    @Basic
    @Column(name = "week_four_end_date")
    private String weekFourEndDate;
    @Basic
    @Column(name = "week_five_start_date")
    private String weekFiveStartDate;
    @Basic
    @Column(name = "week_five_end_date")
    private String weekFiveEndDate;
    @Basic
    @Column(name = "week_six_start_date")
    private String weekSixStartDate;
    @Basic
    @Column(name = "week_six_end_date")
    private String weekSixEndDate;
    @Basic
    @Column(name = "week_seven_start_date")
    private String weekSevenStartDate;
    @Basic
    @Column(name = "week_seven_end_date")
    private String weekSevenEndDate;
    @Basic
    @Column(name = "week_eight_start_date")
    private String weekEightStartDate;
    @Basic
    @Column(name = "week_eight_end_date")
    private String weekEightEndDate;
    @Basic
    @Column(name = "week_nine_start_date")
    private String weekNineStartDate;
    @Basic
    @Column(name = "week_nine_end_date")
    private String weekNineEndDate;
    @Basic
    @Column(name = "week_ten_start_date")
    private String weekTenStartDate;
    @Basic
    @Column(name = "week_ten_end_date")
    private String weekTenEndDate;
    @Basic
    @Column(name = "week_eleven_start_date")
    private String weekElevenStartDate;
    @Basic
    @Column(name = "week_eleven_end_date")
    private String weekElevenEndDate;
    @Basic
    @Column(name = "week_twelve_start_date")
    private String weekTwelveStartDate;
    @Basic
    @Column(name = "week_twelve_end_date")
    private String weekTwelveEndDate;

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
        GameDatesEntity that = (GameDatesEntity) o;
        return Objects.equals(seasonNumber, that.seasonNumber) && Objects.equals(startDate, that.startDate) && Objects.equals(regularSeasonEndDate, that.regularSeasonEndDate) && Objects.equals(postseasonStartDate, that.postseasonStartDate) && Objects.equals(postseasonEndDate, that.postseasonEndDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seasonNumber, startDate, regularSeasonEndDate, postseasonStartDate, postseasonEndDate);
    }

    public String getWeekOneStartDate() {
        return weekOneStartDate;
    }

    public void setWeekOneStartDate(String weekOneStartDate) {
        this.weekOneStartDate = weekOneStartDate;
    }

    public String getWeekOneEndDate() {
        return weekOneEndDate;
    }

    public void setWeekOneEndDate(String weekOneEndDate) {
        this.weekOneEndDate = weekOneEndDate;
    }

    public String getWeekTwoStartDate() {
        return weekTwoStartDate;
    }

    public void setWeekTwoStartDate(String weekTwoStartDate) {
        this.weekTwoStartDate = weekTwoStartDate;
    }

    public String getWeekTwoEndDate() {
        return weekTwoEndDate;
    }

    public void setWeekTwoEndDate(String weekTwoEndDate) {
        this.weekTwoEndDate = weekTwoEndDate;
    }

    public String getWeekThreeStartDate() {
        return weekThreeStartDate;
    }

    public void setWeekThreeStartDate(String weekThreeStartDate) {
        this.weekThreeStartDate = weekThreeStartDate;
    }

    public String getWeekThreeEndDate() {
        return weekThreeEndDate;
    }

    public void setWeekThreeEndDate(String weekThreeEndDate) {
        this.weekThreeEndDate = weekThreeEndDate;
    }

    public String getWeekFourStartDate() {
        return weekFourStartDate;
    }

    public void setWeekFourStartDate(String weekFourStartDate) {
        this.weekFourStartDate = weekFourStartDate;
    }

    public String getWeekFourEndDate() {
        return weekFourEndDate;
    }

    public void setWeekFourEndDate(String weekFourEndDate) {
        this.weekFourEndDate = weekFourEndDate;
    }

    public String getWeekFiveStartDate() {
        return weekFiveStartDate;
    }

    public void setWeekFiveStartDate(String weekFiveStartDate) {
        this.weekFiveStartDate = weekFiveStartDate;
    }

    public String getWeekFiveEndDate() {
        return weekFiveEndDate;
    }

    public void setWeekFiveEndDate(String weekFiveEndDate) {
        this.weekFiveEndDate = weekFiveEndDate;
    }

    public String getWeekSixStartDate() {
        return weekSixStartDate;
    }

    public void setWeekSixStartDate(String weekSixStartDate) {
        this.weekSixStartDate = weekSixStartDate;
    }

    public String getWeekSixEndDate() {
        return weekSixEndDate;
    }

    public void setWeekSixEndDate(String weekSixEndDate) {
        this.weekSixEndDate = weekSixEndDate;
    }

    public String getWeekSevenStartDate() {
        return weekSevenStartDate;
    }

    public void setWeekSevenStartDate(String weekSevenStartDate) {
        this.weekSevenStartDate = weekSevenStartDate;
    }

    public String getWeekSevenEndDate() {
        return weekSevenEndDate;
    }

    public void setWeekSevenEndDate(String weekSevenEndDate) {
        this.weekSevenEndDate = weekSevenEndDate;
    }

    public String getWeekEightStartDate() {
        return weekEightStartDate;
    }

    public void setWeekEightStartDate(String weekEightStartDate) {
        this.weekEightStartDate = weekEightStartDate;
    }

    public String getWeekEightEndDate() {
        return weekEightEndDate;
    }

    public void setWeekEightEndDate(String weekEightEndDate) {
        this.weekEightEndDate = weekEightEndDate;
    }

    public String getWeekNineStartDate() {
        return weekNineStartDate;
    }

    public void setWeekNineStartDate(String weekNineStartDate) {
        this.weekNineStartDate = weekNineStartDate;
    }

    public String getWeekNineEndDate() {
        return weekNineEndDate;
    }

    public void setWeekNineEndDate(String weekNineEndDate) {
        this.weekNineEndDate = weekNineEndDate;
    }

    public String getWeekTenStartDate() {
        return weekTenStartDate;
    }

    public void setWeekTenStartDate(String weekTenStartDate) {
        this.weekTenStartDate = weekTenStartDate;
    }

    public String getWeekTenEndDate() {
        return weekTenEndDate;
    }

    public void setWeekTenEndDate(String weekTenEndDate) {
        this.weekTenEndDate = weekTenEndDate;
    }

    public String getWeekElevenStartDate() {
        return weekElevenStartDate;
    }

    public void setWeekElevenStartDate(String weekElevenStartDate) {
        this.weekElevenStartDate = weekElevenStartDate;
    }

    public String getWeekElevenEndDate() {
        return weekElevenEndDate;
    }

    public void setWeekElevenEndDate(String weekElevenEndDate) {
        this.weekElevenEndDate = weekElevenEndDate;
    }

    public String getWeekTwelveStartDate() {
        return weekTwelveStartDate;
    }

    public void setWeekTwelveStartDate(String weekTwelveStartDate) {
        this.weekTwelveStartDate = weekTwelveStartDate;
    }

    public String getWeekTwelveEndDate() {
        return weekTwelveEndDate;
    }

    public void setWeekTwelveEndDate(String weekTwelveEndDate) {
        this.weekTwelveEndDate = weekTwelveEndDate;
    }
}
