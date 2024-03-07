import java.util.Objects;

public abstract class Bateau implements IProplusion {
	private String nom;
	private int tonnage;
	private Equippagecommande equipage;
	
	public Bateau(String n,int t,Equippagecommande e) {
		this.nom=n;
		this.tonnage=t;
		this.equipage=e;
	}
	public String toString() {
		return "Bateau [nom :"+this.nom+","+"tonnage :"+this.tonnage+","+"Commandant:"+this.equipage.getCommandant().getNom()+" ,Mode de proplusion: "+this.getPropulsion()+"\nmembres de l'equipage\n["+this.equipage.getEquipage()+"]"+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bateau other = (Bateau) obj;
		return Objects.equals(nom, other.nom);
	}
	
	
}
