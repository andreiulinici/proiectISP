package ex2ClassesSimpleTests;
//this test is used to check if user gained his access
import static org.junit.Assert.*;
import a.Turist;

import org.junit.Test;

import a.Turist;

public class testTurist {

	@Test
	public void test() {
		Turist t=new Turist();
		Boolean x=t.obtineAccess(true,null);
		assertEquals(true,x);
		
		
	}

}
