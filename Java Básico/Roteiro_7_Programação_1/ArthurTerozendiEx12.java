import java.util.Scanner;

public class ArthurTerozendiEx12 {
    static Thread temp =  new Thread();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int aux = 0, op;
        int estoque[][] = new int[50][3];
        String nome[] = new String [50];
        temp.start();
        synchronized (temp) {
            do {
                System.out.println("----------------------------");
                System.out.println("    1. Cadastrar planta");
                System.out.println("    2. Retirar planta");
                System.out.println("    3. Inserir planta");
                System.out.println("    4. Impremir relatorio");
                System.out.println("    5. Sair");
                System.out.println("----------------------------");
                System.out.println("\nO que deseja fazer? ");
                op = in.nextInt();
                if (op == 1) {
                    aux = cadastrarPlanta(estoque, nome, aux);
                } else if (op == 2) {
                    retirarPlanta(estoque);
                } else if (op == 3) {
                    inserirPlanta(estoque);
                } else if (op == 4) {
                    imprimirRelatorio(estoque, nome);
                } else if (op > 5 && op < 1) {
                    System.out.println("Error!");
                }
                temp.wait(1000);
            } while (op != 5);
        }
    }
    public static int cadastrarPlanta(int estoque[][], String nome[], int aux){
        if (aux < 50) {
            in.nextLine();
            System.out.print("Digite o nome da planta: ");
            nome[aux] = in.nextLine();
            System.out.print("Digite o código da planta: ");
            estoque[aux][0] = in.nextInt();
            System.out.print("Digite a quantidade em estoque: ");
            estoque[aux][1] = in.nextInt();
            System.out.print("Digite a quantidade ideal de estoque: ");
            estoque[aux][2] = in.nextInt();
            aux++;
        }
        else{
            System.out.println("Error! Já tem 50 plantas cadastradas");
        }
        return aux;
    }
    public static void retirarPlanta(int estoque[][]){
        int quant, cod, pos = 0;
        boolean achou = false;
        System.out.print("Digite o codigo da planta que deseja retirar: ");
        cod = in.nextInt();
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i][0] ==  cod) {
                pos = i;
                achou = true;
                break;
            }
        }
        if (achou == false) {
            System.out.println("Código inexistetente!");
        }
        else{
            System.out.println("Quantidade em estoque: " + estoque[pos][1]);
            System.out.print("Digite a quantidade que deseja retirar: ");
            quant = in.nextInt();
            if (quant > estoque[pos][1]) {
                System.out.println("Quantidade em estoque insuficiente");
                retirarPlanta(estoque);
            }
            else{
                estoque[pos][1] -= quant;
            }
        }
    }
    public static void inserirPlanta(int estoque[][]){
        int quant, cod, pos = 0;
        boolean achou = false;
        System.out.print("Digite o código da planta que deseja inserir: ");
        cod = in.nextInt();
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i][0] == cod) {
                pos = i;
                achou = true;
                break;
            }
        }
        if (achou == false) {
            System.out.println("Código inexistente");
        }
        else{
            System.out.println("Estoque Ideal: " + estoque[pos][2]);
            System.out.print("Digite a quantidade que deseja inserir: ");
            quant = in.nextInt();
            if (quant <= (estoque[pos][2] - estoque[pos][1])) {
                estoque[pos][1] += quant;
                System.out.println("Quantidade em estoque aumentada");
            }
            else{
                System.out.println("Error! quantidade extrapolára a quantidade ideal de estoque");
                inserirPlanta(estoque);
            }
        }
    }
    public static void imprimirRelatorio(int estoque[][], String nome[]){
        for (int i = 0; i < estoque.length; i++) {
            System.out.println("Nome: " +  nome[i]);
            System.out.println("Codigo: " + estoque[i][0]);
            System.out.println("Quantidade em estoque: " +  estoque[i][1]);
            System.out.println("Quantidade ideal: " + estoque[i][2]);
        }
    }

}
