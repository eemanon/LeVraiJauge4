package tec;

public class PassagerStandard implements Passager, Usager{
	private EtatPassager etat;
	private String nom;
	private int destination;
	
	public PassagerStandard(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String nom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean estDehors() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estAssis() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estDebout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void accepterSortie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accepterPlaceAssise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accepterPlaceDebout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nouvelArret(Bus bus, int numeroArret) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void monterDans(Transport t) throws UsagerInvalideException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return nom+" "+etat.toString();
	}

}
