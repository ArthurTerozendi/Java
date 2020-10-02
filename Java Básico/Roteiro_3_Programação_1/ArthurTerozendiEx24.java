/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex24;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int cod, quant;
        float total;
        
        System.out.print("Digite o código do produto(1 à 40): ");
        cod = teclado.nextInt();
        
        System.out.print("Digite a quantidade desejada do produto: ");
        quant = teclado.nextInt();
        
        if(cod>=1 && cod<=10){
            total = 10.00f * (float) quant;
            System.out.println("Preço unitário: R$10,00");
            System.out.println("Preço total: " + total);
            if(total<250){
                System.out.println("Desconto de 5%");
                System.out.println("Preço total: R$" + total * 0.95);
            }
            else if(total>=250 && cod<500){
                System.out.println("Desconto de 10%");
                System.out.println("Preço total: R$" + total * 0.90);
            }
            else{
                System.out.println("Desconto de 15%");
                System.out.println("Preço total: R$" + total * 0.85);
            }
        }
        else if(cod>=11 && cod<=20){
            total = 20.00f * (float) quant;
            System.out.println("Preço unitário: R$20,00");
            System.out.println("Preço total: " + total);
            if(total<250){
                System.out.println("Desconto de 5%");
                System.out.println("Preço total: R$" + total * 0.95);
            }
            else if(total>=250 && cod<500){
                System.out.println("Desconto de 10%");
                System.out.println("Preço total: R$" + total * 0.90);
            }
            else{
                System.out.println("Desconto de 15%");
                System.out.println("Preço total: R$" + total * 0.85);
            }
        }
        else if(cod>=21 && cod<=30){
            total = 30.00f * (float) quant;
            System.out.println("Preço unitário: R$30,00");
            System.out.println("Preço total: " + total);
            if(total<250){
                System.out.println("Desconto de 5%");
                System.out.println("Preço total: R$" + total * 0.95);
            }
            else if(total>=250 && cod<500){
                System.out.println("Desconto de 10%");
                System.out.println("Preço total: R$" + total * 0.90);
            }
            else{
                System.out.println("Desconto de 15%");
                System.out.println("Preço total: R$" + total * 0.85);
            }
        }
        else if(cod>=31 && cod<=40){
            total = 40.00f * (float) quant;
            System.out.println("Preço unitário: R$40,00");
            System.out.println("Preço total: " + total);
            if(total<250){
                System.out.println("Desconto de 5%");
                System.out.println("Preço total: R$" + total * 0.95);
            }
            else if(total>=250 && cod<500){
                System.out.println("Desconto de 10%");
                System.out.println("Preço total: R$" + total * 0.90);
            }
            else{
                System.out.println("Desconto de 15%");
                System.out.println("Preço total: R$" + total * 0.85);
            }
        }
        else{
            System.out.println("Código de produto inexistente");
        }
    }
    
}
