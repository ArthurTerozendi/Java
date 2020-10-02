/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagemdosistema;

import java.util.Locale;

/**
 *
 * @author Arthur
 */
public class LinguagemDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale lingua = Locale.getDefault();
        System.out.println(lingua.getDisplayLanguage());
    }
    
}
