package emp_details;

import org.tnsif.employeemanagement.designation;
import org.tnsif.employeemanagement.employee;

public class demoemployee {
	public static void main(String[] args)
	{
		designation des = new designation();
		des.setDesignation("user interface");
		des.setDescription("developing desing of website");
		
		employee emp= new employee();
		emp.setName("Akash Prajapati");
		emp.setDesig(des);
		
		
		System.out.println(emp);
	}

}
