package ERE.AnaliseFechamentoCotacao;

import java.util.ArrayList;
/**
 * @author Arthur Terozendi
 * @turma BSI 2019.1
 * @escola IFMG
 */
public class Fila {
    ArrayList<Float> cotacoes;

    /**
     * Construtor da classe
     * Recebe uma arrayList como paramentro
     * @param cotacoes
     */
    public Fila(ArrayList<Float> cotacoes) {
        this.cotacoes = cotacoes;
    }

    /**
     * Método para adcionar um novo valor a Fila
     * @param num
     */
    public void inserir(float num) {
        cotacoes.add(num);
    }

    /**
     * Método para remover um valor da Fila
     * sempre remove o primeiro valor
     */
    public void remover() {
        cotacoes.remove(0);
    }

    /**
     * Método responsável por retornar a ArrayList da Pilha
     * @return
     */
    public ArrayList<Float> getCotacoes() {
        return cotacoes;
    }
}
