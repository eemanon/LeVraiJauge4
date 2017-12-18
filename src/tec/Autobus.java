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
		if(p2.estDehors() && this.aPlaceAssise()) {
			this.bus[tailleMax-(assis+debout)]=p2;
			p2.accepterPlaceAssise();
			this.assis--;
		}
	}	

	@Override
	public void demanderPlaceDebout(Passager p) {
		if(p.estDehors() && this.aPlaceDebout()) {
			this.bus[tailleMax-(assis+debout)]=p;
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
		if(arret>nbArret)
			arret=0; //le bus est au terminus et reprend un cycle.
		for(int i=0;i<(tailleMax-(assis+debout));i++){
			bus[i].nouvelArret(this, this.arret);
		}		
	}
	
	@Override
	public String toString() {
		return "[arret:"+this.arret+ ", assis:"+assis+", debout:"+debout+"]";
	}


/* Resultat de l'execution.
[arret:1, assis:0, debout:0]
[arret:2, assis:1, debout:1]
Kaylee assis
Jayne debout
[arret:3, assis:1, debout:2]
Kaylee assis
Jayne debout
Inara debout
[arret:4, assis:1, debout:1]
Kaylee assis
Jayne dehors
Inara debout
[arret:5, assis:0, debout:0]
Kaylee dehors
Jayne dehors
Inara dehors
*/

}
