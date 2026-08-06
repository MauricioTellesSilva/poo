public class Saudacao {

    //Faça um programa que receba duas notas como argumentos de linha de comando e imptima na tela à media e a situação do aluno como aprovado (se a media for maior que 6) ou reprovado, caso contrario
    public static void main (String [] args){
        if (args.length==0){
            IO.println("Sem argumentos");
        }
        else{
            IO.println("Ele passou "+args.length+" argumentos");
        }
    }
}