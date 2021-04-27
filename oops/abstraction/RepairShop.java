package oops.abstraction;

public class RepairShop {
	
	public static void repairCar(Car car) {
		System.out.println("The car is repaired");
	}

	public static void main(String[] args) {
		
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		repairCar(wagonR);
		repairCar(audi);

	}

}
