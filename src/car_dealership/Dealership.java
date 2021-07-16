package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1= new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123");
		cust1.setCashOnHand(12000);
		
		Vehicle vehicle=new Vehicle("Lamborghini","Aventador",20000);
		
		Employee emp=new Employee();
		
		cust1.purchaseCar(vehicle,emp,false);
		

	}

}
