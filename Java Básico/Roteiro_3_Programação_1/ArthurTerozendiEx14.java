/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex14;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double s, d, q, n;
        
        System.out.print("Digite o diâmetro da barra(metros): ");
        d = teclado.nextFloat();
        System.out.print("Digite o peso da carga(kg): ");
        q = teclado.nextFloat();
        
        if(d>100){
            n = 2;
            s = ((4*q)/(Math.PI * Math.pow(d, 2)))*n;
        }
        else if(d<50){
            n = 6;
            s = ((4*q)/(Math.PI * Math.pow(d, 2)))*n;
        }
        else{
            n = 4;
            s = ((4*q)/(Math.PI * Math.pow(d, 2)))*n;
        }
        System.out.printf("A tensão é %.3f kg/m² \n",s);
    }
}
    

