package ads.poo;

public abstract class Character {
    private int life;
    private int attack;
    private double speed;

    public Character(int life, int attack, double speed) {
        this.life = life;
        this.attack = attack;
        this.speed = speed;
    }


    public abstract String mover();
    public abstract String atacar();

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
