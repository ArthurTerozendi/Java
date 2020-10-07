package ERE.AnaliseFechamentoCotacao;

import java.util.ArrayList;
import java.util.Collections;

public class ManipularCotacao {
    private ArrayList<Float> cotacoes;

    public ManipularCotacao (ArrayList<Float> cotacoes) {
        this.cotacoes = cotacoes;
    }

    public float getTamanhoArray () {
        return cotacoes.size();
    }

    public float getMaiorValor() {
        return ordenarDecrescente(cotacoes).get(0);
    }

    public float getMenorValor() {
        return ordenarCrescente(cotacoes).get(0);
    }

    public ArrayList<Float> ordenarCrescente(ArrayList<Float> cotacao) {
        Collections.sort(cotacao);
        return cotacao;
    }

    public ArrayList<Float> ordenarDecrescente (ArrayList<Float> cotacao) {
        Collections.reverse(ordenarCrescente(cotacao));
        return cotacao;
    }

    public ArrayList<Float> getDezMaiores() {
        ArrayList<Float> maiores = new ArrayList<>();
        ArrayList<Float> maioresArrayList = ordenarDecrescente(cotacoes);
        for (int i = 0; i < 10; i++) {
            maiores.add(maioresArrayList.get(i));
        }
        return maiores;
    }

    public ArrayList<Float> getDezMenores() {
        ArrayList<Float> menores = new ArrayList<>();
        ArrayList<Float> menoresArrayList = ordenarCrescente(cotacoes);
        for (int i = 0; i < 10; i++) {
            menores.add(menoresArrayList.get(i));
        }
        return menores;
    }

    public ArrayList<Float> intercalar(ArrayList<Float> a, ArrayList<Float> b) {
        ArrayList<Float> intercalado = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            intercalado.add(a.get(i));
            intercalado.add(b.get(i));
        }
        return intercalado;
    }
}
