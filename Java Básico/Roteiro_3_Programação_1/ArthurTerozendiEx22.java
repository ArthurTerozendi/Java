/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex22;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.print("Digite os três números: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        
        if(n1>=n2 && n1>=n3){
            if(n2>=n3){
                System.out.println("Decrescente: " + n1 + " " + n2 + " " + n3);
                System.out.println("Crescente: " + n3 + " " + n2 + " " + n1);
            }
            else{
                System.out.println("Decrescente: " + n1 + " " + n3 + " " + n2);
                System.out.println("Crescente: " + n2 + " " + n3 + " " + n1);
            }
        }
        else if(n2>=n1 && n2>=n3){
            if(n1>=n3){
                System.out.println("Decrescente: " + n2 + " " + n1 + " " + n3);
                System.out.println("Crescente: " + n3 + " " + n1 + " " + n2);
            }
            else{
                System.out.println("Decrescente: " + n2 + " " + n3 + " " + n1);
                System.out.println("Crescente: " + n1 + " " + n3 + " " + n2);
            }
        }
        else if(n3>=n1 && n3>=n1){
            if(n1>=n2){
                System.out.println("Decrescente: " + n3 + " " + n1 + " " + n2);
                System.out.println("Crescente: " + n2 + " " + n1 + " " + n3);
            }
            else{
                System.out.println("Decrescente: " + n3 + " " + n2 + " " + n1);
                System.out.println("Crescente: " + n1 + " " + n2 + " " + n3);
            }
        }
    }
    
}
