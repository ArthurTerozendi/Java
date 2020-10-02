/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex12;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int anoAtual, numCopas = -2;
        
        System.out.print("Digite o ano: ");
        anoAtual = teclado.nextInt();
        
        for(int i=1930; i<anoAtual; i+=4){
            numCopas++;
        }
        System.out.println("Foram realizadas " + numCopas + " copas");
    }
    
}
