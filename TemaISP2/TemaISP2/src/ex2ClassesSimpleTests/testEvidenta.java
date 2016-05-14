package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import a.Turist;
import a.EvidentaTuristi;


import org.junit.Test;

public class testEvidenta {

	@Test
	public void test() {
		Turist tt=new Turist("Surdu","Marian","1940203146252",22,true,"codCartela",true,true);
		Turist tt1=new Turist("Surdu","Marian","1940203146252",22,true,"codCartela",true,true);
		Turist tt2=new Turist("Ardu","Marian","1940203146252",22,true,"codCartela",true,true);

		ArrayList<Turist> listA=new ArrayList<Turist>();
		ArrayList<Turist> listI=new ArrayList<Turist>();
		listA.add(tt);
		listA.add(tt1);
		
		EvidentaTuristi E=new EvidentaTuristi();
		E.TuristiActivi=listA;
		E.TuristiInactivi=listI;
		
		assertEquals(E.TuristiActivi.size(),2);
		assertEquals(E.TuristiInactivi.size(),0);
		
		
	}

}
