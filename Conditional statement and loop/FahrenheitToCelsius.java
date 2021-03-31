//Convert Fahrenheit to Celsius
import java.util.*;
class FahrenheitToCelsius
{
	public static void main(String ss[])
	{
		Scanner sc=new Scanner(System.in);
		float f,c;
		System.out.println("Enter temperature in Fahrenheit");
		f=sc.nextFloat();
		c=((f-32)*(5)/9);
		System.out.println(f+" degrees in fahrenheit is "+c+" degrees in celsius");
	}
}
