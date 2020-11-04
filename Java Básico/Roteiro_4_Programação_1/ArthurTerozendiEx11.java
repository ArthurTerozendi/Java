/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex11;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float num, h = 0;
        System.out.print("Digite o valor positivo para N: ");
        num = teclado.nextInt();
        while(num<=0){
            System.out.println("N não positivo (error)");
            System.out.print("Digite o valor positivo para N: ");
            num = teclado.nextInt();
        }
        for (float i = 1; i <= num; i++) {
            if(i%2 == 0){
                h -= 1/i;
            }
            else{
                h += 1/i;
            }
        }
        System.out.println("H = " + h);
    }
}
