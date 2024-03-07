
public class BateauAMoteur extends Bateau {
	public BateauAMoteur(String n,int t,Equippagecommande e) {
		super(n,t,e);
	}
	
	public String getPropulsion() {
		return "moteur";
	}
}
