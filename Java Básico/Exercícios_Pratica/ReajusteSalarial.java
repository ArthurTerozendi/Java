/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reajustesalarial;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ReajusteSalarial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o salario: ");
        float salario = in.nextFloat();
        
        System.out.println("Digite a taxa do ajuste (em %): ");
        float taxa = (in.nextFloat())/100;
        
        float reaj = salario * (1+taxa);
        
        System.out.println("Salario com o valor reajustado é: " + reaj);
    }

    private static float salario(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
