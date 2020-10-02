/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex21;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int ano;
        System.out.print("Digite o ano: ");
        ano = teclado.nextInt();
        
        if(ano%4==0 && (ano%100!=0 || ano%400==0)){
            System.out.println("O ano de " + ano + " é bissexto");
        }
        else{
            System.out.println("O ano de " + ano + " não é bissexto");
        }
    }
    
}
