package JavaPractise;

public class Project5a
	{
		public Project5a ()
		{
			this(1,2,3);
		System.out.println("Parent default constructor");
	}
		public Project5a (int a) {
			this(1,2);
		System.out.println("Parent one parameter constructor");
	}
		public Project5a (int a, int b) {
			this();
			System.out.println("Parent two parameter constructor");
		}
	public Project5a (int a, int b, int c) {
		System.out.println("Parent three parameter constructor");
	}
	}
	