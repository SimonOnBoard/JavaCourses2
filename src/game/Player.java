package game;


public class Player {
    protected int hp;
    protected String name;
    protected String battleCry;

    public Player(String name) {
        this(name, "leroy jenkins");
    }

    public Player(String name, String battleCry) {
        this.hp = 100;
        this.name = name;
        this.battleCry = battleCry;
        shoutBattleCry();
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void shoutBattleCry(){
        System.out.println(battleCry);
    }

    public void hit(Player enemy, int kickForce){
        System.out.println(this.toString() + " am hitting the " + enemy.toString() + " with kick force = " + kickForce);
        if(kickForce >=7){
            return;
        }else{
            enemy.setHp(enemy.getHp() - kickForce);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                ", battleCry='" + battleCry + '\'' +
                '}';
    }
}
