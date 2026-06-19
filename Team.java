package com.cricket.scoring.model;

import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    private int totalRuns;
    private int wickets;
    private int overs;
    private int balls;

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public void addRuns(int runs) {
        totalRuns += runs;
    }

    public void addWicket() {
        wickets++;
    }

    public void nextBall() {
        balls++;
        if (balls == 6) {
            balls = 0;
            overs++;
        }
    }

    // Getters
    public int getTotalRuns() { return totalRuns; }
    public int getWickets() { return wickets; }
    public String getScore() {
        return totalRuns + "/" + wickets + " (" + overs + "." + balls + ")";
    }
}