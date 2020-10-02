/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex8;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double salario;
        
        System.out.print("Digite o salário do funcionário: ");
        salario = teclado.nextDouble();
        
        if(salario<700){
            System.out.printf("Salário reajustado: %.2f", salario * 1.3);
        }
        else{
            System.out.printf("Salário reajustado: %.2f", salario * 1.1);
        }
    }
    
}
