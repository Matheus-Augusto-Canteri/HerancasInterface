package bytebankHerdadoConta.src.br.com.bytebank.banco.Teste;

import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.Cliente;

public class TesteCliente {

    public static void main(String[] args) {
        Cliente clienteNormal = new Cliente();
        clienteNormal.setNome("Flavio");

        Cliente clienteVip = new Cliente();
        clienteVip.setNome("Romulo");

        Object[] refs = new Object[5];
        refs[0] = clienteNormal;
        refs[1] = clienteVip;

        System.out.println(((Cliente) refs[1]).getNome());
    }

}
