import java.util.Arrays;
import java.util.Scanner;

public class arthurterozendiex08 {
    public static void main(String[] args) {
        // TODO code application logic here
        // Sério sera se é?!

        Scanner in = new Scanner(System.in);
        int matriz [][] = new int [4][4], cont[] = new int [4];
        boolean aux = false;
        Arrays.fill(cont, 0);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                cont[i] += matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                cont[i] += matriz[j][i];
            }
        }
        for (int i = 0; i < cont.length; i++) {

            if (cont[i] == 2) {
                aux = true;
            }
            else{
                aux = false;
                break;
            }
        }
        if (aux == true) {
            System.out.println("É uma matriz permutação");
        }
        else{
            System.out.println("Não é uma matriz permutação");
        }
    }
}
