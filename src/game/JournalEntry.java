package game;

import java.sql.Date;

public class JournalEntry {
    private Date date;
    private Player player1, player2;
    private boolean winner;

    public JournalEntry(Date date, Player player1, Player player2, boolean winner) {
        this.date = date;
        this.player1 = player1;
        this.player2 = player2;
        this.winner = winner;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public String toString() {
        return "JournalEntry{" +
                "date=" + date +
                ", player1=" + player1 +
                ", player2=" + player2 +
                ", winner=" + winner +
                '}';
    }
}
