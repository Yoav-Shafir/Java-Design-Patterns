package behavioral.observer.exe2;

public class Main {
	public static void main(String[] args) {
		
		Database database = new Database();
		database.registerObserver(new Archiver());
		database.registerObserver(new Client());
		database.registerObserver(new Boss());
		
		database.editRecord("delete", "record1");
	}
}
