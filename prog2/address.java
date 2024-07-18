package prog2;

public class address {
	String socityname,area;
	int pincode;
	
	public String getSocityname() {
		return socityname;
	}

	public void setSocityname(String socityname) {
		this.socityname = socityname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public address() {
		this.socityname = "shukan";
		this.area = "nikol";
		this.pincode = 392561;
		
		System.out.println();
	}

	public address(String socityname, String area, int pincode) {
		super();
		this.socityname = socityname;
		this.area = area;
		this.pincode = pincode;
	}

	

}
