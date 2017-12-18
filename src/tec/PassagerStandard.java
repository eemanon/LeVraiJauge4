package tec;

import tec.EtatPassager.Etat;

/**
 * Declaration d'un Passager, 
 * le nom est une chaine de  et la destination (numéro d'arret) un entier
 * un passager possède aussi un etat, initialisé à DEHORS
 */

public class PassagerStandard implements Passager, Usager{
	private EtatPassager etat;
	private String nom;
	private int destination;
	
	public PassagerStandard(String string, int i) {
		etat = EtatPassager.creerEtatPassager(Etat.dehors);
		this.nom = string;
		this.destination = i;
	}

	@Override
	public String nom() {
		return null;
	}

	@Override
	public boolean estDehors() {
		if (etat.estExterieur())
			return true;
		return false;
	}

	@Override
	public boolean estAssis() {
		if(etat.estAssis())
			return true;
		return false;
	}

	@Override
	public boolean estDebout() {
		if(etat.estDebout())
			return true;
		return false;
	}

	@Override
	public void accepterSortie() {
		etat.setMonEtat(Etat.dehors);
	}

	@Override
	public void accepterPlaceAssise() {
		etat.setMonEtat(Etat.assis);
		
	}

	@Override
	public void accepterPlaceDebout() {
		etat.setMonEtat(Etat.debout);
		
	}

	@Override
	public void nouvelArret(Bus bus, int numeroArret) {
		if(numeroArret==this.destination)
			bus.demanderSortie(this);	
		if(this.estAssis())
			bus.demanderPlaceDebout(this);
	}

	@Override
	public void monterDans(Transport t) throws UsagerInvalideException {
		Bus b = (Bus)t;
		b.demanderPlaceAssise(this);
		if(this.estDehors())
			b.demanderPlaceDebout(this);
	}

	@Override
	public String toString() {
		return nom+" "+etat.toString();
	}
}
