package dogovor.system.inheritance.system;

import game.JournalEntry;
import game.Player;

import java.sql.Date;
import java.time.LocalDate;

public class Storage {
    private static final int capacity = 1000;
    private Contract contracts[] = new Contract[capacity];
    private int size = 0;


    public void save(Contract contract) {
        if (size >= 1000) {
            System.out.println("Местро в хранилище закончено");
        } else {
            contracts[size++] = contract;
        }
    }

    public Contract getByIndex(int i){
        if(i < 0 || i >= 1000 || i >= size){
            System.out.println("Нет такого номера");
            return null;
        }else{
            return contracts[i];
        }
    }

    public void printAllInfo(){
        for (int i = 0; i < size; i++) {
            Contract contract = this.getByIndex(i);
            contract.printInfo();
            System.out.println();
        }
    }
}
