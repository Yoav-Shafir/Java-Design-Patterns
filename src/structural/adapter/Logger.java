package structural.adapter;

public abstract class Logger {
	abstract public void trace(String str);

	abstract public void debug(String str);

	abstract public void log(String str);

	public static Logger create() {

		// This was the first implementation.
		// return new LoggerImpl();

		// This is the new implementation.
		// This is the only change we do in the source code,
		// Non of the client needs to change the way they call to Logger.
		return new ApacheCommonsLogAdapter();
	}
}
