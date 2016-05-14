package a;
import java.util.ArrayList;

public class Turist extends Persoana {

	PunctReferinta locatie;
	String codeT;
	Boolean isActive;
	Boolean haveInstructor;
	Instructor Instructor;
	Transport Transport;
	Boolean haveAccess;
	Acces Access;
	ArrayList<Partie> Traseu;
	Boolean facturaPlatita;
	Traseu traseu;
	Factura factura;
	ArrayList<PunctReferinta> tablouPuncteReferinta;

	public Turist(String Nume,String Prenume,String CNP,int varsta,Boolean isActive,String codeT,Boolean haveInstruct,Boolean haveAcces) {
	
		super(Nume,Prenume,CNP,varsta);
		//this.locatie=locatie;
		this.isActive=isActive;
		this.codeT=codeT;
		this.haveInstructor=haveInstruct;
		this.haveAccess=haveAcces;
	}

	public Turist(Persoana Pers,Boolean isActive,String codeT,Boolean haveInstruct,Boolean haveAcces) {
		super(Pers.Nume, Pers.Prenume, Pers.CNP, Pers.varsta);
		this.isActive=isActive;
		this.codeT=codeT;
		this.haveInstructor=haveInstruct;
		this.haveAccess=haveAcces;
	}

	public void Turist( String string, Traseu traseu2) {	
		this.codeT=string;
		this.traseu=traseu2;
	}

	public Traseu getTraseu() {
		System.out.println(this.traseu);
		return this.traseu;
	}

	public void afisareTurist() {
		//afisare turist
		System.out.println("\nTurist:");
		System.out.println(this.Nume);
		System.out.println(this.Prenume);
		System.out.println(this.varsta);
		System.out.println(this.CNP);
		System.out.println(this.codeT); //code Turist
		if(this.haveInstructor) {
			this.Instructor.afisareI();
		}
		else {
			System.out.println("Not having instruct");
		}
		if (this.haveAccess){
			this.Access.afisare();
		}
	}

	public void assignInstructor(Instructor p) {
		this.Instructor=p;
	}

	public void addPunctReferinta(PunctReferinta p) {
		this.tablouPuncteReferinta.add(p);
	}
	public static double round(double value, int places) {
		if (places < 0) throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}

	public double calculDistantaParcursa() {
		final int R = 6371; // Radius of the earth
		double  distance=0d;
		double  distanceToReturn=0d;
	 
		for (int i=0;i<tablouPuncteReferinta.size()-1;i++) {
			Double latDistance = Math.toRadians(tablouPuncteReferinta.get(i+1).cx - tablouPuncteReferinta.get(i).cx);
			Double lonDistance = Math.toRadians(tablouPuncteReferinta.get(i+1).cy - tablouPuncteReferinta.get(i).cy);
			Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
					+ Math.cos(Math.toRadians(tablouPuncteReferinta.get(i+1).cx)) * Math.cos(Math.toRadians(tablouPuncteReferinta.get(i).cx))
		            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
			Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
			distance = R * c * 1000; // convert to meters
			double height = tablouPuncteReferinta.get(i+1).alt-tablouPuncteReferinta.get(i).alt;
			distance = Math.pow(distance, 2) + Math.pow(height, 2);
			distanceToReturn=distanceToReturn+distance;
		}
	 	return round((Math.sqrt(distanceToReturn)),2);
	}

	public void assignPartie(Partie p) {
		this.Traseu.add(p); //adaugare partie in traseu
	}
	
	public void assignTransport(Transport p) {
		this.Transport=p;
	}

	public void addAccess(Acces a) {
		this.Access=a;	
	}

	public String getCodeT() {
		return codeT;
	}

	public void setCodeT(String codeT) {
		this.codeT = codeT;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public ArrayList<PunctReferinta> getTablouPuncteReferinta() {
		return tablouPuncteReferinta;
	}
	

	public Boolean obtineAccess( Boolean b,Acces a ) {
		this.haveAccess=b;
		if (b) {
			this.Access=a;
		}
		else {
			this.Access=null;
		}
		return b;
	
	}
	
	public Boolean getAcces() {
		return this.haveAccess;
	}

	public Boolean platireFactura() {
		Boolean x=true;
		if (this.haveInstructor) {
			if (this.facturaPlatita) {
				x=true;	
			}
			else {
				x=false;
			}
		}
		return x;
	}
	
	public void setTraseu(Traseu altTraseu) {
		this.traseu=altTraseu;
	}

	public void setTablouPuncteReferinta(ArrayList<PunctReferinta> a) {
		this.tablouPuncteReferinta=a;
	}
	
}