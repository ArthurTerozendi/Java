/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex22;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float num, cont = 0, soma = 0;
        
        System.out.print("Digite um número: ");
        num = teclado.nextFloat();
        
        while (num != -1){
            if(num>0){
                cont++;
                soma += num;
            }
            System.out.print("Digite um número: ");
            num = teclado.nextFloat();
        }
        System.out.println("Média: " + soma/cont);
    }
    
}
