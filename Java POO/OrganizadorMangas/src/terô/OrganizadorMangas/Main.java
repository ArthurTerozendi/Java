package terô.OrganizadorMangas;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File path = new File("C:\\Users\\Arthur\\Documents\\Projetos JAVA\\OrganizadorMangas\\src\\terô\\OrganizadorMangas\\mangas.txt");
        EscreverArquivo escArq = new EscreverArquivo(path);
        LerArquivo lerArq = new LerArquivo(path);

        //escArq.escrever("teste");
        lerArq.ler();
        escArq.reescreverArq(lerArq.removerLinha("teste"));
    }
}
