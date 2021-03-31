//Reverse a number
import java.util.*;
class ReverseANumber
{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner(System.in);
		int num,rev=0,d;
		System.out.println("Enter a number");
		num=sc.nextInt();
		System.out.println("The original number is:"+num);
		System.out.print("The number after reversal is:");
		while(num>0)
		{
			d=num%10;
			rev=rev*10+d;
			num/=10;
		}
		System.out.println(rev);
	}
}
