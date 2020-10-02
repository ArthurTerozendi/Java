/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex26;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double salarioBase, tempo, imposto, grat, salarioLiq;
        
        System.out.print("Digite o salario: ");
        salarioBase = teclado.nextDouble();
        System.out.print("Digite o tempo de serviço(em anos): ");
        tempo = teclado.nextDouble();
        
        if(salarioBase < 200){
            imposto = 1;
        }
        else if(salarioBase >= 200 && salarioBase <= 450){
            imposto = 0.97;
        }
        else if(salarioBase > 450 && salarioBase < 700){
            imposto = 0.92;
        }
        else{
            imposto = 0.82;
        }
        
        if(salarioBase > 500){
            if(tempo < 3){
                grat = 1.20;
            }
            else{
                grat = 1.30;
            }
        }
        else{
            if(tempo < 3){
                grat = 1.23;
            }
            else if(tempo >= 3 && tempo < 6){
                grat = 1.35;
            }
            else{
                grat = 1.33;
            }
        }
        salarioLiq = salarioBase * imposto * grat;
        
        if(salarioLiq < 350){
            System.out.println("A");
        }
        else if(salarioLiq >= 350 && salarioLiq < 600){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
    
}
