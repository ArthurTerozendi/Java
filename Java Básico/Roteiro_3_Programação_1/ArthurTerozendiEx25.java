/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex25;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double alt;
        String sexo;
        
        System.out.print("Digite o sexo(M - Masculino | F - Feminino): ");
        sexo = teclado.nextLine();
        System.out.print("Digite a altura (em m): ");
        alt = teclado.nextDouble();
        
        if(sexo.equalsIgnoreCase("M")){
            System.out.println("O peso ideal é: " + ((72.7 * alt) - 58));
        }
        else if(sexo.equalsIgnoreCase("F")){
            System.out.println("O peso ideal é: " + ((62.1 * alt) - 44.7));
        }
        else{
            System.out.println("Sexo inexistente");
        }
    }
    
}
