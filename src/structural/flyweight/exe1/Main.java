package structural.flyweight.exe1;

public class Main {
	public static void main(String[] args) {
		
		// we want to configure a Student object to appear like a set of
		// real students, so you we store the students’ data (names, IDs, and test scores) 
		// in a set of arrays.
		String[] names = {"Ralph", "Alice", "Sam"};
		int ids[] = {1001, 1002, 1003};
		int scores[] = {45, 55, 65};
		
		// to compare a particular student to the other students, we also need to
		// determine the average test score, which we find by summing the scores and
		// dividing by the total number of scores:
		double total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		double averageScore = total / scores.length;
		
		// get the StudentThreaded single instance using the static method 'getInstance()' method. 
		StudentThreaded student = StudentThreaded.getInstance();
		student.setAverageScore(averageScore);
		
		// now we can configure the flyweight object as needed, rather than having a
		// dedicated object for each student.
		for (int i = 0; i < scores.length; i++) {
			student.setName(names[i]);
			student.setId(ids[i]);
			student.setScore(scores[i]);
			
			System.out.println("Name: " + student.getName());
			System.out.println("Standing: " + Math.round(student.getStanding()));
			System.out.println("");
		}
		
		// so instead of three full objects, we need only one configurable object.
		// much like the Singleton pattern, the idea behind the Flyweight pattern is to control
		// object creation and limit the number of objects you need.
	}
}
