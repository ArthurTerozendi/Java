/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex2;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float num1, num2, num3, calc;
        
        System.out.print("Digite os três números (o terceiro não pode ser 0): ");
        num1 = teclado.nextFloat();
        num2 = teclado.nextFloat();
        num3 = teclado.nextFloat();
        
        calc = (num1 * num2)/ num3;
        
        System.out.printf("O resultado é: " + "%.2f \n",calc);
    }
    
}
