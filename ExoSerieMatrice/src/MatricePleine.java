import java.util.Random;

public class MatricePleine {
	private int hauteur;
	private int largeur;
	private int[][] mat;
	
	public MatricePleine(int h,int l) {
		this.hauteur=h;
		this.largeur=l;
		mat=new int [h][l];
		Random r = new Random();
		for(int i=0;i<hauteur;i++) {
			for(int j=0;j<largeur;j++) {
				mat[i][j]=r.nextInt(10) ;	
			}
		}
	}
	
	public void set(int x, int y, int valeur) {
		mat[x][y]=valeur;
	}
	
	public int get(int x, int y) {
		return mat[x][y];
	}
	
	public int getHauteur() {
		return hauteur;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public String toString() {
		String s="";
		for(int i=0;i<hauteur;i++) {
			for(int j=0;j<largeur;j++) {
				s+=mat[i][j]+" ";	
			}
			s+="\n";
		}
		return s;
	}
	
	private int getNbNonNuls() {
		int count=0;
		for(int i=0;i<hauteur;i++) {
			for(int j=0;j<largeur;i++) {
				if(mat[i][j]==0)
					count++;
			}
		}
		return count;
	}
	
	public double getTauxRemplissage() {
		double taux=0.0;
		int nombre = (hauteur*largeur)-getNbNonNuls();
		return (nombre/(hauteur*largeur))/100;
	}
	
	public MatricePleine addition(MatricePleine m) {
		if (hauteur == m.hauteur && largeur==m.largeur) {
			MatricePleine c=new MatricePleine(hauteur,largeur);
			for(int i=0;i<hauteur;i++) {
				for(int j=0;j<largeur;j++) {
					c.set(i, j, get(i,j)+c.get(i, j));
				}
			}
			return c;
		}else
			return null;
	}
	
	public MatricePleine transposee() {
		MatricePleine c=new MatricePleine(largeur,hauteur);
		for(int i=0;i<hauteur;i++) {
			for(int j=0;j<largeur;j++) {
				c.set(j, i, get(i,j));
			}
		}
		return c;
	}
	public MatricePleine multiplication(MatricePleine m) {
		if(largeur == m.hauteur) {
			MatricePleine c=new MatricePleine(hauteur,m.largeur);
			for(int i=0;i<c.hauteur;i++) {
				for(int j=0;j<c.largeur;j++) {
					c.set(i, j, 0);
				}
			}
			
			for(int i=0;i<c.hauteur;i++) {
				for(int j=0;j<c.largeur;j++) {
					for(int k=0;k<m.hauteur;k++) {
						c.set(i, j, c.get(i, j)+get(i, k)*m.get(k, j));
					}
				}
			}
			return c;
		}else
			return null;
	}
}
