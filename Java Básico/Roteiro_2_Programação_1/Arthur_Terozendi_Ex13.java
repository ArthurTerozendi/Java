/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex13;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float altQuarto, larguQuarto, area, iluminacao;
        
        System.out.print("Digite as dimenções do quarto (em metros): ");
        altQuarto = teclado.nextFloat();
        larguQuarto = teclado.nextFloat();
        
        area = altQuarto * larguQuarto;
        iluminacao = area * 18;
        
        System.out.printf("Para um cômodo de %.2fm² é necessário %.2fW de potência para a iluminação\n",area, iluminacao);
               
                
    }
    
}
