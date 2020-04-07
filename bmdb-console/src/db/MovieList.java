package db;

import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieList implements DAO<Movie> {
    private List<Movie> movies = null;
    
    
	public MovieList() {
		// initialize the list of movies
		movies = new ArrayList<Movie>();
		Movie m1 = new Movie(1, "300", 2006, "R", "Zach Snyder");
		Movie m2 = new Movie(2, "Original Sin", 2001, "R", "Michael Cristofer");
		movies.add(m1);
		movies.add(m2);
	}

	@Override
	public Movie get(int id) {
		// Get a Movie for the given ID
		Movie m = null;
		for (Movie movie: movies) {
			if (movie.getId() == id) {
				m = movie;
			}
		}
		return m;
	}

	@Override
	public List<Movie> list() {
		// Return the full list of Movies
		return movies;
	}

	@Override
	public boolean add(Movie m) {
		// Add a Movie
		// if Movie ID is Zero, generate an ID
		if (m.getId()==0)
		m.setId(generateID());
		return movies.add(m);
	}
	
	private int generateID() {
		int id = 0;
		for (Movie m: movies) {
			id = Math.max(id, m.getId());
		}
		return id+1;
	}

	@Override
	public boolean update(Movie t) {
		// TODO Yet to be implemented
		return false;
	}

	@Override
	public boolean delete(Movie m) {
		// TODO Delete Movie from the list
		return movies.remove(m);
	}

}
