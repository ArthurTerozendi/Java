/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex09;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rng = new Random();
        double alt[] = new double[50], somaM = 0, somaH = 0, maior = 0, menor = 0;
        int sexo[] = new int [50], h = 0, m = 0;
        for (int i = 0; i < alt.length; i++) {
            do {
                alt[i] = rng.nextDouble() * 2.1;
            }while (alt[i] < 1.4 || alt[i] > 2.1);
            do {
                sexo[i] = rng.nextInt(3);
            } while (sexo[i] == 0);
        }
        for (int j = 0; j < alt.length; j++) {
            if(j == 0){
                maior = alt[j];
                menor = alt[j];
            }
            if (alt[j]>=maior) {
                maior = alt[j];
            }
            if (alt[j] <= menor){
                menor = alt[j];
            }
            if (sexo[j] == 1) {
                h++;
                somaH += alt[j];
            }
            else{
                m++;
                somaM += alt[j];
            }
        }
        System.out.printf("A maior pessoa tem %.2fm de altura \n", maior);
        System.out.printf("A menor pessoa tem %.2fm de altura \n", menor);
        System.out.printf("Media feminina: %.2fm \n", somaM/m);
        System.out.printf("Media masculina: %.2fm \n", somaH/h);
        System.out.printf("Media da turma: %.2fm \n", (somaH + somaM)/(h+m));
        System.out.println("Alturas femininas acima da média masculina: ");
        for (int k = 0; k < alt.length; k++) {
            if(sexo[k] == 2){
                if (alt[k] >= somaH/h) {
                    System.out.printf("%.2fm \n", alt[k]);
                }
            }
        }
        System.out.println("Alturas masculinas abaixo da média feminina: ");
        for (int l = 0; l < alt.length; l++) {
            if (sexo[l] == 1) {
                if(alt[l] <= somaM/m){
                    System.out.printf("%.2fm \n", alt[l]);
                }
            }
        }
        System.out.println("Alunos acima da média da turma");
        for (double valor:alt) {
            if (valor >= (somaH + somaM)/(h+m)) {
                System.out.printf("%.2fm \n", valor);
            }
        }
    }
    
}