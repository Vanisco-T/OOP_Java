
public class Entrepot {
   private String adresse ;
   private Porte [] stock;
   private int capacite;
   private int nbPortes;
   
   public Entrepot (String adresse, int capacite) {
	   this.adresse = adresse;
	   this.capacite = capacite;
	   stock = new Porte [capacite];
	   nbPortes = 0;
   }
   
   public String toString() {
	   
	   String s ;
	   
	   s = adresse + "/" + nbPortes + "/" + capacite + "\n" ;
	   for (int i=0 ; i<capacite ; i++) {
		   if (stock[i] != null) {
			   s += stock[i].toString() + "\n" ;
		   }
	   }
	   return s ; 
		   
	   
   }
   
   public void ajouterPorte(Porte p) {
	   if (nbPortes == capacite) {
		   System.out.println("STOP lentrepot est plein!!");
		   return ;
	   }
	   boolean trouve = false ;
	   int i = 0 ;
	   while (trouve == false && i<capacite) {
		   if (stock[i] == null) {
			   stock[i] = p ;
			   trouve = true ;
			   nbPortes++;
		   }
		   else i++;
	   }
	   //if (trouve == false) System.out.println("STOP lentrepot est plein!!");
   }
}
