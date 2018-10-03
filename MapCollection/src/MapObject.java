import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapObject 
{
	public static void main(String [] args)
	{
		Employee e = new Employee("Ayush");
		Employee e1 = new Employee("Raj");
		Employee e2 = new Employee("Amit");
		Employee e3 = new Employee("Ayush");
		
		/*System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);*/
		
		HashMap<Employee, String> m = new HashMap<>();
		m.put(e, "India");
		m.put(e1, "India");
		m.put(e2, "India");
		m.put(e3, "America");
		
        for (Map.Entry<Employee,String> entrys : m.entrySet())  {
        	System.out.println(entrys.getKey().name+"  "+entrys.getValue());
        	
        	
        }

		
		Set<Employee> s = m.keySet();
		System.out.println(s);
		for (Employee employee : s) {
			System.out.println(employee.getName()+"  "+m.get(employee));
			
		}
		
	
	
		
		//System.out.println(m.size());
		//System.out.println(m);
		
		//Iterator<Employee> itr = m.it
		
	}

}
