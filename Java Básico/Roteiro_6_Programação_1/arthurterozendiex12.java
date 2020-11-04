import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arthurterozendiex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();

        int maiorP2 = 0, mP2 = 0, maiorCusto = 0, mC = 0, menorEstoq = 0, mE = 0;
        int matriz[][] = new int[5][3], estoque[] = new int[4];
        Arrays.fill(estoque, 0);
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rng.nextInt(100);
                estoque[i] += matriz[i][j];
            }
        }
        for (int i = 0; i < matriz[matriz.length - 1].length; i++) {
            matriz[matriz.length-1][i] = in.nextInt();
            if (i == 0) {
                maiorCusto = matriz[matriz.length -1][i];
                mC = i;
            }
            if (matriz[matriz.length - 1][i] > maiorCusto) {
                maiorCusto = matriz[matriz.length - 1][i];
                mC = i;
            }
        }
        for (int i = 0; i < matriz.length - 1; i++) {
            if (i == 0) {
                maiorP2 = matriz[i][1];
                mP2 = i;
            }
            if (maiorP2 < matriz[i][1]) {
                maiorP2 = matriz[i][1];
                mP2 = i;
            }
        }
        for (int i = 0; i < estoque.length; i++) {
            if (i == 0) {
                menorEstoq = estoque[i];
                mE = i;
            }
            if (estoque[i] < menorEstoq) {
                menorEstoq = estoque[i];
                mE = i;
            }
        }
        System.out.print("Armazem: ");
        for (int valor:estoque) {
            System.out.print(valor + " ");
        }
        System.out.println("\nArmazem " + (mP2 + 1) + " possui o maior estoque do produto 2");
        System.out.println("O armazem " + (mE + 1) + " possui o menor estoque de produtos");
        System.out.println("O armazem " +(mC + 1) + "possui o maior custo de estocagem");
    }
}
