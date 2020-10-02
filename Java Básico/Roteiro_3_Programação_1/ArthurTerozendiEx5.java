/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex5;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double custoFabrica, custoConsumidor;
        
        System.out.print("Digite o custo de fábrica do carro: ");
        custoFabrica = teclado.nextDouble();
        
        if(custoFabrica<=28000){
            custoConsumidor = custoFabrica * 1.05;
        }
        else if(custoFabrica>28000 && custoFabrica<45000){
            custoConsumidor = custoFabrica * 1.10 * 1.15;
        }
        else{
            custoConsumidor = custoFabrica * 1.15 * 1.20;
        }
        
        System.out.printf("Custo do carro é: %.2f \n", custoConsumidor);
    }
    
}
