package a;

public class Acces {
String codCartela;
int pret;
String codTurist;



public  Acces(String a,int b,String c) {
	this.codCartela=a;
	this.pret=b;
	this.codTurist=c;
}

	public void setAcces(Turist p) {
			if (codCartela!=null){
				p.haveAccess=true;
				
			}
			else {
				p.haveAccess=false;
			}
		}

public void deleteAccess(Turist p) {
				p.haveAccess=false;
		}
public void afisare() {
	System.out.println("codCartela:"+codCartela);
	System.out.println("Pret:"+pret);
	System.out.println("codTurist:"+codTurist);
	
	
	
}
}
