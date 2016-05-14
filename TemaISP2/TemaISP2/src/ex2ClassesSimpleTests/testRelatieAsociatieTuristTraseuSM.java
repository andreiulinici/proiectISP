package ex2ClassesSimpleTests;
import java.util.ArrayList;
import a.Acces;
import a.Persoana;
import a.Traseu;
import a.Turist;
import a.PunctReferinta;
import a.Partie;

import junit.framework.TestCase;

public class testRelatieAsociatieTuristTraseuSM extends TestCase {
	Persoana persoana;
	Traseu traseu;
	Turist turist;
	protected void setUp() throws Exception{
		super.setUp();
		//persoana=new Persoana("ion","ionel","22323",22);
		
		String dificultate="Medie";
		PunctReferinta pctInc=new PunctReferinta(2,3,4);
		PunctReferinta pctSfarsit=new PunctReferinta(2,3,5);
		Partie p=new Partie(dificultate,pctInc,pctSfarsit);
		ArrayList<Partie> list = new ArrayList<Partie>();
		list.add(p);
		traseu=new Traseu(list);
		turist=new Turist("Marian","Surdu","1940401xx123",22,true,"456",true,true);
		turist.setTraseu(traseu);
		ArrayList<PunctReferinta> tablou=new ArrayList<PunctReferinta>();
		tablou.add(pctInc);
		tablou.add(pctSfarsit);
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		turist=null;
		traseu=null;
	}
	public void testAsociereTraseu() {
		assertSame(turist.getTraseu(),traseu);
	}
	public void testSetTraseu() {
		
		String dificultate="Incepator";
		PunctReferinta pctInc=new PunctReferinta(2,2,4);
		PunctReferinta pctSfarsit=new PunctReferinta(2,2,5);
		Partie p=new Partie(dificultate,pctInc,pctSfarsit);
		ArrayList<Partie> list = new ArrayList<Partie>();
		list.add(p);
		Traseu altTraseu=new Traseu(list);
		turist.setTraseu(altTraseu);
		//se verifica faptul ca turistul are asociat noul traseu
		assertEquals(turist.getTraseu(),altTraseu);
		assertNotSame(turist.getTraseu(),traseu);
		
	}
	
	public void testGetTraseu() {
		 //verificarea faptului ca se returneaza chiar obiectul asociat
		Traseu t=turist.getTraseu();
		String dificultate="Incepator";
		PunctReferinta pctInc=new PunctReferinta(2,1,4);
		PunctReferinta pctSfarsit=new PunctReferinta(1,2,5);
		Partie p=new Partie(dificultate,pctInc,pctSfarsit);
		ArrayList<Partie> list = new ArrayList<Partie>();
		list.add(p);
		Traseu altTraseu=new Traseu(list);
		
			assertNotSame(t,altTraseu);
			assertSame(t,traseu);
	}
}





