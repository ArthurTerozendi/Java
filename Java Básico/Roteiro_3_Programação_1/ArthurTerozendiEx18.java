/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex18;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num, d1, d3;
        
        System.out.println("Digite o número, de três digitos: ");
        num = teclado.nextInt();
        
        d1 = num % 10;
        num /= 100;
        d3 = num % 10;
        if(d1 == d3){
            System.out.println("o número é um palindromo");
        }
        else{
            System.out.println("O número não é um palindromo");
        }
    }
}
