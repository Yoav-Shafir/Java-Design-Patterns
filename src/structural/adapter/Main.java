package structural.adapter;

public class Main {
	public static void main(String[] args) {
		Logger logger = Logger.create();
		logger.trace("trace...");
		logger.debug("debug...");
		logger.log("trace...");
	}
}
