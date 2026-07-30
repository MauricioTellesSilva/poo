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
String buffer =IO.readln("Digite a quantidade de dias da semana que tem aula desta disciplina: ");
int qdtA =Integer.parseInt(buffer);
String diasA[] =new String[qdtA];
    for (int i=0; i<=qdtA; i++){
      buffer=IO.readln("Digite o dia da semana da aula "+(i)+" :");
      diasA[i]=buffer;
    }
IO.println("na disciplina "+sigl+" você tem aulas nos seguintes dias");
    for (int i=1; i<=qdtA; i++){
        IO.println("- "+diasA[i-1]);
    }
}