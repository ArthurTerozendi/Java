/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, String description)
    {  
        this.name = name;
        this.description = description;
    }

    /**
     * @return nome do item
     */ 
    public String getName()
    {
        return name;
    }
    
    /**
     * @return descriçao do item
     */
    public String getDescription()
    {
        return description;
    }
}
