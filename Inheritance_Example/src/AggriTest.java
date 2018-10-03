import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

class Author
{
	String Name;
	int age;
	String place;
	
	Author(String Name , int age , String place )
	{
		this.Name = Name;
		this.age = age;
		this.place = place;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getplace()
	{
		return place;
	}
}
class Book
{
	String name;
	int price;
	Author auth;
	Book(String n , int p , Author at )
	{
		this.name = n;
		this.price = p;
		this.auth = at;
	}
	
	public void ShowDetails()
	{
		System.out.println("Book name is "+name);
		System.out.println("Price is "+price);
		System.out.println("Author is "+auth.getName());
		System.out.println("Age is "+auth.getAge());
		System.out.println("Place is "+auth.getplace());
	}
}

public class AggriTest {

	public static void main(String[] args) {
		Author as = new Author("Ayush", 27, "Bangalore");
		Book b = new Book("Java", 500, as);
		b.ShowDetails();
		
	}
}
