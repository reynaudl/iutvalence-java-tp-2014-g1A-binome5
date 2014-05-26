/* TODO Nom de package. */


/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
/** Le pion Soldat herite des caracteristique de la classe Pion  */
public class PionSoldat extends Pion
{
    private boolean dejaDeplace;
    
    public PionSoldat(Couleur couleur)
    {
        super(couleur);
        this.dejaDeplace = false;
    }

    /** calcule qui permet au pion Soldat de se deplacer, il n'y a pas la regle pour
     * manger un pion adverse en diagonal, ni la regle qui empeche le pion de 
     * manger en colonne.   */
    @Override
    public boolean deplacementEstValide(Deplacement deplacement, Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        
        
        if (colonneDepart==colonneArrivee)
        {
            if (!(dejaDeplace))
            {
                if(this.couleur==Couleur.BLANC)
                    if ((ligneDepart-ligneArrivee<0)&&(ligneArrivee-ligneDepart <= 2))
                    {
                        this.dejaDeplace = true;
                        return true;
                    }
                if(this.couleur==Couleur.NOIR)
                    if ((ligneDepart-ligneArrivee>0)&&(ligneArrivee-ligneDepart <= -2))
                    {
                        this.dejaDeplace = true;
                        return true;
                    }
 
            }
            if (dejaDeplace)
            {
                if(this.couleur==Couleur.BLANC)
                    if (ligneDepart-ligneArrivee==1)
                        return true;
                if(this.couleur==Couleur.NOIR)
                    if (ligneDepart-ligneArrivee==-1)
                        return true;
            
            }
        }
        return false;
    }
    
    /** Le pion Soldat est modeliser avec la lettre "S" sur l'echiquier  */
    @Override
    public String toString()
    {
        return "S ";
    }
}
