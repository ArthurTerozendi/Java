/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media4num;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Media4Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        float n1, n2, n3, n4, media;
        System.out.print("Digite os numeros: ");
        
        Scanner in = new Scanner(System.in);
        
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        n3 = in.nextFloat();
        n4 = in.nextFloat();
        
        media = (n1 + n2 + n3 + n4)/4;
        
        System.out.println("A media é: " + media);
    }
    
}
