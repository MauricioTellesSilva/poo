package ads.poo;

public class Livro {
    private int Ano;
    private String Autor;
    private String Tiulo;

    public Livro(int ano, String autor, String tiulo) {
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
