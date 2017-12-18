package tec;

import tec.EtatPassager.Etat;

public class PassagerStandard implements Passager, Usager{
	private EtatPassager etat;
	private String nom;
	private int destination;
	
	public PassagerStandard(String string, int i) {
		etat = EtatPassager.creerEtatPassager(Etat.DEHORS);
	}

	@Override
	public String nom() {
		// TODO Auto-generated method stub
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
		etat.setMonEtat(Etat.DEHORS);
	}

	@Override
	public void accepterPlaceAssise() {
		etat.setMonEtat(Etat.ASSIS);
		
	}

	@Override
	public void accepterPlaceDebout() {
		etat.setMonEtat(Etat.DEBOUT);
		
	}

	@Override
	public void nouvelArret(Bus bus, int numeroArret) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void monterDans(Transport t) throws UsagerInvalideException {
		
		
	}
	@Override
	public String toString() {
		return nom+" "+etat.toString();
	}

}
