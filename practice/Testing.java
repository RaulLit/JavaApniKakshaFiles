package practice;

public class Testing {
	public static void main(String[] args) {
		Participants obj1 = new Participants("Aditya", 9326171, "Photography");
		Participants obj2 = new Participants("Raul", 55555, "hello");
		
//		System.out.println(obj1.getRegistrationId() + " " + obj1.getCounter());
//		System.out.println(obj1.getName() + " " + obj1.getContactNumber());
//		System.out.println(obj1.getBranch());
//		System.out.println();
//		System.out.println(obj2.getRegistrationId() + " " + obj2.getCounter());
//		System.out.println(obj2.getName() + " " + obj2.getContactNumber());
//		System.out.println(obj2.getBranch());
	}
}

class Participants {
	static int counter = 1001;
	String name, branch;
	String registrationId = "D"+ counter;
	long contactNumber;
	
	//Constructor
	Participants (String name, long contactNumber, String branch) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.branch = branch;
		counter++;
		System.out.println("Hi "+this.name+"! Your registration id is "+this.registrationId);
	}
	
	//Methods
	public String getRegistrationId() {
		return registrationId;
	}
	public int getCounter() {
		return counter;
	}
	public static void setcounter(int counter) {
		Participants.counter = counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
