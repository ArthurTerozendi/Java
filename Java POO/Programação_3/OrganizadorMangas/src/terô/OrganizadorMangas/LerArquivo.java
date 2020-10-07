package terô.OrganizadorMangas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LerArquivo {

    private File path;

    public LerArquivo (File path) {
        this.path = path;
    }

    public ArrayList<String> ler() throws IOException {
        FileReader lerArq = new FileReader(path);
        BufferedReader bLerArq = new BufferedReader(lerArq);

        ArrayList<String> linha = new ArrayList();

        while (bLerArq.ready()) {
            linha.add(bLerArq.readLine());
        }

        bLerArq.close();
        lerArq.close();

        return linha;
    }

    public ArrayList<String> removerLinha(String removerLinha) throws IOException {
        ArrayList<String> linhas = new ArrayList<>();

        FileReader lerArq = new FileReader(path);
        BufferedReader bLerArq = new BufferedReader(lerArq);

        String linha;

        while (bLerArq.ready()) {
            linha = bLerArq.readLine();
            if(!linha.equalsIgnoreCase(removerLinha)) {
                linhas.add(linha);
            }
        }

        bLerArq.close();
        lerArq.close();

        return linhas;
    }

}
