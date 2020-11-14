package com.tcs.Employee.DAO;

import java.util.List;
import java.util.Optional;

import com.tcs.Employee.Model.Organization;

public interface OrganizationDAO {
	public String addOrganization(Organization organization);
	   public String updateOrganization(Organization organization);
	   public String deleteOrganization(int id);
	   public Optional<Organization>findById(int id);
	   public Optional<List<Organization>> getOrganization();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
