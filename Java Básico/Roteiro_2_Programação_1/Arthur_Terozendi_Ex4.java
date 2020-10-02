/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex4;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        float salario, salarioGrat, salarioFinal;
        
        System.out.print("Digite o salário: R$");
        salario = teclado.nextFloat();
        
        salarioGrat = salario * 1.1f;
        salarioFinal = salarioGrat * 0.95f;
        
        System.out.printf("O salario final é: R$%.2f \n", salarioFinal);
    }
    
}
