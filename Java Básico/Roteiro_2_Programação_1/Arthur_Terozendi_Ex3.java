/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex3;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, p1, p2, p3, mediaP;
        
        System.out.print("Digite a primeira nota e seu respectivo peso: ");
        nota1 = teclado.nextFloat();
        p1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota e seu respectivo peso: ");
        nota2 = teclado.nextFloat();
        p2 = teclado.nextFloat();
        
        System.out.print("Digite a terceira nota e seu respectivo peso: ");
        nota3 = teclado.nextFloat();
        p3 = teclado.nextFloat();
        
        mediaP = ((nota1 * p1) + (nota2 * p2) + (nota3 * p3))/(p1 + p2 + p3);
        System.out.println("A média ponderada é: " + mediaP);
    }
    
}
