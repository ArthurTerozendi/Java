/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex9;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float soma = 0, num;
        System.out.print("Digite o valor de N: ");
        num = teclado.nextInt();
        for (int i = 0; i <= num; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma/num);
    }
    
}
