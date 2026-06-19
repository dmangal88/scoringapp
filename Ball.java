package com.cricket.scoring.model;

import com.cricket.scoring.enums.BallResult;

public class Ball {

    private BallResult result;
    private Player striker;
    private Player bowler;

    public Ball(BallResult result, Player striker, Player bowler) {
        this.result = result;
        this.striker = striker;
        this.bowler = bowler;
    }

    public BallResult getResult() {
        return result;
    }

    public Player getStriker() {
        return striker;
    }

    public Player getBowler() {
        return bowler;
    }
}