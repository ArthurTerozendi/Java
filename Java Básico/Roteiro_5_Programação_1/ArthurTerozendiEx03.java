/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex03;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite quantos números da sequencia fibonacci você deseja saber: ");
        n = in.nextInt();
        
        int fib[] = new int [n];
        
        for (int i = 0; i < fib.length; i++) {
            if (i == 0 || i == 1) {
                fib[i] = 1;
            }
            else{
                fib[i] = fib[i-1] + fib[i-2];
            }
        }
        System.out.print("Fibonacci: ");
        for (int valor:fib) {
            System.out.print(valor + " ");
        }
        System.out.println("");
    }
    
}
