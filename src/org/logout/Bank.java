package org.logout;
import com.individuallogin.Employee;
import com.individuallogin.School;

public class Bank {
	
	private void bankName() {
		System.out.println("Bank name is Indian Bank");
	}
	
	public static void main(String[] args) {
		Bank b = new Bank();
		b.bankName();
		
		Employee e = new Employee();
		e.employeeId();
		e.employeeName();
		e.employeeAddress();
		
		School s = new School();
		s.schoolId();
	}

}
