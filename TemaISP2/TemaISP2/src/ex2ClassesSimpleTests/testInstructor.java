package ex2ClassesSimpleTests;

import static org.junit.Assert.*;

import org.junit.Test;
import a.Instructor;
import a.Persoana;
public class testInstructor {

	@Test
	public void test() {
		Instructor i=new Instructor("x","y","aaa",23,"443wss",12);
		int iz=i.getTuristiInscrisi();
		assertEquals(iz,12);
		assertNotEquals(iz,13);
	}

}
