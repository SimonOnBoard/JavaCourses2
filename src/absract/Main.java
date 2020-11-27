package absract;

public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[10];
        for (int i = 0; i < 10; i+=2){
            devices[i] = new Phone(i + "Phone");
            devices[i+1] = new Camera(i + "Camera");
        }
        for (Device device: devices){
            device.on();
            device.printInfo();
            device.off();
        }
    }
}
