package terô.OrganizadorMangas;

import java.io.*;
import java.util.ArrayList;

public class EscreverArquivo {

    private File path;

    public EscreverArquivo (File path) {
        this.path = path;
    }

    public void escrever(String linha) throws IOException {
        FileWriter escArq = new FileWriter(path, true);
        BufferedWriter bEscArq = new BufferedWriter(escArq);

        if (linha == null) {
            System.out.println("String nula");
        } else {
            bEscArq.write(linha);
            bEscArq.newLine();
        }

        bEscArq.close();
        escArq.close();
    }

    public void reescreverArq (ArrayList<String> linhas) throws IOException {
        FileWriter escArq = new FileWriter(path);
        BufferedWriter bEscArq = new BufferedWriter(escArq);

        for (String linha : linhas) {
            bEscArq.write(linha);
            bEscArq.newLine();
        }

        bEscArq.close();
        escArq.close();
    }
}
