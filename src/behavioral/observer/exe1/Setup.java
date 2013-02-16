package behavioral.observer.exe1;

// a simple class to start the program.
public class Setup {
	private Driver driver;
	private Thermometer thermometer;
	
	public Setup() {
		this.thermometer = new Thermometer();
		this.driver = new Driver(this.thermometer);
		this.driver.start();
	}
	
	public void shutdown() {
		this.driver.shutdown();
	}
	
	public Thermometer getThermometer() {
		return this.thermometer;
	}
}
