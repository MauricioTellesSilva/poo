package ads.poo;

import java.util.ArrayList;
import java.util.Date;

import ads.poo.Exception.BibliotecaException;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public void criarusuario(String nome){
     usuarios.add(new Usuario(nome));
    }

    public void criarlivro(Integer id, String nome){
     livros.add(new Livro(id,nome));
    }

    public void emprestar(Usuario usuario, int idLivro) throws BibliotecaException {
        // TODO: Localizar o livro no acervo pelo idLivro.
        int numemprestimos=0;
        int lvint = 0;
        for (int i = 0; lvint < livros.size(); i++) {
            if (idLivro == livros.get(lvint).getId()) {
                System.out.println("Livro encontrado");
                lvint=i;
            }
        }
        // TODO: Se o livro tiver empréstimo ativo, lançar LivroJaEmprestadoException.
        for (int i = 0; i < emprestimos.size(); i++) {
            Livro Livroconsulta =emprestimos.get(i).getLivro();
            Usuario usuarioconsulta=emprestimos.get(i).getUsuario();
            if (idLivro == Livroconsulta.getId()) {
                System.out.println("Livro já emprestado");
            }
            // TODO: Contar os empréstimos ativos do usuário.
            else{
                for (i=0; i <emprestimos.size(); i++)
                    if(usuarioconsulta.equals(emprestimos.get(i).getUsuario())){
                        numemprestimos++;
                    }
                }
            // TODO: Se o usuário já tiver 3 empréstimos, lançar LimiteEmprestimosException.
            if (numemprestimos>=3){
                System.out.println("Livro ja emprestado");
            }
            // TODO: Criar um Emprestimo com usuário, livro e data atual
            // TODO: Adicionar o empréstimo à lista de empréstimos ativos.
            else {
              emprestimos.add(new Emprestimo(usuario,livros.get(lvint)));
            }
        }
    }

    public void devolver(Usuario usuario, int idLivro) throws BibliotecaException {
        // TODO: Localizar o empréstimo ativo correspondente ao usuário e ao livro.

        // TODO: Se não existir, lançar LivroNaoEmprestadoException.
        // TODO: Remover o empréstimo encontrado da lista.
    }

}
