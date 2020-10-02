/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex22;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int a=1450, b=1150, c=900, ab=350, ac=400, bc=300, abc=100, NA;
        a-=(ab + ac + abc);
        b-=(ab + bc + abc);
        c-=(ac + bc + abc);
        
        NA = 3000 - (a + b + c + ab + ac + bc + abc);
        System.out.println("O número de pessoas que não assistem nenhuma das novela é: " + NA);
    }
    
}
