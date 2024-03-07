package initiation;

public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		final int TAILLE=5;
		int [] tab;
		tab = new int[TAILLE];
		tab[0]=7;
		tab[1]=6;
		tab[2]=1;
		tab[3]=2;
		tab[4]=4;
		for (int j=0;j<tab.length;j++) {
			if(j%2==1) {
				System.out.println(tab[j]);
			}
			/*else {	
			}	*/
		}
		//Boucle PHARE de POO
		for (int v:tab) {
			System.out.println(v);
		}
		int [][] matrice = new int [TAILLE][3];
		
		
		
		
		
		}
}
