package behavioral.observer.exe1;

// this class is getting every some time a value 
// from the Driver.
// it knows how to return the value in several formats.
public class Thermometer extends Observable {
	public double tempratureInKelvin = -1.0;
	private final String KELVIN_FORMAT = "%,.1fK";
	private final String CELCIUS_FORMAT = "%,.1fC";
	private final String FAHRENHEIT_FORMAT = "%,.1fF";

	public Thermometer() {
		
	}
	void driverValue(long value) {
		this.tempratureInKelvin = value / 100.0;
		super.notifyDependents();
	}
	public String getTempratureKelvin() {
		return String.format(KELVIN_FORMAT, this.tempratureInKelvin);
	}
	public String getTempratureCelcius() {
		return String.format(CELCIUS_FORMAT, this.tempratureInKelvin - 273.15);
	}
	public String getTempratureFahrenheit() {
		return String.format(FAHRENHEIT_FORMAT, this.tempratureInKelvin - 273.15);
	}
	
}
