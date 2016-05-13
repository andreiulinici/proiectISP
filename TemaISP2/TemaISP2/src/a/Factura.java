package a;

import java.util.ArrayList;

public class Factura {	// Asociatie cu Turist
	String codFactura;
	String codTurist;
	int pret;

	public Factura(String c,String b) {
		this.codFactura=c;
		this.codTurist=b;	
	}
	
	public Factura(String c,String b,int pret) {
		this.codFactura=c;
		this.codTurist=b;
		this.pret=pret;
	}
	
	public int addPret(int pret) {
		this.pret = this.pret + pret;
		return this.pret;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	public String getCodFactura() {
	return codFactura;
	}

	public void setCodFactura(String codFactura) {
		this.codFactura = codFactura;
	}

	public String getCodTurist() {
		return codTurist;
	}	

	public void setCodTurist(String codTurist) {
		this.codTurist = codTurist;
	}

	public void afisareF(Turist t) {		
		System.out.println("Factura client:\nCod Factura: "+ codFactura);
		System.out.println("Client: "+t.Nume+" "+t.Prenume);
		System.out.println("CNP: "+t.CNP);
		System.out.println("Cod Client: "+t.codeT);
		System.out.println("Total Plata: "+pret);
	}
}