package ru.kpfu.itis.java.introduction.inheritance.dogovor.system;

public class Journal {
    private static final int capacity = 1000;
    private JournalEntry journalEntries[] = new JournalEntry[capacity];
    private int size = 0;
}
