
import java.util.Scanner;

public class arthurterozendiex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int onibus[][] = new int[12][4], m, n;
        String op;
        for (int i = 0; i < onibus.length; i++) {
            for (int j = 0; j < onibus[i].length; j++) {
                onibus[i][j] = 0;
            }
        }
        do {
            System.out.println("==================================");
            System.out.println("        MARIAS UNIDAS");
            System.out.println("==================================");
            System.out.println("    a. Vender passagem");
            System.out.println("    b. Mostrar mapa de ocupação");
            System.out.println("    c. Encerrar");
            System.out.println("==================================");
            System.out.println("\nO que deseja fazer?");
            op = in.nextLine();
            if (op.equalsIgnoreCase("a")) {
                System.out.println("Qual lugar gostaria de comprar?(Posição da poltrona)");
                n = in.nextInt();
                m = in.nextInt();
                if (onibus[n][m] == 0){
                    System.out.println("Obrigado pela compra!");
                    onibus[n][m] = 1;
                }
                else{
                    System.out.println("Poltrona ocupada!");
                }
            }
            else if(op.equalsIgnoreCase("b")) {
                for (int i = 0; i < onibus.length; i++) {
                    for (int j = 0; j < onibus[i].length; j++) {
                        if (j == 2){
                            System.out.print(" ");
                        }
                        System.out.print(onibus[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("ERROR! Operação desconhecida!");
            }
            in.nextLine();
        } while (!op.equalsIgnoreCase("c"));
    }
}
