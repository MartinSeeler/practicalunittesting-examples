package com.practicalunittesting;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FootballTeam implements Comparable<FootballTeam> {
    private final int gamesWon;

    public FootballTeam(final int gamesWon) {
        if (gamesWon < 0) {
            throw new IllegalArgumentException("Not possible to have less than 0 games won! (was + " + gamesWon  + ")");
        }
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    //@Override
    public int compareTo(final FootballTeam otherTeam) {
        return gamesWon - otherTeam.gamesWon;
    }
}
