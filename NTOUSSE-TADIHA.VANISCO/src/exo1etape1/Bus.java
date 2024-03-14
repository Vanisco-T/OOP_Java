package exo1etape1;

public class Bus extends Vehicule{
	private int passagers;
	Bus(String im,int an){
		super(im,an,20);
		this.passagers=0;
	}
	public String toString() {
		return  super.toString()+"-->"+"bus (passagers:" + passagers + ")" ;
	}
	public void setPassager(int p) {
		if(p<=50 && p>=0) {
			this.passagers=p;
		}
	}
}
