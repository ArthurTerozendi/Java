import java.sql.SQLOutput;
import java.util.Scanner;

public class cifraCesar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String alf[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                        "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String alfCrip[] =  new String[26];
        int chave = 0, aux = 0, op;
        String legivel, ilegivel;
        System.out.println(" 1 - Criptografar");
        System.out.println(" 2 - Descriptografar");

        System.out.println("Digite qual é a operação: ");
        op = in.nextInt();

        if (op == 1) {
            System.out.print("Digite o texto que deseja criptografar: ");
            legivel = in.nextLine();
            System.out.print("Digite a chave: ");
            chave = in.nextInt();

            for (int i = 0; i < alf.length; i++) {
                if ((i + chave) < 26) {
                    aux = i + chave;
                    alfCrip[i] = alf[aux];
                } else {
                    aux = (chave + i) - 26;
                    alfCrip[i] = alf[aux];
                }
            }
            String separada[] = legivel.split("");
            for (int i = 0; i < legivel.length(); i++) {
                for (int j = 0; j < alf.length; j++) {
                    if (separada[i].equalsIgnoreCase(alf[j])) {
                        aux = j;
                        break;
                    }
                }
                if (separada[i].equalsIgnoreCase(" ")) {
                    separada[i] = " ";
                } else {
                    separada[i] = alfCrip[aux];
                }
            }
            for (String valor : separada) {
                System.out.print(valor);
            }
        }
        else if (op == 2){
            in.nextLine();
            System.out.println("Digite o texto que deseja descriptografar: ");
            ilegivel = in.nextLine();
            System.out.println("Digite a chave: ");
            chave = in.nextInt();

            for (int i = 0; i < alf.length; i++) {
                if ((i + chave) < 26) {
                    aux = i + chave;
                    alfCrip[i] = alf[aux];
                } else {
                    aux = (chave + i) - 26;
                    alfCrip[i] = alf[aux];
                }
            }
            String descrip[] = ilegivel.split("");
            for (int i = 0; i < ilegivel.length(); i++) {
                for (int j = 0; j < alf.length; j++) {
                    if (descrip[i].equalsIgnoreCase(alfCrip[j])) {
                        aux = j;
                        break;
                    }
                }
                if (descrip[i].equalsIgnoreCase(" ")) {
                    descrip[i] = " ";
                } else {
                    descrip[i] = alf[aux];
                }
            }
            for (String valor : descrip) {
                System.out.print(valor);
            }
        }
    }
}
