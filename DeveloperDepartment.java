package java8;

import java.util.ArrayList;
import java.util.Scanner;

public class DeveloperDepartment {

	public static void main(String[] args) {
		ArrayList<Employee_2> employeeList = new ArrayList<Employee_2>();

		Scanner scanner = new Scanner(System.in);

		System.err.println("How many employees :- ");
		int numberOfEmployee = scanner.nextInt();

		for (int i = 0; i < numberOfEmployee; i++) {
			System.out.println("Enter employee details :- " + (i + 1));

			System.out.print("Enter id : ");
			int id = scanner.nextInt();

			scanner.nextLine();

			System.out.print("Enter name : ");
			String name = scanner.nextLine();

			System.out.print("Enter email : ");
			String email = scanner.next();
			
			scanner.nextLine();
			
			System.out.print("Enter role : ");
			String role = scanner.nextLine();

			System.out.print("Enter salary : ");
			double salary = scanner.nextDouble();

			System.out.print("Enter address : ");
			String address = scanner.next();

			Employee_2 employee = new Employee_2(id, name, email, role, salary, address);

			employeeList.add(employee);
			
			System.out.println();
		}

		System.err.println("\nemployee List sorted by salary :- ");
//		for (Employee emp : employeeList) {
//			System.out.println(
//					"[" + emp.id + ", " + emp.name + ", " + emp.email + ", " + emp.salary + ", " + emp.address + "]");
//		}
		
		employeeList.stream().sorted((e1, e2) -> Double.compare(e1.salary, e2.salary)).forEach(System.out::println);
	}
}