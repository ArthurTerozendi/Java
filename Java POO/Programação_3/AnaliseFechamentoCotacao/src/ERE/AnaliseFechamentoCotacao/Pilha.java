package ERE.AnaliseFechamentoCotacao;

import java.util.ArrayList;
/**
 * @author Arthur Terozendi
 * @turma BSI 2019.1
 * @escola IFMG
 */
public class Pilha {
    ArrayList<Float> cotacoes;

    /**
     * Construtor da classe
     * Recebe uma arrayList como paramentro
     * @param cotacoes
     */
    public Pilha(ArrayList<Float> cotacoes) {
        this.cotacoes = cotacoes;
    }

    /**
     * Método para adcionar um novo valor a Pilha
     * @param num
     */
    public void inserir(float num){
        cotacoes.add(num);
    }

    /**
     * Método para remover um valor da pilha
     * sempre remove o ultimo valor
     */
    public void remover(){
        cotacoes.remove(cotacoes.size() - 1);
    }

    /**
     * Método responsável por retornar a ArrayList da Pilha
     * @return
     */
    public ArrayList<Float> getCotacoes() {
        return cotacoes;
    }
}
