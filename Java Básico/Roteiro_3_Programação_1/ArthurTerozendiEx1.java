/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        
        if(num>0){
            System.out.println("Número é positivo");
        }
        else if(num<0){
            System.out.println("Número é negativo");
        }
        else{
            System.out.println("Número é nulo");
        }
    }
    
}
