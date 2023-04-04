import java.util.Scanner;
class input_user
{
	String input;
	public void getInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input user: ");
		input = sc.nextLine();
	}
	public void setInput()
	{
		System.out.print(" => Your input is: "+input);
		System.out.println();
	}
}
public class challenge_1 
{
	public static void main(String[] args)
	 {
		input_user obj = new input_user();

		while(true)
		{
		obj.getInput();
		System.out.println();
		obj.setInput();
		System.out.println();
		}
	}
}
