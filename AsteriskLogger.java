package Week5APP;

public class AsteriskLogger {
	 public void log(String message) {
	        System.out.println("***" + message + "***");
	    }

	    public void error(String message) {
	        String errorMessage = "***Error: " + message + "***";
	        String border = "".repeat(errorMessage.length());
	        border = "*".repeat(border.length());
	        
	        System.out.println(border);
	        System.out.println(errorMessage);
	        System.out.println(border);
	    }
	}

