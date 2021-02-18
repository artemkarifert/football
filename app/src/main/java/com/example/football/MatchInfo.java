package com.example.football;

public class MatchInfo {
    private int id;
    private String teamHome;
    private int goalHome;
    private String teamGuest;
    private int goalGuest;

    public MatchInfo(int id, String teamHome, int goalHome, String teamGuest, int goalGuest) {
        this.id = id;
        this.teamHome = teamHome;
        this.goalHome = goalHome;
        this.teamGuest = teamGuest;
        this.goalGuest = goalGuest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(String teamHome) {
        this.teamHome = teamHome;
    }

    public int getGoalHome() {
        return goalHome;
    }

    public void setGoalHome(int goalHome) {
        this.goalHome = goalHome;
    }

    public String getTeamGuest() {
        return teamGuest;
    }

    public void setTeamGuest(String teamGuest) {
        this.teamGuest = teamGuest;
    }

    public int getGoalGuest() {
        return goalGuest;
    }

    public void setGoalGuest(int goalGuest) {
        this.goalGuest = goalGuest;
    }
}
