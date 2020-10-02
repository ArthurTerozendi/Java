/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somabinario;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class SomaBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[4];
        int aux=0, soma, j = 3;
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        b[0] = 1;
        b[1] = 1;
        b[2] = 1;
        
        for(int i = 2 ; i >= 0 ; i--){
            soma = a[i] + b[i]+aux;
            if(soma <= 1){
                aux = 0;
                c[i+1] = soma;
            }else if(soma == 2){
                aux = 1;
                c[i+1] = 0;
            }else if(soma == 3){
                aux = 1;
                c[i+1] = 1;
            }
        }
        c[0] = aux;
        for(int k=0; k<4; k++){
            System.out.print(c[k]);
        }
    }
    
}
