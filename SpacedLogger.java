package Week5APP;

public class SpacedLogger {
	 public void log(String message) {
	        System.out.println(addSpaces(message));
	    }

	    public void error(String message) {
	        System.out.println("ERROR: " + addSpaces(message));
	    }

	    private String addSpaces(String message) {
	        return message.replaceAll("", " ").trim();
	    }
	}


