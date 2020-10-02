/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex14;

import java.util.Scanner;


/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex14 {
    
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.1416;
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double raio, area;
        
        System.out.print("Digite o valor do raio: ");
        raio = teclado.nextFloat();
        area = PI * raio * raio;
        System.out.printf("A circunferência é : %.2f \n", area);
    }
    
}
