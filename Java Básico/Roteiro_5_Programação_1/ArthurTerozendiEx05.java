/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex05;

import java.util.Random;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rng = new Random();
        
        double alt[] = new double [20], soma = 0, aux;
        
        for (int i = 0; i < alt.length; i++) {
            alt[i] = rng.nextDouble() + 1;
            soma += alt[i];
        }
        System.out.printf("Media das alturas: %.2fm \n", soma/alt.length);
        System.out.println("Irão participar do torneio: ");
        for (int j = 0; j < alt.length; j++){
            aux = j;
            if (alt[j] >= soma/alt.length) {
                System.out.printf("Atleta %.0f: %.2fm \n",aux ,alt[j]);
            }
        }
    }
    
}
