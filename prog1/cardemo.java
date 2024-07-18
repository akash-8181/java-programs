package prog1;

public class cardemo {
	
	public static void main(String[] srgs) {
		carrental cr = new carrental();
		cr.setCarid(1);
		cr.setCartype("Small car");
		cr.setRent(1000);
		
		
		
		System.out.println(cr.getCarid());
		System.out.println(cr.getCartype());
		System.out.println(cr.getRent());
	}

}
