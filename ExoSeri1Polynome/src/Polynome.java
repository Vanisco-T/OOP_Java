
public class Polynome {
	private final int MAX_COEF=8;
	private double []COEFFICIENT;
	
	public Polynome() {
		COEFFICIENT = new double[MAX_COEF+1];
		for(int i=0;i<COEFFICIENT.length;i++) {
			COEFFICIENT[i]=0;
		}
	}
	
	public Polynome(double coef,int degre) {
		this();
		COEFFICIENT[degre]=coef;		
	}
	
	public Polynome(double coef) {
		this(coef,0);		
	}
	
	public double valeur(int x) {
		int result=0;
		for(int i=0;i<COEFFICIENT.length;i++) {
			result += COEFFICIENT[i]*Math.pow(x, i);
		}
		return result;
	}
	
	public Polynome plus(Polynome p) {
		Polynome s=new Polynome();
		for(int i=0;i<COEFFICIENT.length;i++) {
			s.COEFFICIENT[i]=p.COEFFICIENT[i]+COEFFICIENT[i];
		}
		return s;
	}
	
	public String toString() {
		String s="";
		for(int i=COEFFICIENT.length-1;i>=0;i--) {
			if(Math.signum(COEFFICIENT[i]) == 1.0)
				s+= " + "+COEFFICIENT[i]+" *X^"+i +" ";
			else
				if(Math.signum(COEFFICIENT[i]) == -1.0)
					s+= COEFFICIENT[i]+" *X^"+i +" ";
		}
		return s;
	}
	
	

	
}
