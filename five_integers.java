import java.util.Scanner;

class input_five_integers
{
	int sum,size =5;
	int input_integers[] = new int[size];
	public void get_input_integers()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("Enter five integers: ");
		for (int i=0; i<input_integers.length; i++)
		 {

			input_integers[i] = sc.nextInt();
		}
	}
	public void sum_input_integers()
	{
		for (int i=0; i < input_integers.length; i++)
		{
			sum = sum + input_integers[i];
		}

		System.out.println("Sum of five integers (+):");

		for(int i = 0; i < input_integers.length;i++)
		{
		System.out.print(input_integers[i]+" ");
		}

		System.out.print(" = "+sum);
		System.out.println();
	}
}
public class five_integers
{
	public static void main(String[] args) 
	 {
		input_five_integers obj = new input_five_integers();
		while(true)
		{
		obj.get_input_integers();
		obj.sum_input_integers();	
		}
		}
	}
