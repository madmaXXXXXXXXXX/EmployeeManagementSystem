package net.javaguides.usermanagement.model;

public class Salary1 {
	
	
	protected String name;
	protected String email;
	protected String salary;
	
	public Salary1() {
	}
	
	public Salary1(String name, String email, String salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public void Salary( String name, String email, String salary) {

		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getsalary() {
		return salary;
	}
	public void setphone(String phone) {
		this.salary = salary;
	}
	

}
