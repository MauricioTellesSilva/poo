package ads.poo;

public class Cavalier extends Character{
    public Cavalier() {
        super(50, 3, 2);
    }
    @Override
    public String mover() {
        return "O Cavaleito se moveu com "+super.getSpeed()+" de velocidade";

    }

    @Override
    public String atacar() {
        return "O Cavaleiro atacou com "+super.getAttack()+" De dano";

    }
}
