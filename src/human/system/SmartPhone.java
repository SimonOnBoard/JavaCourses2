package human.system;

public class SmartPhone extends Phone {
    @Override
    public void call() {
        System.out.println("I am calling from cool smartphone");
    }

    public void takePhoto(){
        System.out.println("I am taking photo from smartPhone");
    }
}
