/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex17;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float salarioMin, quilowatt, valorKW, valorResidencia, valorDesc;
        
        System.out.print("Digite o valor do salario mínimo: R$");
        salarioMin = teclado.nextFloat();
        System.out.print("Digite a quantidade de quilowatt consumida em sua residência: ");
        quilowatt = teclado.nextFloat();
        
        valorKW = salarioMin/5;
        valorResidencia = quilowatt * valorKW;
        valorDesc = valorResidencia * 0.85f;
        
        System.out.printf("Valor pago por quilowatt: R$%.2f \n",valorKW);
        System.out.printf("Valor a ser pago pelo consumo na residência: R$%.2f \n", valorResidencia);
        System.out.printf("Valor com desconto de 15 porcento: R$%.2f \n", valorDesc);
    }
    
}
