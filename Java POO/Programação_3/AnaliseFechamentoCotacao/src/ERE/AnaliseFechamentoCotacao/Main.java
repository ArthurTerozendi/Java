package ERE.AnaliseFechamentoCotacao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Arthur Terozendi
 * @turma BSI 2019.1
 * @escola IFMG
 */

public class Main {

    public static void main(String[] args) throws IOException {
        //Instanciando o objeto FILE passando como paramentro o arquivo que vamos usar
        File path = new File("cotacao_MGLU3.csv");
        lerArquivo lerArq = new lerArquivo(path);

        //Salvando na ArrayList as cototações que pegamos do cotacao_MGLU3.csv
        ArrayList<Float> cotacoes = lerArq.ler();

        //ArrayList criada para salvar todos os novos dados gerados nesse projeto
        ArrayList<Float> novoArq = new ArrayList<>();

        //Instanciando um objeto da classe ManipularCotacao passando a ArrayList com todas as cotacoes do arquivo
        ManipularCotacao manCot = new ManipularCotacao(cotacoes);

        //Imprimindo todas as cotações
        System.out.print("Todas as cotações: ");
        System.out.println(cotacoes);

        //Imprimindo a quantidade de cotações e salvando esse valor na nova ArrayList
        System.out.println( "\nNúmero de cotações: " + manCot.getTamanhoArray());
        novoArq.add(manCot.getTamanhoArray());

        //Imprimindo o maior valor e o menor valor das cotações e os salvando na nova ArrayList
        System.out.println( "Cotação mais cara: " + manCot.getMaiorValor());
        novoArq.add(manCot.getMaiorValor());
        System.out.println("Cotação mais barata: " + manCot.getMenorValor());
        novoArq.add(manCot.getMenorValor());

        //Imprimindo a media entre a maior cotação e a menor e salvando o resultado na nova ArrayList
        System.out.println("Media: " + (manCot.getMaiorValor() + manCot.getMenorValor())/2);
        novoArq.add((manCot.getMaiorValor() + manCot.getMenorValor())/2);

        //Imprimindo as dez maiores cotações e as dez menores e salvando o resultado
        System.out.println("\nAs dez mais caras cotações: " + manCot.getDezMaiores());
        novoArq.addAll(manCot.getDezMaiores());
        System.out.println("As dez mais baratas cotações: " + manCot.getDezMenores());
        novoArq.addAll(manCot.getDezMenores());

        //Imprimindo as dez maiores cotações e as dez menores em ordem decrescente, e salvando o resultado
        System.out.println("\nAs dez maiores cotações em ordem decrescente"
                + manCot.ordenarDecrescente(manCot.getDezMaiores()));
        novoArq.addAll(manCot.getDezMenores());
        System.out.println("As dez menores cotações em ordem decrescente"
                + manCot.ordenarDecrescente(manCot.getDezMenores()));
        novoArq.addAll(manCot.ordenarDecrescente(manCot.getDezMenores()));

        //Imprimindo a intercalação dos dez maiores valores e os dez menores, em ordem crescente, e os salvando na nova ArrayList
        System.out.println("\nIntercalação entre as dez maiores e as dez menores cotações: " + manCot.intercalar(manCot.ordenarCrescente(manCot.getDezMaiores()), manCot.getDezMenores()));
        novoArq.addAll(manCot.intercalar(manCot.ordenarCrescente(manCot.getDezMaiores()), manCot.getDezMenores()));

        //Instanciando uma pilha e uma fila com os valores que foram intercalados;
        Pilha pilha = new Pilha(manCot.intercalar(manCot.ordenarCrescente(manCot.getDezMaiores()), manCot.getDezMenores()));
        Fila fila = new Fila(manCot.intercalar(manCot.ordenarCrescente(manCot.getDezMaiores()), manCot.getDezMenores()));


        fila.inserir(777);
        pilha.inserir(999);

        //Imprimindo e salvando a pilha e fila com as novas inserções
        System.out.println("\nInicial");
        System.out.println("Pilha: " + pilha.getCotacoes());
        novoArq.addAll(pilha.cotacoes);
        System.out.println("Fila: " + fila.getCotacoes());
        novoArq.addAll(fila.getCotacoes());

        fila.remover();
        pilha.remover();

        //Imprimindo e salvando o resultado da fila e da pilha após a remoção de um valor
        System.out.println("\nFinal ");
        System.out.println("Pilha: " + pilha.getCotacoes());
        novoArq.addAll(pilha.cotacoes);
        System.out.println("Fila: " + fila.getCotacoes());
        novoArq.addAll(fila.getCotacoes());

        //Imprimindo a ArrayList com todos os resultados salvos nela
        System.out.println("\nTodas os resultados: " + novoArq);
        EscreverArquivo escArq = new EscreverArquivo(novoArq, new File("nova_cotacao_MGLU3.csv"));
        escArq.escrever();
    }
}
