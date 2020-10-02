/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descontoproduto;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.O;

/**
 *
 * @author Arthur
 */
public class DescontoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        float precoProduto, desconto, precoDesconto;
        
        System.out.print("Digite o preço do produto: ");
        precoProduto = in.nextFloat();
        System.out.print("Digite o valor do desconto(em %): ");
        desconto = (in.nextFloat())/100;
        
        precoDesconto = precoProduto * (1 - desconto);
        
        System.out.printf("O preço com o desconto é de R$" + "%.2f", precoDesconto);
        System.out.println("");
    }
    
}
