
public class MarinComparable extends Marin implements Comparable<Marin> {


	public MarinComparable(String n, int s) {
		super(n, s);
	}

	public int compareTo(Marin o) {
		if(this.getSalaire() > o.getSalaire()) return -1;
		if(this.getSalaire() < o.getSalaire()) return +1;
		return 0;
	}

	

}
