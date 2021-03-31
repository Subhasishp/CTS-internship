/*program to add 8 to the number 2345 and then divide it by 3*/
class ModuloOperation
{
	public static void main(String args[])
	{
		int no=2345,add=8;
		int quo=(no+add)/3;
		int mo=quo%5;
		int res=mo*5;
		System.out.println("Final result is "+res);
	}
}
