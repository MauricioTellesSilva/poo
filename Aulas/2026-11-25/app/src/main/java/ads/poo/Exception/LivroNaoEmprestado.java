package ads.poo.Exception;

public class LivroNaoEmprestado extends RuntimeException {
    public LivroNaoEmprestado(String message) {
        super(message);
    }
}
