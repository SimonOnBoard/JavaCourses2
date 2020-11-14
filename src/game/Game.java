package game;

import java.util.Random;

public class Game {
    private Player winner;
    private Player player1;
    private Player player2;
    private Random random;
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        random = new Random();
    }


    public Player getWinner() {
        return winner;
    }

    public void start(){
        int counter = 0;
        int force = 0;
        while (player1.getHp() > 0 && player2.getHp() > 0){
            if(counter % 2 == 0){
                System.out.println("Player 1 is kicking");
                force = random.nextInt(10);
                player1.hit(player2, force);
            }
            else{
                System.out.println("Player 2 is kicking");
                force = random.nextInt(10);
                player2.hit(player1, force);
            }
            counter++;
            printCurrentStatistics();
        }
        if(player1.getHp() > 0){
            winner = player1;
        }else{
            winner = player2;
        }
    }

    private void printCurrentStatistics() {
        System.out.println(player1.toString() + " : " + player2.toString());
    }
}
