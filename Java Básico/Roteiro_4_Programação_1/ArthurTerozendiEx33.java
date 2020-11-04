/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex33;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int a, b, i = 0;
        
        System.out.print("Digite os dois números, respectivamente, numerador e denominador: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        
        while(a>=b){
            a -= b;
            i++;
        }
        System.out.println("Quociente = " + i);
    }
    
}
