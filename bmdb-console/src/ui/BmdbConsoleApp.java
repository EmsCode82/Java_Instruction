package ui;

import java.util.List;

import business.Movie;
import db.DAO;
import db.MovieList;
import util.Console;

public class BmdbConsoleApp {
	private static DAO<Movie> movieRepo = new MovieList();

	public static void main(String[] args) {
		// Welcome and Initialization
		System.out.println("Welcome to the BMDB Console App!!!");
		String command = "";

		// - Start Loop
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			// Get User Input
			command = Console.getString("Command?: ", true);
			// Do Business Logic
			// Display Results
			switch (command) {
			case "get":
				// Get a Movie
				getMovie();
				break;
			case "list":
				// List all Movies
				listMovie();
				break;
			case "add":
				// Add a Movie
				addMovie();
				break;
			case "del":
				// Delete a Movie
				deleteMovie();
				break;
			case "exit":
				// Do nothing - Exit App
				break;
			default:
				System.out.println("Invalid Entry. Try again.!");
				break;
			}
			// - End Loop
		}
		// Bye
		System.out.println("Bye!");
	}

	private static void deleteMovie() {
		// Prompt user for id and get the Movie
		Movie m = getIdAndReturnMovie();
		
		// Delete the Movie
		movieRepo.delete(m);
		
		// Display confirmation message
		System.out.println("Movie successfully deleted!");
		System.out.println();
	}

	private static void addMovie() {
		// Prompt user for Movie Data
		// int id = Console.getInt("Movie ID:  ", 0, (int)Double.POSITIVE_INFINITY);
		String title = Console.getString("Movie Title:  ", true);
		int year = Console.getInt("Release Year:  ", 0, (int)Double.POSITIVE_INFINITY);
		String rating = Console.getString("Movie Rating:  ", true);
		String director = Console.getString("Movie Director:  ", true);
		
		// Add the Movie
		Movie m = new Movie(0, title, year, rating, director);
		movieRepo.add(m);
		
		// Display confirmation message
		System.out.println("Movie successfully added!");
		
	}

	private static void listMovie() {
		// Get list of all Movies
		List<Movie> movies = movieRepo.list();
		// Display to screen
		for (Movie m: movies) {
			System.out.println(m);
		}
		
	}

	private static void getMovie() {
		// Prompt user for ID and get the Movie
		Movie m = getIdAndReturnMovie();
		// Display to screen
		System.out.println(m);
	}
    
	private static Movie getIdAndReturnMovie() {
		Movie m = null;
		while (m == null) {
			int id = Console.getInt("Movie ID: ", 0, (int)Double.POSITIVE_INFINITY);
			m = movieRepo.get(id);
			System.out.println();
		}
		
		return m;
	}
	
	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("list   - List all movies\n");
		menu.append("get    - Get a movie by id\n");
		menu.append("add    - Add a movie\n");
		menu.append("del    - Delete a movie\n");
		menu.append("exit   - Exit the Program\n");
		System.out.println(menu);
	}
	
}