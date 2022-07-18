package bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo;


import java.io.Serializable;
/**
 * Classe representa a moldura de uma conta
 * 
 * @author Matheus Augusto Canteri
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable{

    protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        // System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
        // System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    /**
     * @param valor
     * @param destino
     * @throws SaldoInsuficienteException
     */

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;

        /**
         * @param numero
         * @return double
         */
    }

    public void setNumero(int numero) {
        if (numero <= 0) {

            /**
             * @param getAgencia(
             * @return int
             */
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {

            /**
             * @param titular
             * @return int
             */
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;

        /**
         * @param titular
         */
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia) {
            return false;
        }
        if (this.numero != outra.numero) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Conta outra){
        return Double.compare(this.saldo, outra.saldo);
    }

    @Override
    public String toString() {
        return "\nNúmero: " + this.numero + "\nAgência: " + this.agencia + "\nSaldo: " + this.saldo;
    }

}
