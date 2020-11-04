/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex37;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int op, a = 0, b = 0, c = 0, d = 0, branco = 0, nulo = 0;
        
        System.out.println("=========================");
        System.out.println(" Eleições");
        System.out.println("=========================");
        System.out.println(" Opções: ");
        System.out.println(" 1 - Primeiro candidato");
        System.out.println(" 2 - Segundo candidato");
        System.out.println(" 3 - Terceiro candidato");
        System.out.println(" 4 - Quarto candidato");
        System.out.println(" 5 - Voto Branco");
        System.out.println(" 0 - Parar de votar");
        System.out.println("==========================");
        System.out.println("\n Para votar nulo, digite qualquer outro número");
        
        System.out.print("Digite para quem vai seu voto: ");
        op = teclado.nextInt();
        while(op != 0){
            switch (op){
                case 1: 
                    a++;
                    break;
                case 2:
                    b++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    d++;
                    break;
                case 5:
                    branco++;
                    break;
                default:
                    nulo++;
                    break;
            }
            System.out.print("Digite para quem vai seu voto: ");
            op = teclado.nextInt(); 
        }
        System.out.println("Candidato   |   Total de votos");
        System.out.println(" 1          |   " + a);
        System.out.println(" 2          |   " + b);
        System.out.println(" 3          |   " + c);
        System.out.println(" 4          |   " + d);
        System.out.println(" Brancos    |   " + branco);
        System.out.println(" Nulos      |   " + nulo);
    }
    
}
