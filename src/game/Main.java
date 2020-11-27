package game;

import ru.kpfu.itis.java.introduction.inheritance.dogovor.system.ResponsibleMan;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();
        Player player = null;
        Player player1;
        Game game;
        for(int i = 0; i < 50; i++){
            player = new HealerPlayer("Иван","Лекарь",20);
            player1 = new Player("Алексей");
            game = new Game(player, player1);
            game.start();
            player.shoutBattleCry();
            journal.saveResult(game.getPlayer1(), game.getPlayer2(), game.getWinner() == game.getPlayer1());
        }
        journal.printAllInfo();


        int winsOfFirstPlayer = 0;
        int winsOfSecondPlayer = 0;
        for (int i = 0 ; i < 50; i++){
            JournalEntry entry = journal.getByIndex(i);
            int waste =  entry.isWinner() ? winsOfFirstPlayer++ : winsOfSecondPlayer++;
        }
        System.out.println(winsOfFirstPlayer  + " : " + winsOfSecondPlayer);
    }
}
