

class Parent
 {
	 public void p1()
	 {
		 System.out.println("Parent Class");
	 }
 }
 
 class First extends Parent
 {
	 public void c1()
	 {
		 System.out.println("Child Class");
	 }
	 
	 public static void main(String[]args)
	 {
		First c = new First();
		 c.c1();
		 c.p1();
	 }
 }
