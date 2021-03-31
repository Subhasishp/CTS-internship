/*program to add 8 to the number 2345 and then divide it by 3*/
class ModuloOperation2
{
	public static void main(String args[])
	{
		int no=2345,add=8,res=5;
		int quo=((no+add)/3);
		res*=(quo%5);
		System.out.println("Final result is "+res);
	}
}
