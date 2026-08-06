public class Media {
    public static void main (String [] args){
        if (args.length !=2){
           IO.println("Digite 2 notas"); 
        } else{
            double nota1=Double.parseDouble(args[0]);
            double nota2=Double.parseDouble(args[1]);
            double media=Math.round((nota1+nota2)/2);
            String estado="";
            if (media>=6){
                estado="aprovado";
            } else {
                estado="reprovado";
            }
            IO.println("A media desse aluno foi "+media+" ele está "+estado); 
        }
    }
}
