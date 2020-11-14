package com.tcs.Employee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


import com.tcs.Employee.Model.Organization;
import com.tcs.Employee.Utils.DBUtils;


public class OrganizationDaoImpl implements OrganizationDAO {


		private  OrganizationDaoImpl() {
			
		}
		
	private static OrganizationDAO dao;

	public static OrganizationDAO getInstance() {
		if (dao==null) {
			dao = new OrganizationDaoImpl();
			return dao;
		}
		return dao;
		
	}
		
	
	
	OrganizationDAO organizationDao = OrganizationDaoImpl.getInstance();
	
	
	
	@Override
	public String addOrganization(Organization organization) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		int result = 0;
		String addorganization = "insert into Department (id, name, address) values(?,?,?)";
		try {
		    preparedStatement = connection.prepareStatement(addorganization);
			preparedStatement.setInt(1,organization.getId());
			preparedStatement.setString(2,organization.getName());
			preparedStatement.setString(3,organization.getAddress());
			
			
			
			
			result = preparedStatement.executeUpdate();
			
			if (result>0)
			{
				connection.commit();
				return "success";
			}
			else {
				return "fail";
			}
		} catch (SQLException e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			return "fail";
		}
		
		finally {
			DBUtils.closeConnection(connection);
		}
	}
	

	@Override
	public String updateOrganization(Organization organization) {
		
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		int result = 0;
		
		try {
			String sql = "UPDATE Organization set Name=? , Address=? WHERE Id=?"  ;
			
		    preparedStatement = connection.prepareStatement(sql);
		    
			
			
			preparedStatement.setString(1,organization.getName());
			preparedStatement.setString(4, organization.getAddress());
			preparedStatement.setInt(3,organization.getId());
			result = preparedStatement.executeUpdate();
					
			
			
		
			
			if (result>0)
			{
				connection.commit();
				return "success";
			}
			else {
				return "fail";
			}
			
		} catch (SQLException e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			return "fail";
		}
		
		finally {
			DBUtils.closeConnection(connection);
		}
	
		
	
	}
	
	
	


	@Override
	public String deleteOrganization(int id) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		int resultSet = 0;
		
		int result = 0;
	
	
		try {
			String query = "delete from Organization where Id=?";
		 preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			resultSet = preparedStatement.executeUpdate();
		
			
			
			
			if (result>0)
			{
				connection.commit();
				
				return "success";
			}
			else {
			
				connection.commit();
				return "fail";
			}
		
			

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			return "fail";
		}
		
		finally {
			DBUtils.closeConnection(connection);
		}
	
	}

	@Override
	public Optional<Organization> findById(int id) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Organization organization = null;
		String query = "select * from Organization where id=?";
		try {
		 preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			resultSet = preparedStatement.executeQuery();
			
			
			
			if (resultSet.next())
			{
				organization = new Organization();
				organization.setId(resultSet.getInt("Id"));
				organization.setName(resultSet.getString("name"));
				organization.setAddress(resultSet.getString("Address"));
			
			}
			
			
		} catch (SQLException e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			return Optional.empty();
		}
		
		finally {
			DBUtils.closeConnection(connection);
		}
		
		return Optional.of(organization);
	}

	@Override
	public Optional<List<Organization>> getOrganization() {
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Organization organization = null;
	
		try {
			String query = "SELECT * FROM Organization";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next())
			{
				int id = resultSet.getInt(1);
				String Name = resultSet.getString(2);
				String Address = resultSet.getString(3);
				
				
				
				organization = new Organization();
				organization.setId(resultSet.getInt("Id"));
				organization.setName(resultSet.getString("name"));
				organization.setAddress(resultSet.getString("address"));
				System.out.println("id: " +resultSet.getInt(1));
				System.out.println("Name: " +resultSet.getString(2));
				System.out.println("Address: " +resultSet.getString(3));
			}
			
			
			
			
		} catch (SQLException e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			return Optional.empty();
		}
		
		finally {
			DBUtils.closeConnection(connection);
		}
		
		return Optional.empty();
		
	}


}
