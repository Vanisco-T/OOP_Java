package exo2etape2;

import java.util.Comparator;

public class ComparateurTable implements Comparator<Table>{

	public int compare(Table o1, Table o2) {
		if (o1.getCapacite() >o2.getCapacite()) return -1 ;
		if (o1.getCapacite()<o2.getCapacite()) return +1 ;
		 //Ici la capacite est la meme	
		if (o1.getCouleur().compareTo(o2.getCouleur()) < 0) return -1 ;
		
		if (o1.getCouleur().compareTo(o2.getCouleur()) > 0) return +1 ;
		
		else return 0 ; 	
	}
	
}
