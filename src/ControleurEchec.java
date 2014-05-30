
public class ControleurEchec {

	

    private final Pion[][] echiquier;

    private final Joueur J1;


    private final Joueur J2;

    private Joueur joueurCourant;

    public ControleurEchec()
    {
        echiquier = new Pion[8][8];
        this.J1 = new Joueur(Couleur.BLANC, "Tom");
        this.J2 = new Joueur(Couleur.NOIR, "Jerry");
        this.joueurCourant = J1;
        premierPlacement();
    }
    

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
    

    public void Mvt(Deplacement deplacement, Pion[][] echiquier)
    {
        int ligneDepart = deplacement.obtenirDepart().ligne();
        int colonneDepart = deplacement.obtenirDepart().colonne();
        int ligneArrivee = deplacement.obtenirArrivee().ligne();
        int colonneArrivee = deplacement.obtenirArrivee().colonne();
        echiquier[ligneArrivee][colonneArrivee]=null;
        echiquier[ligneArrivee][colonneArrivee]=echiquier[ligneDepart][colonneDepart];
        echiquier[ligneDepart][colonneDepart]=null;
        if (this.joueurCourant==J1)
            this.joueurCourant=J2;
        else
            this.joueurCourant=J1;
    }

    public void premierPlacement()
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
