/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex02;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int vetorOriginal[] = new int [10], vetorInvertido[] = new int [10];
        System.out.print("Digite todos os " + vetorOriginal.length + " números: ");
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i] = in.nextInt();
        }
        for (int j = 0; j < vetorOriginal.length; j++) {
            vetorInvertido[(vetorOriginal.length - j - 1)] = vetorOriginal[j];
        }
        System.out.print("Vetor original:");
        for (int valor:vetorOriginal) {
            System.out.print(" " + valor);
        }
        System.out.print("\nVetor invertido: ");
        for (int valor:vetorInvertido) {
            System.out.print(valor + " ");
        }
        System.out.println("");
    }
    
}
