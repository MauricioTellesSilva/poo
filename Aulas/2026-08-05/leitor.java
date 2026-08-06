import java.util.Scanner;

public class leitor {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        String linha;
        while (leitor.hasNext()){
        linha = leitor.nextLine();
        IO.println("Saida: "+linha);
        }    
        leitor.close();
    }
}
