package absract;

public class Camera extends Device {
    private Phone phone;
    public Camera(String name) {
        super(name);
        phone = new Phone("phone to check");
    }

    @Override
    public void on() {
        System.out.println("Я включаюсь и я камера");
    }

    @Override
    public void off() {
        System.out.println("Я выключаюсь и я камера");
    }

    @Override
    public void printInfo() {
        System.out.println("Я камера с именем:" + name);

    }
}
