package a;

public class Instructor extends Persoana {


String code;
int numarClienti;

public Instructor(String nume, String prenume, String cnp, int varsta,String code,int numarClienti) {
	super(nume, prenume, cnp, varsta);
	this.code=code;
	this.numarClienti=numarClienti;
}
public void afisareI() {
	System.out.println(Nume);
	System.out.println(Prenume);
	System.out.println(CNP);
	System.out.println(varsta);
	System.out.println(code);
	System.out.println(numarClienti);
}


public void emiteFactura(Factura f) {
	System.out.println("Factura emisa:");
	System.out.println(f.codFactura);
	System.out.println(f.codTurist);
	
}
public void assignClient(){
	this.numarClienti+=1;
}

public int getTuristiInscrisi() {
	return this.numarClienti;
}

}
