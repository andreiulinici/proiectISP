package ex2ClassesSimpleTests;
import static org.junit.Assert.*;
import org.junit.Test;
import a.Instructor;
import a.Persoana;

public class testRelatiePersoanaInstructor {

	@Test
	public void test()
	{
		Persoana p=new Persoana("Predescu","Vlad","4343",45);
		Instructor i=new Instructor("Dumitrecu","Ion","4345",26,"cod1",5);
		int x1=p.getVarsta();
		int x2=i.getVarsta();
		if(x1==x2)
		{
			System.out.println("Au aceeasi varsta"); 
		} else
		{
			System.out.println("Nu au aceeasi varsta");
		}
		
		
	}
}