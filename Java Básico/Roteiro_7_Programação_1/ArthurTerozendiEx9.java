/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex9;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        
        int n;
        System.out.println("Digite o tamanho do vetor");
        n = in.nextInt();
        int vet[] = new int[n];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rng.nextInt(100);
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
        ordenar(vet);
    }
    
    public static void ordenar(int vet[]){
        int aux;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[i] < vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        for (int valor:vet) {
            System.out.print(valor + " ");
        }
        System.out.println("");
    }
}
