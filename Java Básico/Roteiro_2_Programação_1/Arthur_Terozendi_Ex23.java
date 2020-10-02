/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex23;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double a, b, c, delta, x1, x2;
        
        System.out.print("Digite, respectivamente, o valor de a, b e c: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        System.out.println(a + "x² + " + b + "x + " + c);
        delta = Math.pow(b, 2) - 4 * a * c;
        /** As vezes retorna um valor não correto pois o delta deu algum valor negativo, e não tem como calcular raiz de um numero negativo
        * Para resolver isso podemos colocar um estrutura condicional  após o calculo de delta, que vai validar se o delta é positivo ou negativo, se for positivo segue o codigo normal, se for negativo imprime um mensagem na tela "Delta negativo, impossivel calcular raiz" e para o codigo  
        */
        x1 = (b + Math.sqrt(delta))/2 * a;
        x2 = (b - Math.sqrt(delta)/2 * a);
        System.out.printf("As raizes são: %.2f e %.2f \n", x1, x2); 
    }
    
}
