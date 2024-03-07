
public class Equippagecommande  extends Equipage{
	private Capitaine commandant;
	
	public Equippagecommande(Capitaine c) {
		super();
		this.commandant=c;
	}
	public Capitaine getCommandant() {
		return commandant;
	}
	public String toString() {
		return "\"EquipageCommande"+commandant+this.getEquipage();
	}
	
}
