/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex23;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n, cont = 0;
        n = in.nextInt();
        int vetV[] = new int [n], vetH[] = new int [n];
        for (int i = 0; i < vetH.length; i++) {
            vetH[i] = in.nextInt();
            vetV[i] = i + 1;
        }
        for (int a:vetV) {
            System.out.print(a + " ");
        }
        for (int i = 0; i < vetV.length; i++) {
            for (int j = 0; j < vetH.length; j++) {
                if (vetV[i] < vetH[j]) {
                    cont++;
                }
                else if (vetV[i] == vetH[j]){
                    break;
                }
            }
        }
        System.out.println(cont);
    }
    
}
