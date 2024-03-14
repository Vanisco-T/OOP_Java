package exo2etape2;

import java.util.Date;
import java.util.Map;
import java.text.*;

public class Reservation {
	private final Date heureArrivee;
	private final int nbPersonnes;
	public Reservation(int n, Date date) {
		this.heureArrivee = date;
		this.nbPersonnes = n;
	}
	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("HH:mm:ss.SSS");
		String s = "Réservée" + " (" + this.nbPersonnes +
				", " + df.format(this.heureArrivee) + ")\n";
		return s ;
	}
}