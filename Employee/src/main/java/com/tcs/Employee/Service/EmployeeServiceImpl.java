package com.tcs.Employee.Service;

import java.util.List;
import java.util.Optional;

import com.tcs.Employee.DAO.EmployeeDAO;
import com.tcs.Employee.DAO.EmployeeDAOImpl;
import com.tcs.Employee.Model.Employee;
import com.tcs.Employee.Service.*;

public class EmployeeServiceImpl implements EmployeeServices {

	
	private static EmployeeServices dao;

	private EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static EmployeeServices getInstance() {
		
		if(dao==null) {
			dao = new EmployeeServiceImpl();
			System.out.println("inside the if condition");
			return dao;
		}
		return dao;
		
		
	}
	EmployeeDAO employeeDao = EmployeeDAOImpl.getInstance();
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.addEmployee(employee);
	}
	
   @Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

   @Override
	public String deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}
	
   @Override
   public Optional<Employee> findById(int id) {
	   return employeeDao.findById(id);
   }
		
			
	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployees();
	}

	@Override
	public Optional<List<Employee>> findByOrganizationId(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findByOrganizationId(id);
	}

}
