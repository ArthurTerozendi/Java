/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterdolarreal;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ConverterDolarReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        float vlrReal, vlrDolar, taxaC;
        
        System.out.print("Digite o valor em Reais: ");
        vlrReal = in.nextFloat();
        System.out.print("Digite a taxa de câmbio: ");
        taxaC = in.nextFloat();
        
        vlrDolar = vlrReal/taxaC;
        
        System.out.printf("O valor em dolar é: $" + "%.2f", vlrDolar);
        System.out.println("");
        
    }
    
}
