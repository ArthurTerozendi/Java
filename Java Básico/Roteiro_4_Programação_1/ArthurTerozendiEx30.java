/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex30;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int n;
        
        System.out.print("Digite a quantidades de linhas do seu triangulo: ");
        n = teclado.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    
}
