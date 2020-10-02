package ERE.ManipuladorArquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscreverArquivo {

    private File path;


    /**
     * Construtor da Classe
     * @param path
     */
    public EscreverArquivo (File path){
        this.path = path;
    }

    /**
     * Método responsável por escrever no arquivo
     * @param nome
     * @param email
     * @param curso
     * @throws IOException
     */
    public void escrever (String nome, String email, String curso) throws IOException {

        FileWriter escritorArquivo = new FileWriter(path, true);
        BufferedWriter bEscritorArquivo = new BufferedWriter(escritorArquivo);

        String novaLinha = nome + ";" + email + ";" + curso;
        try {
            //Escreve no arquivo o que foi passado pela String
            bEscritorArquivo.write(novaLinha);

            //Cria uma nova linha no arquivo
            bEscritorArquivo.newLine();

            //Fecha o buffer e mostra q o arquivo não esta mais sendo utilizado
            bEscritorArquivo.close();
            escritorArquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sobescreve o arquivo só que sem as linhas que eram pra ser excluídas
     *
     * @param linhas
     * @throws IOException
     */
    public void reescreverArquivo (ArrayList<String> linhas) throws IOException {
        FileWriter escritorArquivo = new FileWriter(path);
        BufferedWriter bEscritorArquivo = new BufferedWriter(escritorArquivo);

        //Repetição responspável por escrever as linhas
        for (String linha : linhas) {
            bEscritorArquivo.write(linha);
            bEscritorArquivo.newLine();
        }
        //fechamento do buffer e do arquivo
        bEscritorArquivo.close();
        escritorArquivo.close();
    }
}
