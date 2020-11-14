package game;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Player player;
        Player player1;
        Game game;
        for(int i = 0; i < 50; i++){
            player = new Player("Иван","43245");
            player1 = new Player("Алексей");
            game = new Game(player, player1);
            game.start();
            storage.saveResult(game.getWinner());
        }
        int winsOfFirstPlayer = 0;
        int winsOfSecondPlayer = 0;
        for (int i = 0 ; i < 50; i++){
            int waste = storage.getResult(i).getName().equals("Иван") ? winsOfFirstPlayer++ : winsOfSecondPlayer++;
        }
        System.out.println(winsOfFirstPlayer  + " : " + winsOfSecondPlayer);
    }
}
