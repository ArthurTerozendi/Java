/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex10;

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
        
        int vet[] = new int [10], S = 0, aux;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rng.nextInt(100);
        }
        for (int j = 0; j < vet.length/2; j++) {
            aux = vet[j] - vet[vet.length - j - 1];
            S += Math.pow(aux,2);
        }
        System.out.println(S);
    }
}