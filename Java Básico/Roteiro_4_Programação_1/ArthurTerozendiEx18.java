/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex18;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        long num, ant = 0, atual = 1, prox;
        
        System.out.print("Digite quantos números da sequencia fibonacci você quer saber: ");
        num = teclado.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(" " + atual + ",");
            prox = atual + ant;
            ant = atual;
            atual = prox;
        }
        System.out.println("... ");
    }
    
}
