package tec;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tec.EtatPassager.Etat;

public class PassagerStandardTest implements Transport{
	
	@Before
	public void initialiser() throws Exception{
	}
	
	@After
	public void nettoyer() throws Exception{		
	}
	@Test
	public void instancation() {
		Passager p = new PassagerStandard("Nathalie", 0);
		assert(p.estDehors());
	}
	@Test
	public void accepterPlaceAssise() {
		Passager p = new PassagerStandard("Jean-Marc", 0);
		p.accepterPlaceAssise();
		assert(p.estAssis());
	}
	@Test
	public void accepterPlaceDebout() {
		Passager p1 = new PassagerStandard("Pierre-Jean", 0);
		p1.accepterPlaceDebout();
		assert(p1.estDebout());
	}
	@Test
	public void accepterSortie() {
		Passager p1 = new PassagerStandard("Fabris", 0);
		p1.accepterSortie();
		assert(p1.estDehors());
	}
	@Test
	public void monterDans() {
		PassagerStandard p1 = new PassagerStandard("Bernard", 0);
		FauxBusVide ghostbus = new FauxBusVide();
		try {
			p1.monterDans(ghostbus);
			assert(!p1.estDehors());
		} catch (UsagerInvalideException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PassagerStandard ghostbuster = new PassagerStandard("Benoit", 0);
		FauxBusPlein ghostbus42 = new FauxBusPlein();
		try {
			ghostbuster.monterDans(ghostbus42);
			assert(!ghostbuster.estDehors());
		} catch (UsagerInvalideException e) {
			System.out.println("OMG il ne peut pas monter dans le bus plein!!!!");
		}		
		PassagerStandard petitpotter = new PassagerStandard("Harry", 0);
		FauxBusDebout busdePuddlar = new FauxBusDebout();
		try {
			petitpotter.monterDans(busdePuddlar);
			assert(!petitpotter.estDehors());
		} catch (UsagerInvalideException e) {
			System.out.println("tout le monde est debout et refuse de laisser Harry monter et voyager a Puddlar.");
		}		
		PassagerStandard madameBilleEnTete  = new PassagerStandard("Valerie", 0);
		FauxBusAssis busmagique = new FauxBusAssis();
		try {
			madameBilleEnTete.monterDans(busmagique);
			assert(!madameBilleEnTete.estDehors());
		} catch (UsagerInvalideException e) {
			System.out.println("Oh non! Les enfants font la greve et empechent Madame Bille en Tete de monter!");
		}
	}
	
	@Test
	public void nouvelArret() {
		Passager p1 = new PassagerStandard("Frédéric", 0);
		p1.accepterSortie();
		assert(p1.estDehors());
	}

	@Override
	public void allerArretSuivant() throws UsagerInvalideException {
		// TODO Auto-generated method stub
		
	}
	
}
