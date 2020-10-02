/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex19;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float salarioMin, horaExtra, horaTrab, salarioReceb;
        
        System.out.print("Digite o valor do salario minimo: R$");
        salarioMin = teclado.nextFloat();
        
        System.out.print("Digite, respectivamente, a hora trabalhada e as horas extras trabalhadas: ");
        horaTrab = teclado.nextFloat();
        horaExtra = teclado.nextFloat();
        
        salarioReceb = horaTrab * (salarioMin * 0.125f) + horaExtra * (salarioMin * 0.25f);
        
        System.out.printf("O salario recebido é de : R$%.2f\n", salarioReceb);
    }
    
}
