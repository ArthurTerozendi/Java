/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex18;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double num;
        
        System.out.print("Digite um numero positivo: ");
        num = teclado.nextFloat();
        
        System.out.printf("Raiz quadrada: %.2f\n", Math.sqrt(num));
        System.out.printf("Elevado ao quadrado: %.2f\n", Math.pow(num,2));
        System.out.printf("Raiz cubica: %.2f\n", Math.cbrt(num));
        System.out.printf("Elevado ao cubo: %.2f\n", Math.pow(num,3));
       
    }
    
}
