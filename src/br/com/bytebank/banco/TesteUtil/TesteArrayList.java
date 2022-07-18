package bytebankHerdadoConta.src.br.com.bytebank.banco.TesteUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.Conta;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.ContaCorrente;

public class TesteArrayList {

    public static void main(String[] args) {

        //generics
        Vector<Conta> lista = new Vector<Conta>(); // Só sabe guardar referencias do tipo conta, usando o <> // Vector trhead safe

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println(lista.size()); // Qual seu tamanho?
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        // for(int i = 0; i < lista.size(); i++){ // Codigo legacy
        // Object oRef = lista.get(i);
        // System.out.println(oRef);
        // }

        System.out.println("\n---------------");

        for (Conta conta : lista) { // Para cada objeto dessa lista
            System.out.println(conta);

        }
    }

}
