/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthur_terozendi_ex11;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Arthur_Terozendi_Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double ruaA, ruaB, ruaC;
        float voltas, caminhadaKM, perimetro;
        
        System.out.print("Digite quantos km serão percorridos: ");
        caminhadaKM = teclado.nextFloat();
        System.out.print("Digite o tamanha das ruas A e B, respectivamente, (em metros): ");
        ruaA = teclado.nextFloat();
        ruaB = teclado.nextFloat();
        
        ruaC = Math.sqrt(Math.pow(ruaA, 2) + Math.pow(ruaB, 2));
        perimetro = (float) (ruaA + ruaB + ruaC);
        voltas = (caminhadaKM * 1000)/perimetro;
            
        System.out.printf("É necessario %.0f voltas", voltas);
    }
    
}
