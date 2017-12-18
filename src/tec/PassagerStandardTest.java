package tec;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tec.EtatPassager.Etat;

public class PassagerStandardTest {
	
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
	
}
