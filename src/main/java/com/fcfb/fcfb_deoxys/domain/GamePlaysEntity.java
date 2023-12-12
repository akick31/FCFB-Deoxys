package com.fcfb.fcfb_deoxys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "game_plays", schema = "deoxys")
public class GamePlaysEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Play_ID")
    private int playId;
    @Basic
    @Column(name = "Game_ID")
    private String gameId;
    @Basic
    @Column(name = "Home_Team")
    private String homeTeam;
    @Basic
    @Column(name = "Away_Team")
    private String awayTeam;
    @Basic
    @Column(name = "Home_Score")
    private Integer homeScore;
    @Basic
    @Column(name = "Away_Score")
    private Integer awayScore;
    @Basic
    @Column(name = "Quarter")
    private Integer quarter;
    @Basic
    @Column(name = "Clock")
    private Integer clock;
    @Basic
    @Column(name = "Ball_Location")
    private Integer ballLocation;
    @Basic
    @Column(name = "Possession")
    private String possession;
    @Basic
    @Column(name = "Down")
    private Integer down;
    @Basic
    @Column(name = "Yards_to_Go")
    private Integer yardsToGo;
    @Basic
    @Column(name = "Defensive_Number")
    private Integer defensiveNumber;
    @Basic
    @Column(name = "Offensive_Number")
    private Integer offensiveNumber;
    @Basic
    @Column(name = "Defensive_Submitter")
    private String defensiveSubmitter;
    @Basic
    @Column(name = "Offensive_Submitter")
    private String offensiveSubmitter;
    @Basic
    @Column(name = "Play")
    private String play;
    @Basic
    @Column(name = "Result")
    private String result;
    @Basic
    @Column(name = "Actual_Result")
    private String actualResult;
    @Basic
    @Column(name = "Yards")
    private Integer yards;
    @Basic
    @Column(name = "Play_Time")
    private Integer playTime;
    @Basic
    @Column(name = "Runoff_Time")
    private Integer runoffTime;
    @Basic
    @Column(name = "Win_Probability")
    private Double winProbability;
    @Basic
    @Column(name = "Play_Number")
    private Integer playNumber;

    public GamePlaysEntity(String gameID, String homeTeam, String awayTeam, String homeScore, String awayScore,
                           String quarter, String clock, String ballLocation, String possession, String down,
                           String yardsToGo, String defensiveNumber, String offensiveNumber, String defensiveSubmitter,
                           String offensiveSubmitter, String play, String result, String actualResult, String yards,
                           String playTime, String runoffTime, String winProbability, String playNumber) {
        this.gameId = gameID;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = Integer.parseInt(homeScore);
        this.awayScore = Integer.parseInt(awayScore);
        this.quarter = Integer.parseInt(quarter);
        this.clock = Integer.parseInt(clock);
        this.ballLocation = Integer.parseInt(ballLocation);
        this.possession = possession;
        this.down = Integer.parseInt(down);
        this.yardsToGo = Integer.parseInt(yardsToGo);
        this.defensiveNumber = Integer.parseInt(defensiveNumber);
        this.offensiveNumber = Integer.parseInt(offensiveNumber);
        this.defensiveSubmitter = defensiveSubmitter;
        this.offensiveSubmitter = offensiveSubmitter;
        this.play = play;
        this.result = result;
        this.actualResult = actualResult;
        this.yards = Integer.parseInt(yards);
        this.playTime = Integer.parseInt(playTime);
        this.runoffTime = Integer.parseInt(runoffTime);
        this.winProbability = Double.parseDouble(winProbability);
        this.playNumber = Integer.parseInt(playNumber);
    }

    public GamePlaysEntity() {
    }

    public int getPlayId() {
        return playId;
    }

    public void setPlayId(int playId) {
        this.playId = playId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public Integer getClock() {
        return clock;
    }

    public void setClock(Integer clock) {
        this.clock = clock;
    }

    public Integer getBallLocation() {
        return ballLocation;
    }

    public void setBallLocation(Integer ballLocation) {
        this.ballLocation = ballLocation;
    }

    public String getPossession() {
        return possession;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Integer getYardsToGo() {
        return yardsToGo;
    }

    public void setYardsToGo(Integer yardsToGo) {
        this.yardsToGo = yardsToGo;
    }

    public Integer getDefensiveNumber() {
        return defensiveNumber;
    }

    public void setDefensiveNumber(Integer defensiveNumber) {
        this.defensiveNumber = defensiveNumber;
    }

    public Integer getOffensiveNumber() {
        return offensiveNumber;
    }

    public void setOffensiveNumber(Integer offensiveNumber) {
        this.offensiveNumber = offensiveNumber;
    }

    public String getDefensiveSubmitter() {
        return defensiveSubmitter;
    }

    public void setDefensiveSubmitter(String defensiveSubmitter) {
        this.defensiveSubmitter = defensiveSubmitter;
    }

    public String getOffensiveSubmitter() {
        return offensiveSubmitter;
    }

    public void setOffensiveSubmitter(String offensiveSubmitter) {
        this.offensiveSubmitter = offensiveSubmitter;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public Integer getYards() {
        return yards;
    }

    public void setYards(Integer yards) {
        this.yards = yards;
    }

    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    public Integer getRunoffTime() {
        return runoffTime;
    }

    public void setRunoffTime(Integer runoffTime) {
        this.runoffTime = runoffTime;
    }

    public Double getWinProbability() {
        return winProbability;
    }

    public void setWinProbability(Double winProbability) {
        this.winProbability = winProbability;
    }

    public Integer getPlayNumber() {
        return playNumber;
    }

    public void setPlayNumber(Integer playNumber) {
        this.playNumber = playNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamePlaysEntity that = (GamePlaysEntity) o;
        return playId == that.playId && Objects.equals(gameId, that.gameId) && Objects.equals(homeTeam, that.homeTeam) && Objects.equals(awayTeam, that.awayTeam) && Objects.equals(homeScore, that.homeScore) && Objects.equals(awayScore, that.awayScore) && Objects.equals(quarter, that.quarter) && Objects.equals(clock, that.clock) && Objects.equals(ballLocation, that.ballLocation) && Objects.equals(possession, that.possession) && Objects.equals(down, that.down) && Objects.equals(yardsToGo, that.yardsToGo) && Objects.equals(defensiveNumber, that.defensiveNumber) && Objects.equals(offensiveNumber, that.offensiveNumber) && Objects.equals(defensiveSubmitter, that.defensiveSubmitter) && Objects.equals(offensiveSubmitter, that.offensiveSubmitter) && Objects.equals(play, that.play) && Objects.equals(result, that.result) && Objects.equals(actualResult, that.actualResult) && Objects.equals(yards, that.yards) && Objects.equals(playTime, that.playTime) && Objects.equals(runoffTime, that.runoffTime) && Objects.equals(winProbability, that.winProbability) && Objects.equals(playNumber, that.playNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playId, gameId, homeTeam, awayTeam, homeScore, awayScore, quarter, clock, ballLocation, possession, down, yardsToGo, defensiveNumber, offensiveNumber, defensiveSubmitter, offensiveSubmitter, play, result, actualResult, yards, playTime, runoffTime, winProbability, playNumber);
    }
}
