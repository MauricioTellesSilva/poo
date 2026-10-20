# Modelagem UML

Para cada um dos exercícios abaixo, crie um diagrama UML com associações de herança.

- Você pode criar as classes que julgar necessário.
- Cada classe deve ter pelo menos um atributo e um método

É necessário pensar em um contexto de domínio para o problema. Exemplos: Escola, biblioteca, transporte, zoológico.

## Escola: Aluno professor, coordenador, diretor

```mermaid
    classDiagram
        direction LR
        class Escola {
            id: long
            nome: String
            endereco: String
            telefone: String
            cursos: ArrayList<Curso>
            diretor: Diretor
        }
        
        class Curso {
            - id: long
            - nome: String
            - turmas: ArrayList<Turma>
            - coordenador: Coordenador
        }
        
        class Disciplina {
            - id: long
            - nome: String
        }

        class Turma {
            - id: long
            - dataInicio: LocalDate
            - dataFim: LocalDate
            - professores: ArrayList<Professor>
            - alunos: ArrayList<Aluno>
        }
        
        class Aluno {
            - id: long
            - nome: String
            - codMatricula: long
        }
        
        class Professor {
            - id: long
            - nome: String
            - salario: bigDecimal
        }
        
        class Coordenador {
            - salario: bigDecimal
        }
        class Diretor {
            - salario: bigDecimal
        }
        
        Professor <|-- Coordenador
        Escola"1" *-- "1" Diretor
        
        Escola "1" *-- "1..N" Curso
        Curso "1" *-- "1..N" Turma
        Coordenador "1" o-- "1" Curso
        
        Turma "1" o-- "1..N" Disciplina
        Disciplina "1" o-- "1..N" Aluno
        Disciplina "1" o-- "1..3" Professor
```        

## Livro, revista, jornal, gibi

```mermaid
    classDiagram 
    direction LR
    class Produto{
        -valor: Double;
        -tipo: String;
        -genero: String;
        -anolancamento: String;
    }
    class Livro{
        -titulo: String;
        -autor: String;
        -isbn: String;
        -editora: String;
    }
    class Revista{
        -titulo: String;
        -edicao: String;
    }

   Produto <|-- Livro
```

## Carro, avião, barco, caminhão

```mermaid
        
```

## Gato, cachorro, arara, galinha, baleia, tubarão

```mermaid
        
```