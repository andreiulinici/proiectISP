package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import a.PunctReferinta;
import a.Turist;

public class testEx3DistantaMorePoints {

	@Test
	public void test() {
		//metoda complexa user cu mai multe puncte inregistrate si calcul distanta
		//parcursa
		PunctReferinta punct=new PunctReferinta(44.4258297,26.112786752490617,100);
		PunctReferinta punct1=new PunctReferinta(44.419477515267005,26.116471040915926,200);
		PunctReferinta punct3=new PunctReferinta(44.4168463541999,26.1253657,100);
		PunctReferinta punct4=new PunctReferinta(44.419477515267005,26.134260359084074,150);
		
		Turist tt=new Turist("Surdu","Marian","1940203146252",22,true,"codCartela",true,true);
		ArrayList<PunctReferinta> list = new ArrayList<PunctReferinta>();
		list.add(punct);
		list.add(punct1);
		list.add(punct3);
		list.add(punct4);
		tt.setTablouPuncteReferinta(list);
		Double x=tt.calculDistantaParcursa();
		Double y=1332.77;
		assertEquals(x,y);
		
		
	}

}
