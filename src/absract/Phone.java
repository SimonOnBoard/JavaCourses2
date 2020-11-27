package absract;

public class Phone extends Device{
    public Phone(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("Я включаюсь и я телефон");
    }

    @Override
    public void off() {
        System.out.println("Я выключаюсь и я телефон");
    }

    @Override
    public void printInfo() {
        System.out.println("My name is (phone): " + super.name);

    }
}
