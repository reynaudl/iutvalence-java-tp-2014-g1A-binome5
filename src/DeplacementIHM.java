

/**
 * Classe DeplacementIHM
 * 
 * @author HENROT/REYNAUD
 * @version v1.0
 */

import java.awt.event.ActionListener;



public class DeplacementIHM extends Deplacement {
	
    public Position depart;
    public Position arrivee;


    public DeplacementIHM(int numeroLigneDepart,int numeroColonneDepart, int numeroLigneArrivee, int numeroColonneArrivee)
    {
        this.depart = new Position(numeroLigneDepart, numeroColonneDepart);
        this.arrivee = new Position(numeroLigneArrivee, numeroColonneArrivee);

    }
     
    public Position obtenirDepart()
    {
        return (depart.ligne()==0 && depart.colonne()==0) ? null : this.depart;
    }
    
    public Position obtenirArrivee()
    {
        return this.arrivee;
    }


    public void setDepart(int x,int y)
    {
        this.depart = new Position(x,y);
    }

    public void setArrivee(int x, int y)
    {
        this.arrivee = new Position(x,y);
    }
    
}
