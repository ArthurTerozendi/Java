/**
 * Write a description of class GeradorDeNomes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GeradorDeNomes
{
    
    /**
     * Constructor for objects of class GeradorDeNomes
     */
    public GeradorDeNomes()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String gerarNomesStarWars(String nome, String sobrenome,
                                     String sobrenomeMae, 
                                     String cidade)
    {
        String primeiroNomeStarWars;
        String sobrenomeStarWars;
        String nomeStarWars;
        
        primeiroNomeStarWars = sobrenome.substring(0, 3).toLowerCase() + 
                               nome.substring(0, 2).toLowerCase();
        sobrenomeStarWars = sobrenomeMae.substring(0, 2).toLowerCase() +
                            cidade.substring(0, 3).toLowerCase();
        nomeStarWars = primeiroNomeStarWars + " " + sobrenomeStarWars;
        return nomeStarWars;
    }
}
