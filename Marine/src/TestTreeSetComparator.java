import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetComparator {

	public static void main(String[] args) {
		Marin m1 =new Marin("vanisco"," t",50000,25);
		Marin m2 =new Marin("vanisco"," t",55000,25);
		Marin m3 =new Marin("anis"," t",5000,20);
		Marin m4 =new Marin("banisco"," t",50000,25);
		Marin m5 =new Marin("zanisco"," t",5000,25);
		MarinTrieParNomPuisParSalaire comp1 = new MarinTrieParNomPuisParSalaire();
		Set<Marin> test =new  TreeSet<Marin>(comp1);
		test.add(m4);
		test.add(m3);
		test.add(m2);
		test.add(m1);
		test.add(m5);
		System.out.println(test);
		
	}

}
