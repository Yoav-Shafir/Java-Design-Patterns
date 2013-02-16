package behavioral.observer.exe3javaNativeSupport;

import java.util.Observable;
import java.util.Observer;

public class Boss implements Observer {
	
	// this method is called whenever the observed object is changed,
	// when the notifyObservers gets called.
	
	// o - the observable object.
	// arg - an argument passed to the notifyObservers method.
	
	@Override
	public void update(Observable o, Object arg) {
		Database database = (Database)o;
		System.out.println("The boss says a " + database.getOperation() 
		 + " operation was performed on " + database.getRecord());
	}

}
