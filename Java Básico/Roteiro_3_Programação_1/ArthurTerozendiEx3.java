/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double num1, num2;
        System.out.print("Digite os números: ");
        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();
        
        if(num1>num2){
            System.out.println("Quadrado do menor número: " + Math.pow(num2, 2));
            if(num1>0){
                System.out.println("Raiz do maior número: " + Math.sqrt(num1));
            }
            else{
                System.out.println("O maior númer é negativo, não tem raiz quadrada real");
            }
        }
        else if(num2>num1){
            System.out.println("Quadrado do menor número: " + Math.pow(num1, 2));
            if(num2>0){
                System.out.println("Raiz do maior número: " + Math.sqrt(num2));
            }
            else{
                System.out.println("O maior númer é negativo, não tem raiz quadrada real");
            }
        }
        else{
            
        }
    }
    
}
