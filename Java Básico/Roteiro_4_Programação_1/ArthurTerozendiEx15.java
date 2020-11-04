/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex15;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double veiculos, acidentes, maior = -99999999, menor = 999999999, totalV = 0, totalA = 0, totalA2 = 0, aux = 0;
        String cidade, maiorC = null, menorC = null;
        
        for (int i = 1; i <= 5; i++) {
            teclado.nextLine();
            System.out.print("Digite o nome da cidade"+ i +": ");
            cidade = teclado.nextLine();
            System.out.println("Digite, respectivamente. o numero de veiculos e o numero de acidentes dessa cidade: ");
            veiculos = teclado.nextDouble();
            acidentes = teclado.nextDouble();
            
            totalV += veiculos;
            totalA += acidentes;
            
            if(acidentes > maior){
                maior = acidentes;
                maiorC = cidade;
            }
            if(acidentes < menor){
                menor  = acidentes;
                menorC = cidade;
            }
            if(acidentes < 200){
                aux++;
                totalA2 += acidentes;
            }
        }
        System.out.println(maiorC + " é a cidade com o maior indice de acidente, com " + maior + " acidentes \n");
        System.out.println(menorC + " é a cidade com o menor indice de acidente, com " + menor + " acidentes \n");
        System.out.println("A razão de total de acidentes por total de veiculos: " + totalA/totalV + "\n");
        System.out.println("A média de acidentes de trânsito nas cidades com menos de 200 veículos: " + totalA2/aux + "\n");
    }
    
}
