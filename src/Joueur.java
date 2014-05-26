


/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */
public class Joueur
{
    /** Le joueur est defini par sa couleur */
    private final Couleur couleur;
    /** et son nom */
    private final String nom;

    /** le constructeur du "joueur" */
    public Joueur(Couleur couleur, String nom) {
        this.couleur = couleur;
        this.nom = nom;
    }
    
    	
    public Couleur obtenirCouleur() {
        return couleur;
    }

    public String obtenirNom() {
        return nom;
    }
    
    
}
