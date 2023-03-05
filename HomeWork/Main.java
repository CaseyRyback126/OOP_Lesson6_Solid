public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		User anotherUser = new User("Brad");

		Saveable saveable = new Persister(user);
		Saveable saveable1 = new Persister(anotherUser);
		saveable1.save();
		saveable.save();

		Reportable reportable = new ReportUser(user);
		Reportable reportable1 = new ReportUser(anotherUser);
		reportable1.report();
		reportable.report();
	}
}