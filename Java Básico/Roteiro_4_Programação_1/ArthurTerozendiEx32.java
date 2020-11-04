/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex32;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int m, div = 0, fatorial = 1, somatorio = 0;
        
        System.out.print("Digite um número(Digite 0 para parar): ");
        m = teclado.nextInt();
        
        while(m != 0){
            if(m%2==0){
                for (int i = 1; i <=m; i++) {
                    if (m%i==0) {
                        div++;
                    }
                }
                System.out.println("O número " + m + " tem " + div + " divisores");
                div = 0;
            }
            else{
                if(m<10){
                    for (int j = 1; j <= m; j++) {
                        fatorial *= j;
                    }
                    System.out.println(m + "! = " + fatorial);
                    fatorial = 0;
                }
                else{
                    for (int k = 1; k <= m; k++) {
                        somatorio += k;
                    }
                    System.out.println("Somatorio = " + somatorio);
                    somatorio = 0;
                }
            }
            System.out.print("Digite um número (Digite 0 para parar): ");
            m = teclado.nextInt();
        }
    }
    
}
