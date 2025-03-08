package Week5APP;

public class App {
	public static void main(String[] args) {
        // Instantiate the Logger implementations
        AsteriskLogger asteriskLogger = new AsteriskLogger();
        SpacedLogger spacedLogger = new SpacedLogger();

        // Test AsteriskLogger
        System.out.println("Testing AsteriskLogger:");
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        // Test SpacedLogger
        System.out.println("\nTesting SpacedLogger:");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}


