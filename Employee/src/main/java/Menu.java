
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.tcs.Employee.Model.Employee;
import com.tcs.Employee.Service.EmployeeServiceImpl;
import com.tcs.Employee.Service.EmployeeServices;

public class Menu {

	
	
	public static void displayMenu() {
		
		
		
		System.out.println("M E N U");
		System.out.println("======================");
		System.out.println("1. Add Employee");
		System.out.println("2. update Employee");
		System.out.println("3. delete Employee");
		System.out.println("4. Find By Id ");
		System.out.println("5. List Employees");
		System.out.println("6. Find by organizationId");
		System.out.println("7. Exit");
		System.out.println("======================");
		
		System.out.print("Enter choice: ");
		
		
		
	}
	
	public static void main(String[] args) {
		
		int choice;
		
		
		
		displayMenu();
		
		Scanner in = new Scanner(System.in);
		
		choice = in.nextInt();
		
		while(choice != 7){
			
			
			if(choice == 1) {
				Employee employee = new Employee(5, 05, 005,"Mary Black",28,"Associate");
				
				EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
				
				String result = employeeServices.addEmployee(employee);
				
				
				if("success".equals(result)) {
					System.out.println("recored added successfully");
					break;
				}
				else {
					System.out.println("problem");
				
			}
			}
			
			else if (choice == 2) {
				
				Employee employee = new Employee(1, 01, 001, "Jahmelia Atkinson", 28, "Trainer" );
				

				
				EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
				
				
			String result = employeeServices.updateEmployee(employee);
				
				
				if("success".equals(result)) {
					System.out.println("recored Updated successfully");
					break;
				}
				else {
					System.out.println("problem");
				
				
				
				
				
				}
				
				
			}
			
			else if (choice == 3) {
				EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
				
				String result1 = employeeServices.deleteEmployee(4);
				
				
				if("success".equals(result1)) {
					System.out.println("recored deleted successfully");
					break;
				}
				else {
					System.out.println("fail");
				}
			}
			else if(choice == 4) {
				EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
				
				
				Optional<Employee> optional= employeeServices.findById(1);
				
				if(optional.isPresent()) {
					Employee employee = optional.get();
					System.out.println(employee);
					break;
				}
				else {
					System.out.println("product is not available");
			}
			}
			else if (choice == 5) {
			
				EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
				Optional<List<Employee>>  optional = employeeServices.getEmployees();
				if(optional.isPresent()) {
					List<Employee> employee = optional.get();
					System.out.println(employee);
					break;
				}
				else {
					System.out.println("");
		
				
			}
			}
			else if (choice == 6) {
				EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
				
				 Optional<List<Employee>> optional =  employeeServices.findByOrganizationId(2);
				
				if(optional.isPresent()) {
					List<Employee> employee = optional.get();
					System.out.println(employee);
					break;
				}
				else {
					System.out.println("");
			}
			
		
			displayMenu();
			
			choice = in.nextInt();
			
		}
	
	System.out.println("Exit");
	
	}
	}
	
}
