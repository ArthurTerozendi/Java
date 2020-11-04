/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex22;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =  new Scanner(System.in);
        
        int tam, numGotas, aux = 0;
        boolean termino = false;
        tam = in.nextInt();
        numGotas = in.nextInt();
        
        int fita[] = new int [tam], posicaoGotas[] = new int [numGotas];
        Arrays.fill(fita, 0);
        
        for (int i = 0; i < posicaoGotas.length; i++) {
            posicaoGotas[i] = in.nextInt() - 1;
        }
        
        for (int i = 0; i < posicaoGotas.length; i++) {
            fita[posicaoGotas[i]] = 1;
        }
        for (int i:fita) {
            System.out.print(i + " ");
        }
        aux = 0;
        while(termino != true){
            for (int j = 0; j < fita.length; j++) {
                  if (fita[j] == 1) {
                    if (j == 0) {
                        fita[j+1] = 1;
                    }
                    else if(j == (fita.length - 1)){
                        fita[j-1] = 1;
                    }
                    else{
                        fita[j+1] = 1;
                        fita[j-1] = 1;
                    }
                }
            }
            for (int k = 0; k < fita.length; k++) {
                if (fita[k] == 0) {
                    aux++;
                    termino = false;
                    break;
                }
                else{
                    termino = true;
                }
            }
        }
            
        System.out.println(aux);
    }
    
}
