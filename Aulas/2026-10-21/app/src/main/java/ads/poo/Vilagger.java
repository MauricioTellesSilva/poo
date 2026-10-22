package ads.poo;

public class Vilagger extends Character {
    @Override
    public String mover() {
        return "O Aldeão se moveu com "+super.getSpeed()+" de velocidade";

    }

    @Override
    public String atacar() {
        return "O Aldeão atacou com "+super.getAttack()+" De dano";

    }

    public Vilagger() {
        super(25, 1, 0.8);

    }
}
