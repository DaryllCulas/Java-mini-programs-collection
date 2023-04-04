import java.util.*;
public class FullTimeEmployee extends Employee
{
	private double monthlySalary;

	public void setMonthlySalary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rate per hour for monthly Salary: ");
		ratePerHour2 = sc.nextDouble();
		
	}

	public double getMonthlysalary()
	{
		monthlySalary = (ratePerHour2*8)*31;
		return monthlySalary;
	}




}