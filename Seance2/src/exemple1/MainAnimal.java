package exemple1;

public class MainAnimal {

	public static void main(String[] args) {
		Animal a1,a2;
		a1=new Animal("chat",2.4);
		a2=new Animal("chien",4.4);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a1));
		
		
	}

}
