package JavaPractise;

public class Project3
{
	public Project3()
	{
		this(10,20,30);	
		System.out.println("Default constructor");
	}	
	public Project3(int a)
	{
		this();
		System.out.println("One Parameterised constructor");
	}
	public Project3(int a,int b)
	{
		this(10);
		System.out.println("Two Parameterised constructor");
	}	
	public Project3(int a, int b, int c)
	{
		System.out.println("Three Parameterised constructor");
	}
		
		public static void main (String[] args)
		{
			Project3 run=new Project3(10,20);
	}	
	
}
