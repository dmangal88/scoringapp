package com.cricket.scoring;

import java.util.*;

public class CricketScoringApp {

    private int totalRuns = 0;
    private int wickets = 0;
    private int overs = 0;
    private int balls = 0;

    private final int MAX_OVERS = 20; // change as needed (ODI = 50, T20 = 20)

    public static void main(String[] args) {
        CricketScoringApp app = new CricketScoringApp();
        app.startMatch();
    }

    public void startMatch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cricket Scoring App ===");

        while (!isInningsOver()) {
            System.out.println("\nEnter ball result (0-6 runs, W = wicket): ");
            String input = scanner.next();

            processBall(input.toUpperCase());
            printScore();
        }

        System.out.println("\n=== Innings Over ===");
        printScore();
        scanner.close();
    }

    private void processBall(String input) {
        if (input.equals("W")) {
            wickets++;
            nextBall();
        } else {
            try {
                int runs = Integer.parseInt(input);
                if (runs >= 0 && runs <= 6) {
                    totalRuns += runs;
                    nextBall();
                } else {
                    System.out.println("Invalid runs! Enter between 0-6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Try again.");
            }
        }
    }

    private void nextBall() {
        balls++;
        if (balls == 6) {
            overs++;
            balls = 0;
        }
    }

    private boolean isInningsOver() {
        return wickets >= 10 || overs >= MAX_OVERS;
    }

    private void printScore() {
        System.out.println("Score: " + totalRuns + "/" + wickets +
                " in " + overs + "." + balls + " overs");
    }
}