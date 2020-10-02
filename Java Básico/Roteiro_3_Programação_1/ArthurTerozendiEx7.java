/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex7;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        char caracter;
        
        System.out.print("Digite um caractér: ");
        caracter = teclado.nextLine().charAt(0);
        switch(caracter){
            case 'a' :
                System.out.println("O caracter " + caracter + " é uma vogal");
                break;
            case 'e' : 
                System.out.println("O caracter " + caracter + " é uma vogal");
                break;
            case 'i' :
                System.out.println("O caracter " + caracter + " é uma vogal");
                break;
            case 'o' :
                System.out.println("O caracter " + caracter + " é uma vogal");
                break;
            case 'u' : 
                System.out.println("O caracter " + caracter + " é uma vogal");
                break;
            default : 
                System.out.println("O caracter " + caracter + " é uma consoante");
        }
    }
    
}
