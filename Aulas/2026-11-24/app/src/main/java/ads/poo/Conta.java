package ads.poo;

public class Conta {

    private int saldo;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) throws SaldoInsuficienteException{
        if(this.saldo<valor){
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        this.saldo-=valor;
    }
}
