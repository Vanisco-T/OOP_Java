package exo1etape1;

public class Fourgonnette extends  Vehicule {
	private int charge;
	
	Fourgonnette(String im,int an){
		super(im,an,2);
		this.charge=0;
	}
	@Override
	public String toString() {
		return  super.toString()+"-->"+"fourgonnette (charge:" + charge + ")" ;
	}
	public void setCharge(int ch) {
		if(ch<=3 && ch>=0) {
			this.charge=ch;
		}
	}
	
	
}
