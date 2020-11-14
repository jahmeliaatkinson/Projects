package com.tcs.Employee.Service;

import java.util.List;
import java.util.Optional;

import com.tcs.Employee.DAO.DepartmentDAO;
import com.tcs.Employee.DAO.DepartmentDAOImpl;
import com.tcs.Employee.DAO.EmployeeDAO;
import com.tcs.Employee.DAO.EmployeeDAOImpl;
import com.tcs.Employee.Model.Department;
import com.tcs.Employee.Model.Employee;

public class DepartmentServiceImpl implements DepartmentService {
	
	private static DepartmentService dao;

	private DepartmentServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static DepartmentService getInstance() {
		
		if(dao==null) {
			dao = new DepartmentServiceImpl();
			System.out.println("inside the if condition");
			return dao;
		}
		return dao;
		
		
	}
	DepartmentDAO departmentDao = DepartmentDAOImpl.getInstance();
	
	@Override
	public String addDepartment(Department department) {
		
		return departmentDao.addDepartment(department);
	}

	@Override
	public String updateDepartment(Department department) {
		
		return departmentDao.updateDepartment(department);
	}

	@Override
	public String deleteDepartment(int id) {
		// TODO Auto-generated method stub
		return departmentDao.deleteDepartment(id);
	}

	@Override
	public Optional<Department> findById(int id) {
		// TODO Auto-generated method stub
		
		return departmentDao.findById(id);
	}

	@Override
	public Optional<List<Department>> getDepartments() {
		// TODO Auto-generated method stub
		return departmentDao.getDepartments();
	}

	@Override
	public Optional<List<Department>> findByOrganizationId(int id) {
		// TODO Auto-generated method stub
		return departmentDao.findByOrganizationId(id);
	}

}
