/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularareacircunferencia;

import java.util.Scanner;
import static java.lang.Math.pow;

/**
 *
 * @author Arthur
 */
public class CalcularAreaCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Digite o raio da circunferência: ");
        Scanner in = new Scanner(System.in);
        
        float raio = in.nextFloat();
        float area, circun;
        
        area = (float) (pow(raio,2) * 3.14f);
        circun = raio * 2 * 3.14f;
        
        System.out.println("Area: " + area + " Circunferência: " + circun);
    }
    
}
