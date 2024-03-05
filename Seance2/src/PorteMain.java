

public class PorteMain {

	public static void main(String[] args) {
		
        Porte p1 ;
        
        p1 = new Porte(180,80,"ROUGE");
        System.out.println(p1.toString());
        
        Porte p2 = new Porte(200,90,"VERTE");
        System.out.println(p2.toString());
        
        System.out.println(p2);
        
        p1.repeindre("GRIS");
        System.out.println(p1);
        
        Porte p3 = new Porte() ;
        System.out.println(p3);
        
        p3.ouvrir();
        System.out.println(p3);
        
        Portial P1 = new Portial();
        System.out.println(P1.newString());
  
	}

}
