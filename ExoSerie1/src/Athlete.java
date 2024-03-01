
public class Athlete {
	private int dossard;
	private static int cpt=1;
	private boolean temoin ;
	private Athlete suivant;
	public  Athlete() {
		dossard=cpt++;
		temoin=false;
		suivant=null;
		}
	public String toString() {
		return "Numero " + dossard;
	}
	public void prendLeTemoin() {
		if(suivant != null) {
			suivant.prendLeTemoin();
			temoin=false;
		}else {
			temoin=true;
		}
	}
	public void rendLeTemoin() {
		if(temoin)
			temoin=false;
	}
	public boolean aLeTemoin() {
		return temoin;
	}
	public void passerLeTemoin(Athlete a) {
		if(temoin && !a.temoin) {
			a.temoin=true;
			temoin=false;
		}
	}
	public void setSuivant(Athlete s) {
		suivant=s;
	}
	
	
}
