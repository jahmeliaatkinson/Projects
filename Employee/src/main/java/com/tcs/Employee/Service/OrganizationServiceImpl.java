package com.tcs.Employee.Service;

import java.util.List;
import java.util.Optional;

import com.tcs.Employee.DAO.EmployeeDAO;
import com.tcs.Employee.DAO.EmployeeDAOImpl;
import com.tcs.Employee.DAO.OrganizationDAO;
import com.tcs.Employee.DAO.OrganizationDaoImpl;
import com.tcs.Employee.Model.Organization;

public class OrganizationServiceImpl implements OrganizationService {


	private static OrganizationService dao;

	private OrganizationServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static OrganizationService getInstance() {
		
		if(dao==null) {
			dao = new OrganizationServiceImpl();
			System.out.println("inside the if condition");
			return dao;
		}
		return dao;
	}
	
OrganizationDAO organizationDao = OrganizationDaoImpl.getInstance();


	
	
	
	@Override
	public String addOrganization(Organization organization) {
		return organizationDao.addOrganization(organization);
	}

	@Override
	public String updateOrganization(Organization organization) {
		return organizationDao.updateOrganization(organization);
		
	}

	@Override
	public String deleteOrganization(int id) {
		return organizationDao.deleteOrganization(id);
	}

	@Override
	public Optional<Organization> findById(int id) {
		return organizationDao.findById(id);
	}

	@Override
	public Optional<List<Organization>> getOrganization() {
		return organizationDao.getOrganization();
	}

	

}
