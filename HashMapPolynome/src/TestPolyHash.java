
public class TestPolyHash {

	public static void main(String[] args) {
		Polynome p=new Polynome();
		Polynome p1=new Polynome(5,5.0);
		Polynome p2=new Polynome(5,5.0);
		Polynome p3=new Polynome(3,2.0);
		Polynome p4=new Polynome(7,4.0);
		Polynome p5=new Polynome(2,4.0);
		Polynome p6=new Polynome(55,10.0);
		p1.plus(p2);
		p1.plus(p3); 
		p1.plus(p4);
		p1.plus(p5);
		p1.plus(p6);
		Polynome p0=new Polynome(1.2);

		p=p0.plus(p1);
		System.out.println(p);
		
		PolynomeTree pt= new PolynomeTree(51,2.0);
		PolynomeTree pt0= new PolynomeTree(1,2.0);
		PolynomeTree pt1= new PolynomeTree(51,10.0);
		pt=pt.plus(pt1);
		pt=pt.plus(pt0);
	    System.out.println(pt);
	}

}
