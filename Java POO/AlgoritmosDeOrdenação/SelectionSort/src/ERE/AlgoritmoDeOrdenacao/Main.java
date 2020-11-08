package ERE.AlgoritmoDeOrdenacao;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Leitura leitura = new Leitura();
        float cotacao[] = leitura.ler();

        for (int i = 0; i < cotacao.length; i++) {
            System.out.print(cotacao[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < cotacao.length - 1; i++) {
            int menorIndex = i;
            for (int j = i; j < cotacao.length; j++) {
                if (cotacao[menorIndex] > cotacao[j]) {
                    menorIndex = j;
                }
            }
            if (cotacao[i] > cotacao[menorIndex]){
                float aux = cotacao[i];
                cotacao[i] = cotacao[menorIndex];
                cotacao[menorIndex] = aux;
            }
        }

        for (int i = 0; i < cotacao.length; i++) {
            System.out.print(cotacao[i] + " ");
        }

       System.out.println();
    }
}
