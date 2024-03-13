import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

public class PolynomeTree {
	private SortedMap<Integer,Double> map;
	public PolynomeTree() {
		TreeSetDecroissant comp1 = new TreeSetDecroissant();
		map = new TreeMap<Integer,Double>(comp1);
	}

	public PolynomeTree(int degre,double coef) {
		this();
		if(coef !=0)map.put(degre, coef);	
	}

	public PolynomeTree(double coef) {
		this();
		map.put(0, coef);
	}
	public double getValueFromKey(int i) {
		return map.get(i);
	}
	public PolynomeTree plus(PolynomeTree p) {
		Collection<Integer> puissance;
		puissance=p.map.keySet();
		PolynomeTree re = new PolynomeTree();
		re.map=map;
		for(Integer a:puissance) {
			if(map.containsKey(a)) {
				re.map.put(a, this.map.get(a)+p.map.get(a));
			}
			else {
			re.map.put(a, p.map.get(a));
			}
		}
		return re ;
	}

	public String toString() {
		String s="";
		Collection<Integer> puissance;
		puissance=map.keySet();
		for(Integer a:puissance) {
			if(map.get(a)>=0) {
				s+=" + "+map.get(a)+"*X^"+a;
			}
			else {
				s+=" "+map.get(a)+"^"+a;
			}
		}
		return s;
	}




}
