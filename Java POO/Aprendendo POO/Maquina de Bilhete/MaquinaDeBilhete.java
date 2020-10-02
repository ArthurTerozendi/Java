
/**
 * Escreva a descrição da classe MaquinaDeBilhete aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MaquinaDeBilhete
{
    // The price of a ticket from this machine.
    private int price;
    private int price2;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public MaquinaDeBilhete(int ticketCost, int ticketCost2)
    {
        price = ticketCost;
        price2 = ticketCost2;
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     * 1 - Ticket 1
     * 2 - Ticket 2
     */
    public int getPrice(int op)
    {
        if(op == 1){
            return price;
        }
        else if(op == 2){
            return price2;
        }
        else{
            System.out.println("Error! Opção de ticket invalidade!");
            return 0;
        }
    }
    
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    /**
     * Receive an amount of money in cents from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     * 
     * 1 - Imprimir ticket 1
     * 2 - Imprimeir ticket 2
     */
    public void printTicket(int op)
    {
        if(op == 1){
            if(balance >= price) {
                // Simulate the printing of a ticket.
                System.out.println("##################");
                System.out.println("# The BlueJ Line");
                System.out.println("# Ticket");
                System.out.println("# " + price + " cents.");
                System.out.println("##################");
                System.out.println();
    
                // Update the total collected with the price.
                total = total + price;
                // Reduce the balance by the prince.
                balance = balance - price;
            }
            else {
                System.out.println("You must insert at least: " +
                                   (price - balance) + " more cents.");
                        
            }
        }
        else if(op == 2){
            if(balance >= price2) {
                // Simulate the printing of a ticket.
                System.out.println("##################");
                System.out.println("# The BlueJ Line");
                System.out.println("# Ticket 2");
                System.out.println("# " + price2 + " cents.");
                System.out.println("##################");
                System.out.println();
    
                // Update the total collected with the price.
                total = total + price2;
                // Reduce the balance by the prince.
                balance = balance - price2;
            }
            else {
                System.out.println("You must insert at least: " +
                                   (price2 - balance) + " more cents.");
                        
            }
        }
        else{
            System.out.println("Error! Opção de ticket inválida!");
        }
    }
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
}
