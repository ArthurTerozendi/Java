/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex6;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float b, h, perimetro, area;
        
        System.out.print("Digite o valor da base e da altura do retangulo: ");
        b = teclado.nextFloat();
        h = teclado.nextFloat();
        
        perimetro = b * 2 + h * 2;
        area = b * h;
        
        System.out.println("Area: " + area + " Perimetro: " + perimetro);
    }
    
}
