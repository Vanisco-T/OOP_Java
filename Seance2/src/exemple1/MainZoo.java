package exemple1;

public class MainZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo z=new Zoo("Mon nouveau zoo");
		System.out.println(z);
		Animal o1=new Animal("oiseau",1.2);
		z.addAnimal(o1);
		System.out.println(z);
		z.removeAnimal(o1);
		System.out.println(z);
		z.addAnimal(o1);
		z.addAnimal(o1);
		System.out.println(z);
	}

}
