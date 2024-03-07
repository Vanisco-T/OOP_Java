
public class EquipageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marin m1 =new Marin("vanisco"," t",50000,25);
		Marin m2 =new Marin("vanisco"," t",55000,25);
		Marin m3 =new Marin("vanis"," t",5000,20);
		Marin m4 =new Marin("vanisco"," t",50000,25);
		Equipage e1=new Equipage();
		e1.addMarin(m4);
		e1.addMarin(m3);
		e1.addMarin(m2);
		e1.addMarin(m1);
		System.out.println(e1);
		Equipage e2=new Equipage();
		Marin m11 =new Marin("tadiha"," ts",50000,25);
		Marin m21 =new Marin("tadiha"," c",55000,25);
		Marin m31 =new Marin("tad"," a",5000,20);
		Marin m41 =new Marin("tadii"," s",50000,25);
		e2.addMarin(m11);
		e2.addMarin(m21);
		e2.addMarin(m31);
		e2.addMarin(m41);
		System.out.println(e2);
		e1.addAllEquipage(e2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.getMarinByName("vanis"));
		
		Capitaine c= new Capitaine("Ouagal"," ",24,Grade.BOSCO);
		System.out.println(c);	
		e2.addMarin(c);
		System.out.println(e2);
		Capitaine c1= new Capitaine("Lamine"," ",22,Grade.CAPITAINE);
		Capitaine c2= new Capitaine("Vanisco"," ",24,Grade.BOSCO);
		System.out.println(c.equals(c1));
		System.out.println(c.equals(c2));
		System.out.println(c.equals(c));
	}

}
