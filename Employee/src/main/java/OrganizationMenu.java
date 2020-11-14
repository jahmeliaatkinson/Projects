import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.tcs.Employee.Model.Organization;
import com.tcs.Employee.Service.OrganizationService;
import com.tcs.Employee.Service.OrganizationServiceImpl;

public class OrganizationMenu {

	

	public static void displayMenu() {
		
		
		
		System.out.println("M E N U");
		System.out.println("======================");
		System.out.println("1. Add Department");
		System.out.println("2. update Department");
		System.out.println("3. delete Department");
		System.out.println("4. Find By Id ");
		System.out.println("5. List Departemnts");
		System.out.println("6. Exit");
		System.out.println("======================");
		
		System.out.print("Enter choice: ");
		
		
		
	}
	
	public static void main(String[] args) {
		
		int choice;
		
		
		
		displayMenu();
		
		Scanner in = new Scanner(System.in);
		
		choice = in.nextInt();
		
		while(choice != 6){
			
			
			if(choice == 1) {
				Organization organization = new Organization(1, "12 Rose LAne", "FVSU", null, null);
				
				OrganizationService organizationService =  OrganizationServiceImpl.getInstance();
				
				String result = organizationService.addOrganization(organization);
				
				
				if("success".equals(result)) {
					System.out.println("recored added successfully");
					break;
				}
				else {
					System.out.println("problem");
				
				}
		
				
			
			}
			
			else if (choice == 2) {
				
			
	Organization organization = new Organization(1, "12 Rose Mont", "FVSU", null, null);
				
				OrganizationService organizationService =  OrganizationServiceImpl.getInstance();
				
				String result = organizationService.updateOrganization(organization);
				
				
				if("success".equals(result)) {
					System.out.println("recored updated successfully");
					break;
				}
				else {
					System.out.println("problem");
				
				}
		
				
			
			}
				
			
			
			else if (choice == 3) {
				OrganizationService organizationService =  OrganizationServiceImpl.getInstance();
				
				String result = organizationService.deleteOrganization(1);
				
				
				if("success".equals(result)) {
					System.out.println("recored deleted successfully");
					break;
				}
				else {
					System.out.println("problem");
				
				}
		
				
				}
				
			
			
			else if(choice == 4) {
				OrganizationService organizationService =  OrganizationServiceImpl.getInstance();
				
				
				Optional<Organization> optional= organizationService.findById(1);
				
				if(optional.isPresent()) {
					Organization organization = optional.get();
					System.out.println(organization);
					
					break;
				}
				else {
					System.out.println("product is not available");
					
				}
			}
			
			
			else if (choice == 5) {
			
				OrganizationService organizationService =  OrganizationServiceImpl.getInstance();
				Optional<List<Organization>>  optional = organizationService.getOrganization();
				if(optional.isPresent()) {
					List<Organization> organization = optional.get();
					System.out.println(organization);
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
