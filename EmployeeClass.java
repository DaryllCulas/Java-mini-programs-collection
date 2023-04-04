import java.util.*;
class EmployeeClass extends Employee
{
	
	public static void main(String[] args)
	 {
	 	Scanner sc = new Scanner(System.in);
	 	String selection;
		Employee obj1 = new Employee();
		PartTimeEmployee obj2 = new PartTimeEmployee();
		FullTimeEmployee obj3 = new FullTimeEmployee();
		EmployeeClass objMain = new EmployeeClass();


		//First Execution code from Employee.java class
		
		obj1.setName(); //Calling out object from Employee.java class


		

		//Second Execution code 
		System.out.println("Press F for full time or P for Part time:");
		selection = sc.next().toUpperCase();

	try
	{
		switch(selection)
		{
			case "P":
			obj2.setWage();
			System.out.println("Name: "+obj1.getName()); //calling out object from PartTimeEmployee.java Class
			System.out.println("Wage: "+obj2.getWage()); //calling out object from PartTimeEmployee.java Class
			break;

			case "F":
			obj3.setMonthlySalary();
			System.out.println("Name: "+obj1.getName()); //calling out object from FullTimeEmployee.java Class
			System.out.println("Monthly Salary: "+obj3.getMonthlysalary());
			break;

			default:
			System.out.println("Invalid input");
			System.out.println();


		}

		
	}
	catch(Exception a)
	{
		System.out.println(" Invalid input!, Please try again!!");
		obj1.setName();
		System.out.println();

	}


	}

}