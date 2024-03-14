package exo1etape3;

public class Camion extends Vehicule{
	private int charge;
	Camion(String im,int an){
		super(im,an,5);
		this.charge=0;
	}
	public String toString() {
		return  super.toString()+"(VitesseMax:"+super.vitesse+")"+"-->"+"camion (charge:" + charge + ")" ;
	}
	public void setCharge(int ch) {
		if(ch<=6 && ch>=0) {
			this.charge=ch;
		}
	}
	public int vitesseMaximale() {
		if(this.charge>0 && this.charge<=3) {
			this.vitesse=90;
			return this.vitesse;
		}
		if(this.charge>3 && this.charge<=6) {
			this.vitesse=80;
			return this.vitesse;
		}
		else{
			
			this.vitesse=110;
			return this.vitesse;
		}
	}
}
