package exo2etape2;

import java.util.Objects;

public class Table {
	private final String couleur;
	private final int capacite;
	public Table(String c, int capacite) {
		this.couleur = c;
		this.capacite = capacite;
	}
	public String getCouleur() {
		return couleur;
	}
	public int getCapacite() {
		return capacite;
	}
	@Override
	public String toString() {
		return "Table " + couleur + " (" + capacite + " places) ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(capacite, couleur);
	}
	
}