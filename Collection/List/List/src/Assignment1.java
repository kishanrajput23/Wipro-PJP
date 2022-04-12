import java.util.*;

public class Assignment1 {
	public static void main(String args[]){
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("Element1");
		arrayList.add("Element2");
		arrayList.add("Element3");
		arrayList.add("Element4");
		arrayList.add("Element5");
		arrayList.add("Element6");
		Iterator<String>iterator=arrayList.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
	}

}
