


/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public abstract class Pion
{
    /** Le pion est defini par sa couleur */
    protected final Couleur couleur;

    /** on defini une couleur au pion */
    public Pion(Couleur couleur)
    {
        this.couleur = couleur;
    }

    public Couleur obtenirCouleur()
    {
        return couleur;
    }

    public abstract boolean deplacementEstValide(Deplacement deplacement, Pion[][] echiquier);
}
