/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex2;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx14 {
    static int cont = 0, cont2 = 0;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        n =  in.nextInt();
        System.out.println(fib(n));
        System.out.println(cont);
        System.out.println("\n"+fib2(n));
        System.out.println(cont2);
    }
    
    public static int fib(int n){
        cont++;
        if (n == 1) {
            return 1;
        }
        else if(n == 0){
            return 0;
        }
        else{
            return fib(n-1) + fib(n - 2);
        }
    }
    public static int fib2(int n){
        int atual, ant, prox;
        atual = 1;
        ant = 0;
        for (int i = 0; i < n - 1; i++) {
            prox = ant + atual;
            ant = atual;
            atual = prox;
            cont2++;
        }
        return atual;
    }
}
