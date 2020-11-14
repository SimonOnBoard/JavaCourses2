package game;

public class Storage {
    private Player[] winners;
    private int counter;
    public Storage() {
        this.winners = new Player[50];
        counter = 0;
    }

    public int getCurrentSizeOfStorage() {
        return counter;
    }

    public void saveResult(Player winner) {
        winners[counter] = winner;
        counter++;
    }

    public Player getResult(int gameNumber){
        return winners[gameNumber];
    }
}
