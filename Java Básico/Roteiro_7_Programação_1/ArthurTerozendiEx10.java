/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Random rng =  new Random();
        
        int n, k;
        boolean achou = false;  
        System.out.print("Digite o tamanho do vetor: ");
        n = in.nextInt();
        
        int vet[] = new int [n];
        for (int i = 0; i < vet.length; i++) {
            vet[i] =  rng.nextInt(100);
        }
        System.out.print("Qual número você deseja procurar: ");
        k = in.nextInt();
        achou = procurar(vet, k);
        if (achou ==  true) {
            System.out.println("O número que você digitou está no vetor");
        }
        else{
            System.out.println("O número que você digitou não está no vetor");
        }
    }
    
    public static boolean procurar(int vet[], int k){
        for (int i = 0; i < vet.length; i++) {
            if (k == vet[i]) {
                return true;
            }
        }
        return false;
    }
}
