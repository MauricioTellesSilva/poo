void main() {

    // faça um programa que o usuario deve informar:
    // -Sigla da disciplina
    // -Todos os dias da semana que tem aula dessa disciplina
    //
    // por fim, imprima:
    // na disciplina **** você tem aulas nos seguintes dias
    // -seg
    // -qua
    // -sex

String sigl =IO.readln("Digite a Sigla da disciplina: ");
String buffer ="";
String diasAi[] =new String[5];
for (int i=0; i<=5; i++){
    buffer=IO.readln("Digite o dia da semana que há aula: ");
    switch(buffer){
        case "seg":
              diasAi[0]="seg";
        break;
        case "ter":
              diasAi[1]="ter";
        break;
        case "qua":
              diasAi[2]="qua";
        break;
        case "qui":
              diasAi[3]="qui";
        break;
        case "sex":
              diasAi[4]="sex";
        break;
        case "nao":
        if (i==0){
            IO.println("nenhum dia foi digitado digite no minimo 1 dia");
            i--;
        }
        else{
         break;   
        }
        break;
        default:
            IO.println("Data invalida, datas validas seg,ter,qua,qui e sex");
            i--;
        break;
    }
}
IO.println("na disciplina "+sigl+" você tem aulas nos seguintes dias");
    for (int i=0; i<diasAi.length; i++){
        if(diasAi[i]!=null){
        IO.println("- "+diasAi[i]);
        }
    }
}