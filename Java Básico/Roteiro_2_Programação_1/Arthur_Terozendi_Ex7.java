/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex7;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float bMaior, bMenor, alt, valorM2, area;
        
        System.out.print("Digite o valor, respectivamente, da base maior, da base menor e da altura do terreno (em metros): ");
        bMaior = teclado.nextFloat();
        bMenor = teclado.nextFloat();
        alt = teclado.nextFloat();
        
        System.out.print("Digite o valor de venda do metro quadrado: R$");
        valorM2 = teclado.nextFloat();
        
        area = ((bMaior + bMenor)*alt)/2;
        
        System.out.printf("Valor de venda do terreno é: R$%.2f \n", area * valorM2);
    }
    
}
