/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex38;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1, div = 0, i = 0;
        
        while (i < 5) {
            for (int j = 1; j < n; j++) {
                if (n%j == 0) {
                    div += j;
                }
            }
            if (div == n) {
                System.out.println(n);
                i++;
            }
            div = 0;
            n++;
        }
    }
    
}
