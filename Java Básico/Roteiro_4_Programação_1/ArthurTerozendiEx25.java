/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex25;


/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 500000, B = 700000, i = 2015;
        while(A<B){
            A *= 1.03;
            B *= 1.02;
            i++;
        }
        System.out.println("A população do país A ultrapassará a do país B no ano de: " + i);
        
    }
    
}
