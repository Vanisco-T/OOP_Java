
public class MainAthlete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athlete a1=new Athlete();
		Athlete a2=new Athlete();
		Athlete a3=new Athlete();
		Athlete a4=new Athlete();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a1.aLeTemoin());
		//a1.prendLeTemoin(); //tester la methode prend le temoin
		System.out.println(a1.aLeTemoin());
		System.out.println("a2 temoin "+a2.aLeTemoin());
		//a1.passerLeTemoin(a2);// tester la methode passer le temoin
		System.out.println("a2 temoin "+a2.aLeTemoin());
		System.out.println("a1 temoin "+a1.aLeTemoin());
		//a3 a4 a1 a2
		a3.setSuivant(a4);
		a4.setSuivant(a1);
		a1.setSuivant(a2);
		a3.prendLeTemoin();
		System.out.println("A la fin de la course \n");
		System.out.println("a1 temoin "+a1.aLeTemoin());
		System.out.println("a2 temoin "+a2.aLeTemoin());
		System.out.println("a3 temoin "+a3.aLeTemoin());
		System.out.println("a4 temoin "+a4.aLeTemoin());
		
	}

}
