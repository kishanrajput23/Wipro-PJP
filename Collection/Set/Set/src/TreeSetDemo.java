import java.util.*;

class Employee {
	Set<Integer> empID=new TreeSet<>();
	Set<String> name= new TreeSet<>();
	Set<Float> salary=new TreeSet<>();
	
	public boolean addEmployee() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Employee number: ");
		{int temp=scanner.nextInt();
		empID.add(temp);}
		System.out.print("Enter the Employee Name: ");
		{String temp=scanner.next();
		name.add(temp);}
		System.out.print("Enter the Employee Salary: ");
		{Float temp=scanner.nextFloat();
		salary.add(temp);}
		scanner.close();
		System.out.println("Employee details added..");
		return true;
	}
	public void displayAllEmployees() {
		System.out.println(empID);
		System.out.println(name);System.out.println(salary);
	}
}

public class TreeSetDemo{
	public static void main(String[] args){
		Employee employee=new Employee();
		employee.addEmployee();
		employee.displayAllEmployees();
	}
}
