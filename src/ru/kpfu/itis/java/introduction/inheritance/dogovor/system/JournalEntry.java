package ru.kpfu.itis.java.introduction.inheritance.dogovor.system;

import java.time.LocalDateTime;

public class JournalEntry {
    private IndidualDogovor dogovor;
    private LocalDateTime localDateTime;

    public IndidualDogovor getDogovor() {
        return dogovor;
    }

    public void setDogovor(IndidualDogovor dogovor) {
        this.dogovor = dogovor;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public JournalEntry(IndidualDogovor dogovor, LocalDateTime localDateTime) {
        this.dogovor = dogovor;
        this.localDateTime = localDateTime;
    }
}
