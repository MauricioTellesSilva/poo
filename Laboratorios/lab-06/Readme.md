``` mermaid
   classDiagram
    class Veiculo {
        <<abstract>>
        -id: String;
        -vla: int;
        -vlm: int;
        +acelerar(vl) int;
        +freiar(vl) int;
    }

    class Anfibio {
        <<interface>>
        +esvaziarlastro() String;
        +encherlastro() String;
    }

    class Conversivel {
        <<interface>>
        +toggleCapota() String;
    }

    class Tracaointegral {
        <<interface>>
        +toggleTi() String;
    }

    class FerrariPortofino {
        -controledeest: boolean;
        -capota: boolean;
        +toggleEst() String;
    }

    class ChevroletS10 {
        -cacanmba: boolean;
        -tracaointegral: boolean;
        +toggleCacanba() String;
    }

    class WaterCarPanther {
        -tempminigel: int;
        -capota: boolean;
        -capla: int;
        -caplamax: int;
        -tracaointegral: boolean;
        +retrairrodas() String;
        +mudartemperaturagel(int) String;
    }

    Veiculo <|-- FerrariPortofino
    Veiculo <|-- WaterCarPanther
    Veiculo <|-- ChevroletS10

    
    Tracaointegral <.. ChevroletS10
    FerrariPortofino ..> Conversivel
    

    WaterCarPanther ..> Conversivel
    WaterCarPanther ..> Anfibio
    WaterCarPanther ..> Tracaointegral
    
```    