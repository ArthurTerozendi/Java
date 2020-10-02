import java.util.Stack;
import java.util.Random;
import java.util.ArrayList;
/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Game 
{
    private boolean portaDestrancada;
    private Parser parser;
    private Stack<Room> historico;
    private Player jogador;
    private NPC npc;
    /**
     * Cria o jogo e inicializa o mapa.
     */
    public Game() 
    {   
        portaDestrancada = false;
        parser = new Parser();
        historico = new Stack();
        jogador = new Player();
        npc = new NPC("Sirgio Milindro");
        createRooms();
    }

    public static void main(String[] args) {
        Game jogo = new Game();
        jogo.play();
    }

    /**
     * Cria todas as salas e as suas saidas.
     */
    private void createRooms()
    {
        Room inicio, die, win, chave, money, sala1, sala2, sala3, sala4, sala5, sala6, boss;

        // cria as salas
        inicio =  new Room("Você está em uma sala quase que totalmente vazia, além de você tem uma porta e alguns pedaços de papéis.");

        die = new Room("morto");

        win = new Room("venceu");

        sala1 = new Room("Ao entrar na sala, você avista uma placa no chão escrita:\n\n'Se você colocar uma moeda em uma garrafa e inserir uma rolha no gargalo, como você pode remover a moeda sem tirar a rolha ou quebrar a garrafa?' \n\nEm cada porta tinha algo escrito nela. \nSul: 'Empurrar a rolha para dentro da garrafa e balançar até a moeda sair' \nLeste: 'Por que eu colocaria uma moeda em uma garrafa?' \nOeste: 'Quebrar a garrafa'");

        sala2 = new Room("Quando entra na sala, não vê nenhuma placa, nem nas paredes, nem no chão, ou mesmo no teto, apenas palavras em cada porta. \n\nSul: 'Waze', Leste: 'Mapa'");

        sala3 = new Room("Entra na sala, olha os seus arredores, quando avista uma charada na parede.\n\n'Essa coisa te devora \nPássaros, monstros, arvores e flores\nMastiga o ferro e morde o aço \nReduz em pó as rochas mais resistentes \nMata o rei e destrói as cidades \ne destrói as montanhas mais altas. \nQue coisa é essa?'\n\nNas portas: Leste: 'Tempo', Sul: 'Vash, o Estouro da Boiada', \nOeste: 'A ganância do ser humano que está destruindo a fauna e a flora do planeta para acumular riquezas e oprimir os desfavorecidos.'");

        sala4 =  new Room("Você entra na sala procurando mais um enigma, mas não encontra nenhum, apenas as frases nas portas. \n\nNorte: 'Maionese caseira da semana passada', Sul: 'Nada', Oeste:'Carambola'");

        sala5 =  new Room("Logo ao entrar na sala você avista um papel no chão, nele esta escrito: \n\n'Sempre quando chego trago a tristeza,mas sempre chego na hora certa,\nas vezes venho depois de uma doença,\ne outras,\ndepois de um ato de violência.'\n\nLeste: 'Encomenda dos Correios', Sul: 'Morte'");

        sala6 =  new Room("Ao vasculhar a sala, você não encontra outra daquelas frases, somente as das portas. \nSul: 'Cicada 3301', Leste: 'Livro'");

        chave = new Room("Diferente das outras salas que você entrou essa não tem nenhuma porta além daquela que você acabou de atravessar.");

        money = new Room("Diferente das outras salas que você entrou essa não tem nenhuma porta além daquela que você acabou de atravessar.");

        boss = new Room("Você entra numa sala toda ornamentada no meio da sala tem uma silhueta que parece uma entidade porém ela usa um boné de lado na cabeça e emite sons que soam como 'yeah yeah, glu glu', misturados com 'salsifufu' e 'RÁÁÁÁ'.");

        // inicializa as saidas de cada sala

        inicio.setExit("sul", sala1);

        sala1.setExit("norte", inicio);
        sala1.setExit("leste", sala2);
        sala1.setExit("sul", sala3);
        sala1.setExit("oeste", die);

        sala2.setExit("leste", chave);
        sala2.setExit("sul", die);
        sala2.setExit("oeste", sala1);

        sala3.setExit("norte", sala1);
        sala3.setExit("leste", sala5);
        sala3.setExit("sul", die);
        sala3.setExit("oeste", sala4);

        sala4.setExit("norte", die);
        sala4.setExit("leste", sala3);
        sala4.setExit("sul", sala6);
        sala4.setExit("oeste", money);

        sala5.setExit("leste", die);
        sala5.setExit("sul", boss);
        sala5.setExit("oeste", sala3);

        sala6.setExit("norte", sala4);
        sala6.setExit("leste", boss);
        sala6.setExit("sul", die);

        chave.setExit("oeste", sala2);

        money.setExit("leste", sala4);

        boss.setExit("norte", sala5);
        boss.setExit("leste", die);
        boss.setExit("sul", win);
        boss.setExit("oeste", sala6);

        //inicializa os itens de cada sala
        chave.addItem("chave", "Uma chave velha");

        inicio.addItem("pag1", "Se [...] moeda em uma [...] como você [...] sem tirar [...] garrafa? \nOeste: Quebra a garrafa; Norte: Tira a Rolha; Sul: Empurra a rolha para dentro da garrafa e balança até a moeda sair; Leste: Por que eu colocaria uma moeda em uma garrafa?");

        sala1.addItem("pag2", "Tenho rios sem água,florestas sem árvores, montanhas sem pedrascidades sem casas. \nQuem sou? \nSul: Waze; Norte: Por quê eu me importaria?; Leste: Mapa; Norte: Gandalf, o Cinzento");

        sala3.addItem("pag3", "Sempre [...] mas [...] certa, [...] uma doença, e outras,    [...] ato de violência. Quem sou eu? \nSul: Morte; Norte: Boleto; Leste: Encomenda dos Correios; Oeste: Processo");

        inicio.addItem("pag4", "É mais poderoso que os deuses, mais maligno que os demônios. \nÉ algo que os pobres tem e os ricos precisam. \nSe você comê-lo, você morre. \nO que é isto? \nLeste: Dinheiro; Sul: Nada; Oeste: Carambola; Norte: Maionese Caseira da semana passada.");

        sala1.addItem("pag5", "Essa [...], monstros, arvores e flores [...] aço Reduz em pó [...] o rei [...] é essa? \nLeste: Tempo; Norte: Erosão; Sul: Vash, o Estouro da Boiada; Oeste: A ganância do ser humano que está destruindo a fauna e a flora do planeta para acumular riquezas e oprimir os desfavorecidos.");

        sala3.addItem("pag6", " Nos vire ao avesso \nE abra nossas viceras \nVocê será o mais sábio dos homens \nMas, sem nós, será apenas um idiota.\nQuem somos nós? \nOeste: A sociedade do Anel; Norte: Wikipedia; Sul: Cicada 3301; Leste: Livros");

        money.addItem("dinheiro", "R$1000,00");

        sala3.addItem("mochila", "");

        jogador.nextRoom(inicio);  // começa o jogo pela sala "inicio"
    }

    /**
     *  Método principal do jogo. Fica rodando em um loop até o fim do jogo.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Obrigado por jogar.  Até mais!.");
    }

    /**
     * Imprime o texto de boas vindas para o jogador.
     */
    private void printWelcome()
    {
        System.out.println("\n###### \n#     #  ####  #####  #####   ##\n#     # #    # #    #   #    #  #\n######  #    # #    #   #   #    #\n#       #    # #####    #   ######\n#       #    # #   #    #   #    #\n#        ####  #    #   #   #    #");
        System.out.println("\n#####   ####   ####\n#    # #    # #\n#    # #    #  ####\n#    # #    #      #\n#    # #    # #    #\n#####   ####   ####");
        System.out.println("\n######\n#     # ######  ####  ######  ####  #####  ###### #####    ##   #####   ####   ####\n#     # #      #      #      #      #    # #      #    #  #  #  #    # #    # #\n#     # #####   ####  #####   ####  #    # #####  #    # #    # #    # #    #  ####\n#     # #           # #           # #####  #      #####  ###### #    # #    #      #\n#     # #      #    # #      #    # #      #      #   #  #    # #    # #    # #    #\n######  ######  ####  ######  ####  #      ###### #    # #    # #####   ####   ####");
        wait(1500);
        System.out.println();
        System.out.println();
        System.out.println("Bem vindo à Porta dos Desesperados, neste jogo você vai se aventurar por salas enigmáticas que colocarão tudo que você acredita em xeque.Seu desafio é chegar ao fim do jogo, e, talvez sair. Boa sorte (você vai precisar) e bom jogo.");
        System.out.println("Esta é uma obra de ficção e não representa as opiniões dos autores");
        System.out.println("Digite 'ajuda' se você precisar de uma ajuda.");
        System.out.println();
        printLocationInfo();
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("Eu não entendi o que você quis dizer.");
            return false;
        }

        String commandWord = command.getCommandWord().toLowerCase();
        if (commandWord.equals("ajuda"))
            printHelp();
        else if (commandWord.equals("ir"))
            goRoom(command);
        else if (commandWord.equals("sair"))
            wantToQuit = quit(command);
        else if (commandWord.equals("olhar"))
            look();
        else if (commandWord.equals("voltar"))
            goBack(command);
        else if (commandWord.equals("pegar"))
            take(command);
        else if (commandWord.equals("inventario"))
            lookInventory();
        else if (commandWord.equals("ler"))
            read(command);
        else if (commandWord.equals("soltar"))
            drop(command);
        else if (commandWord.equals("usar"))
            use(command);
        else if (commandWord.equals("convencer"))
            portaDestrancada = npc.interagir(commandWord);
        else if (commandWord.equals("subornar")) {
            if(jogador.hasItem("dinheiro")) {
                portaDestrancada = npc.interagir(commandWord);

            } else {
                System.out.println("Vocẽ não possui dinheiro para isso.");
            }
        }

        if (jogador.getCurrentRoom().getDescription().equals("venceu")){
            wantToQuit = venceu();
        } else if (jogador.getCurrentRoom().getDescription().equals("morto")) {
            wantToQuit = perdeu();
        } 

        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("Seu objetivo é sair desse labirinto.");
        System.out.println("\nDicas: ");
        System.out.println("    - Para passar na maioria das salas é só ir para sala com a resposta correta.");
        System.out.println("    - Salas podem ou não tem mais de uma resposta correta");
        System.out.println("    - Cuidado com as portas, elas podem ser mortais.");
        System.out.println();
        System.out.println("Os comandos válidos são:");
        System.out.println(parser.getAllCommands());
    }

    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Ir onde?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        nextRoom = jogador.getCurrentRoom().getExit(direction);
        if (nextRoom == null) {
            System.out.println("Não existe uma saída ai!");
        }
        else {
            if (jogador.getCurrentRoom().getDescription().equals("Você entra numa sala toda ornamentada no meio da sala tem uma silhueta que parece uma entidade porém ela usa um boné de lado na cabeça e emite sons que soam como 'yeah yeah, glu glu', misturados com 'salsifufu' e 'RÁÁÁÁ'.")) {
                if(command.getSecondWord().equals("sul")){
                    if (portaDestrancada){
                        historico.push(jogador.getCurrentRoom());
                        jogador.nextRoom(nextRoom);
                    }  else {
                        System.out.println("Essa porta esta trancada!");
                    }
                } else {
                    historico.push(jogador.getCurrentRoom());
                    jogador.nextRoom(nextRoom);
                    if (jogador.getCurrentRoom().getDescription().equals("venceu")
                    || jogador.getCurrentRoom().getDescription().equals("morto")){
                    } else {
                        printLocationInfo();
                    }
                }
            } else {
                historico.push(jogador.getCurrentRoom());
                jogador.nextRoom(nextRoom);
                if (jogador.getCurrentRoom().getDescription().equals("venceu")
                || jogador.getCurrentRoom().getDescription().equals("morto")){
                } else {
                    printLocationInfo();
                }
            }
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("O que você quis dizer?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }

    /**
     * "look" dá uma descrição de como está a situação ao redor do jogador.
     */
    private void look()
    {
        if(jogador.getCurrentRoom().getDescription().equals("Você entra numa sala toda ornamentada no meio da sala tem uma silhueta que parece uma entidade porém ela usa um boné de lado na cabeça e emite sons que soam como 'yeah yeah, glu glu', misturados com 'salsifufu' e 'RÁÁÁÁ'.")) {
            System.out.println(npc.getName() + ": \n    - \n #     #                         #     #\n  #   #  ######   ##   #    #     #   #  ######   ##   #    #\n   # #   #       #  #  #    #      # #   #       #  #  #    #\n    #    #####  #    # ######       #    #####  #    # ######\n    #    #      ###### #    #       #    #      ###### #    #\n    #    #      #    # #    #       #    #      #    # #    #\n    #    ###### #    # #    #       #    ###### #    # #    #");
        } else {
            System.out.println(jogador.getCurrentRoom().getLongDescription());
        }
    }

    /**
     * "back" faz com que o jogador retorne à ultima sala em que esteve.
     */
    private void goBack(Command command)
    {
        if (command.hasSecondWord()) {
            System.out.println("Voltar o que?");
        } else {
            if(!historico.empty()){
                jogador.nextRoom(historico.pop());
                printLocationInfo();
            } else {
                System.out.println("Não é possível voltar mais do que isso.");
            }
        }
    }

    /**
     * "take" + "nome do objeto" faz com que o jogador pegue esse item e o coloque na mochila.
     */
    private void take(Command command)
    {
        if (!command.hasSecondWord()) {
            System.out.println("Pegar o que?");
        } else {
            if (jogador.getCurrentRoom().hasItem(command.getSecondWord())) {
                if (command.getSecondWord().equals("mochila")) {
                    jogador.aumentarQuantidadeMaxItens();
                    System.out.println("Você colocou a mochila nas costas, e com isso aumentou a quantidade de itens que você pode carregar.");
                    jogador.getCurrentRoom().deleteItem("mochila");
                } else {
                    jogador.keepItem(command.getSecondWord(),jogador.getCurrentRoom().takeItem  (command.getSecondWord()));
                }
            } else {
                System.out.println("Não existe esse item nesta sala");
            }
            lookInventory();
        }
    }

    /**
     * "inventory" mostra todos os itens que estão na mochila do jogador.  
     */
    private void lookInventory()
    {
        System.out.println(jogador.lookBackpack() + jogador.getQuantidadeItens() + "/" + jogador.getQuantidadeMaxItens());
    }

    /**
     * @return true
     * Falando que o jogador venceu e assim encerrando o jogo.
     */
    private boolean venceu()
    {
        System.out.println("Você venceu!");
        wait(5000);
        return true;
    }

    /**
     * @return true
     * Falando como o jogador morreu e assim encerrando o jogo.
     */
    private boolean perdeu()
    {
        System.out.println(maneirasDeMorrer());
        wait(5000);
        return true;
    }

    /**
     * Uma ArrayList de maneiras de como o jogador pode morrer.
     * @param indice um numéro inteiro que corresponde a um item da lista.
     * @return um String descrevendo como o jogador morreu.
     */
    private String maneirasDeMorrer()
    {

        Random rng = new Random();
        ArrayList<String> mortes = new ArrayList();

        mortes.add("Você abriu a porta e avistou um botão, em cima dele tinha uma placa escrito (Não aperte). Você apertou, e foi explodido. VOCÊ MORREU!");
        mortes.add("Ao entrar na sala você percebe que ela está escura, ao proucurar uma fonte de luz, você tropeça e cai em um buraco cheio de espinhos.VOCÊ MORREU!");
        mortes.add("Você não sabe o que aconteceu, afinal VOCÊ MORREU!");
        mortes.add("Você abre a porta e ve um sanduiche de uma rede de fast-food que não patrocinou o jogo, você não consegue perceber se ele está estragado ou não mas come o sanduiche mesmo assim, afinal, o que não mata engorda.Desta vez não, VOCÊ MORREU!");
        mortes.add("Você percebe um vulto e vê muito sangue escorrendo, é o seu sangue. Poisé amigão, VOCÊ MORREU!");

        return mortes.get(rng.nextInt(mortes.size()));
    }

    /**
     * "read" + "nome do item" lê a descrição do item.
     */
    private void read(Command command)
    {
        if(!command.hasSecondWord()){
            System.out.println("Qual página?");
        } else {
            if (jogador.hasItem(command.getSecondWord())) {
                System.out.println(jogador.getItemDescription(command.getSecondWord()));
            } else {
                System.out.println("Página não encontrada");
            }

        }
    }

    private void drop(Command command)
    {
        if (!command.hasSecondWord()) {
            System.out.println("Jogar fora o que??");
        } else {
            if (jogador.hasItem(command.getSecondWord())) {
                jogador.getCurrentRoom().addItem(command.getSecondWord(), jogador.dropItem(command.getSecondWord()));
            } else {
                System.out.println("Item não encontrado");
            }
        }
    }

    private void use(Command command)
    {
        if (!command.hasSecondWord()) {
            System.out.println("Usar o que?");
        } else {
            if (jogador.hasItem(command.getSecondWord())) {
                if (command.getSecondWord().equals("chave")) {
                    if (jogador.getCurrentRoom().getDescription().equals("Você entra numa sala toda ornamentada no meio da sala tem uma silhueta que parece uma entidade porém ela usa um boné de lado na cabeça e emite sons que soam como 'yeah yeah, glu glu', misturados com 'salsifufu' e 'RÁÁÁÁ'.")) {
                        System.out.println("Você destrancou a porta");
                        portaDestrancada = true;
                    } else {
                        System.out.println("Não é possível usar o item nessa sala!");
                    }
                } else {
                    System.out.println("Você não pode usar este item");
                }
            } else {
                System.out.println("Esse item não foi encontrado no seu inventario");
            }
        }
    }

    private void wait(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        } 
        catch (InterruptedException e)
        {
            // ignoring exception at the moment
        }
    }

    /**
     * Imprime as informaçãoes da localização onde o jogador se encontra.
     */
    private void printLocationInfo()
    {
        System.out.println(jogador.getCurrentRoom().getLongDescription());
    }
}
