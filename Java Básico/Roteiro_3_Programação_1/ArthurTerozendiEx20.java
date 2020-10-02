/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex20;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.print("Digite o valor dos dois números: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        
        if(n1%n2==0){
            System.out.println("O primeiro número é multiplo do segundo");
        }
        else{
            System.out.println("O primeiro número não é multiplo do segundo");
        }
    }
    
}
