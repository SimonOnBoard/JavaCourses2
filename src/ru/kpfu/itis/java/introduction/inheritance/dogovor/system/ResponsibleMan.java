package ru.kpfu.itis.java.introduction.inheritance.dogovor.system;

public class ResponsibleMan {
    private String fio;

    public ResponsibleMan(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "ResponsibleMan{" +
                "fio='" + fio + '\'' +
                '}';
    }
}
