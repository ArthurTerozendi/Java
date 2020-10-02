/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex19;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int num, d1, d2, d3, d4;
        
        System.out.print("Digite o número de 4 digitos: ");
        num = teclado.nextInt();
        
        d1 = num%10;
        num /= 10;
        d2 = num%10;
        num /= 10;
        d3 = num%10;
        num /= 10;
        d4 = num%10;
        
        if(d1 == 1 || d1 == 0){
            if(d2==1 || d2 == 0){
                if(d3 == 1 || d3 == 0){
                    if(d4 == 1 || d4 == 0){
                        System.out.println("O número pertence a familia dos binários");
                    }
                    else{
                        System.out.println("O número não pertence a família dos binários");
                    }
                }
                else{
                    System.out.println("O número não pertence a família dos binários");
                }
            }
            else{
                System.out.println("O número não pertence a família dos binários");
            }
        }
        else{
            System.out.println("O número não pertence a família dos binários");
        }
    }
    
}
