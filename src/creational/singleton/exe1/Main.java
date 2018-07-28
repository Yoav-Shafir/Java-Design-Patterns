package creational.singleton.exe1;

public class Main {
	public static void main(String[] args) {

		// singleton implementing synchronized method.
		DatabaseSynchronized dbSync = DatabaseSynchronized.getInstance("products");
		dbSync.editRecord("delete");

		// singleton implementing instance creation on class loading.
		DatabaseThreaded dbThread = DatabaseThreaded.getInstance();
		dbThread.editRecord("delete");
	}
}
