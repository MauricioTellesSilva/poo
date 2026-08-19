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
        if ((velocidadeAtual-frenagem)>=0){
            velocidadeAtual-=frenagem;
        } else{
            velocidadeAtual=0;
        }
    }
    public void painel(){
        IO.println("A velocidade atual é: "+velocidadeAtual);
    }
}