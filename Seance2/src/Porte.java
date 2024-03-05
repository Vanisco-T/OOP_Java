

public class Porte {
	private int hauteur;
	private int largeur;
	private String couleur ;
	private final String madein="MADE IN FRANCE";
	private static double TVA=20.5;
	private boolean ferme;
	private double prixHT ;
	
	public Porte() {
		/*hauteur = 182 ;
		largeur = 85 ;
		couleur = "BLANC" ;*/
		this(182,870,"BLANC");
	}
	
	public Porte (int h, int l , String c) {
		this.hauteur = h ;
		this.largeur = l ;
		couleur = c ;
		ferme = true ;
		prixHT = 0.0 ;
	}
	
	public String toString() {
		String s ;
		s= "{" + hauteur + "," + largeur + "," + couleur + "," + ferme + "," + prixHT +"}";
		return s ;
	}
	
	public void repeindre(String c) {
		couleur = c ;
	}
	
	public void rabotter(int t) {
		hauteur -= t ;
	}
	
	public void ouvrir() {
		ferme = false ;
	}

	public void fermer() {
		ferme = true ;
	}
	
	public void setPrixHT(double px) {
		prixHT = px ;
	}
	
	public double getPrixTTC() {
		return prixHT + (prixHT*Porte.TVA/100.0);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((couleur == null) ? 0 : couleur.hashCode());
		result = prime * result + hauteur;
		result = prime * result + largeur;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Porte other = (Porte) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (hauteur != other.hauteur)
			return false;
		if (largeur != other.largeur)
			return false;
		return true;
	}
}
