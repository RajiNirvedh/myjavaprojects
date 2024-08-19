
public class Homewrk_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Average of 3 integer and 3 float in 2method with same name");

Homewrk_1.average(250,10,90);
Homewrk_1.average(125f,65f,147f);

	}
public static void average(int c,int d,int e)
{
	float avg_1=(c+d+e)/3;
	System.out.println("Average of inegers is "+avg_1);
	;
}
public static void average(float f,float g,float h)
{
	float avg_2=(f+g+h)/3;
	System.out.println("Average of float is "+avg_2);
}

}
