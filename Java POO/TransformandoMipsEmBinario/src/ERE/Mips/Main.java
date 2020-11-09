package ERE.Mips;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        String registradores = "";
        String linha = in.nextLine();
        String comando[] = linha.split(" ");
        for (int i = 1; i < comando.length; i++) {
            registradores += comando[i];
        }
        String registrador[] = registradores.split(",");
        System.out.println(comando[0]);
        for (int i = 0; i < registrador.length; i++) {
            System.out.println(registrador[i]);
        }
    }
}
