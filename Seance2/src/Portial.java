//super means call the constructor of a super class
public class Portial extends Porte {
	private int batan;
	Portial(){
		this.batan=2;
	}
	Portial(int batan){
		this.batan=batan;
	}
	
	public String newString() {
		return this.toString().substring(0, this.toString().length()-1) + ","+this.batan +"}";
		
	}
	
}
