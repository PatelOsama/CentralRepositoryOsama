package JavaPractise;

public class Project4 
{
	public void methoddf()
	{
		this.method3();
		System.out.println("Default Method");
	}
	public void method1()
	{
		this.methoddf();
		System.out.println("1st Method");
	}
	public void method2()
	{
		this.method1();
		System.out.println("2nd Method");
	}	
	public void method3()
	{
		System.out.println("3rd Method");
	}
	public static void main (String[] args)
	{
		Project4 run1=new Project4();
		run1.method2();	
	}
}
