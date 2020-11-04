/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex6;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double x, cos = 1, aux = 2, fat, exp, grau, m = -1;
        grau =  in.nextInt();
        x = converter(grau);
        for (int i = 0; i < 20; i++) {
            fat = calcularFat(aux);
            aux += 2;
            exp = calcularPot(x, aux);
            cos += m * exp/fat;
            m *= -1;
        }
        System.out.println(cos);
        System.out.println(Math.cos(x));
    }
    public static double converter(double x){
        x = (x * Math.PI)/180;
        return x;
    }
    public static double calcularFat(double aux){
        for (int i = (int) (aux-1); i > 0; i--) {
            aux *= i;
        }
        System.out.println("fat " + aux);
        return aux;
    }
    public static double calcularPot(double x, double aux){
        double n;
        n = x;
        for (int i = (int) (aux - 1); i > 0; i--) {
            x *= n;
        }
        System.out.println("exp " + x);
        return x;
    }
}
