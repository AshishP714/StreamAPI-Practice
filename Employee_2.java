package java8;

public class Employee_2 {

	public int id;
	public String name;
	public String email;
	public String role;
	public double salary;
	public String address;
	
	public Employee_2(int id, String name, String email, String role, double salary, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", role=" + role + ", salary=" + salary + ", address="
				+ address + "]";
	}
}