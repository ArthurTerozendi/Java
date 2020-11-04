import java.util.Arrays;
import java.util.Scanner;

public class arthurterozendiex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, m, col = 0, aux = 0;
        n = in.nextInt();
        m = in.nextInt();
        int matriz[][] = new int[n][m], tamanho[] = new int[n];
        boolean zeros = false, escada = false;

        Arrays.fill(tamanho, 0);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = in.nextInt();
            }
            for (int k = 0; k < matriz[i].length; k++) {
                tamanho[i] += matriz[i][k];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            if (tamanho[i] == 0) {
                for (int j = 0; j < tamanho.length; j++) {
                    if (tamanho[j] == 0){
                        zeros = true;
                    }
                    else {
                        zeros = false;
                        break;
                    }
                }
            }
        }
        if (zeros == false) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] != 0){
                        col = j;
                        break;
                    }
                }
                aux = 0;
                for (int k = 0; k <= col; k++) {
                    aux += matriz[i][k];
                }
                if (aux == 0){
                    escada = true;
                }
                else{
                    escada = false;
                    break;
                }
            }
            if (escada == false){
                System.out.println("N");
            }
            else{
                System.out.println("S");
            }
        }
        else{
            System.out.println("S");
        }

    }
}
