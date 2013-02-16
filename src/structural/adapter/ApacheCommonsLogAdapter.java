package structural.adapter;


// this is the new implementation we want our clients to use.
public class ApacheCommonsLogAdapter extends Logger {
	
	// instantiate the 'BetterLogger' class which we want
	// out client to start use.
	private BetterLogger logger = new BetterLogger();
	
	// each method forward the calling
	// to the new BetterLogger instance which has a different API
	// and method signature.
	// the user is not aware of it.
	
	@Override
	public void trace(String str) {
		logger.log(str, 0);
	}

	@Override
	public void debug(String str) {
		logger.log(str, 1);
	}

	@Override
	public void log(String str) {
		logger.log(str, 2);
	}

}
