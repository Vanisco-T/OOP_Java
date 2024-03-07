import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Equipage {
	private List<Marin> maList;

	public Equipage() {
		this.maList = new ArrayList<Marin>();
	}
	public int getNombreMarins() {
		return maList.size();
	}
	public boolean isMarinPresent(Marin m) {
		return maList.contains(m);
	}
	public boolean addMarin(Marin m) {
		if(!this.isMarinPresent(m)) {
			this.maList.add(m);
			return true;
		}else
			return false;
	}
	public String toString() {
		String s="";
		s+="\"";
		for(Marin m:maList) {
			s += m +";";
		}
		s+="\"";
		return s;
	}
	public boolean retirerMarin(Marin m) {
		if(this.isMarinPresent(m)) {
			this.maList.remove(m);
			return true;
		}else
			return false;
	}
	public void clear() {
		this.maList.clear();
	}
	public List<Marin> getEquipage(){
		if(!this.maList.isEmpty()) {
			List<Marin> copy=new ArrayList<Marin>();
			for(Marin m:this.maList) {
				copy.add(m);
			}
			return copy;
		}
		else
			return null;
	}
	public boolean addAllEquipage(Equipage e) {
		for(Marin m:e.getEquipage()) {
			if(this.isMarinPresent(m))
				return false;
		}
		this.maList.addAll(e.maList);
		e.clear();
		return true;
	}
	public Marin getMarinByName(String nom) {
		for(Marin m:this.maList) {
			if(m.getNom().equals(nom))
				return m;
		}
		return null;
	}
	public void augmenterSalaire(double s) {
		for(Marin m:this.maList) {
			m.augmenterSalaire(s);
		}
	}
	public double getMaxSalaire() {
		double max=0.0;
		for(Marin m:this.maList) {
			if(m.getSalaire()>max)
				max=m.getSalaire();
		}
		return max;
	}
	public double getMoyenneSalaire() {
		double moyenne=0.0;
		if(maList.size()>0) {
			for(Marin m:this.maList) {
				moyenne+=m.getSalaire();		
			}
			return moyenne/maList.size();
		}
		return moyenne;
	}
	public double getMedianeSalaire() {
		double median=0.0;
		double [] tab = new double[maList.size()];
		int i=0;
		for(Marin m:this.maList) {
			tab[i]=m.getSalaire();
			i++;
		}
		Arrays.sort(tab);
		if(tab.length %2 == 1)
			return tab[(tab.length/2)+1];
		return (tab[(tab.length/2)+1]+tab[(tab.length/2)])/2;
	}
	public boolean equals(Equipage e) {
		for(Marin m:this.maList) {
			if(!e.maList.contains(m))
				return false;
		}
		return true;
	}
		
}
