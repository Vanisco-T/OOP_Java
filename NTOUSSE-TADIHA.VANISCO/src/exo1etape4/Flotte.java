package exo1etape4;
import java.util.ArrayList;
import java.util.List;

public class Flotte {
	protected List<Vehicule> flotte;
    Flotte(){
    	this.flotte=new ArrayList<Vehicule>();
    }
    public void ajouterVehicule(Vehicule v) {
    	flotte.add(v);
    }
    public String toString() {
    	String s="";
    	s +=flotte.size();
    	for ( Vehicule v :flotte) {
    		s+=v;
    	}
    	return s;
    }
}
