package oops.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		AppConfig obj1 = AppConfig.getInstance();
		AppConfig obj2 = AppConfig.getInstance();
		AppConfig obj3 = AppConfig.getInstance();
		
		// No matter how many object you make this way, you are accessing only one main object each and every time.
	}

}
