package com.cricket.scoring.model;

import com.cricket.scoring.enums.PlayerRole;

public class Player {

    private String name;
    private PlayerRole role;

    // Batting stats
    private int runs;
    private int ballsFaced;

    // Bowling stats
    private int ballsBowled;
    private int runsGiven;
    private int wickets;

    public Player(String name, PlayerRole role) {
        this.name = name;
        this.role = role;
    }

    // Basic methods
    public void addRuns(int runs) {
        this.runs += runs;
        this.ballsFaced++;
    }

    public void bowlBall(int runs, boolean isWicket) {
        this.runsGiven += runs;
        this.ballsBowled++;
        if (isWicket) {
            this.wickets++;
        }
    }

    // Getters
    public String getName() { return name; }
    public int getRuns() { return runs; }
    public int getWickets() { return wickets; }
}