package interfaces;

public class SmartPhone implements DeviceInterface, CallInterface, MakePhotoInterface {
    public SmartPhone() {
    }

    @Override
    public void on() {
        System.out.println("я крутой смартон и включаюсь");
    }

    @Override
    public void off() {
        System.out.println("я крутой смартон и выключаюсь");

    }

    @Override
    public void printInfo() {
        System.out.println("я реализую только один интерфейс, но на самом деле могу представляться сразу 3 ");

    }

    @Override
    public void makeCall() {
        System.out.println("я крутой смартон и звоню");

    }

    @Override
    public void makePhoto() {
        System.out.println("я крутой смартон и фотографию");

    }
}
