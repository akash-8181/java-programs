package prog3;

public class MyClassDemo {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
	
	 MyClass ob1 = new MyClass(5);
     MyClass ob2 = new MyClass(7);  
     
     ob1.printX();
     ob2.printX();
     
     MyClass.incrementCount();
     
     //MyClass.incrementCount();
     
     ob1.printCount();
     ob2.printCount();
     
     ob1.setX(14);
     
     ob1.incrementCount();
     
     ob1.printX();
     
     ob1.printCount();
     ob2.printCount();
     
     
//     System.out.println(ob1);
//     System.out.println(ob2);
     
	}
     
    
}
