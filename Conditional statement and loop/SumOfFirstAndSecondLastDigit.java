//Calculate sum of first and second last digit in 5 digit number
import java.util.*;
class SumOfFirstAndSecondLastDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int s=0,n;
		System.out.println("Enter a 5 digit number");
		n=sc.nextInt();
		s=((n%100)/10)+(n/10000);
		System.out.println("Sum of first and second last digit in number "+n+" is "+s);
	}
}
