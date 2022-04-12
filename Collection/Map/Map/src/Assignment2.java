import java.util.*;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> treeMap= new TreeMap<String, String>();
		treeMap.put("1234567890","Abdul");
		treeMap.put("2345678901","baskar");
		treeMap.put("3456789012","Catherine");
		treeMap.put("4567890123","DumbulDoor");
		treeMap.put("5678901234","Escanor");
		
		//provides phone number and get the contact name.
		System.out.print("Contact Name: "+treeMap.get("1234567890"));
		System.out.println();
		
		//provides contact name and get the phone number.
		Set<Map.Entry<String, String>> entries = treeMap.entrySet();
		String strValue = "Escanor";
		for( Map.Entry<String, String> entry : entries ){
            if(entry.getValue().equals(strValue)){
                System.out.println("Contact Number of " + strValue + " is: " + entry.getKey());
                break;
            }
		}
		//print all the contact names and their respective phone numbers and observe the output.
		System.out.print("Contact Number & Names: "+treeMap);
		
	}
}
