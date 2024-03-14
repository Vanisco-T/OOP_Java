package exo1etape4;

public class Bus extends Vehicule{
	private int passagers;
	
	Bus(String im,int an){
		super(im,an,20);
		this.passagers=0;
	}
	public String toString() {
		return  super.toString()+"(VitesseMax:"+super.vitesse+")"+"-->"+"bus (passagers:" + passagers + ")" ;
	}
	public void setPassager(int p) {
		if(p<=50 && p>=0) {
			this.passagers=p;
		}
	}
	public int vitesseMaximale() {
		this.vitesse=100;
		return vitesse;
	}
}
