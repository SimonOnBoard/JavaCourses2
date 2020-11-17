package game;

import java.util.Random;

public class HealerPlayer extends Player{

    public HealerPlayer(String name, String battleCry, int healPoints) {
        super(name, battleCry);
        this.healPoints = healPoints;
    }
    private int healPoints;

    @Override
    public void hit(Player enemy, int kickForce) {
        super.hit(enemy, kickForce);
        Random random = new Random();
        if(random.nextInt(10) >= 5) heal(random.nextInt(healPoints));
    }

    public void heal(int p){
        if(p < healPoints){
            hp += p;
            healPoints -=p;
        }
    }

    @Override
    public void shoutBattleCry(){
        super.shoutBattleCry();
        System.out.println("И я умею лечить себя");
    }
}
