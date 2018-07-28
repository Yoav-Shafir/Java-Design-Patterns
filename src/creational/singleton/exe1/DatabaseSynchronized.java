package creational.singleton.exe1;

// using the synchronized key-word.
public class DatabaseSynchronized {

	private static DatabaseSynchronized singleObject;
	private int record;
	private String name;

	private DatabaseSynchronized(String n) {
		name = n;
		record = 0;
	}

	public void editRecord(String operation) {
		System.out.println("Performing a " + operation + " operation on record " + record + " in database " + name);
	}

	public String getName() {
		return name;
	}

	// use the Java synchronized keyword,
	// which restrict access to getInstance to one thread at a time.
	public static synchronized DatabaseSynchronized getInstance(String n) {
		if (singleObject == null) {
			singleObject = new DatabaseSynchronized(n);
		}

		return singleObject;
	}
}
