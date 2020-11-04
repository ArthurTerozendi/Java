/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex26;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a = 0, b = 400000, t = 0;
        
        while (a < b){
            a += 30;
            b -= 40;
            t +=1;
        }
        t = t/60;
        System.out.println("São necessarios " + t + " minutos para os trens cruzarem");
        System.out.println("A percorre " + a + "m e B percorre " + (400000-b) + "m ");
    }
    
}
