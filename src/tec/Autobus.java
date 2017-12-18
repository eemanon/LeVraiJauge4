package tec;

public class Autobus implements Bus, Transport{
/** assis est le nombre de places assises libres.
 * debout est le nombre de places debouts libres
 */
	int assis;
	int debout;
	
	public Autobus(int i, int j) {
		this.assis=i;
		this.debout=j;
	}

	@Override
	public boolean aPlaceAssise() {
		return this.assis>0;
	}

	@Override
	public boolean aPlaceDebout() {
		return this.debout>0; 
	}
  
	@Override
	public void demanderPlaceAssise(Passager p) {
		p.accepterPlaceAssise();
		this.assis++;
	}

	@Override
	public void demanderPlaceDebout(Passager p) {
		p.accepterPlaceDebout();
		this.debout++; 
	}

	@Override
	public void demanderChangerEnDebout(Passager p) {
		p.accepterPlaceDebout();
		this.assis++;
		this.debout--;
	}

	@Override
	public void demanderChangerEnAssis(Passager p) {
		p.accepterPlaceAssise();		
		this.assis--;
		this.debout++;
	}

	@Override
	public void demanderSortie(Passager p) {
		EtatPassager etat = p.getEtat();
		if(etat == DEBOUT)
		    this.debout++;
		else
			this.assis++;
		p.accepterSortie();
	}

	@Override
	public void allerArretSuivant() throws UsagerInvalideException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "nombre de places assises : "+assis+" - nombre de places debout : "+debout;
	}


}
