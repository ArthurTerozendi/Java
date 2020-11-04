/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex31;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Você quer a tabuada até qual número: ");
        n = teclado.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println( i + " x " + j + " = " + i*j);
            }
            System.out.println("");
        }
    }
    
}
