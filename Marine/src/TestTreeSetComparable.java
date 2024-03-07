import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetComparable {

	public static void main(String[] args) {
		MarinComparable m1 =new MarinComparable("vanisco",50000);
		MarinComparable m2 =new MarinComparable("vanisco",25);
		MarinComparable m3 =new MarinComparable("vanis",2000);
		MarinComparable m4 =new MarinComparable("vanisco",1000);
		MarinComparable m5 =new MarinComparable("mehdi",21);
		Set<MarinComparable> test =new  TreeSet<MarinComparable>();
	    test.add(m1);
		test.add(m2);
		test.add(m3);
		test.add(m5);
		test.add(m4);
		System.out.println(test);
	}

}
