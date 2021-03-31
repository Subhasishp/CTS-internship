//check if both the conditions 'a < 50' and 'a < b' are true.
class ConditionCheckUsingAnd
{
	public static void main(String args[])
	{
		int a=55,b=70;
		if(a<50 && a<b)
			System.out.println("Both the conditions are satisfied");
		else if((a>=50 && a<b) || (a<50 && a>=b))
			System.out.println("One of the condition is not satisfied");
		else
			System.out.println("Both the conditions are not satisfied");
	}
}
