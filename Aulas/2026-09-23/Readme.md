# Diagrama de classes UML

## Codigo Java
``` java 
public class Pessoa{
    private Strinf nome;
}
```
## Diagrama UML

```mermaid
classDiagram
    class Retangulo{
    - int altura
    - int largura
    + Retangulo(al: int la: int) 
    + getArea() int
    }
```
```mermaid
classDiagram
    class Carro{
        
    -marca String
    -propulsor Motor
    +Carro()
    +acelerar(v: int) void
    }
    class Motor{
        -hp int
        -giroAtual int
        -cilindros int
        +Motor()
        +acelerar(v: int) void
    }

    Carro o-- Motor
```


