
public class BateauAVoiles extends Bateau {
	public BateauAVoiles(String n,int t,Equippagecommande e) {
		super(n,t,e);
	}
	
	public String getPropulsion() {
		return "voiles";
	}
}
