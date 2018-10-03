class Test1
{	
	int a;
	int b;
	
	void M1()
	{
		System.out.println("This is my car");
	}
	
	Test1(int a , int b)
	{
		this.a = a;
		this.b = b;
	}
}

public class Test_inheritance extends Test1
{
	Test_inheritance(int a, int b)
	{
		super(a, b);
	}
	void M1()
	{
		
		System.out.println("Car is running safe "+(a+b));
	}
	
	{
		
	}
	public static void main(String [] args)
	{
		new Test_inheritance(10, 20).M1();
		
	}
}
