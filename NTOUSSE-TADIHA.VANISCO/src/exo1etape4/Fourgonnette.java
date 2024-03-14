package exo1etape4;

public class Fourgonnette extends Vehicule {
	private int charge;
	private int vitesse;
	
	Fourgonnette(String im,int an){
		super(im,an,2);
		this.charge=0;
		this.vitesseMaximale();
	}
	@Override
	public String toString() {
		return  super.toString()+"(VitesseMax:"+super.vitesse+")"+"-->"+"fourgonnette (charge:" + charge + ")" ;
	}
	public void setCharge(int ch) {
		if(ch<=3 && ch>=0) {
			this.charge=ch;
		}
	}
	
	public int vitesseMaximale() {
		if(this.charge>0 && this.charge<=3) {
			this.vitesse=100;
			return this.vitesse;
		}else {
			this.vitesse=110;
			return this.vitesse;
		}
	}
}
