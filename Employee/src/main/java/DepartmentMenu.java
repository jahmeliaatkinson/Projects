import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.tcs.Employee.Model.Department;

import com.tcs.Employee.Service.DepartmentService;
import com.tcs.Employee.Service.DepartmentServiceImpl;


public class DepartmentMenu {

	

	public static void displayMenu() {
		
		
		
		System.out.println("M E N U");
		System.out.println("======================");
		System.out.println("1. Add Department");
		System.out.println("2. update Department");
		System.out.println("3. delete Department");
		System.out.println("4. Find By Id ");
		System.out.println("5. List Departemnts");
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
				Department department = new Department(7, 7, "English", null);
				
				DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
				
				String result = departmentService.addDepartment(department);
				
				
				if("success".equals(result)) {
					System.out.println("recored added successfully");
					break;
				}
				else {
					System.out.println("problem");
				
				}
		
				
			
			}
			
			else if (choice == 2) {
				
			

				Department department = new Department(2, 2,  "Chemistry", null );
				

				
				DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
				
				
			String result = departmentService.updateDepartment(department);
				
				
				if("success".equals(result)) {
					System.out.println("recored Updated successfully");
					break;
				}
				else {
					System.out.println("problem");
				
				
				
				
				}
				
				
			}
			
			else if (choice == 3) {
				DepartmentService DepartmentService =  DepartmentServiceImpl.getInstance();
				
				String result1 = DepartmentService.deleteDepartment(1);
				
				
				if("success".equals(result1)) {
					System.out.println("recored deleted successfully");
					break;
				}
				else {
					System.out.println("fail");
					
				}
				
			}
			
			
			
			else if(choice == 4) {
				DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
				
				
				Optional<Department> optional= departmentService.findById(3);
				
				if(optional.isPresent()) {
					Department department = optional.get();
					System.out.println(department);
					
					break;
				}
				else {
					System.out.println("product is not available");
					
				}
			}
			
			
			else if (choice == 5) {
			
				DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
				Optional<List<Department>>  optional = departmentService.getDepartments();
				if(optional.isPresent()) {
					List<Department> employee = optional.get();
					System.out.println(employee);
					break;
				}
				else {
					System.out.println("");
		
				
			}
			}
			else if (choice == 6) {
				DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
				
				 Optional<List<Department>> optional =  departmentService.findByOrganizationId(2);
				
				if(optional.isPresent()) {
					List<Department> department  = optional.get();
					System.out.println(department);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

