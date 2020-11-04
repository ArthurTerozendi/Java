/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex20;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String nomes[] = new String [50];
        int numConta[] = new int [50], op = 0, quant = 0, conta, posicao = 0;
        double saldoConta[] = new double [50], valor;
        boolean contaIgual = false, acharConta = false;
        
        Arrays.fill(saldoConta, 0);
        Arrays.fill(numConta, 0);
        Arrays.fill(nomes, " ");
        
        System.out.println("Menu de Operações");
        System.out.println("------------------------------------");
        System.out.println("    1 - Cadastrar");
        System.out.println("    2 - Efetuar depósito");
        System.out.println("    3 - Efetuar saque");
        System.out.println("    4 - Consultar saldo da conta");
        System.out.println("    5 - Finalizar o programa");
        System.out.println("------------------------------------");
        
        do {
            System.out.print("\nO que deseja fazer? ");
            op = in.nextInt();
            if(op == 1){
                if(quant < 50){
                    System.out.print("Digite o número da conta: ");
                    numConta[quant] = in.nextInt();
                    do{
                        for (int i = 0; i < numConta.length; i++) {
                            if(quant != i){
                                if (numConta[i] != numConta[quant]){
                                    contaIgual = false;
                                    quant++;
                                    break;
                                }
                                else{
                                    System.out.println("Número da conta ja existente! Por favor digite outro número para sua conta");
                                    contaIgual = true;
                                    break;
                                }
                            }
                        }
                    }while(contaIgual != false);    
                    System.out.print("Digite seu nome: ");
                    nomes[quant] = in.nextLine();
                    in.nextLine();
                }
            }
            else if (op == 2) {
                System.out.print("Digite qual é a seu número de conta: ");
                conta = in.nextInt();
                for (int j = 0; j < numConta.length; j++) {
                    if (conta == numConta[j]) {
                        posicao = j;
                        acharConta = true;
                        break;
                    }
                    else{
                        acharConta = false;
                    }
                }
                if (acharConta == false) {
                    System.out.println("Conta inexistente!");
                }
                else{
                    System.out.print("Quanto deseja depositar: ");
                    valor = in.nextDouble();
                    saldoConta[posicao] += valor;
                }
            }
            else if(op == 3){
                System.out.print("Digite qual é a seu número de conta: ");
                conta = in.nextInt();
                for (int j = 0; j < numConta.length; j++) {
                    if (conta == numConta[j]) {
                        posicao = j;
                        acharConta = true;
                        break;
                    }
                    else{
                        acharConta = false;
                    }
                }
                if (acharConta == false) {
                    System.out.println("Conta inexistente!");
                }
                else{
                    System.out.print("Quanto deseja sacar: ");
                    valor = in.nextDouble();
                    if (saldoConta[posicao] < valor) {
                        System.out.println("Saldo insuficiente");
                    }
                    else{
                        saldoConta[posicao] -= valor;
                    }
                }
            }
            else if(op == 4){
                System.out.print("Digite qual é a seu número de conta: ");
                conta = in.nextInt();
                for (int j = 0; j < numConta.length; j++) {
                    if (conta == numConta[j]) {
                        posicao = j;
                        acharConta = true;
                        break;
                    }
                    else{
                        acharConta = false;
                    }
                }
                if (acharConta == false) {
                    System.out.println("Conta inexistente!");
                }
                else{
                    System.out.println("O saldo da conta " + numConta[posicao] + ": " + saldoConta[posicao]);
                }
            }
            else if (op == 5) {
                break;
            }
            else{
                System.out.println("Operação inexistente!");
            }
        } while (op != 5);
        
    }
    
}
