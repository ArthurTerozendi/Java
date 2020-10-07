package ERE.EstruturaDados;

/**
 * Nome: Arthur Henrique Lopes Terozendi Silva
 * Turma: BSI 2019.1
 * Data: 02/10/2020
 */

import java.util.ArrayList;
import java.util.Collections;

public class EstruturaDeDados {
    protected ArrayList<String> estruturaDeDados;

    /**
     * Construtor da super classe
     * Apenas instaciando a ArrayList
     */
    public EstruturaDeDados() {
        this.estruturaDeDados = new ArrayList<>();
    }

    /**
     * Método para a inserir um nome na ArrayList
     * o nome é sempre inserido na ultima posição
     * @param nome
     */
    public void inserir (String nome) {
        estruturaDeDados.add(nome);
    }

    /**
     * Método que retorna o tamanho total da lista
     * @return
     */
    public int getTamanhoArray() {
        return estruturaDeDados.size();
    }

    /**
     * Método para mostrar para o usuário todos os elementos da lista e o seu tamanho
     */
    public void imprimir() {
        System.out.println("Tamanho: " + getTamanhoArray() + " " + estruturaDeDados);
    }

    /**
     * Método que vai ordenar os elementos dentro da ArrayList alfabeticamente
     */
    public void ordenar() {
        Collections.sort(estruturaDeDados);
    }
}
