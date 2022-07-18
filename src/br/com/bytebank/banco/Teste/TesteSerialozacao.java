package bytebankHerdadoConta.src.br.com.bytebank.banco.Teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.Cliente;
import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.ContaCorrente;

import java.io.ObjectOutputStream;

public class TesteSerialozacao {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Matheus");
        cliente.setProfissao("Dev");
        cliente.setCpf("234113131");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);
    
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin")); // Dessirialização
         oos.writeObject(cc);
         oos.close(); 
    }
    
}
