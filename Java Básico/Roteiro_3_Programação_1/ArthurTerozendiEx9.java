/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex9;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double precoCarro, anoFabricacao, imposto;
        
        System.out.print("Digite o ano de fabricação do carro: ");
        anoFabricacao = teclado.nextDouble();
        
        System.out.print("Digite o preço do carro: ");
        precoCarro = teclado.nextDouble();
        
        if(anoFabricacao <= 1990){
            imposto = precoCarro * 1.01;
        }
        else{
            imposto = precoCarro * 1.015;
        }
        System.out.printf("O imposto a ser pago é: %.2f \n ",imposto);
    }
    
}
