/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex5;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int fat;
        fat = in.nextInt();
        
        System.out.println(calcularFat(fat));
    }
    
    public static int calcularFat(int fat){
        if (fat > 0) {
            for (int i = fat -1; i > 0; i--) {
                fat *= i;
            }
            return fat;
        }
        else if(fat == 0){
            return 1;
        }
        else{
            return -1;
        }
    }
}
