/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        float a, b;
        a = in.nextFloat();
        b = in.nextFloat();
        
        elevar(a,b);
    }
    
    public static void elevar(float a, float b){
        float aux;
        aux = a;
        if (b < 0) {
            for (int i = -1; i > b; i--) {
                a *= aux;
            }
            System.out.println("Resultado: " + 1/a);
        }
        else{
            for (int i = 0; i < b - 1; i++) {
                a *= aux;
            }
            System.out.println("Resultado: " + a);
        }
    }
    
}
