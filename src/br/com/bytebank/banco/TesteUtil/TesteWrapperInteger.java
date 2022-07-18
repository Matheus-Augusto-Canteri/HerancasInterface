package bytebankHerdadoConta.src.br.com.bytebank.banco.TesteUtil;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int[] idades = new int [5];
        String[] nomes = new String[5];

        int idade = 29; // Primitivo // Interger // Transformar o primitivo para o objeto usando o interger

        Integer idadeRef = Integer.valueOf(29); // Me de o valor desse primitivo //Autoboxing
        int valor = idadeRef.intValue(); // Unboxing

        System.out.println(idadeRef.doubleValue()); //Transformar de int para double

        System.out.println(Integer.MAX_VALUE); // Constantes // Quanto um integer pode guardar?
        System.out.println(Integer.MIN_VALUE);// Constantes // Quanto um integer pode guardar?

        System.out.println(Integer.SIZE); // Constantes // Quantos bytes conseguimos guardar?
        System.out.println(Integer.BYTES); // Constantes // Quantos bytes conseguimos guarda

        String s = args[0]; // "10"
        // Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s); // Transformar de string para int
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>(); // Só guarda referencia
        numeros.add(29); //Autoboxing
        
    }
    
}
