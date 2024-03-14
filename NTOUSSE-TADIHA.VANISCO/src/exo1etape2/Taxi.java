package exo1etape2;

public class Taxi extends Vehicule {
	private int passagers;
	Taxi(String im,int an){
		super(im,an,2);
		this.passagers=0;
	}
	public String toString() {
		return  super.toString()+"(VitessMax:"+super.vitesse+")"+"-->"+"taxi (passagers:" + passagers + ")" ;
	}
	public void setPassager(int p) {
		if(p<=4 && p>=0) {
			this.passagers=p;
		}
	}
	public int vitesseMaximale() {
		this.vitesse=130;
		return vitesse;
	}
}
