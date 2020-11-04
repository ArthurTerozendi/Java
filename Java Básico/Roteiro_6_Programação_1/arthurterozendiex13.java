import java.util.Scanner;

public class arthurterozendiex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, apelido;
        System.out.println("Digite seu nome: ");
        nome = in.nextLine();
        System.out.println("Digite seu apelido: ");
        apelido = in.nextLine();

        System.out.println("O nome tem " + nome.length() + " caracters");
        System.out.println(nome.concat(apelido));
        if (nome.equalsIgnoreCase(apelido)) {
            System.out.println("São iguais");
        }
        else {
            System.out.println("São diferentes");
        }
    }
}
