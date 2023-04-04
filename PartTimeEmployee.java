import java.util.*;
public class PartTimeEmployee extends Employee
{
	private double ratePerHour;
	private int hoursWorked;
	private double wage;

	Scanner sc = new Scanner(System.in);
	public void setWage()
	{
		
		System.out.print("Enter rate per hour and number of hours worked separated by spaces: ");
		ratePerHour = sc.nextDouble();
		hoursWorked = sc.nextInt();

	}
	public double getWage()
	{
		wage = ratePerHour * hoursWorked;
		return wage;
	}




}