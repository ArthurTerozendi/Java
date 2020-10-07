package ERE.EstruturaDados;

/**
 * Nome: Arthur Henrique Lopes Terozendi Silva
 * Turma: BSI 2019.1
 * Data: 02/10/2020
 */

public class Fila extends EstruturaDeDados{

    /**
     * Método responsável por remover o primeiro elemento da ArrayList
     */
    public void remover() {
        estruturaDeDados.remove(0);
    }

    /**
     * Método para pesquisar um nome dentro da lista
     * Se houver o nome, ele retorna a posição onde ele está
     * Se não, ele fala que o nome não foi encotrado
     * @param nome
     * @return
     */
    public String pesquisar(String nome) {
        int index = -1;

        for (int i = 0; i < getTamanhoArray(); i++) {
            if ( nome.equalsIgnoreCase(estruturaDeDados.get(i)) ) {
                index = i;
            }
        }
        if (index != -1) {
            return "Nome encontrado na " + (index + 1) + "° posição na fila";
        }
        return "Nome não está foi encontrado na fila";
    }


}
