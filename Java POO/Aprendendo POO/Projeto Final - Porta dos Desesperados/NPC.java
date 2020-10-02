import java.util.Random;
/**
 * Write a description of class NPC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NPC
{
    // instance variables - replace the example below with your own
    private String nome;   

    /**
     * Constructor for objects of class NPC
     */
    public NPC(String nome)
    {
        this.nome = nome;
    }

    /**
     * 
     */
    public String getName()
    {
        return nome;
    }
    
    public boolean interagir(String opcao){
        Random rng = new Random(); 
        if (opcao.equals("convencer")){
            if (rng.nextInt(100) == 7 || rng.nextInt(100) == 47) {
                System.out.println("Sua história me comoveu, pode ir! \n Porta destrancada");
                return true;
            } else {
                System.out.println("Existem dois tipos de problemas, os meus e os seus, esses não são meus então arruma outro jeito de sair.");
                return false;
            }
        } else if (opcao.equals("subornar")) {
            if(rng.nextInt(2) == 1) {
                System.out.println(nome + ": \n - Nossa! Uma graificação pelos bons trabalhos prestados! É claro que eu aceito. Pode passar meu consagrado.");
                System.out.println("Porta destranca");
                return true;
            } else {
                System.out.println(nome + ": \n - Ta maluco cara! Ta me oferencendo suborno seu vagabundo! Você não vai sair daqui é nunca.");;
                return false;
            }
        } else {
            System.out.println("opcão de interação inválida!");
            return false;
        }    
    }
}
