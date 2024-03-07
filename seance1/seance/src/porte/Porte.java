package porte;

public class Porte {
	//definition des attribu ou champ ou proprietes
	private int hauteur;
	private int largeur;
	private Coleur couleur;
	//constructeur de la classe
	Porte(int h, int l, Coleur c){
		hauteur=h;
		largeur=l;
		couleur=c;
	}
	public String toString() {
		String s;
		s= "{" + hauteur +"," + largeur+ "," + Coleur + "}";
		return s;
	}
	public void repaindre (Coleur c) {
		couleur = c;
	}
	
}
