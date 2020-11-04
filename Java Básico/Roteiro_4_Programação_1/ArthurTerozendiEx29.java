/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex29;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float x, aux = 1, fatorial = 1, sen = 0;
        
        System.out.print("Digite o seno de qual angulo quer saber: ");
        x = teclado.nextFloat();
        
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <= aux; j++) {
                fatorial *= j;
            }
            if(i%2==0){
                sen -= (Math.pow(x, aux))/fatorial;
            }
            else{
                sen += (Math.pow(x, aux))/fatorial;
            }
            aux += 2;
            
        }
        System.out.println("sen(" + x + ") = " + sen);
    }
    
}
