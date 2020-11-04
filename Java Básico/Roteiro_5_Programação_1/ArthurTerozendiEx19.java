/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rng = new Random();
        Scanner in = new Scanner(System.in);
        int vet[] = new int [10], n;
        boolean aux = false;
        
        System.out.print("Digite um número: ");
        n = in.nextInt();
        
        System.out.print("Vetor: [");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rng.nextInt(50);
            System.out.print(vet[i] + " ");
        }
        System.out.println("]");
        
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == n) {
                System.out.println("O valor " + n + " está na posição " + (i+1) + " do vetor");
                aux = true;
                break;
            }
            else{
                aux = false;
            }
        }
        if (aux == false) {
            System.out.println("O valor " + n + " não está presente no vetor");
        }
        
    }
    
}