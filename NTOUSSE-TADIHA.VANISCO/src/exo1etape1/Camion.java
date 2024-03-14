package exo1etape1;

public class Camion extends Vehicule{
	private int charge;
	Camion(String im,int an){
		super(im,an,5);
		this.charge=0;
	}
	public String toString() {
		return  super.toString()+"-->"+"camion (charge:" + charge + ")" ;
	}
	public void setCharge(int ch) {
		if(ch<=6 && ch>=0) {
			this.charge=ch;
		}
	}
}
