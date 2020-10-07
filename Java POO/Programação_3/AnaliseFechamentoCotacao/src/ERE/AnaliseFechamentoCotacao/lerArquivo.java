package ERE.AnaliseFechamentoCotacao;

import java.io.*;
import java.util.ArrayList;

public class lerArquivo {
    private File path;

    public lerArquivo (File path) {
        this.path = path;
    }

    public ArrayList<Float> ler () throws IOException {
        FileReader lerArq = new FileReader(path);
        BufferedReader bLerArq = new BufferedReader(lerArq);


        ArrayList<Float> cotacoes = new ArrayList<>();

        String linha;

        int i = 0;
        while (bLerArq.ready()) {
            linha = bLerArq.readLine();
            if (i != 0) {
                cotacoes.add(Float.parseFloat(separador(linha)));
            }
            i++;
        }
        bLerArq.close();
        lerArq.close();

        return cotacoes;
    }

    private String separador (String linha) {

        String [] splitLinha = linha.split(";");

        return splitLinha[1];
    }
}
