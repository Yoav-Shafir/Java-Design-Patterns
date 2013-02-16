package structural.flyweight.exe1;

public class StudentThreaded {
	String name;
	int id;
	int score;
	double averageScore;
	
	// we can create the flyweight object
	// when the class is first loaded, make the constructor private, and allow object
	// creation only through a getInstance method.
	private static StudentThreaded singleObject = new StudentThreaded();
	
	// static method to get the single instance.
	public static StudentThreaded getInstance(){
		return singleObject;
	}
	
	// gettes/setters.
	public void setAverageScore(double a) {
		averageScore = a;
	}
	public void setName(String n) {
		name = n;
	}
	public void setId(int i) {
		id = i;
	}
	public void setScore(int s) {
		score = s;
	}
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public int getScore() {
		return score;
	}
	public double getStanding() {
		return ( ( (double)score / averageScore - 1.0) ) * 100.0;
	}
}
