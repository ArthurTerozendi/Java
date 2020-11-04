/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex10;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rng = new Random();
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Digite o tamanho da matriz: ");
        n = in.nextInt();

        int matriz[][] = new int [n][n], rota[] = new int[n], custo = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rota.length; i++) {
            rota[i] = in.nextInt();
        }
        for (int i = 0; i < matriz.length - 1; i++) {
            custo += matriz[rota[i]][rota[i+1]];
        }
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println(custo);
    }
    
}
