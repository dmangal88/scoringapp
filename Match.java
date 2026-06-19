package com.cricket.scoring.model;

import com.cricket.scoring.enums.MatchType;

public class Match {

    private Team teamA;
    private Team teamB;
    private MatchType matchType;

    private Team battingTeam;
    private Team bowlingTeam;

    public Match(Team teamA, Team teamB, MatchType matchType) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchType = matchType;

        this.battingTeam = teamA;
        this.bowlingTeam = teamB;
    }

    public void switchInnings() {
        Team temp = battingTeam;
        battingTeam = bowlingTeam;
        bowlingTeam = temp;
    }

    public Team getBattingTeam() {
        return battingTeam;
    }

    public MatchType getMatchType() {
        return matchType;
    }
}