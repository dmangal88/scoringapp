package com.cricket.scoring.enums;

public enum BallResult {
    DOT(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    SIX(6),
    WICKET(-1),
    WIDE(1),
    NO_BALL(1);

    private final int runs;

    BallResult(int runs) {
        this.runs = runs;
    }

    public int getRuns() {
        return runs;
    }
}