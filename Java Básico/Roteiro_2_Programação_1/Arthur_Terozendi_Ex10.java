/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex10;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float salario, conta1, conta2, salarioFinal;
        
        System.out.print("Digite o salário: R$");
        salario = teclado.nextFloat();
        System.out.print("Digite o valor da primeira conta: R$");
        conta1 = teclado.nextFloat();
        System.out.print("Digite o valor da segunda conta: R$");
        conta2 = teclado.nextFloat();
        
        salarioFinal = salario - ((conta1 * 1.02f) + (conta2 * 1.02f));
        System.out.printf("O restante do salário é: R$%.2f \n", salarioFinal);
    }
    
}
