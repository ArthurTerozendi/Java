/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex17;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float ladoA, ladoB, ladoC;
        
        System.out.print("Digite os três valores: ");
        ladoA = teclado.nextFloat();
        ladoB = teclado.nextFloat();
        ladoC = teclado.nextFloat();
        
        if(ladoA + ladoB >= ladoC && ladoA + ladoC >= ladoB && ladoB + ladoC >=ladoA){
            System.out.println("Pode formar um quadrado");
        }
        else{
            System.out.println("Não é um quadrado");
        }
    }
    
}
