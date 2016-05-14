package a;
import java.util.ArrayList;

public class PunctReferinta {	// Compozitie cu Turist
	double cx;
	double cy;
	double alt;

	public double getCx() {
		return cx;
	}

	public void setCx(double cx) {
		this.cx = cx;
	}

	public double getCy() {
		return cy;
	}

	public void setCy(double cy) {
		this.cy = cy;
	}

	public double getAlt() {
		return alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

	public PunctReferinta(double x,double y,double z) {
		this.cx=x;
		this.cy=y;
		this.alt=z;
	}

	public PunctReferinta getCoord(PunctReferinta p) {
		return p;	
	}

	public Boolean estePePartie(Turist p,Partie x){
		if (p.locatie.cx>x.pctInceput.cx && p.locatie.cy>x.pctInceput.cy && p.locatie.cx<x.pctSfarsit.cx && p.locatie.cy<x.pctSfarsit.cy) {
			return true;
		}
		else {
			return false;
		}
	}
}