package ERE.AnaliseFechamentoCotacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscreverArquivo {
    private ArrayList<Float> cotacoes;
    private File path;

    public EscreverArquivo(ArrayList<Float> cotacoes, File path) throws IOException {
        this.cotacoes = cotacoes;
        this.path = path;

        if(!path.exists()){
            path.createNewFile();
        }
    }

    public void escrever() throws IOException {
        FileWriter escArq = new FileWriter(path);
        BufferedWriter bEscArq = new BufferedWriter(escArq);

        for (float num : cotacoes) {
            String linha = "";
            bEscArq.write(linha);
            bEscArq.newLine();
        }
        bEscArq.close();
        escArq.close();
    }
}
