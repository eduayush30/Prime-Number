class Par
{
	int a = 10;
	int b = 20;
}
public class SuperInheri extends Par
{
	int a = 10;
	int b = 10;
	
	void add(int a , int b)
	{
		System.out.println("Local Variable "+(a+b));
		System.out.println("Instance Variable "+(this.a + this.b));
		System.out.println("Super Variable "+(super.a+super.b));
		
	}
	
	public static void main(String [] args)
	{
		new SuperInheri().add(100, 200);
	}
}
