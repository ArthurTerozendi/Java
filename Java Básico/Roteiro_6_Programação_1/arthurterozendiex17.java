import java.util.Arrays;
import java.util.Scanner;

public class arthurterozendiex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rede[][] = new int[5][5], quant[] = new int[5];
        Arrays.fill(quant, 0);

        for (int i = 0; i < rede.length; i++) {
            for (int j = 0; j < rede[i].length; j++) {
                if (i == j){
                    rede[i][j] = 0;
                }
                else{
                    System.out.println("n" + i + " é amigo de n" + j + "? ");
                    rede[i][j] = in.nextInt();
                }
            }
        }
        for (int i = 0; i < rede.length; i++) {
            for (int j = 0; j < rede[i].length; j++) {
                rede[j][i] = rede[i][j];
            }
        }
        for (int i = 0; i < rede.length; i++) {
            for (int j = 0; j < rede[i].length; j++) {
                System.out.print(rede[i][j] + "");
            }
            System.out.println();
        }
        for (int i = 0; i < rede.length; i++) {
            for (int j = 0; j < rede[i].length; j++) {
                quant[i] += rede[i][j];
            }
        }
        for (int i = 0; i < quant.length; i++) {
            System.out.println("n" + i + " tem " + quant[i] + " amigos");
        }
    }
}
