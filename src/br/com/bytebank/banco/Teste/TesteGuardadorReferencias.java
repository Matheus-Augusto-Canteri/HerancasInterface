package bytebankHerdadoConta.src.br.com.bytebank.banco.Teste;

import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.Conta;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.ContaCorrente;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.GuardadorDeReferencias;


public class TesteGuardadorReferencias {

    public static void main(String[] args) {
        
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta)guardador.getReferencia(1);
        System.out.println(ref.getNumero());
    }
    
}
