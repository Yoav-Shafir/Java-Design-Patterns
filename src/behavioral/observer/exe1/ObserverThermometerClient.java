package behavioral.observer.exe1;

public class ObserverThermometerClient implements Observer {
	
	public ObserverThermometerClient() {
		
	}
	
	@Override
	public void update(Observable o) {
		Thermometer t = (Thermometer) o;
		
		System.out.println(
			"Checking temprature #"
			+ ": "
			+ t.getTempratureCelcius()
			+ ", "
			+ t.getTempratureKelvin()
			+ ", "
			+ t.getTempratureFahrenheit()
		);
	}
	
	public static void main(String[] args) {
		Setup s = new Setup();
		@SuppressWarnings("unused")
		ObserverThermometerClient client = new ObserverThermometerClient();
		s.getThermometer().addObserver(client);
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----- shuting down!!! -----");
		s.shutdown();
	}
}
