import java.util.Scanner;

public class leitor {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        String linha;
        while(leitor.hasNextLine()){
            linha=leitor.nextLine();
            String[] aluno =linha.split(",");
            double nota1=Double.parseDouble(aluno[1]);
            double nota2=Double.parseDouble(aluno[2]);
            double media=Math.round((nota1+nota2)/2);
            String estado="";
            if (media>=6){
                estado="aprovado";
            } else {
                estado="reprovado";
            }
            IO.println("A media do aluno/aluna "+aluno[0]+ " foi "+media+" ele está "+estado);
        }   
        leitor.close();
    }
}
