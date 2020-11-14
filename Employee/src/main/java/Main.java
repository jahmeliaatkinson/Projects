import java.util.List;
import java.util.Optional;

import com.tcs.Employee.Model.Employee;
import com.tcs.Employee.Service.EmployeeServiceImpl;
import com.tcs.Employee.Service.EmployeeServices;

public class Main {

public static void main(String[] args) {
	/**
		Employee employee = new Employee(4, 04, 004,"Brian Black",28,"Associate");
		
		EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
		
		String result = employeeServices.addEmployee(employee);
		
		
		if("success".equals(result)) {
			System.out.println("recored added successfully");
		}
		else {
			System.out.println("problem");
		}
		
	**/
	
	
	Employee employee = new Employee(2, 02, 20, "Bob Will", 22, "Student" );
	

	
	EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
	
	
String result = employeeServices.updateEmployee(employee);
	
	
	if("success".equals(result)) {
		System.out.println("recored Updated successfully");
	}
	else {
		System.out.println("problem");
	
	
	
	/**
		EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
		
		String result1 = employeeServices.deleteEmployee(4);
		
		
		if("success".equals(result1)) {
			System.out.println("recored deleted successfully");
		}
		else {
			System.out.println("fail");
		}
		
		
	/**
	EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
	
	
		Optional<Employee> optional= employeeServices.findById(1);
		
		if(optional.isPresent()) {
			Employee employee = optional.get();
			System.out.println(employee);
		}
		else {
			System.out.println("product is not available");
		}
**/
	
	/**
	EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
	
	 Optional<List<Employee>> optional =  employeeServices.findByOrganizationId(2);
	
	if(optional.isPresent()) {
		List<Employee> employee = optional.get();
		System.out.println(employee);
	}
	else {
		System.out.println("");
	}

	
	
	/**
	EmployeeServices employeeServices =  EmployeeServiceImpl.getInstance();
	Optional<List<Employee>>  optional = employeeServices.getEmployees();
	if(optional.isPresent()) {
		List<Employee> employee = optional.get();
		System.out.println(employee);
	}
	else {
		System.out.println("");
		
		**/
}
}
}


