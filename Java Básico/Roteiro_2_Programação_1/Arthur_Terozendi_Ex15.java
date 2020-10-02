/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex15;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int hora, min;
        
        System.out.print("Digite os minutos: ");
        min = teclado.nextInt();
        
        hora = min/60;
        min = min%60;
        System.out.println("São " + hora + " horas e " + min + " minutos");
    }
    
}
