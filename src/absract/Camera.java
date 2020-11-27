package absract;

public class Camera extends Device {
    public Camera(String name) {
        super(name);
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
