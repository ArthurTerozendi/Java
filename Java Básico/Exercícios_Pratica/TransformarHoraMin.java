/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformarhoramin;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class TransformarHoraMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite as horas e os minutos");
        int hora = in.nextInt();
        int min = in.nextInt();
        
        int somin = hora * 60 + min;
        System.out.println("Resultado: " + somin);
    }
    
}
