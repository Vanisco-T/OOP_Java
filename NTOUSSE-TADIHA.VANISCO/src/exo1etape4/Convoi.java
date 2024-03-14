package exo1etape4;

import java.util.ArrayList;
import java.util.List;

public class Convoi extends Flotte {
	private Vehicule vehiculeDeTete;
    Convoi(Vehicule v){
    	super();
    	this.vehiculeDeTete=v;
    }
    public int vitesseConvoi() {
    	int min=0;
    	int max=0;
    	for (Vehicule v: this.flotte) {
    		min=v.vitesse;
    		max=v.vitesse;
    	}
    	for (Vehicule v: this.flotte) {
    		if(v.vitesse<=min) {
    			min=v.vitesse;
    		}else {
    			max=v.vitesse;
    			this.vehiculeDeTete=v;
    		}
    	}
    	return min;
    }
    public String toString() {
    	String s="";
    	s+="Convoi :"+this.vehiculeDeTete +"\n"+super.toString()+"\n"+"Vittesse convoi "+this.vitesseConvoi();
    	return s;
    }
    
}
