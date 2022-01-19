import java.io.*;
import java.util.*;

class Movie implements Comparable < Movie > {

	private String movie;
	private int year;

	Movie(String movie, int year) {
		this.movie = movie;
		this.year = year;
	}
	
	public String getmovie() {
		return movie;
	}
	
	public int getyear() {
		return year;
	}

	//Abstarct method of Comparable interface
	public int compareTo(Movie movie) {
		return this.year - movie.year;
	}
	
}

public class ListComparable {

	public static void main(String[] args) {
		ArrayList < Movie > movieDetails = new ArrayList < Movie > ();
		movieDetails.add(new Movie("Force", 2017));
		movieDetails.add(new Movie("Force 2", 2019));
		movieDetails.add(new Movie("FF 2", 2015));
		movieDetails.add(new Movie("FF 3", 2016));
		movieDetails.add(new Movie("FF", 2013));

		Collections.sort(movieDetails);

		System.out.println("Movies after sorting : ");

		for (Movie movie: movieDetails) {
			System.out.println(movie.getmovie() + " " + movie.getyear());
		}
	}

}