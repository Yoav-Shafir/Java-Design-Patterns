package structural.adapter;

// old implementation that we want to change.
public class LoggerImpl extends Logger {

	@Override
	public void trace(String str) {
		System.out.println("TRACE: " + str);
	}

	@Override
	public void debug(String str) {
		System.out.println("DEBUG: " + str);
	}

	@Override
	public void log(String str) {
		System.out.println("LOG: " + str);
	}

}
