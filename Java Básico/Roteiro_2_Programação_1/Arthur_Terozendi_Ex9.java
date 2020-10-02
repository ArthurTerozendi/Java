/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex9;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double mes;
        double deposito, montantefinal;
        
        System.out.print("Digite o valor do deposito: R$");
        deposito = teclado.nextFloat();
        System.out.print("Digite os mêses: ");
        mes = teclado.nextInt();
        
        montantefinal = deposito * Math.pow(1.005f, mes);
        System.out.printf("Montante final: R$%.2f \n", montantefinal);
        
    }
    
}
