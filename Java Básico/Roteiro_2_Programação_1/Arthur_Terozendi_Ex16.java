/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex16;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double num, parteFrac;
        
        System.out.print("Digite o numero: ");
        num = teclado.nextFloat();
        
        parteFrac = num%1;
        
        System.out.printf("Parte inteira: %.0f\n",num);
        System.out.printf("Parte fracionaria: %.4f \n", parteFrac);
        
    }
    
}
