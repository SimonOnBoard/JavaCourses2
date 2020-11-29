package interfaces;

public class Phone implements CallInterface{
    @Override
    public void makeCall() {
        System.out.println("Я звоню по обычному телефону");
    }

}
