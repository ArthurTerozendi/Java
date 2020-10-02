import java.util.ArrayList;
import java.util.Iterator;
/**
* Store details of club memberships.
* 
* @author Arthur Terozendi  
* @version 06/09/2019
*/
public class Club
{
    private ArrayList<Membership> member;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        member = new ArrayList<>();
        
    }
    
    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        this.member.add(member);
    }
    
    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return member.size();
    }
    
    /**
     * Determina o número de membros que se associaram ao mês dado.
     * @param month  O mês em que estamos interessados.
     * @return O número de memebros que se associaram no mês.
     */
    public int joinedInMonth(int month)
    {
        if ((month < 1) || (month > 12)){
            System.out.println("Mês Invalido!");
            return 0;
        }else{
            int membersMonth = 0;
            for (Membership members: member) {
                if (month == members.getMonth()){
                    membersMonth++;
                }
            }
            return membersMonth;
        }
    }
    
    /**
     * Remove da coleção club todos os membros que
     * se associaram no mês dado e retorna-os armazenados
     * em um objeto coleção separado.
     * @param month O mês de associação.
     * @param year O ano da associação.
     * @return Os membros que se associaram no mês e ano especficados.
     */
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> memberRemoved = new ArrayList<>();
        if ((month < 1)||(month > 12)) {
            System.out.println("Mês Invalido");
            return null;
        } else {
            Iterator<Membership> memberIt = member.iterator();
            while (memberIt.hasNext()) {
                Membership memberRemove = memberIt.next();
                if ((memberRemove.getYear() == year) 
                && (memberRemove.getMonth() == month)) {
                    memberRemoved.add(memberRemove);
                    memberIt.remove();
                }
            }
            return memberRemoved;
        }
    }
}

