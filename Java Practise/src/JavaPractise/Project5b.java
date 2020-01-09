package JavaPractise;

public class Project5b extends Project5a
	{
		public Project5b()
		{
			this(1,2);
		System.out.println("Child default constructor");
	}
		
		public Project5b (int a) {
			this(1,2,3);
		System.out.println("Child one parameter constructor");
	}
		public Project5b (int a, int b) {
			super(1);
			System.out.println("Child two parameter constructor");
		}
	public Project5b (int a, int b, int c) {
		this();
		System.out.println("Child three parameter constructor");
	}
	public static void main(String[] args) {
		Project5b pqr=new Project5b(1);	
	}
}