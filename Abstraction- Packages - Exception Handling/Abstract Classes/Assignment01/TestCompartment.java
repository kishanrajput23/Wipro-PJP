import java.util.Random;

abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "You are in First Class Compartment";
	}
	
}

class Ladies extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "You are in Ladies Compartment";
	}
	
}

class General extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "You are in General Compartment";
	}
	
}

class Luggage extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "You are in Lugguage Compartment";
	}
	
}

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartments = new Compartment[10];

		Random random = new Random();
		
	    	for (int i = 0; i < 10; i++) {
	    		int randomNum = random.nextInt((4 - 1) + 1) + 1;
	    	
	    		if (randomNum == 1)
	    			compartments[i] = new Luggage();
	    		else if (randomNum == 2)
	    			compartments[i] = new Ladies();
	    		else if (randomNum == 3)
	    			compartments[i] = new General();
	    		else if (randomNum == 4)
	    			compartments[i] = new FirstClass();
	    	
	    		System.out.println(compartments[i].notice());
	    	}
	}

}
