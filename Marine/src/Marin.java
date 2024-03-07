import java.util.Objects;

public class Marin {
	private String nom;
	private String prenom;
	private double salaire;
	private int age;
	
	public Marin(String nom, String prenom, double salaire, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.age = age;
	}

	public Marin(String n, int s) {
		this(n,"",s,0);
	}
	public Marin(String n,String p, int a ) {
		this(n,p,0,a);
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public double getSalaire() {
		return salaire;
	}

	public int getAge() {
		return age;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public String toString() {
		return "\nMarin {n:" + nom + ",p:" + prenom + ",a:" + age + ",s:" + salaire + "}";
	}
	public void vieillir() {
		age++;
	}
	public void augmenterSalaire(double m) {
		salaire+=(m/100)*salaire;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, nom, prenom, salaire);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marin other = (Marin) obj;
		return age == other.age && Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
				//&& salaire == other.salaire;
	}
	
	
}
