import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class TestHashSet {

	public static void main(String[] args) {
		Marin m1 =new Marin("vanisco"," t",50000,25);
		Marin m2 =new Marin("vanisco"," t",55000,25);
		Marin m3 =new Marin("vanis"," t",5000,20);
		Marin m4 =new Marin("vanisco"," t",50000,23);
		Marin m5 =new Marin("mehdi"," ougual",65000,21);
		Set<Marin> test =new  HashSet<Marin>();
		test.add(m5);
		test.add(m4);
		test.add(m3);
		test.add(m2);
		test.add(m1);
		System.out.println(test);
		Marin m6 =new Marin("mehdi"," ougual",65000,21);
		test.add(m6);
		System.out.println(test);
		System.out.println(m5.hashCode());
		System.out.println(m6.hashCode());
		System.out.println(m4.hashCode());
		
		//Le parcour du HashSet par le toString
		System.out.println("-------------");
		System.out.println(test.toString());
		// Le parcour du HashSet avec le Iterator
		System.out.println("-------------"); 
		Iterator<Marin> value = test.iterator(); 
		 while (value.hasNext()) { 
	            System.out.println(value.next()); 
	        } 
		//Le parcour du HasSet avec le for each
		 System.out.println("-------------");
		 for(Marin m:test) {
			 System.out.println(m);
		 }
	}

}
