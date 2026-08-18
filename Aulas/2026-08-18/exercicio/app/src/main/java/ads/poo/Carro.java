package ads.poo;

public class Carro {
    private int velocidadeAtual;
    public void acelerar(int incremento){
        if ((velocidadeAtual+incremento)<=100){
            velocidadeAtual+=incremento;
        } else{
            velocidadeAtual=100;
        }
    }
    public void freiar(int frenagem){
        velocidadeAtual-=frenagem;
    }
    public void painel(){
        IO.println("A velocidade atual é: "+velocidadeAtual);
    }
}