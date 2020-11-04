/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex7;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int i = 0, num;
        System.out.print("Digite um numéro(para parar o código digite um numero não positivo): ");
        num = teclado.nextInt();
        
        while(num>0){
            i++;
            System.out.print("Digite um numéro(para parar o código digite um numero não positivo): ");
            num = teclado.nextInt();
        }
        System.out.println("Foram digitados " + i + " números");
    }
    
}
