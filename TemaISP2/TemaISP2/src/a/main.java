package a;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
	Persoana persoana=new Persoana("Ulinici","Andrei","1940329141216",22);
	PunctReferinta punct=new PunctReferinta(45.493663,25.579865,1200);
	PunctReferinta punct1=new PunctReferinta(45.495254, 25.578290,1000);
	PunctReferinta punct3=new PunctReferinta(45.496908, 25.576572,700);
	PunctReferinta punct4=new PunctReferinta(45.499051, 25.576607,500);
	
	String codTurist="client001";
	String codCartela="cartela001";
	Boolean haveInstructor=true;
	Boolean haveAccess=true;
	Boolean facturaPlatita=true;
	int pC = 30;	// Pret Cartela
	int pC1 = 50;
	int pI = 80;	// Pret Instructor
	int pI1 = 100;
	
	Transport t=new Transport("Telescaun");
	Transport t1=new Transport("Teleski");
	
	Turist tt=new Turist("Surdu","Marian","1940203146252",22,true,codCartela,true,true);
	Turist tt1=new Turist(persoana,true,"client002",true,true);
	
	Instructor p=new Instructor("Ski","Instructor","1890404125151",27,"instr001",5);
	tt.assignInstructor(p);
	tt.assignTransport(t);
	tt1.assignInstructor(p);
	tt1.assignTransport(t1);
	
	Acces a=new Acces(codCartela,pC,codTurist);
	Acces a1=new Acces("cartela002",pC1,"client002");
		
	//Traseu()
	
	tt.addAccess(a);
	tt1.addAccess(a1);
	Raport raport=new Raport();
	raport.assignRaport(tt);
	
	//tt.tablouPuncteReferinta.add(punct);
	//tt.tablouPuncteReferinta.add(punct1);
	//Double distance=tt.calculDistantaParcursa();
	ArrayList<PunctReferinta> list = new ArrayList<PunctReferinta>();
	list.add(punct);
	list.add(punct1);
	list.add(punct3);
	list.add(punct4);
	tt.setTablouPuncteReferinta(list);
	Double distance=tt.calculDistantaParcursa();
	
	tt.afisareTurist();
	tt1.afisareTurist();
	
	System.out.println("\nDistanta parcursa de " + tt.Nume+ " este:"+distance+"\n");
	
	Factura f = new Factura("factura001", codTurist, pC+pI);
	f.afisareF(tt);
	
	}
}