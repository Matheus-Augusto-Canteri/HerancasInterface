package bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo;

// modelo.CalculadorDeImposto = FQN
public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

}
