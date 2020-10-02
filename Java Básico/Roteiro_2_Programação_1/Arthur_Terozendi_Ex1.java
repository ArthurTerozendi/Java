/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex1;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        float soma, media;
        
        System.out.print("Digite os três números: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        
        soma = (float) num1 + num2 + num3;
        media = soma/3;
        
        System.out.printf("A soma é: %.0f \n", soma);
        System.out.printf( "A media é: %.2f \n", media);
    }
    
}
