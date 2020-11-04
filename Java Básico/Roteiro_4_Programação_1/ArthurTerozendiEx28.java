/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex28;

/**
 *
 * @author aluno
 */
public class ArthurTerozendiEx28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double S = 0, j = 1;
        
        for (int i = 1; i <= 51; i++) {
            if(i%2==0){
                S -= 1/Math.pow(j,3);
            }
            else{
                S += 1/Math.pow(j,3);
            }
            j+=2;
        }
        System.out.println("PI = " + Math.cbrt(S * 32));
    }
    
}
