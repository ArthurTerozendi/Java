/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex5;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 100; i++) {
            if (i%2 != 0 || i%5 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
