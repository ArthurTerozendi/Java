/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex20;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2, aux;
        
        System.out.print("Digite os dois números: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        
        if(num1 < num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        System.out.print("mdc(" + num1 + ", " + num2 + "): ");
        do{
            aux = num1%num2;
            num1 = num2;
            num2 = aux;
        }while(num1%num2!=0);
        System.out.println(aux);
    }
    
}
