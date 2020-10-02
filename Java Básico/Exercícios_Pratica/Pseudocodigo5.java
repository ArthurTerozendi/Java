/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseudocodigo5;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Pseudocodigo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int num, c, d, u, numU;
        
        System.out.print("Digite o numero: ");
        num = in.nextInt();
        
        c = num/100;
        d = (num%100)/10;
        u = num%10;
        numU = u * 100 + d * 10 + c;
        System.out.println("Resultado: " + numU);
        
    }
    
}
