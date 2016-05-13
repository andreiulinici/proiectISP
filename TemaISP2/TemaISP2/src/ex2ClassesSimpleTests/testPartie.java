package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import a.Partie;
import a.PunctReferinta;

public class testPartie {
	String dificultate;
	PunctReferinta punct;
	PunctReferinta punct1;
	Partie partie;	
	
	@Before
    public void setUp() throws Exception {
		punct=new PunctReferinta(45.493663,25.579865,1200);
		punct1=new PunctReferinta(45.495254, 25.578290,1000);
		partie=new Partie("incepatori", punct, punct1);
	}
	
    @After
    public void tearDown() throws Exception {
          punct = null;
          punct1 = null;
          dificultate = null;
    }
    
	@Test
	public void testGetPartie() {
        assertEquals(partie.getDificultate(),"incepatori");
        assertEquals(partie.getPctInceput(),punct);
        assertEquals(partie.getPctSfarsit(),punct1);
	}
	
	@Test
	public void testSetPartie() {
		partie=new Partie("mediu", punct, punct1);
		assertNotSame(partie.getDificultate(),"incepatori");
        assertEquals(partie.getPctInceput(),punct);
        assertEquals(partie.getPctSfarsit(),punct1);
	}

}
