package ERE.AlgoritmoDeOrdenacao;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random rng = new Random();
        int lista[] = new int[1000000];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = rng.nextInt(10);
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
        }
    }
}
