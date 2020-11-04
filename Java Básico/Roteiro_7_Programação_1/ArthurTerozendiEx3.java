/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex3;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx3 {

    /**
     * @param args the command line arguments
     */
    static int R[][] = new int[5][5], G[][] = new int[5][5], B[][] = new int[5][5];
    static int C[][] =  new int[5][5], poster[][] = new int [5][5], N[][] = new int[5][5];
    static Random rng = new Random();
    public static void main(String[] args) {
        // TODO code application logic here
        
        preencherRGB();
        preencherCinzaPoster();
        mostrarMatrizes();
    }
    
    public static void preencherRGB(){
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                R[i][j] = rng.nextInt(255);
                G[i][j] = rng.nextInt(255);
                B[i][j] = rng.nextInt(255);
            }
        }
    }
    public static void preencherCinzaPoster(){
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = (R[i][j] + G[i][j] + B[i][j])/3;
                N[i][j] = 255 - C[i][j];
                if (C[i][j] > 127) {
                    poster[i][j] = 255;
                }
                else{
                    poster[i][j] = 0;
                }
            }
        }
    }
    public static void mostrarMatrizes(){
        System.out.println("Matriz de vermelho: ");
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                System.out.print(R[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matriz de verde: ");
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                System.out.print(G[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matriz de azul: ");
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matriz de cinza: ");
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matriz de negativo: ");
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                System.out.print(N[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matriz de poster: ");
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R[i].length; j++) {
                System.out.print(poster[i][j] + " ");
            }
            System.out.println("");
        }
    }
}