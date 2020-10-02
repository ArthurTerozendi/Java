/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String data1, data2;
        DateFormat formato = DateFormat.getDateInstance(DateFormat.MEDIUM);

        System.out.print("Digite a primeira data (dd/mm/aaaa): ");
        data1 = teclado.nextLine();
        System.out.print("Digite a segunda data (dd/mm/aaaa): ");
        data2 = teclado.nextLine();
        
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        d1.setTime(formato.parse(data1));
        d2.setTime(formato.parse(data2));
        
        if(d1.after(d2)){
            System.out.println(formato.format(d1.getTime()));
        }
        else if(d2.after(d1)){
            System.out.println(formato.format(d2.getTime()));
        }
        else{
            System.out.println("Datas são iguais");
        }
    }
    
}
