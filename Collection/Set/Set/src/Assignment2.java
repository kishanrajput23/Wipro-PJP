import java.util.Iterator;
import java.util.TreeSet;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		set.add("Ajith");
		set.add("Sam");
		set.add("Maara");
        set.add("kris");
        
        	System.out.println("Original tree set:" + set);  
        	Iterator<String> itr1 = set.descendingIterator();
        	System.out.println("Elements in Reverse Order:");
        	while (itr1.hasNext()) {
       			System.out.println(itr1.next());
        	}
		
		Iterator<String> itr2 = set.iterator();
		String query = "Sam";
		boolean result = false;
		
		while (itr2.hasNext()) {
			if (itr2.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");
	}

}