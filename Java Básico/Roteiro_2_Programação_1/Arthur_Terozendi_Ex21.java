/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex21;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2, aux;
        
        System.out.print("Digite o valor dos dois numeros: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        
        System.out.println("Antes da troca a: " + num1 + " b: " + num2);
        
        aux = num1;
        num1 = num2;
        num2 = aux;
        
        System.out.println("Depois da troca a: " + num1 + " b: " + num2);
    }
    
}
