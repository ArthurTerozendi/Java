/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex4;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double a, b, c, delta, x1,x2;
        
        System.out.print("Digite o valor de a, b e c, respectivamente: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        
        if(a == 0){
            System.out.println("Não é uma equação de segundo grau");
            if(b == 0){
                System.out.println("Não é uma equação do 1° grau");
            }
            else{
                x1 = -c/b;
                System.out.println("Resultado: " + x1);
            }
        }
        else{
            delta = Math.pow(b,2) - 4 * a * c;
            System.out.println(delta);
            if(delta<0){
                System.out.println("Não há raizes reais");
            }
            else{
                x1 = (-b - Math.sqrt(delta))/2*a;
                x2 = (-b + Math.sqrt(delta))/2*a;
                
                System.out.printf("x': %.2f \n",x1);
                System.out.printf("x'': %.2f \n", x2);
            }
        }
    }
    
}
