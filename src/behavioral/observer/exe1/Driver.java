package behavioral.observer.exe1;

// this class only job is to run as a separate thread
// and generate a random value every some time.
// the 'Thermometer' instance is being fed with the value.
public class Driver extends Thread {
	
	// some configuration params.
	public static final long AVERAGE_TIME_BETWEEN_UPDATES_IN_SEC = 5;
	private static final long RANGE_OF_CHANGE = 100;
	
	// simple counter.
	public int updateCount = 0;
	
	// initial value... Just a number to start with.
	private long value = 30000; 
	
	
	private Thermometer thermometer;
	private boolean shutdown = false;
	
	public Driver(Thermometer t) {
		this.thermometer = t;
	}
	
	@Override
	public void run() {
		try {
			while (!this.shutdown) {
				// add a random value to the current value.
				this.value += (long) (Math.random() * RANGE_OF_CHANGE / 2);
				this.updateCount++;
				
				System.out.println("Driver update # " + this.updateCount + ": " + this.value );
				
				// inject the new value to the thermometer. 
				this.thermometer.driverValue(this.value);
				
				// wait a while...
				Thread.sleep((long) (Math.random() * AVERAGE_TIME_BETWEEN_UPDATES_IN_SEC * 1000));
			}
		} catch (Exception e) {}
	}
	
	public void shutdown() {
		this.shutdown = true;
	}
}
