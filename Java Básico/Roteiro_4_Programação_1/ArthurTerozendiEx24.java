/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex24;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num, i = 0, numInv = 0, aux;
        
        System.out.println("Digite o número: ");
        num = teclado.nextInt();
        
        aux = num;
        while (aux > 0) {
            aux /= 10;
            i++;
        }
        aux = num;
        for (int j = i -1; j >= 0; j--) {
            numInv += (aux%10) * Math.pow(10, j);
            aux /= 10;
        }
        if(numInv == num){
            System.out.println(numInv + " " + num + " é um palindromo");
        }
        else{
            System.out.println(numInv + " " + num + " não é um palindromo");
        }
    }
    
}
