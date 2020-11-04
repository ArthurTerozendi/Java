/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex21;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n, pico = 0, quant = 0;
        boolean error = false;
        
        n = in.nextInt();
        
        int vet[] = new int [n];
        
        for (int i = 0; i < vet.length; i++) {
            if (i == 0) {
                vet[i] = in.nextInt();
            }
            else{
                vet[i] = in.nextInt();
                if (vet[i] == vet[i-1]) {
                    System.out.println("error");
                    error = true;
                }
            }
            if (vet[i] < 2 || vet[i] > n) {
                System.out.println("error");
                error = true;
                break;
            }
        }
        if (error == false) {
            for (int i = 0; i < vet.length; i++) {
                if(vet[i] > pico){
                    pico = vet[i];
                }
            }
            for (int j = 0; j < vet.length; j++) {
                if (pico == vet[j]) {
                    quant++;
                }
            }
            if (quant >= 2) {
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }
        }
    }
    
}
