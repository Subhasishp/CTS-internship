//check if atleast one of the condition 'a < 50' or 'a < b' is true.
class ConditionCheckUsingOr
{
	public static void main(String args[])
	{
		int a=55,b=70;
		if(a<50 || a<b)
			System.out.println("Atleast One of the condition is true");
		else
			System.out.println("Both the conditions are not satisfied");
	}
}
