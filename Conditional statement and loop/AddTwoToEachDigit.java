/*Write a program to display a number whose digits are 2 
greater than the corresponding digits of the 4 digit number taken.*/
import java.util.*;
class AddTwoToEachDigit
{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner(System.in);
		int num,newnum=0,d,c=0;
		System.out.println("Enter a 4 digit number");
		num=sc.nextInt();
		while(num>0)
		{
			d=num%10;
			if(d==8 || d==9)
				newnum+=((d+2)*(int)(Math.pow(10,c)))-(int)(Math.pow(10,c+1));
			else
				newnum+=((d+2)*(int)(Math.pow(10,c)));
			c++;
			num/=10;
		}
		System.out.println("New Number after adding 2 to each digit is \n"+newnum);
	}
}
