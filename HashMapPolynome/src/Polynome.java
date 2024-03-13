import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Polynome {
	private Map<Integer,Double> map;
	public Polynome() {
		this.map = new HashMap<Integer,Double>();
	}
	
	public Polynome(int degre,double coef) {
		this();
		if(coef !=0)map.put(degre, coef);	
	}
	
	public Polynome(double coef) {
		this();
		map.put(0, coef);
	}
	public double getValueFromKey(int i) {
		return map.get(i);
	}
	public Polynome plus(Polynome p) {
		Collection<Integer> puissance;
		puissance=p.map.keySet();
		Polynome re = new Polynome();
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
		List<Integer> sortedKeys = map.keySet().stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		for(Integer a:sortedKeys) {
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
