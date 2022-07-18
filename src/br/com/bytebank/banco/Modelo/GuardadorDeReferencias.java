package bytebankHerdadoConta.src.br.com.bytebank.banco.Modelo;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias(){
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
    
}
