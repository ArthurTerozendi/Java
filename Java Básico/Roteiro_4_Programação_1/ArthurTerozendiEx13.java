/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex13;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double num, n, maior=-999999999, menor=999999999;
        
        System.out.print("Digite a quantidade de números desejados: ");
        n = teclado.nextDouble();
        
        for(int i=0; i<n;i++){
            System.out.print("Digite um número: ");
            num = teclado.nextDouble();
            if(num>=maior){
                maior = num;
            }
            if(num<=menor){
                menor = num;
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
    
}
