package tec;

import static org.junit.Assert.*;

/**
 * jeu de test pour la classe autobus.
 * avec faux passagers pour �tudier les tests sur autobus.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class AutobusTestFauxPassager {
	Autobus a1;
	Autobus a2;
	Autobus a3;
	FauxPassager p1;
	FauxPassager p2; 
	FauxPassager p3;
	
	@Before
	public void instanciation() throws Exception{
		this.a1=new Autobus(5,5);
		this.a2=new Autobus(5,0);
		this.a3=new Autobus(0,5);
		p1=new FauxPassager();
		p2=new FauxPassager();
		p3=new FauxPassager();
	}
	
	@After
	public void nettoyer() throws Exception{		
	}
	
	@Test
	public void testaPlaceAssise() {
		assert(a1.aPlaceAssise());
		assert(a2.aPlaceAssise());
		assert(a3.aPlaceAssise());
	}

	@Test
	public void testaPlaceDebout() {
		assert(a1.aPlaceDebout());
		assert(a2.aPlaceDebout());
		assert(a3.aPlaceDebout());			
	}
	  
	@Test
	public void testdemanderPlaceAssise() {
		a1.demanderPlaceAssise(p1);
		a2.demanderPlaceAssise(p2);
		a3.demanderPlaceAssise(p3);
		assert(p1.estAssis());
		assert(p2.estAssis());
		assert(p3.estAssis());
	}	

	@Test
	public void testdemanderPlaceDebout() {
		a1.demanderPlaceDebout(p1);
		a2.demanderPlaceDebout(p2);
		a3.demanderPlaceDebout(p3);
		assert(p1.estDebout());
		assert(p2.estDebout());
		assert(p3.estDebout());
	
	}
	
	@Test
	public void testdemanderChangerEnDebout() {
		a1.demanderChangerEnDebout(p1);
		assert(p1.estDebout());
		a2.demanderChangerEnDebout(p2);
		assert(p2.estDebout());
		a3.demanderChangerEnDebout(p3);
		assert(p3.estDebout());
	}

	@Test
	public void testdemanderChangerEnAssis() {
		a1.demanderChangerEnAssis(p1);
		assert(p1.estAssis());
		a2.demanderChangerEnAssis(p2);
		assert(p2.estAssis());
		a3.demanderChangerEnAssis(p3);
		assert(p3.estAssis());
	}

	@Test
	public void testdemanderSortie() {
		a1.demanderSortie(p1);
		assert(p1.estDehors());
		a2.demanderSortie(p2);
		assert(p2.estDehors());
		a3.demanderSortie(p3);
		assert(p3.estDehors());
	}

}
