package ERE.AnaliseFechamentoCotacao;

import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Arthur Terozendi
 * @turma BSI 2019.1
 * @escola IFMG
 */
public class ManipularCotacao {
    private ArrayList<Float> cotacoes;

    /**
     * Construtor da Classe
     * Recebe uma ArrayList como as cotações
     * @param cotacoes
     */
    public ManipularCotacao (ArrayList<Float> cotacoes) {
        this.cotacoes = cotacoes;
    }

    /**
     * Retorna o tamanho da ArrayList
     * @return
     */
    public float getTamanhoArray () {
        return cotacoes.size();
    }

    /**
     * Retorna o maior valor de todas as cotações
     * @return
     */
    public float getMaiorValor() {
        return ordenarDecrescente(cotacoes).get(0);
    }

    /**
     * Retorna o menor valor de todas as cotações
     * @return
     */
    public float getMenorValor() {
        return ordenarCrescente(cotacoes).get(0);
    }

    /**
     * Ordena a arrayList em ordem crescente
     * @param cotacao
     * @return
     */
    public ArrayList<Float> ordenarCrescente(ArrayList<Float> cotacao) {
        Collections.sort(cotacao);
        return cotacao;
    }

    /**
     * Ordena a arrayList em ordem decrescente
     * @param cotacao
     * @return
     */
    public ArrayList<Float> ordenarDecrescente (ArrayList<Float> cotacao) {
        Collections.reverse(ordenarCrescente(cotacao));
        return cotacao;
    }

    /**
     * Cria uma nova ArrayList com os dez maiores valores das cotações
     * Retorna essa nova arrayList
     * @return
     */
    public ArrayList<Float> getDezMaiores() {
        ArrayList<Float> maiores = new ArrayList<>();
        ArrayList<Float> maioresArrayList = ordenarDecrescente(cotacoes);
        for (int i = 0; i < 10; i++) {
            maiores.add(maioresArrayList.get(i));
        }
        return maiores;
    }

    /**
     * Cria uma nova ArrayList com os dez menores valores das cotações
     * Retorna essa nova arrayList
     * @return
     */
    public ArrayList<Float> getDezMenores() {
        ArrayList<Float> menores = new ArrayList<>();
        ArrayList<Float> menoresArrayList = ordenarCrescente(cotacoes);
        for (int i = 0; i < 10; i++) {
            menores.add(menoresArrayList.get(i));
        }
        return menores;
    }

    /**
     * Intercala os valores das duas arrayList passadas por paramentro em uma nova ArrayList
     * @param a
     * @param b
     * @return
     */
    public ArrayList<Float> intercalar(ArrayList<Float> a, ArrayList<Float> b) {
        ArrayList<Float> intercalado = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            intercalado.add(a.get(i));
            intercalado.add(b.get(i));
        }
        return intercalado;
    }
}
