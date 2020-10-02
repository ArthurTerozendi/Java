/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterhoraemminuto;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ConverterHoraEmMinuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int hora, min;
        
        System.out.print("Digite os minutos: ");
        min = in.nextInt();
        
        hora = min/60;
        min = min%60;
        System.out.println("São " + hora + " horas e " + min + " minutos");
    }
    
}
