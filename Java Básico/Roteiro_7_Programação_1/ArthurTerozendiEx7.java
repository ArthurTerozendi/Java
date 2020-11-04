/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex7;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        
        somarDivisores(num);
    }
    public static void somarDivisores(int num){
        int soma =  0, perf = 0;
        for (int i = 1; i <= num; i++) {
            if (num != i) {
                if (num%i==0) {
                    soma += i;
                    perf += i;
                }
            }
            else{
                if(num%i==0){
                    soma+= i;
                }
            }
        }
        
        if (perf == num) {
            System.out.println("Número perfeito");
        }
        else{
            System.out.println("Número não é perfeito");
        }
        System.out.println("Soma dos divisores: " + soma);
    }
    
}
