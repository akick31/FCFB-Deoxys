package com.fcfb.fcfb_deoxys.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "rotom_users", schema = "deoxys")
public class RotomUsersEntity {
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "discord_id")
    private String discordId;
    @Basic
    @Column(name = "discord_username")
    private String discordUsername;
    @Basic
    @Column(name = "reddit_username")
    private String redditUsername;

    public RotomUsersEntity(String discordId, String discordUsername, String redditUsername) {
        this.discordId = discordId;
        this.discordUsername = discordUsername;
        this.redditUsername = redditUsername;
    }

    public RotomUsersEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDiscordId() {
        return discordId;
    }

    public void setDiscordId(String discordId) {
        this.discordId = discordId;
    }

    public String getDiscordUsername() {
        return discordUsername;
    }

    public void setDiscordUsername(String discordUsername) {
        this.discordUsername = discordUsername;
    }

    public String getRedditUsername() {
        return redditUsername;
    }

    public void setRedditUsername(String redditUsername) {
        this.redditUsername = redditUsername;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"id\": \"" + id + "\",\n" +
                "\"discordId\": \"" + discordId + "\",\n" +
                "\"discordUsername\": \"" + discordUsername + "\",\n" +
                "\"redditUsername\": \"" + redditUsername + "\"\n" +
                "}";
    }
}
