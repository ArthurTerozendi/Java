/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex12;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int idade;
        
        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();
        
        if(idade>=5 && idade<=7){
            System.out.println("Categoria: Infantil");
        }
        else if(idade>=8 && idade<=10){
            System.out.println("Categoria: Juvenil");
        }
        else if(idade>=11 && idade<=15){
            System.out.println("Categoria: Adoscelente");
        }
        else if(idade>=16 && idade<=40){
            System.out.println("Categoria: Adulto");
        }
        else{
            System.out.println("Categoria: Sênior");
        }
    }
    
}
