package ERE.AnaliseFechamentoCotacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * @author Arthur Terozendi
 * @turma BSI 2019.1
 * @escola IFMG
 */
public class EscreverArquivo {
    private ArrayList<Float> cotacoes;
    private File path;

    /**
     * Construtor que recebe a nova ArrayList como paramentro, e o caminho para o novo arquivo
     * Se esse arquivo não existir, é criado um;
     * @param cotacoes
     * @param path
     * @throws IOException
     */
    public EscreverArquivo(ArrayList<Float> cotacoes, File path) throws IOException {
        this.cotacoes = cotacoes;
        this.path = path;

        if(!path.exists()){
            path.createNewFile();
        }
    }

    /**
     * Método que vai escrever no arquivo todos os valores da ArrayList
     * @throws IOException
     */
    public void escrever() throws IOException {
        FileWriter escArq = new FileWriter(path);
        BufferedWriter bEscArq = new BufferedWriter(escArq);

        for (float num : cotacoes) {
            String linha = num + "";
            bEscArq.write(linha);
            bEscArq.newLine();
        }
        bEscArq.close();
        escArq.close();
    }
}
