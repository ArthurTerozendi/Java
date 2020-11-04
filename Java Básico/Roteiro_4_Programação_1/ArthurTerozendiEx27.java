/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex27;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numConsu, codigo;
        float quantidade, resi = 0, come = 0, indu = 0, i = 0, j = 0;
        System.out.print("Digitite o número do consumidor (Para parar o código o número do consumidor = 0):");
        numConsu = teclado.nextInt();
        while(numConsu != 0){
            
            System.out.print("Digite a quantidade de kWh consumido durante o mês: ");
            quantidade = teclado.nextFloat();
            System.out.println("Tipo de consumidor");
            System.out.println("    1 - Residencial");
            System.out.println("    2 - Comercial");
            System.out.println("    3 - Industrial");
            System.out.print("Digite o tipo de consumidor: ");
            codigo = teclado.nextInt();
            
            if (codigo == 1) {
                i++;
                resi += quantidade * 0.3f;
                System.out.println("Custo total do consumidor " + numConsu + " é: " + quantidade * 0.3);
            }
            else if (codigo == 2) {
                j++;
                come += quantidade * 0.5;
                System.out.println("Custo total do consumidor " + numConsu + " é: " + quantidade * 0.5);
            }
            else if (codigo == 3) {
                indu += quantidade * 0.7;
                System.out.println("Custo total do consumidor " + numConsu + " é: " + quantidade * 0.7);
            }
            System.out.print("Digitite o número do consumidor (Para parar o código o número do consumidor = 0):");
            numConsu = teclado.nextInt();
        }
        System.out.println("Consumo total de todos os tipos de consumidores: " + (resi + come + indu));
        System.out.println("Media do consumo residencial e do comercial: " + (resi + come)/(i + j));
    }
    
}
