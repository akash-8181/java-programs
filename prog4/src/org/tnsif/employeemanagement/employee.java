package org.tnsif.employeemanagement;


public class employee {
	private String name;
	private designation desig;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public designation getDesig() {
		return desig;
	}
	public void setDesig(designation desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", desig=" + desig + "]";
	}
	


}
