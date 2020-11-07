package ERE.AlgoritmoDeOrdenacao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Random rng = new Random();
        int lista[] = new int[10];
        Leitura leitura = new Leitura();

       /** for (int i = 0; i < lista.length; i++) {
            lista[i] = rng.nextInt(100);
        }

        for (int i = 0; i < lista.length - 1; i++) {
            int menorIndex = i;
            for (int j = i; j < lista.length; j++) {
                if (lista[menorIndex] > lista[j]) {
                    menorIndex = j;
                }
            }
            if (lista[i] > lista[menorIndex]){
                int aux = lista[i];
                lista[i] = lista[menorIndex];
                lista[menorIndex] = aux;
            }
        }*/
       ArrayList<Float> cotacao = leitura.ler();
        System.out.println(cotacao);
        for (int i = 0; i < cotacao.size(); i++) {
            int menorIndex = i;
            for (int j = i; j < cotacao.size(); j++) {
                if (cotacao.get(menorIndex) > cotacao.get(j)) {
                    menorIndex = j;
                }
            }
            if (cotacao.get(i) > cotacao.get(menorIndex)){
                float aux = cotacao.get(i);
                cotacao.add(i, cotacao.get(menorIndex));
                cotacao.add(menorIndex, aux);
            }
        }


       System.out.println(cotacao);
    }
}
