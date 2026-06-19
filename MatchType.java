package com.cricket.scoring.enums;

public enum MatchType {
    T20(20),
    ODI(50),
    TEST(90); // overs per day (simplified)

    private final int maxOvers;

    MatchType(int maxOvers) {
        this.maxOvers = maxOvers;
    }

    public int getMaxOvers() {
        return maxOvers;
    }
}