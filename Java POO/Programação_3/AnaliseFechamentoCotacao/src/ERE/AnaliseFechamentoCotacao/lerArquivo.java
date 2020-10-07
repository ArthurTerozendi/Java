package ERE.AnaliseFechamentoCotacao;

import java.io.*;
import java.util.ArrayList;
/**
 * @author Arthur Terozendi
 * @turma BSI 2019.1
 * @escola IFMG
 */
public class lerArquivo {
    private File path;

    /**
     * Construtor que apenas armazena o caminho para o arquivo com as cotações
     * @param path
     */
    public lerArquivo (File path) {
        this.path = path;
    }

    /**
     * Lê o arquivo linha por linha, e armazena a coluna do meio em uma ArrayList
     * Retorna essa ArrayList
     * @return
     * @throws IOException
     */
    public ArrayList<Float> ler () throws IOException {
        FileReader lerArq = new FileReader(path);
        BufferedReader bLerArq = new BufferedReader(lerArq);


        ArrayList<Float> cotacoes = new ArrayList<>();

        String linha;

        int i = 0;
        //Estrutura de repetição que, enquanto tiver uma linha para ler, ele vai continuar rodando
        while (bLerArq.ready()) {
            linha = bLerArq.readLine();
            //Condicional responsável por não armazenar a primeira linha do arquivo.
            if (i != 0) {
                /**
                 * antes de salvar na ArrayList, ele manda o valor da linha para outro método que vai separar e retornar
                 * apenas o valor da coluna do meio
                 */
                cotacoes.add(Float.parseFloat(separador(linha)));
            }
            i++;
        }
        bLerArq.close();
        lerArq.close();

        return cotacoes;
    }

    /**
     * Recebe a linha do arquivo como parametro
     * separa ela, e retorna o conteudo da coluna do meio
     * @param linha
     * @return
     */
    private String separador (String linha) {

        String [] splitLinha = linha.split(";");

        return splitLinha[1];
    }
}
