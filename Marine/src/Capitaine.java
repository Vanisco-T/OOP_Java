import java.util.Objects;

public class Capitaine extends Marin {
	private Grade grade;
	public Capitaine(String nom, String prenom, double salaire, int age,Grade g) {
		super(nom,prenom,salaire,age);
		this.grade=g;
	}
	public Capitaine(String n, int s,Grade g) {
		super(n,s);
		this.grade=g;
	}
	public Capitaine(String n,String p, int a,Grade g ) {
		super(n,p,a);
		this.grade=g;
	}
	public Grade getGrade() {
		return this.grade;
	}
	public String toString() {
		return  "\""+super.toString()  + "- >" + this.grade+"\"";	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(grade);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitaine other = (Capitaine) obj;
		return grade == other.grade;
	}
	
	
}
