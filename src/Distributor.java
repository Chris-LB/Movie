/*
 * Chris Lara-Betancourt 

 * ICS 240 
 * Summer 2020
 * This program will create an array of movies and store it in the distributor class.
 * The distributor class 
 * 
 */
import java.util.Arrays;

public class Distributor {
	private String name;
	private String address;
	private String phone;
	private Movie [] movies;
	private int numberOfMovies;
	
/**
 * 	
 * @param name = the name of the distributor 
 * @param address = the address of the distributor 
 * @param phone  = the phone number of the distributor
 */
	public Distributor(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.movies = new Movie [5];
		this.numberOfMovies = 0;
	}
/*
 * The getter and setter for this class
 */

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Movie[] getMovie() {
		return Arrays.copyOf(movies, numberOfMovies);
		
	}
	/**
	 * Will add a movie to the distributor
	 * @param next - The input of the function
	 * @return will return true if added and false if not 
	 */
	public boolean addMovie(Movie next) {
		boolean added = false;
		 if(movies.length > numberOfMovies) {
			movies[numberOfMovies] = next;
			numberOfMovies += 1;
			added = true;
			
		}else {
			added = false;
		}
		
		return added;	
	}
	
/**
 * 
 * @param name
 * @param directorsName
 * @param genre
 * @param earnings
 * @return
 */
	public boolean addMovie(String name, String directorsName, int genre, double earnings ) {
		Movie movie1 = new Movie( name, directorsName, genre);
		movie1.setEarnings(earnings);
		return addMovie(movie1);
	}
	
	/**
	 * Will find the total number of in the distributor.
	 * @return Will return an integer telling the user how many movies there are.
	 */
	public int totalNumberOfMovies() {
		return numberOfMovies;
	}
	/**
	 * Will find the total earning of the movies in the distributor.
	 * @return Will return a double telling the user the total price of the movies.
	 */
	public double findTotalEarnings() {
		double totalEarnings = 0;
		for(int i = 0; i < numberOfMovies; i++) {
			totalEarnings += movies[i].getEarnings();		
		}
		return totalEarnings;
	}
	
	public double comedyTotalEarnings() {
		double totalEarnings = 0;
		for(int i =0; i< numberOfMovies; i++) {
			if(movies[i].getGenre()== 0) {
				totalEarnings += movies[i].getEarnings();
			}
		}
		return totalEarnings;
	}
	
	/**
	 * Will add the earning to a total earning if the movies exist.
	 * @param name Is the name of the movie.
	 * @param earn Is the amount of the movie earned.
	 * @return Will return a boolean value letting the user know if it was added or not.
	 */
	public boolean addEarnings(String name, double earn) {
		boolean found = false;
		for(int i = 0; i < numberOfMovies; i++) {
			if(movies[i].getName().equalsIgnoreCase(name)) {
			  movies[i].addEarning(earn);
				found = true;
			}	
		}
		return found;
	}
	
	/**
	 * Will check if for the genre is a type for the movies.
	 * @param num : Is the number to decide what kind of genre the user is looking for.
	 * @return Will give the user the number of movies in the genre or it will show -1.
	 */
	public int getNumGenre(int num) {
		if(num == 0 || num == 1 || num == 2) {
			int counter = 0;
			for(int i = 0; i < numberOfMovies; i++) {
				if(movies[i].getGenre() == num) {
					counter += 1;
				}
			}
			return counter;	
			
		}else {
			return -1;
		}
	}
	
	/**
	 * Will calculate the tax of the total earnings of a distributor.
	 * @param tax : Will be a double to know what the tax rate is.
	 * @param dis : take in the distributor for what the tax will be calculated for.
	 * @return Will return the tax needed to be paid.
	 */
	public static double calculateTax (double tax, Distributor dis) {
		return dis.findTotalEarnings() * tax;
	}
	
	/**
	 * Will check if one distributor is equal to another distributor.
	 * @param dis : Is the input for which distributor the user wanted to compare.
	 * @return Will return a boolean value the lets the user know if they do equal.
	 */
	public boolean equals(Distributor dis) {
		boolean isTrue = false;
		if(dis instanceof Distributor) {
			Distributor first = (Distributor) dis;
			if(this.name.equalsIgnoreCase(first.name)) {
				isTrue = true;
			}
		}
		return isTrue;

	}
	

	@Override
	public String toString() {
		return "Distributor [Distributor name =" + name + ", address=" + address + "\n, phone number =" + phone + ", movies="
				+ Arrays.toString(movies) + ", numberOfMovies=" + numberOfMovies + "]";
	}
	
	
	
	
	
	
	
	
}
