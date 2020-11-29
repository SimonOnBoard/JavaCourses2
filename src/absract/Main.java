package absract;

public class Main {
    public static void main(String[] args) {
//        Device[] devices = new Device[10];
//        for (int i = 0; i < 10; i+=2){
////            devices[i] = new Phone(i + "Phone");
//            devices[i+1] = new Camera(i + "Camera");
//        }
//        for (Device device: devices){
//            device.on();
//            device.printInfo();
//            device.off();
//        }

        Device condition = new Device("Conditsioner") {
            @Override
            public void on() {
                System.out.println("Ya conditsioner i ya vklyshays");
                shoutBattleCry();
            }

            public void shoutBattleCry() {
                System.out.println("fajksdhrewlkjhrwlekqrjhwe");
            }

            @Override
            public void off() {
                System.out.println("Ya condistrioner i ya viklushays");
            }

            @Override
            public void printInfo() {
                System.out.println("Ya device conditsioner s imenem: " + super.name);
            }
        };

        condition.on();
        condition.off();
        condition.printInfo();
    }
}
