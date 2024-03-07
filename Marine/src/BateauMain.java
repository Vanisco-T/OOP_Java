
public class BateauMain {

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
		Capitaine c1= new Capitaine("Lamine"," ",22,Grade.CAPITAINE);
		System.out.println(c1);
		Equippagecommande ec= new Equippagecommande(c1);
		System.out.println(ec);
		ec.addMarin(m41);
		ec.addMarin(m21);
		ec.addMarin(m31);
		Capitaine c2= new Capitaine("Lami"," ",22,Grade.CAPITAINE);
		ec.addMarin(c2);
		System.out.println(ec);
		
		/*
		impossible de initialiser b1 car abstraite
		Bateau b1=new Bateau("Le vaste",10000,ec);
		*/
		Bateau b1= new BateauAMoteur("Le vaste",10000,ec);
		Bateau b2= new BateauAVoiles("Le vaste",10000,ec);
		Bateau b3= new BateauARames("Le vaste",10000,ec);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
