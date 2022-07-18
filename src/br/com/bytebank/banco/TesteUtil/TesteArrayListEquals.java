package bytebankHerdadoConta.src.br.com.bytebank.banco.TesteUtil;

import java.util.ArrayList;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.Conta;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.ContaCorrente;


public class TesteArrayListEquals {

    public static void main(String[] args) {

        //generics
        ArrayList<Conta> lista = new ArrayList<Conta>(); // Só sabe guardar referencias do tipo conta, usando o <>

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);

        boolean existe = lista.contains(cc3);
        System.out.println("Já existe? " + existe);

        for (Conta conta : lista) { // Para cada objeto dessa lista
            System.out.println(conta);

        }
    }

}
