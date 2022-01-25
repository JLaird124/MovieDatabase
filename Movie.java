import java.util.ArrayList;

public class Movie {

	private int movieID;
	private String movieTitle;
	private int minuteRunTime;
	private String genre;
	private Director movieDirector;
	private ArrayList<Actor> movieCast = new ArrayList<Actor>();

	public Movie() {
		
	}

	public Movie(int movieID, String movieTitle, int minuteRunTime, String genre, Director movieDirector,
			ArrayList<Actor> movieCase) {
		super();
		this.movieID = movieID;
		this.movieTitle = movieTitle;
		this.minuteRunTime = minuteRunTime;
		this.genre = genre;
		this.movieDirector = movieDirector;
		this.movieCast = movieCase;
	}
	
	public void addActor(Actor a) {
		movieCast.add(a);
	}

	public void removeActor(Actor a) {
		movieCast.remove(a);
		
	}
	
	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getMinuteRunTime() {
		return minuteRunTime;
	}

	public void setMinuteRunTime(int minuteRunTime) {
		this.minuteRunTime = minuteRunTime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	public Director getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(Director movieDirector) {
		this.movieDirector = movieDirector;
	}

	public ArrayList<Actor> getMovieCast() {
		return movieCast;
	}

	public void setMovieCast(ArrayList<Actor> movieCast) {
		this.movieCast = movieCast;
	}
	
	public void printSummary() {
		System.out.println(movieID + " \t" + movieTitle);
	}
	
	public void printDetails() {
		System.out.println("Movie ID: \t" + movieID);
		System.out.println("Movie Title: \t" + movieTitle);
		System.out.println("Movie Run time: \t" + minuteRunTime);
		System.out.println("Director " + movieDirector.getDirectorName()); 
		printCastList();
		
	}
	public void printCastList() {
		for(Actor a: movieCast) {
			a.printDetails();
	}
	}}
