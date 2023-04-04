import java.util.*;
class CulasDaryll_Activity02
{
	static int fval,sval,res1;
	static long start1;
	public static void main(String[] args)throws InterruptedException
	 {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("");			
			System.out.print("Input the first number: ");
			fval=sc.nextInt();
			System.out.print("Input the second number: ");
			sval=sc.nextInt();
			System.out.println("");
			start1 =System.currentTimeMillis();
				Thread.sleep(1000);


			res1 = res2(fval,sval);
			System.out.print("Result: "+res1);
			System.out.println("");

		}


	 }
	 public static int res2(int num1, int num2)
	 {
	 	if(num1==num2)
        	return 0;
    	if(num1 % 6 == num2 % 6)
    		if(num1<num2)
    			return num1;
    		else
    			return num2;
    		if(num1>num2)
    			return num1;
    		else
    			return num2;		
	 }
}