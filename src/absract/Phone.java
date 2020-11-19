package absract;

public class Phone extends Device{
    @Override
    public void on() {
        System.out.println("Я включаюсь");
    }

    @Override
    public void off() {
        System.out.println("Я выключаюсь");
    }

    @Override
    public void printInfo() {
        System.out.println("Я обычный телефон");

    }
}
