package day02.Practice;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		// TODO complete this code using the above template	
		System.out.println("INFO: " + msg );
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
		
		System.out.println("ERROR: " + msg );
	}
	
	//debug int
	public static void debug (int num) {
		// TODO Complete this code
		System.out.println("DEBUG: " + num );
	}
	
	
	//Info int
	public static void info (int num) {
		// TODO complete this code using the above template	
		System.out.println("INFO: " + num );
	}
	
	
	//num int
	public static void error (int num) {
		// TODO complete this code using the above template
		
		System.out.println("ERROR: " + num );
	}
	
	// Similarly write overloaded methods for error and info.
}
