import java.util.ArrayList;

public class Actor {

	private int actorID;
	private String actorName;
	
	
	private ArrayList<Movie> actorCredits = new ArrayList<Movie>();
public int getActorID() {
		return actorID;
	}
	public void setActorID(int actorID) {
		this.actorID = actorID;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public ArrayList<Movie> getActorCredits() {
		return actorCredits;
	}
	public void setActorCredits(ArrayList<Movie> actorCredits) {
		this.actorCredits = actorCredits;
	
	}

	public void printDetails() {
		System.out.println(actorID + " \t" + actorName);
	}
	public void printSummary() {
		for(Movie m: actorCredits) {
			m.printSummary();
			
		}
	}
	public void addFilm(Movie m) {
		actorCredits.add(m);
	}
	public void removeFilm(Movie m) {
		actorCredits.remove(m);
	}
	public Actor(int actorID, String actorName, ArrayList<Movie> actorCredits) {
		super();
		this.actorID = actorID;
		this.actorName = actorName;
		this.actorCredits = actorCredits;
	}

	
	public Actor() {
	
}
	
	
	
	
}
