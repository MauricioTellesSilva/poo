package ads.poo;

public class Archer extends Character{
    public Archer() {
        super(35, 2, 1);
    }
    @Override
    public String mover() {
        return "O Arqueiro se moveu com "+super.getSpeed()+" de velocidade";

    }

    @Override
    public String atacar() {
        return "O Arqueiro atacou com "+super.getAttack()+" De dano";

    }
}
