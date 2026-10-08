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
    boolean addTelefone(String rotulo,String valor){
        if (telefone.containsKey(rotulo)){
            return false;
        }
    return true;
    }
    boolean addEmail(String rotulo,String valor){

    }
    boolean removeTelefone(String rotulo){

    }
    boolean removeEmail(String email){

    }
    boolean updateTelefone(String rotulo,String valor){

    }
    boolean updateEmail(String rotulo,String valor){

    }
}

