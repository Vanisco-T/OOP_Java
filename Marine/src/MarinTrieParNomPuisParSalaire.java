import java.util.Comparator;

public class MarinTrieParNomPuisParSalaire  implements Comparator<Marin> {
	@Override
	public int compare(Marin o1, Marin o2) {
		if(o1.getNom().compareTo(o2.getNom())<0 || o1.getNom().compareTo(o2.getNom())>0 ) return o1.getNom().compareTo(o2.getNom());
		if(o1.getSalaire() < o2.getSalaire()) return -1;
		if(o1.getSalaire() > o2.getSalaire()) return +1;
		return 0;
	}

}
