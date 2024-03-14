package exo1etape4;

public abstract class Vehicule implements IVitesse {
	private String immatriculation;
	private int  anneeAchat;
	private int poids;
	public int vitesse;
	
	public String toString() {
		return "vehicule (annee:"+this.anneeAchat+")"+" "+"(immat:"+this.anneeAchat+")";
	}

	public Vehicule(String im,int an,int p) {
		this.immatriculation=im;
		this.anneeAchat=an;
		this.poids=p;
	}
	public abstract int vitesseMaximale(); 
}

