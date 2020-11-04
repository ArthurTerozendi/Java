/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex39;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int cpf, v1, v2, digVerificador1, digVerificador2, somatorio=0, somatorio2=0;
        int d[] = {0,0,0,0,0,0,0,0,0};
        
        System.out.print("Digite os 9 primeiros dígitos do cpf (todos juntos): ");
        cpf = teclado.nextInt();
        
        System.out.print("Digite os 2 digitos verificadores (separadamente): ");
        digVerificador1 = teclado.nextInt();
        digVerificador2 = teclado.nextInt();
        
        for(int i=0; i<9; i++){
            d[i] = cpf % 10; 
            cpf /= 10;
        }
        for(int i=0; i<9; i++){
            somatorio += d[i] * (9 - (i % 10)); 
            somatorio2 += d[i] * (9 - ((i+1)%10));
        }
        v1 = (somatorio % 11) % 10;
        v2 = ((somatorio2 + (v1 * 9)) % 11) % 10;
        
        if(v1 == digVerificador1 && v2 == digVerificador2){
            System.out.println("O cpf é válido");
        }
        else{
            System.out.println("O cpf não é válido");
        }
    }
}
