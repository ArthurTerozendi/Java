import java.util.HashMap;
import java.util.ArrayList;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> saidas;
    private HashMap<String, Item> items;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        items = new HashMap();
        saidas = new HashMap();
    }

    /**
     * Define uma saída dessa sala.
     * @param direction  A direção da saída.
     * @param vizinha  O objeto Room na direção especificada.
     */
    public void setExit(String direction, Room vizinha){
        saidas.put(direction, vizinha);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * retorna uma descrição mais detalhada da sala.
     */
    public String getLongDescription()
    {
        String longDescription = "\n" + getDescription() + "\n"
                               + getAllItens() + "\n"
                               + getExitString();
        return longDescription;
    }
    
    /**
     * @return para qual objeto Room aquela direção leva.
     * @param descrição da direção (Ex.: "north", "up", "NE").
     */
    public Room getExit(String description)
    {
        return saidas.get(description);
    }

    /**
     * Retorna uma descrição das saídas da sala,
     * por exemplo, "Exits: north west"
     * @return  Uma descrição das saídas disponíveis.
     */
    public String getExitString()
    {
        String saida = "Saidas: ";
        for(String exits : saidas.keySet()){
            saida += exits + " ";
        }   
        return saida;
    }
    
    /**
     * adiciona um objeto Item a um coleção de objetos.
     * @param nome do objeto e a sua descrição
     */
    public void addItem(String nome, String descricao)
    {
        Item item = new Item(nome, descricao);
        
        items.put(nome, item);
    }

    public void addItem(String nome, Item item)
    {
        items.put(nome, item);
    }
    
    /**
     * @return todos os itens presentes na sala;
     */
    public String getAllItens()
    {
        String itens = "Items: ";
        for(String item : items.keySet()){
             itens += item + " ";
        }
        return itens;
    }
    
    /**
     * pega um item que está na sala
     * @param nome do item.
     * @return o item.
     */
    public Item takeItem(String nome)
    {
        Item item = items.get(nome);
        items.remove(nome);
        return item;
    }

    public boolean hasItem(String nome)
    {   
        if (items.get(nome) != null){
            return true;
        }
        return false;
    }

    public void deleteItem(String nome){
        items.remove(nome);
    }
}
