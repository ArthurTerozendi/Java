/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex11;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double x;
        
        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();
        
        if(x<=1){
            System.out.println("f(x) = 1");
        }
        else if(x>1 && x<=2){
            System.out.println("f(x) = 2");
        }
        else if(x>2 && x<=3){
            System.out.println("f(x) = " + Math.pow(x,2));            
        }
        else if(x>3){
            System.out.println("f(x) = " + Math.pow(x, 3));
        }
    }
    
}
