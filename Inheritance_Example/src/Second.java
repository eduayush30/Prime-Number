class Parent1 
{
	String vehicle_type;
}
public class Second extends Parent1
{
	String model;
	
	public void showdetails()
	{
		vehicle_type = "Car";
		model = "Sports";
		System.out.println(vehicle_type+" "+model);
	}

	public static void main(String[] args) {
		Second s = new Second();
		s.showdetails();

	}

}
