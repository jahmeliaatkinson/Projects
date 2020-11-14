import java.util.List;
import java.util.Optional;

import com.tcs.Employee.Model.Department;
import com.tcs.Employee.Model.Employee;
import com.tcs.Employee.Service.DepartmentService;
import com.tcs.Employee.Service.DepartmentServiceImpl;
import com.tcs.Employee.Service.EmployeeServiceImpl;
import com.tcs.Employee.Service.EmployeeServices;

public class DepartmentMain {

	
	public static void main(String[] args) {
		
		
		/**
		Department department = new Department(3, 3, "Arts", null);
		
		DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
		
		String result = departmentService.addDepartment(department);
		
		
		if("success".equals(result)) {
			System.out.println("recored added successfully");
		}
		else {
			System.out.println("problem");
		}
		**/
		
		Department department = new Department(2, 2,  "Chemistry", null );
		

		
		DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
		
		
	String result = departmentService.updateDepartment(department);
		
		
		if("success".equals(result)) {
			System.out.println("recored Updated successfully");
		}
		else {
			System.out.println("problem");
		
		
		/**
		
       DepartmentService DepartmentService =  DepartmentServiceImpl.getInstance();
		
		String result1 = DepartmentService.deleteDepartment(1);
		
		
		if("success".equals(result1)) {
			System.out.println("recored deleted successfully");
		}
		else {
			System.out.println("fail");
		}
		
		**/
		/**
		DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
		
		
		Optional<Department> optional= departmentService.findById(3);
		
		if(optional.isPresent()) {
			Department department = optional.get();
			System.out.println(department);
		}
		else {
			System.out.println("product is not available");
		}
		
**/
		/**
		
		DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
		
		 Optional<List<Department>> optional =  departmentService.findByOrganizationId(2);
		
		if(optional.isPresent()) {
			List<Department> department  = optional.get();
			System.out.println(department);
		}
		else {
			System.out.println("");
		
		
		
		
		
	}**/
		/**
		DepartmentService departmentService =  DepartmentServiceImpl.getInstance();
		Optional<List<Department>>  optional = departmentService.getDepartments();
		if(optional.isPresent()) {
			List<Department> employee = optional.get();
			System.out.println(employee);
		}
		else {
			System.out.println("");
		
		
	}**/
	}
	}
}


