package JavaPractise;

public class Project2 {
	public int add (int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub (int a, int b) {
		int c;
		c=a-b;
		return c;
	}
	public int Mul (int a, int b) {
		int c;
		c=a*b;
		return c;
	}
	public void Div(int a, int b) {
		int c;
		c=a/b;
		System.out.println("Assignment : (((((10+2)+2)-2)*2)/2)");
		System.out.println("Final Result is : "+c);
		
	}
public static void main(String[] args) {
	Project2 result=new Project2();
	int result1=result.add(10,2);
	int result2=result.add(result1,2);
	int result3=result.sub(result2,2);
	int result4=result.Mul(result3,2);
	result.Div(result4,2);
}
}
