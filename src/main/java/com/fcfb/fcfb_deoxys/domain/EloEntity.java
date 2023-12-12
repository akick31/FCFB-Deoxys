package com.fcfb.fcfb_deoxys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "elo", schema = "deoxys")
public class EloEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "team")
    private String team;
    @Basic
    @Column(name = "week")
    private Integer week;
    @Basic
    @Column(name = "season")
    private Integer season;
    @Basic
    @Column(name = "elo")
    private Double elo;

    public EloEntity() {
    }

    public EloEntity(String team, Integer week, Integer season, Double elo) {
        this.team = team;
        this.week = week;
        this.season = season;
        this.elo = elo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Double getElo() {
        return elo;
    }

    public void setElo(Double elo) {
        this.elo = elo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EloEntity eloEntity = (EloEntity) o;
        return id == eloEntity.id && Objects.equals(team, eloEntity.team) && Objects.equals(week, eloEntity.week) && Objects.equals(season, eloEntity.season) && Objects.equals(elo, eloEntity.elo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, team, week, season, elo);
    }
}
