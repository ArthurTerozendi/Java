/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex01;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String nome[] = new String [40];
        int idade[] = new int [40], maior = 0, menor = 0, cont1 = 0, cont2 = 0;
        double soma = 0;
        for (int i = 0; i < nome.length; i++) {
            in.nextLine();
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nome[i] = in.nextLine();
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idade[i] = in.nextInt();
            soma += idade[i];
            if (idade[i] >= idade[maior]) {
                maior = i;
            }
            if (idade[i] <= idade[menor]) {
                menor = i;
            }
            if(idade[i] <= 16){
                cont1++;
            }
            if(idade[i] > 16){
                cont2++;
            }
        }
        System.out.println("Total de alunos com idade menor ou igual a 16 anos: " + cont1);
        System.out.println("Total de alunos com a idade maior que 16 anos: " + cont2);
        System.out.println("Media das idades: " + soma/nome.length);
        System.out.println("Alunos com idade acima da média: ");
        for (int l = 0; l < nome.length; l++) {
            if (idade[l] > soma/nome.length) {
                System.out.println("  " + nome[l]);
            }
        }
        System.out.println(nome[maior] + " é @ mais velhx, com " + idade[maior] + " anos");
        System.out.println(nome[menor] + " é @ mais novx, com " + idade[menor] + " anos");
        
    }
    
}
