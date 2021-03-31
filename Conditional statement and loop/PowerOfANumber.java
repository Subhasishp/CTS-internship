//program to print the power of 7 raised to 5.
class PowerOfANumber 
{
	public static void main(String ss[])
	{
		int b=7,p=5,res=1,r=1,i;
		System.out.println("First way:");
		for(i=1;i<=p;i++)
			res*=b;
		System.out.println("The result is: "+res);
		System.out.println("\nSecond way");
		r=(int)Math.pow(b,p);
		System.out.println("The result is: "+r);
	}
}
