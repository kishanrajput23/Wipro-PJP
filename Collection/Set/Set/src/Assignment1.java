import java.util.HashSet;
import java.util.Iterator;

class Country {
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> itr = H1.iterator();
		
		while (itr.hasNext()) {
			if (itr.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country country = new Country();
		country.saveCountryNames("India");
		country.saveCountryNames("USA");
		country.saveCountryNames("Russia");
		country.saveCountryNames("Bangladesh");
		country.saveCountryNames("China");

		System.out.println("India: " + country.getCountry("India"));
		System.out.println("Japan: " + country.getCountry("Japan"));		
	}

}