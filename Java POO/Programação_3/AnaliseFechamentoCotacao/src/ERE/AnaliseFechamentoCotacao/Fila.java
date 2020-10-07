package ERE.AnaliseFechamentoCotacao;

import java.util.ArrayList;

public class Fila {
    ArrayList<Float> cotacoes;

    public Fila(ArrayList<Float> cotacoes) {
        this.cotacoes = cotacoes;
    }

    public void inserir(float num) {
        cotacoes.add(num);
    }

    public void remover() {
        cotacoes.remove(0);
    }

    public ArrayList<Float> getCotacoes() {
        return cotacoes;
    }
}
