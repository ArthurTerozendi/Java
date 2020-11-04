/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex35;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String sexo;
        int n, idade, somaM = 0;
        float alt, peso, maior = -999999999;
        System.out.print("Com os dados de quantas pessoas você quer entrar: ");
        n = teclado.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            System.out.print("Digite o sexo(M - Masculino F - Feminino): ");
            teclado.nextLine();
            sexo = teclado.nextLine();
            System.out.print("Digite a idade: ");
            idade = teclado.nextInt();
            System.out.print("Digite a altura: ");
            alt = teclado.nextFloat();
            System.out.print("Digite o peso: ");
            peso = teclado.nextInt();
            
            if(sexo.equals("F")){
                if(idade > 30){
                    somaM += peso;
                }
            }
            else{
                if(alt > maior){
                    maior = alt;
                }
            }
        }
        
        System.out.println("Soma dos pesos: " + somaM);
        System.out.println("Altura do homem mais alto: " + maior + "m");
        
        
    }
    
}
