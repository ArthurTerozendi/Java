import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        boolean idExiste = false;
        for (Product produto: stock){
            if(item.getID() == produto.getID()){
                idExiste = true;
            }
        }
        if (!idExiste) {
            stock.add(item);
        } else {
            System.out.println("Já existe um produto com esse ID");
        }
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        for (Product produto: stock){
            if (id == produto.getID()){
                produto.increaseQuantity(amount);
            }
        }
        System.out.println("ID Inválido!");
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for (Product produto: stock){
            if (id == produto.getID()){
                return produto;
            }
        }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        for (Product produto: stock){
            if (id == produto.getID()){
                return produto.getQuantity();
            }
        }
        System.out.println("ID inválido!");
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        for (Product produto: stock) {
            System.out.println(produto.toString());
        }
    }
    
    /**
     * Printa os detalhes dos produtos com a quantidade no estoque
     * menor do que a quantidade passada por parametro
     * @param amount quantidade no estoque
     */
    public void printDetails(int amount){
        for (Product produto: stock){
            if(produto.getQuantity() < amount){
                System.out.println(produto.toString());
            }
        }
    }
    
    /**
     * Try to find a product in the stock with the given name.
     * @return The identified product, or null if there is none
     *         with a matching name.
     */
    public Product findProduct(String name)
    {
        for (Product produto: stock){
            if (name.equals(produto.getName())){
                return produto;
            }
        }
        return null;
    }
}