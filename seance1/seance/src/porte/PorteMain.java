package porte;

public class PorteMain {
	public static void main(String[] args) {
		Porte p ;
	    p=new Porte(180,10,"rouge");
	    System.out.println(p.toString());
	   Porte p2=new Porte(18,1,"vert");
	   System.out.println(p2.toString());
	   p.repaindre("blue");
	   System.out.println(p.toString());
	}
 	
}
