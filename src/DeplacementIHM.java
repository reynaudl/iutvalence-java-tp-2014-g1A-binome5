

/**
 * Classe DeplacementIHM
 * 
 * @author HENROT/REYNAUD
 * @version v1.0
 */

public class DeplacementIHM extends Deplacement {
	
	
	
	
	

	public DeplacementIHM(int numerolignedepart, int numerocolonnedepart,
			int numerolignearrivee, int numerocolonnearrivee, Pion[][] echiquier) 
		{
			super(numerolignedepart, numerocolonnedepart, numerolignearrivee,
				numerocolonnearrivee, echiquier);
		}

	public Position obtenirDepart() {
		return depart;
	}

	public Position obtenirArrivee() {
		return arrivee;
	}

	
	 public Position setDepart(){
		return depart;
	  
	  }
	  
	  public Position setArrivee(){
		return arrivee;
	  
	  }
	 
}
