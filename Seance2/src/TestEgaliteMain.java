
public class TestEgaliteMain {

	public static void main(String[] args) {
        Porte p1 = new Porte(200,90,"VERTE");
        p1.setPrixHT(500.99);
        Porte p2 = new Porte(200,90,"ROUGE");
        p1.setPrixHT(500.99);
        Porte p3 = new Porte(200,90,"ROUGE");
        p1.setPrixHT(500.99);
        
        if (p1 == p2) {
        	System.out.println("OK");
        }
        else {
        	System.out.println("KO");
        }
        if (p2 == p3) {
        	System.out.println("OK");
        }
        else {
        	System.out.println("KO");
        }
        if (p2.equals(p3)) {
        	System.out.println("OK");
        }
        else {
        	System.out.println("KO");
        }

	}

}
