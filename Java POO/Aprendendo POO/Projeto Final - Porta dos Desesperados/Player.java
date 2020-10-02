import java.util.HashMap;
/**
 * Escreva a descrição da classe Player aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Player
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Room currentRoom;
    private HashMap<String, Item> mochila;
    private int quantidadeDeItens;
    private int quantidadeMaxItens;

    /**
     * COnstrutor para objetos da classe Player
     */
    public Player()
    {
        mochila = new HashMap();
        currentRoom = null;
        quantidadeDeItens = 0;
        quantidadeMaxItens = 3;
        
    }

    /**
     * @return a localização atual do jogador. 
     */
    public Room getCurrentRoom()
    {
        return currentRoom;
    }

    /**
     * Movimenta o jogador para a uma outra sala.
     * @param nextRoom qual é a proxima sala.
     */
    public void nextRoom(Room nextRoom)
    {
        currentRoom = nextRoom;
    }
    
    /**
     * Guarda o item pega na sala e guarda na mochila
     * @param nome nome do item
     * @param item o item a ser guardado
     */
    public void keepItem(String nome, Item item)
    {
        if (quantidadeDeItens < quantidadeMaxItens) {
            mochila.put(nome, item);
            quantidadeDeItens++;
        } else {
            System.out.println("Você ja ta carregando a quantidade maxima de itens possivel");
        }
    }
    
    public Item dropItem(String nome)
    {
        if (quantidadeDeItens == 0) {
            System.out.println("Você não tem items para jogar fora!");
        } else {
            Item drop = mochila.get(nome);
            mochila.remove(nome);
            return drop;
        }
        return null;
    }
    
    /**
     * Pega um item da mochila
     * @param nome o nome do item que deseja pegar
     * @return o item
     */
    public Item getItem(String nome)
    {
        Item item = mochila.get(nome);
        mochila.remove(nome);
        return item;
    }
    
    /**
     * Fala qual são os itens dentro da mochila
     * @return o nome dos itens que estão dentro da mochila 
     */
    public String lookBackpack()
    {
        String itens = "Itens no inventario: ";
        for(String items : mochila.keySet()){
             itens += items + " ";
        }   
        return itens;
    }
    
    /**
     * @param nome nome do item
     * @return a descrição do item
     */
    public String getItemDescription(String nome)
    {
        return mochila.get(nome).getDescription();
    }

    public boolean hasItem(String nome)
    {   
        if (mochila.get(nome) != null){
            return true;
        }
        return false;
    }

    public int getQuantidadeItens()
    {
        return quantidadeDeItens;
    }

    public int getQuantidadeMaxItens()
    {
        return quantidadeMaxItens;
    }

    public void aumentarQuantidadeMaxItens()
    {
        quantidadeMaxItens = 100;
    }
    
    public void deleteItem(String nome){
        mochila.remove(nome);
    }
}
