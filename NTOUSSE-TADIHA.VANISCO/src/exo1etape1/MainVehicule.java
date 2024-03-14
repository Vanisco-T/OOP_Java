package exo1etape1;

public class MainVehicule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camion c=new Camion("DHDH 56",3000);
		System.out.println(c);
		Fourgonnette f=new Fourgonnette(" 56",3000);
		System.out.println(f);
		Taxi t=new Taxi("dfd",22);
		System.out.println(t);
		Bus b=new Bus("BFd",55);
		System.out.println(b);
	}

}
