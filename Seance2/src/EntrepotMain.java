
public class EntrepotMain {
	public static void main(String[] args) {
		Entrepot e = new Entrepot("Saint-Denis",5);
		
		System.out.println(e);
		
        Porte p = new Porte(200,90,"VERTE");
        p.setPrixHT(500.99);
        System.out.println(p.getPrixTTC());
        
        e.ajouterPorte(p);
        
		System.out.println(e);
		
        Porte p2 = new Porte() ;
        p2.setPrixHT(478.99);
        e.ajouterPorte(p2);
		System.out.println(e);
        e.ajouterPorte(p2);
        e.ajouterPorte(p2);
        e.ajouterPorte(p2);
        Porte p3 = new Porte(180,80,"ROUGE");
        p3.setPrixHT(50.97);
        e.ajouterPorte(p3);
        
		System.out.println(e);
	}
	
}
