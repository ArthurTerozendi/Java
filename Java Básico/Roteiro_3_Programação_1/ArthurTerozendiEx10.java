/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex10;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double peso, idade;
        
        System.out.print("Digite, respectivamente, seu peso e sua idade: ");
        peso = teclado.nextDouble();
        idade = teclado.nextDouble();
        
        if(idade >= 12){
            if(peso >= 60){
                System.out.println("O paciente deve tomar 40 gotas do medicamento");
            }
            else{
                System.out.println("O paciente deve tomar 35 gotas do medicamento");
            }
        }
        else{
            if(peso >=5 && peso <=9){
                System.out.println("O paciente deve tomar 5 gotas do medicamento");
            }
            else if(peso > 9 && peso <= 16){
                System.out.println("O paciente deve tomar 10 gotas do medicamento");
            }
            else if(peso > 16 && peso <= 24){
                System.out.println("O paciente deve tomar 15 gotas do medicamento");
            }
            else if(peso > 24 && peso <= 30){
                System.out.println("O paciente deve tomar 20 gotas do medicamento");
            }
            else if(peso > 30){
                System.out.println("O paciente deve tomar 30 gotas do medicamento");
            }
        }
    }
    
}
