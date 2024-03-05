package exemple1;

import java.util.Objects;

public class Animal {

	private String nom;
	private double poids;
	
	public Animal(String nom,double poids) {
		this.nom=nom;
		this.poids=poids;
	}
	
	public String toString() {
		return this.nom + "," + this.poids;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom, poids);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(nom, other.nom) && Double.doubleToLongBits(poids) == Double.doubleToLongBits(other.poids);
	}
	
	
	
}
