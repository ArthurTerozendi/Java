/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex04;


/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = new int [10];
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) Math.pow(i, 2);
        }
        for (int valor:vet) {
            System.out.print(valor + " ");
        }
        System.out.println("");
    }
    
}
