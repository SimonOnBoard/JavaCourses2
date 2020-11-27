package educational.system;

public class People {
    protected String fio;
    protected int age;
    protected int points;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public People(String fio, int age, int points) {
        this.fio = fio;
        this.age = age;
        this.points = points;
    }

    public String toString() {
        return "People{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", points=" + points +
                '}';
    }
}
