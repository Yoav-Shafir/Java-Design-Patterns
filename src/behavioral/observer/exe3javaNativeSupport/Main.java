package behavioral.observer.exe3javaNativeSupport;

public class Main {
	public static void main(String[] args) {
		
		Database database = new Database();
		database.addObserver(new Archiver());
		database.addObserver(new Boss());
		
		database.editRecord("delete", "record 1");
	}
}
