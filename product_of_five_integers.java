import java.util.Scanner;
class input_users
{
	 int product=1, size=5;
	 int input_integers[] = new int[size];

	public void get_input_integers()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five integers: ");
		for (int i=0; i<input_integers.length; i++)
		 {

			input_integers[i] = sc.nextInt();
		}
	}
	public void multiply_SetInput_integers()
	{
		for (int i=0; i < input_integers.length; i++)
		{
			product = product * input_integers[i];
		}
		System.out.println("Product of five integers (x):");

		for(int i = 0; i < input_integers.length;i++)
			{
			   System.out.print(input_integers[i]+" ");
			}
			System.out.print(" = "+product);
			System.out.println();
	}
}

public class product_of_five_integers 
{
	public static void main(String[] args)
	 {
		input_users obj1 = new input_users();
		
		obj1.get_input_integers();
		obj1.multiply_SetInput_integers();
		
		
	}

}