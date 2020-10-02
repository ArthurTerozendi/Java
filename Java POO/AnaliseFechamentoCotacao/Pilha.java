package ERE.AnaliseFechamentoCotacao;

import java.util.ArrayList;

public class Pilha {
    ArrayList<Float> cotacoes;

    public Pilha(ArrayList<Float> cotacoes) {
        this.cotacoes = cotacoes;
    }

    public void inserir(float num){
        cotacoes.add(num);
    }

    public void remover(){
        cotacoes.remove(cotacoes.size() - 1);
    }

    public ArrayList<Float> getCotacoes() {
        return cotacoes;
    }
}
