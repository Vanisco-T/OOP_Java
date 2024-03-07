
public class MarinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marin m1 =new Marin("vanisco"," t",50000,25);
		Marin m2 =new Marin("vanisco"," t",55000,25);
		Marin m3 =new Marin("vanis"," t",5000,20);
		Marin m4 =new Marin("vanisco"," t",50000,25);
		System.out.println(m1);
		//m1.vieillir();
		//m1.augmenterSalaire(20.5);
		if(m1==m4)
			System.out.println("Vrai");
		else
			System.out.println("faux");
		//deuxieme test 
		if(m1.equals(m4))
			System.out.println("Vrai");
		else
			System.out.println("faux");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());
		
		
		
	}

}
