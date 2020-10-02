/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arthurterozendiex16;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class ArthurTerozendiEx16 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        DateFormat formato = DateFormat.getDateInstance(DateFormat.MEDIUM);
        
        String dataEleicao, dataNasc;
        
        System.out.println("Digite o dia, mes e ano da eleição(dd/mm/aaaa): ");
        dataEleicao = teclado.nextLine();
        
        System.out.println("Digite a data de nascimento(dd/mm/aaaa): ");
        dataNasc = teclado.nextLine();
        
        String[] dataE = dataEleicao.split("/");
        String[] dataN = dataNasc.split("/");
       
        int anoE = Integer.parseInt(dataE[2]), mesE = Integer.parseInt(dataE[1]), diaE = Integer.parseInt(dataE[0]);
        int anoN = Integer.parseInt(dataN[2]), mesN = Integer.parseInt(dataN[1]), diaN = Integer.parseInt(dataN[0]);
        
        int diasE = (anoE * 365) + (mesE * 30) + diaE;
        int diasN = (anoN * 365) + (mesN * 30) + diaN;
        
        int idade = (diasE - diasN)/365;
        System.out.println(idade);
        if(idade<16){
            System.out.println("Não pode votar");
        }
        else if(idade>=16 && idade<18 || idade>70){
            System.out.println("Voto facultativo"); 
        }
        else if(idade>=18 && idade<=70){
            System.out.println("Voto obrigatório");
        }
        
    }
    
}
