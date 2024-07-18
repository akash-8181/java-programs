package prog1;

public class demostudent {
	public static void main(String[] args) {
		
		student s1 = new student();
		
		s1.getdata();
		s1.display();
		
		student1 s11 = new student1();
		s11.setRollno(44);
		s11.setName("Harsh");
		System.out.println(s11.getRollno());
		System.out.println(s11.getName());
		
		
		System.out.println(s11);
		
		
	}

}
