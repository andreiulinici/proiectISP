package a;
import java.util.ArrayList;

public class EvidentaTuristi {
public ArrayList<Turist> TuristiActivi;
public ArrayList<Turist> TuristiInactivi;

public void addTurist(Turist p) {
	if (p.isActive) {
		this.TuristiActivi.add(p);
	}
	else {
		this.TuristiInactivi.add(p);
	}
}


public void deleteTurist(Turist p) {
	if (p.isActive) {
		TuristiActivi.remove(p);
	}
	else {
		TuristiInactivi.remove(p);
	}
}


public ArrayList<Turist> getTuristiA() {
	return this.TuristiActivi;
}
}
