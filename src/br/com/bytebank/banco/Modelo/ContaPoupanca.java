package bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);

    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
        
    }

    @Override
    public String toString() {
        return "Conta Poupança" + super.toString();
    }


}