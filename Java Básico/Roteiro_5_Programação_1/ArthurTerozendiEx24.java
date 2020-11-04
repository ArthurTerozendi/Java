/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex24;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int n, cont = 0;
        n = in.nextInt();
        
        int y[] = new int [n], x[] = new int [n];
        
        for (int i = 0; i < x.length; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        for (int j = 0; j < x.length; j++) {
            if (x[j] < 0) {
                x[j] *= -1;
            }
        }
        for (int i = 0; i < x.length - 1; i++) {
            if (x[x.length - 1] >= x[i]) {
                if (y[y.length - 1] >= y[i]) {
                    cont++; 
                }
            }
        }
        System.out.println(cont);
    }
    
}
