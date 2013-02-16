package behavioral.observer.exe3javaNativeSupport;

import java.util.Observable;

// creating the observable object.
public class Database extends Observable {
	
	private String operation;
	private String record;
	
	public Database() {
		
	}
	
	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		
		// Marks this Observable object as having been changed. 
		// the hasChanged method will now return true.
		setChanged();
		
		// If this object has changed, as indicated by the hasChanged method, 
		// then notify all of its observers and then call the clearChanged 
		// method to indicate that this object has no longer changed.
		notifyObservers();
	}
	
	public String getRecord() {
		return record;
	}
	
	public String getOperation() {
		return operation;
	}
}
