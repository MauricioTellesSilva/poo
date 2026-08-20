package ads.poo;

public class Contador {
    private int valorAtual;
    public void Atribuirvalor(int valor){
        valorAtual=valor;
    }
    public void Incrementarvalor(){
        valorAtual+=1;
    }
    public int Obtervalor(){
        return valorAtual;
    }

}
