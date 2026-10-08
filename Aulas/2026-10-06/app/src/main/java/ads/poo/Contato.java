package ads.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobreNome;
    private LocalDate dataNasc;
    static HashMap<String, Telefone> telefone= new HashMap<>();
    static HashMap<String, Email> email=new HashMap<>();

    public Contato(String nome, String sobreNome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = dataNasc;
    }
     void addTelefone(String rotulo,String valor){
        if (telefone.containsKey(rotulo)){
            return false;
        }

    }
     void addEmail(String rotulo,String valor){

    }
    void removeTelefone(String rotulo){

    }
     void removeEmail(String email){

    }
    void updateTelefone(String rotulo,String valor){

    }
    void updateEmail(String rotulo,String valor){

    }
}

