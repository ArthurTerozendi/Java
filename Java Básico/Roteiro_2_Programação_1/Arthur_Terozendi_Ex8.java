/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex8;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int numLados;
        
        System.out.print("Digite o número de lados do seu polígono: ");
        numLados = teclado.nextInt();
        
        System.out.println("O polígono tem " + numLados * (numLados - 3)/2 + " diagonais");
    }
    
}
