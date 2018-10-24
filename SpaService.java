public class SpaService {
	
	private String serviceDescription;
	private double price;
	
	//explicit default constructor that sets serviceDescription to XXX and price to 0.
	public SpaService(){
		
		serviceDescription="XXX";
		price=0;
	}
	
	
	public void setServiceDescription(String service){
		
		serviceDescription=service;
	}
	
	public void setPrice(double servicePrice){
		
		price= servicePrice;
	}
	
	public String getServiceDescription(){
		
		return serviceDescription;
	}
	
	public double getPrice(){
		return price;
		
	}
	
}