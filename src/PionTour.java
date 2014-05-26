/* TODO Nom de package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
/** Le pion Tour herite des caracteristique de la classe Pion  */
public class PionTour extends Pion
{
    public PionTour(Couleur couleur)
    {
        super(couleur);
    }
    
    /** calcule qui permet au pion Tour de se deplacer en ligne droite tout en 
     * fessant attention a la presence d'opstacle. */
    public boolean deplacementEstValide(Deplacement deplacement, Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        
        int diffLigne = Math.abs(ligneDepart-ligneArrivee);
        int diffCol = Math.abs(colonneDepart-colonneArrivee);
        if (((ligneDepart==ligneArrivee) && (colonneDepart!=colonneArrivee)) || ((ligneDepart!=ligneArrivee) && (colonneDepart==colonneArrivee)) && (Math.abs(ligneArrivee-ligneDepart)!=Math.abs(colonneArrivee-colonneDepart)))
        {
            if (diffLigne!=0)
                for (int j=1;j<diffLigne-1;j++)
                    if (echiquier[j][colonneDepart]!=null)
                        return false;
            if (diffCol!=0)
                for (int j=1;j<diffCol-1;j++)
                    if (echiquier[ligneDepart][j]!=null)
                        return false;
            return true;
        }
                    
        return false;
    }
    
    /** Le pion Tour est modeliser avec la lettre "T" sur l'echiquier  */
    @Override
    public String toString()
    {
        return "T ";
    }
}
