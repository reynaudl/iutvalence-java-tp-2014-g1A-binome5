/* TODO Nom de package. */


/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
/** Le pion Roi herite des caracteristique de la classe Pion  */
public class PionRoi extends Pion
{
    public PionRoi(Couleur couleur)
    {
        super(couleur);
    }

    /** calcule qui permet au pion Roi de se deplacer.
     * Ce pion heritera des caracteristique du pion Dame mais d'une facon limite   */
    @Override
    public boolean deplacementEstValide(Deplacement deplacement, Pion[][] echiquier)
    {
        return true;
    }
    
    /** Le pion Roi est modeliser avec la lettre "R" sur l'echiquier  */
    @Override
    public String toString()
    {
        return "R ";
    }
}
