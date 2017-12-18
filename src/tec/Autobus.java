package tec;

public class Autobus implements Bus, Transport{
/** assis est le nombre de places assises libres.
 * debout est le nombre de places debouts libres
 * tailleMax est la capacité du bus
 * bus[] est un tableau de passagers
 * nbArret est le nombre d'arrets de la ligne
 * arret est l'arret courant.
 */
	int assis;
	int debout;
	int tailleMax;
	Passager bus[];
	int nbArret;
	int arret;
	
	public Autobus(int i, int j) {
		this.assis=i;
		this.debout=j;
		this.tailleMax = i+j;
		bus = new Passager[tailleMax];
		nbArret=15;
		arret=0;
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
	public void demanderPlaceAssise(Passager p2) {
		if(p2.estDehors() && bus.length<this.tailleMax && this.aPlaceAssise()) {
			this.bus[bus.length+1]=p2;
			p2.accepterPlaceAssise();
			this.assis--;
		}
	}	

	@Override
	public void demanderPlaceDebout(Passager p) {
		if(p.estDehors() && bus.length<this.tailleMax && this.aPlaceDebout()) {
			this.bus[bus.length+1]=p;
			p.accepterPlaceDebout();
			this.debout--; 
		}	
		
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
		if(p.estDebout()) 
		    this.debout++;
		else
			this.assis++;
		p.accepterSortie();
	}

	@Override
	public void allerArretSuivant() throws UsagerInvalideException {
		this.arret++;
		if(arret<nbArret)
			arret=0; //le bus est au terminus et reprend un cycle.
		for(int i=0;i<this.bus.length;i++){
			int destination = bus[i].getDestination();
			if(destination == arret)	{
				this.demanderSortie(bus[i]);
			}
		}		
	}
	
	@Override
	public String toString() {
		return "nombre de places assises : "+assis+" - nombre de places debout : "+debout;
	}


}
