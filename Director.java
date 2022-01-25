import java.util.ArrayList;

public class Director{
	private int directorID;
	private String directorName;
	private ArrayList<Movie> directorCredits = new ArrayList<Movie>();

	public Director() {
		
	}

	public Director(int directorID, String directorName, ArrayList<Movie> directorCredits) {
		super();
		this.directorID = directorID;
		this.directorName = directorName;
		this.directorCredits = directorCredits;
	}

	public int getDirectorID() {
		return directorID;
	}

	public void setDirectorID(int directorID) {
		this.directorID = directorID;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public ArrayList<Movie> getDirectorCredits() {
		return directorCredits;
	}

	public void setDirectorCredits(ArrayList<Movie> directorCredits) {
		this.directorCredits = directorCredits;
	}
	
	public void printDetails() {
		System.out.println(directorID + " \t" + directorName);
		
	}
	public void printCredits() {
		for(Movie m: directorCredits) {
			m.printSummary();
		}
	}

	public void addMovie(Movie m) {
		directorCredits.add(m);
		
	}
	public void removeMovie(Movie m) {
		directorCredits.remove(m);
	}






}
