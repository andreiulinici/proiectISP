package a;

public class Partie {	// Compozitie
	String dificultate;
	PunctReferinta pctInceput;
	PunctReferinta pctSfarsit;
	
	public Partie(String dificultate, PunctReferinta pctInc, PunctReferinta pctSfarsit) {
		this.dificultate=dificultate;
		this.pctInceput=pctInc;
		this.pctSfarsit=pctSfarsit;
	}
	 
	public String getDificultate() {
		return dificultate;
	}

	public void setDificultate(String dificultate) {
		this.dificultate = dificultate;
	}

	public PunctReferinta getPctInceput() {
		return pctInceput;
	}

	public void setPctInceput(PunctReferinta pctInceput) {
		this.pctInceput = pctInceput;
	}

	public PunctReferinta getPctSfarsit() {
		return pctSfarsit;
	}

	public void setPctSfarsit(PunctReferinta pctSfarsit) {
		this.pctSfarsit = pctSfarsit;
	}

	public void afisare() {
		System.out.println("Dificultate:"+dificultate);
		System.out.println("Coordonate Partie:");
		System.out.println("Punct Inceput:"+pctInceput);
		System.out.println("Punct Sfarsit:"+pctSfarsit);
	}
}