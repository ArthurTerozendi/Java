/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex06;

import java.util.Random;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rng = new Random();
        int n = rng.nextInt(100), mult = 1;
        
        int vet[] = new int [n];
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rng.nextInt() * mult;
            mult *= -1;
        }
        System.out.println("Conjunto 1: ");
        for (int valor:vet){
            if(valor > 0 && valor%2 == 0){
                System.out.println(" " + valor);
            }
        }
        System.out.println("Conjunto 2: ");
        for (int valor:vet){
            if(valor < 0 || valor%2 != 0){
                System.out.println(" " + valor);
            }
        }
    }
    
}
