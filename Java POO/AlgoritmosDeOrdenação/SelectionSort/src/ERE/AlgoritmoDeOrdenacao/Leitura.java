package ERE.AlgoritmoDeOrdenacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {
    private File path;
    public Leitura(){
        path = new File("cotacaoEMBR3.csv");
    }

    public float[] ler() throws IOException {
        FileReader lerArquivo = new FileReader(path);
        BufferedReader bLerArquivo = new BufferedReader(lerArquivo);
        float cotacoes[] = new float[2732];

        int i = -1;
        while (bLerArquivo.ready()){
            String linha;
            if (i == -1) {
                linha = bLerArquivo.readLine();
            } else {
                linha = bLerArquivo.readLine();
                cotacoes[i] = Float.valueOf(separarLinha(linha));
            }
            i++;
        }

        return cotacoes;
    }

    private String separarLinha(String linha) {

        String linhaSeparada[] = linha.split(";");
        linha = linhaSeparada[1];
        return linha;
    }
}
