/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex23;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float num, par = 0, impar = 0, maior = -99999999, menor = 99999999, somaP = 0, somaI = 0;
        
        System.out.print("Digite um número: ");
        num = teclado.nextFloat();
        
        while (num>=0) {
            if(num%2==0){
                par++;
                if (num>maior) {
                    maior = num;
                }
                somaP += num;
            }
            else{
                impar++;
                if(num<menor){
                    menor = num;
                }
                somaI += num;
            }
            System.out.print("Digite um número: ");
            num = teclado.nextFloat();
        }
        System.out.println("Maior par: " + maior);
        System.out.println("Menor ímpar: " + menor);
        System.out.println("Media dos números pares: " + somaP/par);
        System.out.println("Meida dos números ímpares: " + somaI/impar);
    }
    
}
