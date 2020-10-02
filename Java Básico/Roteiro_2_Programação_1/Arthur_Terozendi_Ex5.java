/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex5;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        float salario, vendas, salarioBonus;
        
        System.out.print("Digite o valor do salario: R$");
        salario = teclado.nextFloat();
        System.out.print("Digite o valor das vendas realizadas: R$");
        vendas = teclado.nextFloat();
        
        salarioBonus = salario + (vendas * 0.04f);  
        System.out.printf("O valor do salario com a bonificação é: R$%.2f \n", salarioBonus);
    }
    
}
