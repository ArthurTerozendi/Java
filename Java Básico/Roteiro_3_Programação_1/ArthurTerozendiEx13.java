/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex13;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float peso, alt, imc;
        
        System.out.print("Digite sua altura (em metros): ");
        alt = teclado.nextFloat();
        System.out.print("Digite seu peso(em Kg): ");
        peso = teclado.nextFloat();
        
        imc = (float) (peso / (double) Math.pow(alt, 2));
        
        if(imc <= 18.5){
            System.out.println("Abaixo do peso. IMC = " + imc);
        }
        else if(imc>18.5 && imc<=25){
            System.out.println("Peso normal. IMC = " + imc);
        }
        else if(imc>25 && imc<=30){
            System.out.println("Acima do peso. IMC = " + imc);
        }
        else{
            System.out.println("Obeso. IMC = " + imc);
        }
    }
    
}