package behavioral.observer.exe2;

import java.util.Vector;

public class Database implements Subject {
	
	private Vector<Observer> observsers;
	private String operation;
	private String record;
	
	public Database() {
		observsers = new Vector<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observsers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observsers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observsers) {
			observer.update(this.operation, this.record);
		}
	}
	
	public void editRecord(String operation, String record) {
		this.operation = operation;
		this.record = record;
		notifyObservers();
	}
	

}
