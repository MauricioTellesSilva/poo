package ads.poo;

public class Livro {
    private String ISBN;
    private int Ano;
    private String Autor;
    private String Tiulo;

    public Livro(String ISBN, int ano, String autor, String tiulo) {
        this.ISBN = ISBN;
        Ano = ano;
        Autor = autor;
        Tiulo = tiulo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getTiulo() {
        return Tiulo;
    }

    public void setTiulo(String tiulo) {
        Tiulo = tiulo;
    }
}
