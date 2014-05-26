/* TODO Nom de package. */

/**
 * TODO.
 *
 * @author TODO
 * @version TODO
 */

/** Le pion Dame herite des caracteristique du pion */
public class PionDame extends Pion {
	public PionDame(Couleur couleur) {
		super(couleur);
	}

	/**
	 * calcule qui permet au pion Dame de se deplacer. Ce pion heritera des
	 * caracteristique du pion fou et tour.
	 */
	@Override
	public boolean deplacementEstValide(Deplacement deplacement,
			Pion[][] echiquier) {
		int ligneDepart = deplacement.obtenirDepart().ligne();
		int colonneDepart = deplacement.obtenirDepart().colonne();
		int ligneArrivee = deplacement.obtenirArrivee().ligne();
		int colonneArrivee = deplacement.obtenirArrivee().colonne();

		if (((ligneDepart == ligneArrivee) && (colonneDepart != colonneArrivee))
				|| ((ligneDepart != ligneArrivee) && (colonneDepart == colonneArrivee))
				&& (Math.abs(ligneArrivee - ligneDepart) != Math
						.abs(colonneArrivee - colonneDepart))
				|| (Math.abs(ligneArrivee - ligneDepart) == Math
						.abs(colonneArrivee - colonneDepart)))
			return true;
		return false;
	}

	/** Le pion Dame est modeliser avec la lettre "D" sur l'echiquier */
	@Override
	public String toString() {
		return "D ";
	}
}
