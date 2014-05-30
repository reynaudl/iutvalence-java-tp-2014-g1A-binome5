


import java.util.Scanner;

/**
 * Classe echec
 * 
 * @author Hoang Thai Binh / Gurbuz Adem
 * @version v0.5
 */
public class Echec
{
    /** l'echicquier est un tableau de pion */
    private final Pion[][] echiquier;

    /** 1er joueur */
    private final Joueur joueur1;

    /** 2eme joueur */
    private final Joueur joueur2;

    /** le joueur qui joue */
    private Joueur joueurCourant;

    /** cree un tableau de pion de 8x8 et cree les 2 joueurs, en asignant a l'un le droit de jouer. */
    public Echec()
    {
        echiquier = new Pion[8][8];
        /** Passez en parametre le nom des joueurs. */
        this.joueur1 = new Joueur(Couleur.BLANC, "Tom");
        this.joueur2 = new Joueur(Couleur.NOIR, "Jerry");
        this.joueurCourant = joueur1;
    }


    public void jouer()
    {
    	/** l'echiquier s'affiche avec la position des pions. */
        this.premierPlacement();
        this.afficherEchiquier();
        
        
        while(true)
        {
            Deplacement deplacement = this.obtenirDeplacementValide();
            Mvt(deplacement,echiquier);
        }
        

        /*
         * Algo d'un tour : 
         * - Afficher l'échiquier. 
         * - Demander le déplacement à effectuer. 
         * - Valider le coup (grille + pion). 
         * - Si valide, jouer le coup. Sinon retour étape 2. 
         * - Changer le joueur courant.
         */
    }

    /** entree des valeurs: la position de depart/selection et d'arrivee du pion  */
    public Deplacement obtenirDeplacement()
    {
        Deplacement deplacement;

        deplacement = new Deplacement(Bouton.POSITION.obtenirDepart().ligne(), Bouton.POSITION.obtenirDepart().colonne(),
                Bouton.POSITION.obtenirArrivee().ligne(), Bouton.POSITION.obtenirArrivee().colonne(), echiquier.clone());
        return deplacement;

    }
    /** Verifie si le deplacement est posible, si oui le joueur courant change, si non on demande au joueur de reessayer */
    public Deplacement obtenirDeplacementValide() 
    {
        Deplacement deplacement;
        while (true)
        {
            deplacement = obtenirDeplacement();
            if (this.estDeplacementValide(deplacement))
            {
                int ligneDepart = deplacement.obtenirDepart().ligne();
                int colonneDepart = deplacement.obtenirDepart().colonne();
                if (this.joueurCourant.obtenirCouleur()==this.echiquier[ligneDepart][colonneDepart].obtenirCouleur())
                    {
                        System.out.println("Changement de joueur!");
                        break;
                    }
            }
            System.out.println("Veuillez ressayer SVP !");
        }
        return deplacement;

    }
    
    /** verifie si le deplacement est valide, qu'il y a bien un pion au joueur courant 
     * sur la case selectionne et qu'il n'y a pas de pion a lui sur la case d'arrivee */
    public boolean estDeplacementValide(Deplacement deplacement)
    {
     
        Pion depart = echiquier[deplacement.depart.ligne()][deplacement.depart.colonne()];
        Pion arrivee = echiquier[deplacement.arrivee.ligne()][deplacement.arrivee.colonne()];
        
        if (depart == null)
            return false;
        
        if (arrivee != null && depart.obtenirCouleur() == arrivee.obtenirCouleur())
            return false;
        
        return depart.deplacementEstValide(deplacement, echiquier.clone());

    }
    
    /** affiche le deplacement en supprimant la pion de la case de depart 
     * et en l'affichant a la case d'arrivee, si possible. Par la meme occasion,
     * le joueur courant change*/
    public void Mvt(Deplacement deplacement, Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        echiquier[ligneArrivee][colonneArrivee]=null;
        echiquier[ligneArrivee][colonneArrivee]=echiquier[ligneDepart][colonneDepart];
        echiquier[ligneDepart][colonneDepart]=null;
        afficherEchiquier();
        if (this.joueurCourant==joueur1)
            this.joueurCourant=joueur2;
        else
            this.joueurCourant=joueur1;
    }

    /** modelise l'echiquier sous format texte, avec les lignes, colonnes et pions*/
    private void afficherEchiquier()
    {
        String echiquierConsole = "    ";
        for (int ligne = 0; ligne < 8; ligne++) {
            echiquierConsole += String.valueOf(ligne);
            echiquierConsole += ' ';
        }
        echiquierConsole += '\n';
        for (int ligne = 0; ligne < 8; ligne++)
        {
            echiquierConsole += ligne + " | ";
            for (int colonne = 0; colonne < 8; colonne++)
            {
               echiquierConsole += (echiquier[ligne][colonne] == null) ? ". " : echiquier[ligne][colonne].toString();
            }
            echiquierConsole += "|\n";

        }

        System.out.println(echiquierConsole);
    }

    /** Position de ebas de tout les pions du jeu, pour les 2 joueurs.*/
    private void premierPlacement()
    {
        /* Placement des pions. */
        echiquier[0][0] = new PionTour(Couleur.BLANC);
        echiquier[0][1] = new PionCavalier(Couleur.BLANC);
        echiquier[0][2] = new PionFou(Couleur.BLANC);
        echiquier[0][3] = new PionRoi(Couleur.BLANC);
        echiquier[0][4] = new PionDame(Couleur.BLANC);
        echiquier[0][5] = new PionFou(Couleur.BLANC);
        echiquier[0][6] = new PionCavalier(Couleur.BLANC);
        echiquier[0][7] = new PionTour(Couleur.BLANC);
        for (int colonne = 0; colonne < 8; colonne++)
            echiquier[1][colonne] = new PionSoldat(Couleur.BLANC);
        echiquier[7][0] = new PionTour(Couleur.NOIR);
        echiquier[7][1] = new PionCavalier(Couleur.NOIR);
        echiquier[7][2] = new PionFou(Couleur.NOIR);
        echiquier[7][3] = new PionRoi(Couleur.NOIR);
        echiquier[7][4] = new PionDame(Couleur.NOIR);
        echiquier[7][5] = new PionFou(Couleur.NOIR);
        echiquier[7][6] = new PionCavalier(Couleur.NOIR);
        echiquier[7][7] = new PionTour(Couleur.NOIR);
        for (int colonne = 0; colonne < 8; colonne++)
            echiquier[6][colonne] = new PionSoldat(Couleur.NOIR);
    }

}
