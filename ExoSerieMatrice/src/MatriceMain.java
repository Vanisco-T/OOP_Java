
public class MatriceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatricePleine m1=new MatricePleine(2,2);
		System.out.println(m1);
		MatricePleine m2=new MatricePleine(2,2);
		System.out.println(m2);
		System.out.println(m1.multiplication(m2));
		System.out.println(m2.transposee());
		System.out.println(m2.addition(m1));
	}

}
