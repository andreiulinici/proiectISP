package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import a.Turist;
import a.PunctReferinta;

public class testPunctReferinta {
//	double cx;
//	double cy;
//	double alt;
	PunctReferinta punct;
	Turist turist;
	
	@Ignore
	  public void ignoreTest() {
	     System.out.println("in ignore test");
	}
	 
	@Before
    public void setUp() throws Exception {
		punct=new PunctReferinta(45.493663,25.579865,1200);
		turist=new Turist("Surdu","Marian","1940203146252",22,true,"cartela003",true,true);
	}
	
    @After
    public void tearDown() throws Exception {
		punct = null;
		turist = null;
    }
    
    private static final double DELTA = 1e-15;
    @Test
	public void testGetCoord() {
    	assertEquals(punct.getCx(),45.493663,DELTA);
    	assertEquals(punct.getCy(),25.579865,DELTA);
    	assertEquals(punct.getAlt(),1200,DELTA);
	}
	
	@Test
	public void testSetPartie() {
		punct=new PunctReferinta(45.493663,25.579865,1200);
		assertNotSame(punct.getCx(),"45.493665");
	}
}
