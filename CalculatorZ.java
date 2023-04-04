import java.util.Scanner;
class CalculatorZ
{

static int num1,num2,num3,num4,sum,diff,pro;
static double quo,total,OddEven,decimaltobinary;
public static void main(String[] args)throws InterruptedException
{
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter First Number: ");
	num1 = in.nextInt();
	System.out.print("Enter Second Number:");
	num2 = in.nextInt();
	System.out.print("Enter Third Number: ");
	num3 = in.nextInt();
	System.out.print("Enter Fourth Number: ");
	num4 = in.nextInt();
	System.out.println("");

	////Displaying method here

	sum = add(num1,num2,num3,num4);
	System.out.print("The SUM of four numbers:"+sum);
	System.out.println("");

	diff = sub(num1,num2,num3,num4);
	System.out.print("The DIFFERENCE of four numbers:"+diff);
	System.out.println("");

	pro = mul(num1,num2,num3,num4);
	System.out.print("The Product of four numbers:"+pro);
	System.out.println("");

	quo = div(num1,num2,num3,num4);
	System.out.print("The Quotient of four numbers: "+quo);
	System.out.println("");
	System.out.println("");
	System.out.println("Loading....");
long start1 =System.currentTimeMillis();
		Thread.sleep(4000);
		System.out.println("");
		System.out.println("");
	total = sum+diff+pro+quo;
	System.out.print("Grand Total: "+total);
	System.out.println("");
	System.out.println("");
	System.out.println("Loading....");
	System.out.println("");
	System.out.println("");
long start2 =System.currentTimeMillis();
		Thread.sleep(4000);

	if(total%2==0)
	{
		System.out.print("odd or even? ------> EVEN");
		System.out.println("");
	}
	else
	{
		System.out.print("odd or even?-------> ODD!");
		System.out.println("");
	}


}


public static int add (int n1, int n2, int n3, int n4)
{
     return n1+n2+n3+n4;
}
public static int sub(int n1, int n2, int n3, int n4)
{
	return n1-n2-n3-n4;

}
public static int mul(int n1, int n2, int n3, int n4)
{
	return n1*n2*n3*n4;
}
public static double div(double n1, double n2, double n3, double n4)
{
	return n1/n2/n3/n4;

	
}

































}
