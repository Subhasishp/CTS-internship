//Sum of digits
import java.util.*;
class SumOfDigits
{
	public static void main(String ss[])
	{
		int num,s=0,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		System.out.print("Sum of digits of "+num);
		while(num>0)
		{
			d=num%10;
			s+=d;
			num/=10;
		}
		System.out.println(" is:"+s);
	}
}