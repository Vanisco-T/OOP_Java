package exo2etape1;
import java.util.Set;
import java.util.TreeSet;

public class Restaurant {
	private Set<Table> tables ;
	Restaurant(){
		ComparateurTable cmp1 = new ComparateurTable();
		this.tables = new TreeSet<Table>(cmp1);
	}
	public void addTable(String c, int capacite) {
		this.addTable(c, capacite);
	}
	
}
