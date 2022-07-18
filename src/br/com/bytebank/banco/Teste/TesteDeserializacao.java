package bytebankHerdadoConta.src.br.com.bytebank.banco.Teste;

import bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo.ContaCorrente;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteDeserializacao {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();
        ois.close();
        System.out.println(cc.getSaldo());
        System.out.println(cc.getTitular().getNome());
    }
    
}
