package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import a.PunctReferinta;
import a.Partie;
import a.Traseu;
import a.PunctReferinta;
import org.junit.Test;

public class testStatiune {

	@Test
	public void test() {
		//Primul traseu al Statiunii
		//Partie 1
		String dificultate="Mediu";
		PunctReferinta pctInc=new PunctReferinta(1,7,6);
		PunctReferinta pctSfarsit=new PunctReferinta(1,3,3);
		Partie p1=new Partie(dificultate,pctInc,pctSfarsit);
		//Partie 2
		String dificultate1="Dificil";
		PunctReferinta pctInc1=new PunctReferinta(2,2,2);
		PunctReferinta pctSfarsit1=new PunctReferinta(1,2,3);
		Partie p2=new Partie(dificultate1,pctInc1,pctSfarsit1);
		//Partie 3
		String dificultate2="Mediu";
		PunctReferinta pctInc2=new PunctReferinta(4,1,2);
		PunctReferinta pctSfarsit2=new PunctReferinta(5,6,3);
		Partie p3=new Partie(dificultate2,pctInc2,pctSfarsit2);
		//Partie 4
		String dificultate3="Profesionisti";
		PunctReferinta pctInc3=new PunctReferinta(4,2,5);
		PunctReferinta pctSfarsit3=new PunctReferinta(1,6,3);
		Partie p4=new Partie(dificultate3,pctInc3,pctSfarsit3);
		//Partie 5
		String dificultate4="Dificil";
		PunctReferinta pctInc4=new PunctReferinta(4,7,5);
		PunctReferinta pctSfarsit4=new PunctReferinta(2,8,3);
		Partie p5=new Partie(dificultate4,pctInc4,pctSfarsit4);
		//Partie 5
		String dificultate5="Dificil";
		PunctReferinta pctInc5=new PunctReferinta(4,1,1);
		PunctReferinta pctSfarsit5=new PunctReferinta(5,5,3);
		Partie p6=new Partie(dificultate5,pctInc5,pctSfarsit5);
		ArrayList<Partie> list = new ArrayList<Partie>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		Traseu t1=new Traseu(list);
		int x1=t1.getLengthTraseu();
		
		//Al doilea traseu al Statiunii
		//Partie 1
		String dificultate7="Incepator";
		PunctReferinta pctInc0=new PunctReferinta(1,7,6);
		PunctReferinta pctSfarsit0=new PunctReferinta(1,6,3);
		Partie p7=new Partie(dificultate7,pctInc0,pctSfarsit0);
		//Partie 3
		String dificultate8="Mediu";
		PunctReferinta pctInc11=new PunctReferinta(4,1,2);
		PunctReferinta pctSfarsit11=new PunctReferinta(5,6,3);
		Partie p8=new Partie(dificultate8,pctInc11,pctSfarsit11);
		//Partie 4
		String dificultate9="Mediu";
		PunctReferinta pctInc22=new PunctReferinta(4,2,8);
		PunctReferinta pctSfarsit22=new PunctReferinta(6,6,3);
		Partie p11=new Partie(dificultate9,pctInc22,pctSfarsit22);
		//Partie 5
		String dificultate10="Mediu";
		PunctReferinta pctInc33=new PunctReferinta(4,7,5);
		PunctReferinta pctSfarsit33=new PunctReferinta(2,8,3);
		Partie p9=new Partie(dificultate10,pctInc33,pctSfarsit33);
		//Partie 5
		String dificultate11="Incepator";
		PunctReferinta pctInc44=new PunctReferinta(4,1,1);
		PunctReferinta pctSfarsit44=new PunctReferinta(5,5,3);
		Partie p10=new Partie(dificultate11,pctInc44,pctSfarsit44);
		ArrayList<Partie> list1 = new ArrayList<Partie>();
		list1.add(p7);
		list1.add(p8);
		list1.add(p9);
		list1.add(p10);
		list1.add(p11);
		
		Traseu t2=new Traseu(list1);
		int x2=t2.getLengthTraseu();
		
		System.out.println("In statiune se gasesc in total : "+(x1+x2)+"partii");
		assertEquals(11,x1+x2);
		
		
	}

}
