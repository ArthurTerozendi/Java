/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex6;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double calculo, num1, num2;
        int opcao;
        
        System.out.println("------Menu Opções-----");
        System.out.println("Soma : 1");
        System.out.println("Subtração : 2");
        System.out.println("Divisão : 3");
        System.out.println("Multiplicação : 4");
        System.out.println("-----------------------");
        
        System.out.print("Escolha qual operação deseja fazer: ");
        opcao = teclado.nextInt();
        System.out.print("Digite os número: ");
        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();
        
        switch(opcao){
            case 1:
                calculo = num1 + num2;
                System.out.println("Resultado: " + calculo);
                break;
            case 2 :
                calculo = num1 - num2;
                System.out.println("Resultado: " + calculo);
                break;
            case 3 :
                if(num2 == 0){
                    System.out.println("Denominador igual a zero");
                }
                else{
                   calculo = num1/num2;
                   System.out.println("Resultado: " + calculo);
                }
            case 4 :
                    calculo = num1 * num2;
                    System.out.println("Resultado: " + calculo);
                break;
            default : System.out.println("Operação inexistente");
        }
        
    }
    
}
