package exo1etape1;

public abstract class Vehicule {
	private String immatriculation;
	private int  anneeAchat;
	private int poids;
	
	public String toString() {
		return "vehicule (annee:"+this.anneeAchat+")"+" "+"(immat:"+this.anneeAchat+")";
	}

	public Vehicule(String im,int an,int p) {
		this.immatriculation=im;
		this.anneeAchat=an;
		this.poids=p;
	}
}

