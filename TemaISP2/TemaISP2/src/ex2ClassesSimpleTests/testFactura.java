package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import a.Factura;
import a.Turist;

import junit.framework.TestCase;

public class testFactura {
	String codFactura = "factura003";
	String codTurist = "client003";
	int pret = 110;
	Turist turist = new Turist("Surdu","Marian","1940203146252",22,true,codTurist,true,true);;
	Factura f = new Factura(codFactura, codTurist, pret);
	
	/*@Before	
	public void setUp() throws Exception {
        //super.setUp();
        turist = new Turist("Surdu","Marian","1940203146252",22,true,codTurist,true,true);
	}
	
	@After
	public void tearDown() throws Exception {
        //super.tearDown();
        turist = null;
	}*/
	
	@Test
	public void testPret() {
		int pretNou = 40;
		int total = 150;
		int pret1 = f.addPret(pretNou);
		assertEquals(pret1, total);
	}
	
	@Test
	public void testCodeT() {
		String codTurist1 = "client005";
        assertSame(turist.getCodeT(), codTurist);
        assertNotSame(turist.getCodeT(), codTurist1);       
	}
	
	@Test
	public void testSetCodeT() {		       
        turist.setCodeT("client003");
        assertEquals(turist.getCodeT(),codTurist);        
	}
}
