/* TODO Nom de package. */


/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
/** Le pion Cavalier herite des caracteristique de la classe Pion  */
public class PionCavalier extends Pion
{
    public PionCavalier(Couleur couleur)
    {
        super(couleur);
    }

    /** calcule qui permet au pion Cavalier de se deplacer.
     * Il n'autorisse que le deplacement en "L" du cavalier sans fair attention 
     * aux obstacles   */
    @Override
    public boolean deplacementEstValide(Deplacement deplacement, Pion[][] echiquier)
    {
       int ligneDepart = deplacement.obtenirDepart().ligne();
       int colonneDepart = deplacement.obtenirDepart().colonne();
       int ligneArrivee = deplacement.obtenirArrivee().ligne();
       int colonneArrivee = deplacement.obtenirArrivee().colonne();
       
       if (Math.abs(ligneDepart-ligneArrivee)== 2 && Math.abs(colonneArrivee-colonneDepart) == 1)
           return true;
       if (Math.abs(ligneDepart-ligneArrivee)== 1 && Math.abs(colonneArrivee-colonneDepart) == 2)
           return true;
       return false;
    }

    /** Le pion Cavalier est modeliser avec la lettre "C" sur l'echiquier  */
    @Override
    public String toString()
    {
        return "C ";
    }
}
