package bytebankHerdadoConta.src.br.com.bytebank.banco.TesteUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.Cliente;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.Conta;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.ContaCorrente;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) { // Para cada
            System.out.println(conta);
        }

        // NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        lista.sort(null);

        //Collections.sort(lista, new NumeroDaContaComparator()); // Ordem crescente
        // Collections.shuffle(lista); // Embaralhar a lista
        //Collections.sort(lista); 
       //Collections.reverse(lista); // inverte a ordem dos elementos
       // Collections.rotate(lista, 5); //rotacionar 5 posicoes

        System.out.println("\n---------------------");

        for (Conta conta : lista) { // Para cada
            System.out.println(conta + "\n" + conta.getTitular().getNome());
        }
    }

}

class TitularDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {

        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();

        nomeC1.compareTo(nomeC2);
        
        return nomeC1.compareTo(nomeC2);
    }
    
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) { // Definir qual conta é maior que a outra

        return Integer.compare(c1.getNumero(), c2.getNumero());

        // return c1.getNumero() - c2.getNumero();

       // if (c1.getNumero() < c2.getNumero()) {
        //    return -1;
       // }

       // if (c1.getNumero() > c2.getNumero()) {
        //    return 1;
        // }

        //return 0;
    }

}
