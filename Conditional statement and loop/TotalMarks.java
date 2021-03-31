//program to calculate total marks and percentage marks.
import java.text.*;
class TotalMarks
{
	public static void main(String args[])
	{
		DecimalFormat df=new DecimalFormat("#.##");
		int m1=78,m2=45,m3=62;
		int tot=m1+m2+m3;
		double per=tot/3.0;
		System.out.println("Total marks is: "+tot);
		System.out.println("Percentage is: "+df.format(per));
	}
}
