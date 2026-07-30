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
int ip=0;
for (int i=0; i<=5; i++){
    buffer=IO.readln("Digite o dia da semana que há aula: ");
    if (buffer.equals("nao")){
        break;
    }
    switch(buffer){
        case "seg":
              diasAi[ip]=buffer;
        break;
        case "ter":
              diasAi[ip]=buffer;
        break;
        case "qua":
              diasAi[ip]=buffer;
        break;
        case "qui":
              diasAi[ip]=buffer;
        break;
        case "sex":
              diasAi[ip]=buffer;
        break;
        default:
            IO.println("Data invalida, datas validas seg,ter,qua,qui e sex");
            ip--;
        break;
    }
    ip++;
}
String diasA[] =new String[ip];
IO.println("na disciplina "+sigl+" você tem aulas nos seguintes dias");
    for (int i=0; i<diasA.length; i++){
        diasA[i]=diasAi[i];
        IO.println("- "+diasA[i]);
    }
}