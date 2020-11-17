package game;

import java.sql.Date;
import java.time.LocalDate;

public class Journal {
    private static final int capacity = 1000;
    private JournalEntry[] journalEntries = new JournalEntry[capacity];
    private int size = 0;

    public void saveResult(Player player1, Player player2, boolean winner) {
        if (size >= 1000) {
            System.out.println("Местро в хранилище закончено");
        } else {
            journalEntries[size++] = new JournalEntry(Date.valueOf(LocalDate.now()), player1, player2, winner);
        }
    }

    public JournalEntry getByIndex(int i){
        if(i < 0 || i >= 1000 || i >= size){
            System.out.println("Нет такого номера");
            return null;
        }else{
            return journalEntries[i];
        }
    }

    public void printAllInfo(){
        for (int i = 0; i < size; i++) {
            System.out.println(this.getByIndex(i));
        }
    }
}
