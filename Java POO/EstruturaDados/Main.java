package ERE.EstruturaDados;

/**
 * Nome: Arthur Henrique Lopes Terozendi Silva
 * Turma: BSI 2019.1
 * Data: 02/10/2020
 */

public class Main {

    public static void main(String[] args) {

        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        //Fila

        System.out.println("Fila:");

        fila.inserir("Roberson");
        fila.inserir("Ricardo");
        fila.inserir("Jorge");
        fila.inserir("Aganomeu");
        fila.inserir("Ana");
        fila.imprimir();

        fila.inserir("Jessica");
        fila.imprimir();
        fila.inserir("Joaquim");
        fila.imprimir();
        fila.inserir("Roberta");
        fila.imprimir();

        fila.remover();
        fila.imprimir();
        fila.remover();
        fila.imprimir();
        fila.remover();
        fila.imprimir();

        System.out.println("\n" + fila.pesquisar("Jessica"));
        System.out.println(fila.pesquisar("Ricardo"));

        System.out.println("\nFila após ser ordenada alfabeticamente");
        fila.ordenar();
        fila.imprimir();


        //Pilha
        System.out.println("\nPilha: ");
        pilha.inserir("Roberson");
        pilha.inserir("Ricardo");
        pilha.inserir("Jorge");
        pilha.inserir("Aganomeu");
        pilha.inserir("Ana");
        pilha.imprimir();

        pilha.inserir("Jessica");
        pilha.imprimir();
        pilha.inserir("Joaquim");
        pilha.imprimir();
        pilha.inserir("Roberta");
        pilha.imprimir();

        pilha.remover();
        pilha.imprimir();
        pilha.remover();
        pilha.imprimir();
        pilha.remover();
        pilha.imprimir();

        System.out.println("\n" + pilha.pesquisar("Jessica"));
        System.out.println(pilha.pesquisar("Ricardo"));

        System.out.println("\nPilha após ser ordenada alfabeticamente");
        pilha.ordenar();
        pilha.imprimir();
    }
}
