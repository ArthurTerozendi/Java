/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex14;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double n, maiorN=-999999999, menorN=999999999, nota;
        String aluno, maiorA = null, menorA = null;
        
        System.out.print("Digite quantos alunos são: ");
        n = teclado.nextDouble();
        
        for (int i = 1; i <= n; i++) {
           
            System.out.print("Digite o nome do aluno " + i + ": ");
            teclado.nextLine();
            aluno = teclado.nextLine();
            
            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = teclado.nextDouble();
            
            if(nota>=maiorN){
                maiorN = nota;
                maiorA = aluno;
            }
            if(nota<=menorN){
                menorN = nota;
                menorA = aluno;
            }
        }
        System.out.println(maiorA + " tirou a maior nota que é: " + maiorN);
        System.out.println(menorA + " tirou a menor nota que é: " + menorN);
    }
    
}
