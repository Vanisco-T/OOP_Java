package exemple1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String adresse;
	private List<Animal> enclos;
	
	public Zoo(String a) {
		this.adresse=a;
		this.enclos=new ArrayList<Animal>();
	}
	public String  toString() {
		String s= this.adresse + " / " + enclos.size() +"\n";
		for(Animal a:enclos) {
			s+=a+"\n";
		}
		return s;
	}
	public void addAnimal(Animal a) {
		if(!isPresent(a)) {
			enclos.add(a);
		}
	}
	public  void removeAnimal(Animal a) {
		 enclos.remove(a);
	}
	public boolean isPresent(Animal a) {
		return enclos.contains(a);
	}
	
}
