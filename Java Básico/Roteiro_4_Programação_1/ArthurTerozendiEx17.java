/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex17;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =  new Scanner(System.in);
        long fatorial = 1, num;
        
        System.out.print("O fatorial de qual número você deseja calcular: ");
        num = teclado.nextInt();
        
        
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
    
}
