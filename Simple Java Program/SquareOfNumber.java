import java.text.*;
class SquareOfNumber
{
	public static void main(String ss[])
	{
		double n=3.9,res;
		res=n*n;
		DecimalFormat df=new DecimalFormat("#.######");
		System.out.println("Square of number "+n+" is "+df.format(res));
	}
}
