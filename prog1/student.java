package prog1;

public class student {
	
	private int rollno;
	private String name;
	
	public void getdata() {
		setRollno(12);
		setName("Akash");
	}
	public void display() {
		System.out.println("name"+"rollno");
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
