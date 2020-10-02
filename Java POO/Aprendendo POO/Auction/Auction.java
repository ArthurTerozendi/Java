import java.util.Iterator;
import java.util.ArrayList;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<Lot>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description)); //Objeto an™nimo
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Bid for a lot.
     * A message indicating whether the bid is successful or not
     * is printed.
     * @param number The lot number being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void bidFor(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            boolean successful = selectedLot.bidFor(new Bid(bidder, value));
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        if (lotNumber < 1){
             //lotNumber invalido
        } else if (lotNumber < nextLotNumber){
            for (Lot lot: lots) {
                if (lot.getNumber() == lotNumber) { 
                    return lot;
                }
            }
        }
        return null;
    }
    
    /**
     * MŽtodo que fecha o leil‹o, mostrando quais lots foram vendidos e quais n‹o foram
     */
    public void close()
    {
        for ( Lot lot: lots) {
            if (lot.getHighestBid() != null){
                System.out.println(lot.getNumber() + " " + lot.getDescription() + ": "
                + lot.getHighestBid().getValue() + " - " + 
                lot.getHighestBid().getBidder().getName() 
                + " Sold ");
            } else {
                System.out.println(lot.getNumber() + " " + lot.getDescription() + ": "
                + lot.getHighestBid() + " - " + " Unsold ");
            }
        }
    }
    
    /**
     * MŽtodo que adiciona os lots n‹o vendidos a uma ArrayList
     */
    public ArrayList<Lot> getUnsold()
    {   
        ArrayList<Lot> lotUnsold = new ArrayList<>();
        for (Lot lot: lots) {
            if(lot.getHighestBid() == null){
                lotUnsold.add(lot);
            }
        }
        return lotUnsold;
    }
    
    /**
     * Remove o lote com o nœmero de lote dado.
     * @param number O nœmero do lote  ser removido.
     * @return O lote com o nœmero dado ou null se n‹o houver esse lote
     */
    public Lot removeLot(int number)
    {
        Iterator<Lot> lotIt = lots.iterator();
        while (lotIt.hasNext()) {
            Lot lotRemove = lotIt.next();
            if(number == lotRemove.getNumber()){
                lotIt.remove();
                return lotRemove;
            }
        }
        return null;
    }

}
