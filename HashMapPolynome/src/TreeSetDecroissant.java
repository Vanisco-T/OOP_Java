

import java.util.Comparator;

public class TreeSetDecroissant implements Comparator<Integer> {
	public int compare(Integer p1, Integer p2) {
		if (p1 >p2) return -1 ;
		if (p1<p2) return 1 ;
		else return 0 ; 	
	}

}