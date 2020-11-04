/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex15;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n, k;
        n = in.nextInt();
        k = in.nextInt();
        System.out.println(comb(n, k));
    }
    public static int comb(int n, int k){
        if (k == 1) {
            return n;
        }
        else if (k == n) {
            return 1;
        }
        else{
            return comb(n -1, k - 1) + comb(n - 1,k);
        }
    }
}
