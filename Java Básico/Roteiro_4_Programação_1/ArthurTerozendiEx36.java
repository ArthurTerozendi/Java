/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex36;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float despesa = 200, lucro; 
        int ingreco = 120;
        System.out.println("   Ingreços   |   Lucro   ");
        for (float i = 5; i >= 1; i-= 0.5f) {
            lucro = (ingreco * i) - despesa;
            System.out.println("   " + ingreco + "        |   R$" + lucro);
            ingreco += 26;
        }
    }
    
}
