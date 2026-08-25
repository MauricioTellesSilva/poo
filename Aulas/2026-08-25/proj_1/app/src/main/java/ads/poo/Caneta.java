package ads.poo;

public class Caneta {
    private String cor;
    private double nivelTinta;

    public Caneta(String cor, int nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }

    public Caneta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
        this.cor="azul";
    }

    public Caneta() {
        this.nivelTinta=100;
        this.cor="azul";
    }
    public double desenhar(int x1,int x2,int y1,int y2){
        double distancia=0;
        distancia=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double tintaGasta=distancia*0.01;
        if ((this.nivelTinta-tintaGasta)<0){
            nivelTinta-=tintaGasta;
            return tintaGasta;
        } else{
            return -1;
        }
    }
    public String toString (){
        return "Cor: "+this.cor +"Tinta "+ this.nivelTinta;
    }

}
