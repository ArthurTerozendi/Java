/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rng = new Random();
        int matriz[][] = new int [3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rng.nextInt(100);
            }
        }
        somarMatriz(matriz);
    }
    
    public static void somarMatriz(int matriz[][]){
        int vet[] = new int [matriz.length];
        Arrays.fill(vet,0);
        System.out.print("Vetor [");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                vet[i] += matriz[i][j];
            }
            if (i == matriz.length -1) {
                System.out.print(vet[i]);
            }
            else{
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println("]");
    }
}
