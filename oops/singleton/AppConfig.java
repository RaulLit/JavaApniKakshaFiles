package oops.singleton;

public class AppConfig {
	
	private AppConfig() {
		
	}
	
//	private static AppConfig obj = new AppConfig();
//		
//	private static AppConfig getInstance() {
//		return obj;
//	}
	
	// OPTIMIZED CODE FOR SAVING MEMORY
	// By this way, if there is no need for this object the memory will not be created when initialized.
	
	private static AppConfig obj = null;
	
	public static AppConfig getInstance() {
		if(obj == null) {
			obj = new AppConfig();
		}
		return obj;
	}
	
}
