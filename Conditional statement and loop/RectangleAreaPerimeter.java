/*Length and breadth of a rectangle are 5 and 7 respectively.
Program to calculate the area and perimeter of the rectangle.*/
class RectangleAreaPerimeter
{
	public static void main(String args[])
	{
		int l=5,b=7,p,a;
		p=2*(l+b);
		a=l*b;
		System.out.println("Perimeter of rectangle is "+p);
		System.out.println("Area of rectangle is "+a);
	}
}
