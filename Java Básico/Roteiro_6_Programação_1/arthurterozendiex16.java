import java.util.Scanner;

public class arthurterozendiex16 {

    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        int estoque[][] = new int [50][3], op, quant = 0, cod, x = 0, y = 0, aux;
        String nome[] = new String[50];

        do{
            System.out.println("==================================");
            System.out.println("     Floricultura Mariasflor ");
            System.out.println("==================================");
            System.out.println("    1. Cadastrar nova planta");
            System.out.println("    2. Retirar planta");
            System.out.println("    3. Inserir planta");
            System.out.println("    4. Imprimir relatório");
            System.out.println("    5. Sair");
            System.out.println("==================================");

            System.out.print("\nO que deseja fazer?");
            op = in.nextInt();

            if (op == 1) {
                if (quant >= 50) {
                    System.out.println("Não é possivel cadastrar a planta! Limite maximo alcançado");
                }
                else {
                    in.nextLine();
                    System.out.print("Digite o nome da planta: ");
                    nome[quant] = in.nextLine();
                    System.out.print("Digite o código da planta: ");
                    estoque[quant][0] = in.nextInt();
                    System.out.print("Digite o tamanho do estoque ideal: ");
                    estoque[quant][1] = in.nextInt();
                    System.out.print("Digite a quantidade em estoque: ");
                    estoque[quant][2] = in.nextInt();
                }
            }
            else if (op == 2) {
                System.out.println("Digite o código da planta que você deseja retirar: ");
                cod = in.nextInt();
                for (int i = 0; i < estoque.length; i++) {
                    for (int j = 0; j < estoque[i].length; j++) {
                        if (estoque[i][j] ==  cod) {
                            x = i;
                            y = j + 2;
                        }
                    }
                }
                if (estoque[x][y] > 0) {
                    System.out.println("Existem " + estoque[x][y] + " dessa planta no estoque.");
                    System.out.println("Digite quantas você deseja retirar: ");
                    aux = in.nextInt();
                    estoque[x][y] -= aux;
                }
                else {
                    System.out.println("Não tem dessa planta em estoque!");
                }
            }
            else if (op == 3) {
                System.out.println("Qual o cógigo da planta que deseja inserir: ");
                cod = in.nextInt();
                for (int i = 0; i < estoque.length; i++) {
                    for (int j = 0; j < estoque[i].length; j++) {
                        if (estoque[i][j] ==  cod) {
                            x = i;
                            y = j + 2;
                        }
                    }
                }
                System.out.println("Existem " + estoque[x][y] + " dessa planta no estoque.");
                System.out.println("Digite quantas você deseja inserir: ");
                aux = in.nextInt();
                estoque[x][y] += aux;
            }
            else if (op == 4) {
                for (int i = 0; i < estoque.length; i++) {
                    System.out.println("Nome: " + nome[i] + " ");
                    System.out.println("Código: " + estoque[i][0] + " ");
                    System.out.println("Estoque atual: " + estoque[i][2]);
                    if (estoque[i][2] < estoque[i][1]) {
                        System.out.println("Quantidade a ser comprada: " + (estoque[i][1] - estoque[i][2]));
                    }
                    System.out.println("");
                }
            }
            else if (op == 5){
                break;
            }
            else{
                System.out.println("Operação desconhecida!!");
            }
        }while (op != 5);
    }
}
