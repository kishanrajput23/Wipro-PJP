import java.util.*;
public class Assignment3 {
	public static void main(String args[]) {
		Vector<Integer> vector=new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		
		//iterator
		Iterator<Integer>iterator=vector.iterator();
		System.out.print("Iterator: ");
		while(iterator.hasNext())
			System.out.print(iterator.next()+" ");
		System.out.println();
		
		//ListIterator
		ListIterator<Integer>listIterator=vector.listIterator();
		System.out.print("List Iterator: ");
		while(listIterator.hasNext())
			System.out.print(listIterator.next()+" ");
		System.out.println();
		
		//Enumerators
		Enumeration<Integer>enumeration=vector.elements();
		System.out.print("Enumeration: ");
		while(enumeration.hasMoreElements())
			System.out.print(enumeration.nextElement()+" ");
		System.out.println();
	}

}
