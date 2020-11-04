/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex19;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String hexa = "";
        int bin, dec = 0, dec2, dec1, oct = 0, i = 0, j = 0, hex;
        boolean aux = false;
        System.out.print("Digite um número binário: ");
        bin = teclado.nextInt();
        
       while (bin > 0){
            if(bin%10 == 1 || bin%10 == 0){
                dec += (bin%10) * Math.pow(2,i);
                bin /= 10;
                aux = true;
                i++;
            }
            else{
                aux = false;
                break;
            }
        }
        if(aux == true){
            dec1 = dec;
            dec2 = dec;
            while (dec1 > 0){
                oct +=  (dec1%8) * Math.pow(10, j);
                dec1 /= 8;
                j++;
            }
        
            while (dec2 > 0) {
                if (dec2%16 == 15){
                    hexa = "F" + hexa;
                }
                else if (dec2%16 == 14){
                    hexa = "E" + hexa;
                }
                else if (dec2%16 == 13){
                    hexa = "D" + hexa;
                }
                else if (dec2%16 == 12){
                    hexa = "C" + hexa;
                }
                else if (dec2%16 == 11){
                    hexa = "B" + hexa;
                }
                else if (dec2%16 == 10){
                    hexa = "A" + hexa;
                }
                else{
                    hex = dec2%16;
                    hexa = hex + hexa;
                }
                dec2 /= 16;
            }
            
            System.out.println("Decimal: " + dec);
            System.out.println("Octal: " + oct);
            System.out.println("Hexadecimal: " + hexa);
        }
        else{
            System.out.println("Não é um número binário");
        }
    }
    
}
