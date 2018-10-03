
 class SuperExp 
{
	String Name;

}
 class Child extends SuperExp
{
	String Name;
	public void display()
	{
		super.Name = "Parent";
		Name = "Child";
		
		System.out.println(super.Name+" "+Name);
	}
	
	public static void main(String[] args)
	{
		Child c = new Child();
		c.display();

	}
}
