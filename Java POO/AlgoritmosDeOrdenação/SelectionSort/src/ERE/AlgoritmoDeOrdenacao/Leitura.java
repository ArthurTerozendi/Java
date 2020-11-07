package ERE.AlgoritmoDeOrdenacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitura {
    private File path;
    public Leitura(){
        path = new File("cotacaoEMBR3.csv");
    }

    public ArrayList<Float> ler() throws IOException {
        ArrayList<Float> cotacoes = new ArrayList<>();
        FileReader lerArquivo = new FileReader(path);
        BufferedReader bLerArquivo = new BufferedReader(lerArquivo);

        int i = 0;
        while (bLerArquivo.ready()){
            String linha;
            if (i == 0) {
                linha = bLerArquivo.readLine();
            } else {
                linha = bLerArquivo.readLine();
                cotacoes.add(Float.valueOf(separarLinha(linha)));
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
