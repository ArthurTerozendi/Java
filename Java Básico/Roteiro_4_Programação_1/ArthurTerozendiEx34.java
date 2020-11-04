/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex34;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int p,n, comb, arran, n_p, nF = 1, pF = 1, npF = 1;
        
        System.out.print("Digite, respectivamente, número de objetos e quantos objetos são pegos por vez: ");
        n = teclado.nextInt();
        p = teclado.nextInt();
        
        n_p = n - p;
        
        System.out.println(n + " " + p + " " + n_p + " ");
        for (int i = 1; i <= p; i++) {
            pF *= i;
        }
        for (int j = 1; j <= n; j++) {
            nF *= j;
        }
        for (int k = 1; k <= n_p; k++) {
            npF *= k;
        }
        System.out.println(nF + " " + pF + " " + npF + " ");
        comb = nF/(pF * npF);
        arran = nF/npF;
        
        System.out.println("Combinação = " + comb);
        System.out.println("Arranjo = " + arran);
    }
    
}
