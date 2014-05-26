
/** Classe qui donne la position de depart et d'arrivee d'un pion*/
public class Deplacement
{

    public Position depart;
    public Position arrivee;
    
    public Pion[][] echiquier;
    
    public Deplacement(int numerolignedepart, int numerocolonnedepart, int numerolignearrivee, int numerocolonnearrivee, Pion[][] echiquier)
    {
        this.depart= new Position(numerolignedepart, numerocolonnedepart);
        this.arrivee= new Position(numerolignearrivee, numerocolonnearrivee);
        this.echiquier = echiquier;
    } 
    
    public Position obtenirDepart()
    {
        return depart;
    }

    public Position obtenirArrivee()
    {
        return arrivee;
    }
}
