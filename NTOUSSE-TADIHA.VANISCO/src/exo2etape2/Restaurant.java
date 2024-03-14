package exo2etape2;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Restaurant {
	private Set<Table> tables ;
	private Map<Table,Reservation> tablesReservees;
	Restaurant(){
		ComparateurTable cmp1 = new ComparateurTable();
		this.tables = new TreeSet<Table>(cmp1);
		this.tablesReservees = new HashMap<Table,Reservation>();
	}
	public void addTable(String c, int capacite) {
		this.addTable(c, capacite);
	}
	public boolean tableDejaReservee(Table table) {
		for(Table t:tables) {
			if(this.tablesReservees.containsKey(table)) {
				return true;
			}
		}
		return false;
	}
	private Table trouverUneTable(int nbPersonnes) {
		for(Table t:tables) {
			if(!this.tableDejaReservee(t) && t.getCapacite()>=nbPersonnes) {
				return t;
			}
		}
		return null;
	}
	public Table addReservation(int nbPersonnes, Date heureArrivee) {
		Table t = this.trouverUneTable(nbPersonnes);
		Reservation r = new Reservation(nbPersonnes,heureArrivee);
		this.tablesReservees.put(t, r);
		return t;
	}
	
	
}
