
import java.util.Random;
import java.util.Scanner;

public class arthurterozendiex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Random rng = new Random();
        int n, m, l = 0, k = 0;
        System.out.print("Digite, respectivamente, o numero de linhas e de colunas da matriz: ");
        n = in.nextInt();
        m = in.nextInt();
        int a[][] = new int[2][3], b[][] = new int[n][m], c[][] = new int[m][m];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = 0;
            }
        }
        System.out.println("Matriz A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Digite o numero da cordenada (" + i + ", " + j + "): ");
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Matriz B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("Digite o numero da cordenada (" + i + ", " + j + "): ");
                b[i][j] = in.nextInt();
            }
        }
        if (a[0].length == b.length){
            for (int x = 0; x < c.length; x++) {
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < b.length; j++) {
                        c[x][i] += (a[x][j] * b[j][i]);
                    }
                }
            }
            System.out.println("Matriz C ");
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Não é possivel fazer a multiplicação");
        }
    }
}
