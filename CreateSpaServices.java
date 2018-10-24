import java.util.Scanner;

public class CreateSpaServices{
	
	public static void main(String [] args){
		
		//variables to hold a service description and price that a user can enter from the keyboard:
		
		String service;
		double price;
		
		/*
declare three objects. 
Two are SpaService objects that use the class you created. 
The third object uses the built-in Java Scanner class. 
Both classes use the new operator to allocate memory for their objects, 
and both call a constructor that has the same name as the class. 
The difference is that the Scanner constructor requires an argument (System.in), 
but the SpaService class does not
		*/
		
		SpaService firstService= new SpaService();
		SpaService secondService = new SpaService();
		
		Scanner keyboard= new Scanner (System.in);
		
		System.out.println("Enter service: ");
		service=keyboard.nextLine();
		//keyboard.nextLine();
		
		System.out.println("Enter price: ");
		price=keyboard.nextDouble();
		keyboard.nextLine();
		
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		
		System.out.println("Enter service: ");
		service=keyboard.nextLine();
		//keyboard.nextLine();
		
		System.out.println("Enter price: ");
		price=keyboard.nextDouble();
		keyboard.nextLine();
		
		secondService.setServiceDescription(service);
		secondService.setPrice(price);
		
		System.out.println("--------------------- ");
		System.out.println("First service details: ");
		System.out.println(firstService.getServiceDescription() + " $ " + firstService.getPrice()); 
		
		System.out.println("--------------------- ");
		System.out.println("Second service details: ");
		System.out.println(secondService.getServiceDescription() + " $ " + secondService.getPrice()); 
		System.out.println("--------------------- ");
		
	}
	
}