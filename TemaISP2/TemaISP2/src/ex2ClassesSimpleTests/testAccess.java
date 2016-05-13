package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import a.Acces;

import a.Turist;

import junit.framework.TestCase;

public class testAccess extends TestCase {
	
//	String codCartela;
//	int pret;
	String codTurist = "client003";
	Turist turist;
	Acces acces;
	
	@Before
	protected void setUp() throws Exception {
        super.setUp();
        turist = new Turist("Surdu","Marian","1940203146252",22,true,codTurist,true,true);
        acces = new Acces("cartela003",60,codTurist);
	}
	
	@After
	protected void tearDown() throws Exception {
        super.tearDown();
        turist = null;
        acces = null;
	}
	
	@Test
	public void testGet() {
		//fail("Not yet implemented");
		Acces a = new Acces("cartela003",60,codTurist);
		
		// test if code starts with "cartela":				
		String s = a.getCodCartela();
		s = s.substring(0,7);
		assertEquals("cartela", s);  
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
