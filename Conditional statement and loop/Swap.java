//Swapping values of variables
class Swap
{
	public static void main(String args[])
	{
		int a=6,b=8;
		System.out.println("Swapping using third variable");
		System.out.println("-----------------------------");
		System.out.println("Before swapping "+a+" "+b);
		int c;
		c=b;b=a;a=c;
		System.out.println("After swapping "+a+" "+b);
		a=6;b=8;
		System.out.println("\nSwapping without using third variable");
		System.out.println("-------------------------------------");
		System.out.println("Before swapping "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping "+a+" "+b);
	}
}