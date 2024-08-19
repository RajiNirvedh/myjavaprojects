
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of figures circle,rectangle,square with same method name");
		Area.figureArea(2.5f);
		Area.figureArea(32,50);
		Area.figureArea(25);
	}
public static void figureArea(float r)
{
	double area=0.5*3.14*r*r;
	System.out.println("Area of circle = "+area+"sq.cm");
}
public static void figureArea(int l,int b)
{
	int area=l*b;
	System.out.println("Area of Rectangle = "+area+"sq.cm");
}
public static void figureArea(int a)
{
	int area=a*a;
	System.out.println("Area of Square = "+area+"sq.cm");
}
}
