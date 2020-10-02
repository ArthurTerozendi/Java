package ERE.ManipuladorArquivo;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerArquivo {
    private File path;

    /**
     * Construtor da Classe
     * @param path
     */
    public LerArquivo(File path) {
        this.path = path;
    }

    /**
     * Método responsável por imprimir todas as linhas do arquivo
     * @throws IOException
     */
    public void listarAlunos () throws IOException {
        FileReader leitorArquivo = new FileReader(path);
        BufferedReader bLeitorArquivo = new BufferedReader(leitorArquivo);

        System.out.println("Nome  -  E-mail  -  Curso");

        //Repetição que irá rodar enquanto ainda tiver linha pra ser lida
        while (bLeitorArquivo.ready()) {
            //lê uma linha do arquivo e o armazena na "linha"
            String linha = bLeitorArquivo.readLine();

            //Separa a linha salva em um vetor, separando assim o nome, o email e o curso
            String cadastros[] = linha.split(";");

            //cadastro[0] = nome; cadastro[1] = email; cadastro[2] = curso;
            System.out.println(cadastros[0]+ "  -  " + cadastros[1] + "  -  " + cadastros[2]);
        }
        System.out.println("");
        //fecha o buffer e o arquivo
        bLeitorArquivo.close();
        leitorArquivo.close();
    }

    /**
     * Método responsável por buscar a primeira ocorrência do nome passado por parâmetro
     * @param nome
     * @return
     * @throws IOException
     */
    public String buscarAluno (String nome) throws IOException {
        FileReader leitorArquivo = new FileReader(path);
        BufferedReader bLeitorArquivo = new BufferedReader(leitorArquivo);

        while (bLeitorArquivo.ready()) {
            //responsável por ler a linha do arquivo
            String linha = bLeitorArquivo.readLine();
            String cadastros[] = linha.split(";");

            //verifica se o nome (cadastro[0]) é igual ao nome passado por parâmetro
            if (cadastros[0].equalsIgnoreCase(nome)) {
                bLeitorArquivo.close();
                leitorArquivo.close();
                return linha;
            }
        }
        bLeitorArquivo.close();
        leitorArquivo.close();
        return null;
    }

    /**
     * Método que armazena todas as linhas, que não contém o nome passado por parâmentro, em uma ArrayList
     * @param nome
     * @return
     * @throws IOException
     */
    public ArrayList<String> removerAluno (String nome) throws IOException{
        FileReader leitorArquivo = new FileReader(path);
        BufferedReader bLeitorArquivo = new BufferedReader(leitorArquivo);

        ArrayList<String> linhas = new ArrayList();
        while (bLeitorArquivo.ready()) {
            String linha = bLeitorArquivo.readLine();
            String linhaSplit [] = linha.split(";");
            if (!linhaSplit[0].equalsIgnoreCase(nome)) {
                linhas.add(linha);
            }
        }
        bLeitorArquivo.close();
        leitorArquivo.close();
        return linhas;
    }

    /**
     * Metodo que para a execução do código por um tempo
     * @param milliseconds
     */
    public void esperar(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e){}
    }

}
