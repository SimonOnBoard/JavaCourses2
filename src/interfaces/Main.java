package interfaces;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        CallInterface callInterface = smartPhone;
        callInterface.makeCall();
        MakePhotoInterface makePhotoInterface = smartPhone;
        makePhotoInterface.makePhoto();
        DeviceInterface deviceInterface = smartPhone;
        deviceInterface.on();
        deviceInterface.off();
        deviceInterface.printInfo();
    }
}
