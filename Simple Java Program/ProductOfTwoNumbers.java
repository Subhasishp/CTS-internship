import java.text.*;
class ProductOfTwoNumbers
{
	public static void main(String ss[])
	{
		float n1=6.0f,n2=8.2f,p;
		p=n1*n2;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Product of given numbers is:"+df.format(p));
	}
}
