/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex21;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num1, num2, op;
        float div;
        boolean operacao = true;

        System.out.println("======================");
        System.out.println("Calculadora de Arthur");
        System.out.println("======================");
        System.out.println("Opções");
        System.out.println("    1 - Soma");
        System.out.println("    2 - Subtração");
        System.out.println("    3 - Multiplicação");
        System.out.println("    4 - Divisão");
        System.out.println("    5 - Sair");
        System.out.println("======================");
        
        do{
            System.out.print("\nDigite qual opção deseja: ");
            op = teclado.nextInt();
            switch (op){
                case 1:
                    System.out.print("Digite os dois números: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    
                    System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                    break;
                case 2:
                    System.out.print("Digite os dois números: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    
                    System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                    break;
                case 3:
                    System.out.print("Digite os dois números: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    
                    System.out.println(num1 + " x " + num2 + " = " + num1*num2);
                    break;
                case 4:
                    System.out.print("Digite os dois números: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    if (num2 == 0) {
                        System.out.println("Error! Divisão por zero");
                    }
                    else{
                        div = (float) num1/num2;
                        System.out.println(num1 + " / " + num2 + " = " + div);  
                    }
                    break;
                case 5:
                    operacao = false;
                    break;
                default:
                    System.out.println("Opção Inválida!!");
            }
        }while(operacao == true);
    }
    
}
