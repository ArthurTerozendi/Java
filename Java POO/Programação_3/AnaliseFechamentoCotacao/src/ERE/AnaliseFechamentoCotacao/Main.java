package ERE.AnaliseFechamentoCotacao;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        File path = new File("cotacao_MGLU3.csv");
        lerArquivo lerArq = new lerArquivo(path);

        ArrayList<Float> cotacoes = lerArq.ler();

        ArrayList<Float> novoArq = new ArrayList<>();


        ManipularCotacao manCot = new ManipularCotacao(cotacoes);

        System.out.println(cotacoes);

        System.out.println(manCot.getTamanhoArray());
        novoArq.add(manCot.getTamanhoArray());

        System.out.println(manCot.getMaiorValor());
        novoArq.add(manCot.getMaiorValor());
        System.out.println(manCot.getMenorValor());
        novoArq.add(manCot.getMenorValor());

        System.out.println("Media: " + (manCot.getMaiorValor() + manCot.getMenorValor())/2);
        novoArq.add((manCot.getMaiorValor() + manCot.getMenorValor())/2);

        System.out.println(manCot.getDezMaiores());
        novoArq.addAll(manCot.getDezMaiores());
        System.out.println(manCot.getDezMenores());
        novoArq.addAll(manCot.getDezMenores());

        System.out.println(manCot.getDezMaiores());
        novoArq.addAll(manCot.getDezMenores());
        System.out.println(manCot.ordenarDecrescente(manCot.getDezMenores()));
        novoArq.addAll(manCot.ordenarDecrescente(manCot.getDezMenores()));

        System.out.println(manCot.intercalar(manCot.ordenarCrescente(manCot.getDezMaiores()), manCot.getDezMenores()));
        novoArq.addAll(manCot.intercalar(manCot.ordenarCrescente(manCot.getDezMaiores()), manCot.getDezMenores()));

        Pilha pilha = new Pilha(manCot.intercalar(manCot.ordenarCrescente(manCot.getDezMaiores()), manCot.getDezMenores()));
        Fila fila = new Fila(manCot.intercalar(manCot.ordenarCrescente(manCot.getDezMaiores()), manCot.getDezMenores()));

        fila.inserir(777);
        pilha.inserir(999);

        System.out.println(pilha.getCotacoes());
        novoArq.addAll(pilha.cotacoes);
        System.out.println(fila.getCotacoes());
        novoArq.addAll(fila.getCotacoes());

        fila.remover();
        pilha.remover();

        System.out.println(pilha.getCotacoes());
        novoArq.addAll(pilha.cotacoes);
        System.out.println(fila.getCotacoes());
        novoArq.addAll(fila.getCotacoes());

        System.out.println(novoArq);
        EscreverArquivo escArq = new EscreverArquivo(novoArq, new File("nova_cotacao_MGLU3.txt"));
        escArq.escrever();
    }
}
