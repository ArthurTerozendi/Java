package ERE.ManipuladorArquivo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //Instacia um objeto do tipo file
        File path = new File("cadastros.txt");

        //instanciando as classes de leitura e de escrita
        EscreverArquivo escArq = new EscreverArquivo(path);
        LerArquivo lerArq = new LerArquivo(path);
        /**
         * Aqui eu fiz uma modificação nos momentos finais, então infelizmente não consegui gravar um outro video, perdão
         * A mudança feita não foi muito grande, eu apenas coloquei uma condicional que se não existir o arquivo txt,
         * o proprío código irá gera um. E também concertei o diretorio, agora ele não é mais o diretorio absoluto do meu
         * computador.
         */
        if(!path.exists()){
            path.createNewFile();
        }

        Scanner in = new Scanner(System.in);

        int op;
        String nome, email, curso;

        do {
            System.out.println("|-------------------|");
            System.out.println("|        Menu       |");
            System.out.println("|-------------------|");
            System.out.println("|1 - Cadastrar      |");
            System.out.println("|2 - Listar Alunos  |");
            System.out.println("|3 - Buscar Aluno   |");
            System.out.println("|4 - Remover Aluno  |");
            System.out.println("|5 - Sair           |");
            System.out.println("|-------------------|");

            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1 :
                    System.out.println("Digite, respectivamente, nome, e-mail e o curso");
                    nome = in.nextLine();
                    email = in.nextLine();
                    curso = in.nextLine();
                    escArq.escrever(nome, email, curso);
                    break;
                case 2 :
                    lerArq.listarAlunos();
                    lerArq.esperar(3000);
                    break;
                case 3 :
                    System.out.println("Digite o nome do aluno que deseja procurar: ");
                    nome = in.nextLine();
                    String aluno = lerArq.buscarAluno(nome);
                    if (aluno == null) {
                        System.out.println("Aluno não encontrado");
                    } else{
                        String alunoSplit[] = aluno.split(";");
                        System.out.println("Nome: " + alunoSplit[0]
                                + "\nE-mail: " + alunoSplit[1]
                                + "\nCurso: " + alunoSplit[2] + "\n");
                    }
                    lerArq.esperar(1000);
                    break;
                case 4 :
                    System.out.println("Digite o nome do aluno que deseja remover: ");
                    nome = in.nextLine();
                    escArq.reescreverArquivo(lerArq.removerAluno(nome));
                    break;
                case 5 :
                    break;
                default :
                    System.out.println("Opção invalida");
            }
        } while (op != 5);
    }
}