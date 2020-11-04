/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex8;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx8 {

    /**
     * @param args the command line arguments
     */
    static int quant[] = new int [100], v[] = new int[10000];
    public static void main(String[] args) {
        // TODO code application logic here
        
        gerarRNG();
        acharMaiorMenor();
    }
    
    public static void gerarRNG(){
        Random rng = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = rng.nextInt(100);
        }
        Arrays.fill(quant, 0);
        for (int valor:v) {
            for (int i = 0; i < quant.length; i++) {
                if (valor == i) {
                    quant[i]++;
                }
            }
        }
        for (int valor:quant) {
            System.out.print(valor + " ");
        }
    }
    
    public static void acharMaiorMenor(){
        int maior = 0, menor = 0;
        for (int i = 0; i < quant.length; i++) {
            if (i == 0){
                maior = quant[i];
                menor = quant[i];
            }
            else{
                if (quant[i] > maior) {
                    maior = quant[i];
                }
                if (quant[i] < menor) {
                    menor = quant[i];
                }
            }
        }
        System.out.println("\nDiferença " + (maior - menor));
    }
}
