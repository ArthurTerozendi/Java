/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex12;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double soma=0, num, quant;
        int i = 1;
        
        System.out.print("Digite a quantidade de números que você quer digitar: ");
        quant = teclado.nextDouble();
        
        do{
            System.out.print(" \n Digite um numero: ");
            num = teclado.nextDouble();
            i++;
            soma += num;
        }while(i<=quant);
    
        System.out.println("\nSoma : " + soma);
        System.out.println("Media : " + soma/quant);
    }
}
