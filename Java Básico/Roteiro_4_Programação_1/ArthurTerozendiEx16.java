/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex16;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num, primo[] = {2,3,5,7,11,13,17};
        boolean aux = false;
        
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        
        for (int i = 0; i < 7; i++) {  
            if(num%primo[i]!=0){
               aux = true;
            }
            else if(num == primo[i]){
                aux = true;
                break;
            }
            else{
                aux = false;
                break;
            }
        }
        if(aux == true){
            System.out.println(num + " é um número primo");
        }
        else{
            System.out.println(num + " não é um número primo");
        }
    }
    
}
