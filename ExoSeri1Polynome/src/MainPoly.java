
public class MainPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynome p1=new Polynome(3.0,2);
		System.out.println(p1);
		Polynome p2=new Polynome(-1.0,1);
		System.out.println(p2);
		Polynome p3=new Polynome(6.0);
		System.out.println(p3);
		Polynome p= p1.plus(p2.plus(p3));
		System.out.println(p);
		System.out.println(p.valeur(2));
		
	}

}
