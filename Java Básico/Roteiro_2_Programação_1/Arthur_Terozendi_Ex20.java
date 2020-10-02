/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex20;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double altParede, angulo, medidaEsc;
        
        System.out.print("Digite o angulo da escada: ");
        angulo = teclado.nextFloat();
        System.out.print("Digite a altura da parede (em metros): ");
        altParede = teclado.nextFloat();
        
        medidaEsc = Math.sin(angulo) * altParede;
        
        System.out.printf("A medida da escada é: %.2fm\n", medidaEsc);
    }
    
}
