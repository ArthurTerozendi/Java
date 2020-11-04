import java.util.Arrays;
import java.util.Scanner;

public class arthurterozendiex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean possibilidade = false;
        int n, maior = 0, mPosicao = 0, m;
        System.out.println("Digite a quantidade de cidades: ");
        n = in.nextInt();
        int rotas[][] = new int[n][n], saem[] = new int[n], entram[] = new int[n];
        Arrays.fill(saem, -1);
        Arrays.fill(entram, -1);
        for (int i = 0; i < rotas.length; i++) {
            for (int j = 0; j < rotas[i].length; j++) {
                if (j == i) {
                    rotas[i][j] = 1;
                }
                else{
                    System.out.print("Tem estrada da cidade " + i + " para a cidade " + j + " (1 - sim | 0 - não): ");
                    rotas[i][j] = in.nextInt();
                }
            }
        }
        for (int i = 0; i < rotas.length; i++) {
            for (int j = 0; j < rotas[i].length; j++) {
                System.out.print(rotas[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < rotas.length; i++) {
            for (int j = 0; j < rotas[i].length; j++) {
                saem[i] += rotas[i][j];
            }
            for (int k = 0; k < rotas.length; k++) {
                entram[i] += rotas[k][i];
            }
        }
        for (int i = 0; i < saem.length; i++) {
            System.out.println("saem da cidade "+ i + " = " + saem[i]);
            System.out.println("entram da cidade " + i + " = " + entram[i]);
            if (i == 0) {
                maior = entram[i];
                mPosicao = i;
            }
            if (entram[i] > maior) {
                maior = entram[i];
                mPosicao = i;
            }
            if (entram[i] == 0 && saem[i] == 0) {
                System.out.println("A cidade " + i + " é uma cidade isolada");
            }
        }
        System.out.println("A cidade com maior número de estradas chegando é a " + mPosicao + " com " + entram[mPosicao] + " estradas");
        System.out.print("Digite quantas cidades terão na sua rota: ");
        m = in.nextInt();
        int rota[] = new int[m];
        System.out.print("Por quais cidades deseja passar?");
        for (int i = 0; i < rota.length; i++) {
            rota[i] = in.nextInt();
        }
        for (int i = 0; i < rota.length - 1;i++) {
            if (rotas[rota[i]][rota[i+1]] == 1){
                possibilidade = true;
            }
            else{
                possibilidade = false;
                break;
            }
        }
        if (possibilidade == true) {
            System.out.println("A rota é possível");
        }
        else {
            System.out.println("A rota não é possível");
        }
    }
}
