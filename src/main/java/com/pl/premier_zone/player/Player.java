package com.pl.premier_zone.player;

import jakarta.persistence.*;

@Entity
@Table(name = "all_players_data")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String number;
    private String nation;
    private String appearances;
    private String goals;
    private String assists;
    private String shots;

    private String player_image;
    private String nation_flag;
    private String saves;
    private String big_chances_created;
    private String clean_sheets;
    private String goals_conceded;
    private String team;
    private String position;

    public Player() {}

    // Getters and Setters
    public Long getId() { return id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getNation() { return nation; }
    public void setNation(String nation) { this.nation = nation; }

    public String getAppearances() { return appearances; }
    public void setAppearances(String appearances) { this.appearances = appearances; }

    public String getGoals() { return goals; }
    public void setGoals(String goals) { this.goals = goals; }

    public String getAssists() { return assists; }
    public void setAssists(String assists) { this.assists = assists; }

    public String getShots() { return shots; }
    public void setShots(String shots) { this.shots = shots; }

    public String getPlayer_image() { return player_image; }
    public void setPlayer_image(String player_image) { this.player_image = player_image; }

    public String getNation_flag() { return nation_flag; }
    public void setNation_flag(String nation_flag) { this.nation_flag = nation_flag; }

    public String getSaves() { return saves; }
    public void setSaves(String saves) { this.saves = saves; }

    public String getBig_chances_created() { return big_chances_created; }
    public void setBig_chances_created(String big_chances_created) { this.big_chances_created = big_chances_created; }

    public String getClean_sheets() { return clean_sheets; }
    public void setClean_sheets(String clean_sheets) { this.clean_sheets = clean_sheets; }

    public String getGoals_conceded() { return goals_conceded; }
    public void setGoals_conceded(String goals_conceded) { this.goals_conceded = goals_conceded; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
}
