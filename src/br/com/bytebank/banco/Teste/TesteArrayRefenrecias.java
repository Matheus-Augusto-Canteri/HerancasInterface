package bytebankHerdadoConta.src.br.com.bytebank.banco.Teste;

import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.Cliente;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.ContaCorrente;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.ContaPoupanca;

public class TesteArrayRefenrecias {

    public static void main(String[] args) {

        // int[] idades = new int[5];
        Object[] referencias = new Object[5]; // Referencia do tipo generico

        // System.out.println(referencias.length); // Devolver tamanho

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1; // Cria uma copia e joga ali dentro

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        // Object referenciaGenerica = contas[1];

       // System.out.println(referenciaGenerica.getNumero());
        

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // Type cast // Guardando o valor dentro da referência
        System.out.println(ref.getNumero());

    }

}
