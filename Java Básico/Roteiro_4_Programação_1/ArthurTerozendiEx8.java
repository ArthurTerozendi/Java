/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex8;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float j = 0, soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += i;
            j++;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + soma/j);
    }
    
}
