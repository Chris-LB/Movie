/*
 * Chris Lara-Betancourt 
 * ICS 240 
 * Summer 2020
 * This class will create a movie and have four requirements.
 * It will need a name, director name, earnings, and genre.
 * You will either be able to initialize it all at one or in increments. 
 */
public class Movie {
	private String name;
	private String directorName;
	private double earnings;
	private int genre;
	
    /**
     * Movie constructor that initializes all instance variables except earnings.
     * @param name
     * @param directorName
     * @param genre
     */
	public Movie(String name, String directorName, int genre) {
		this.name = name;
		this.directorName = directorName;
		this.earnings = 0;
		this.genre = genre;
	}
	
	/*
	 * The getter and setter methods of this class.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

	public int getGenre() {
		return genre;
	}
	
	/**
	 * Add earning method that will add a certain amount to the earned amount of a
	 * certain movie.
	 * @param amount
	 * @return
	 */
	public double addEarning(double amount) {
		earnings += amount;
		return earnings;
	}
	
	/**
	 * Equals method will check a movie with the movie initialized by the constructor.
	 * It will check the name,director name, and genre in order to determine if it is equal.
	 * @param one
	 * @return
	 */
	public boolean equals(Movie one) {
		boolean isTrue = false;
		if(one instanceof Movie) {
			Movie first = (Movie) one;
			if(this.name.equalsIgnoreCase(first.name) && this.directorName.equalsIgnoreCase(first.directorName) && this.genre == first.genre) {
				isTrue = true;
			}
		}else {
			 isTrue = false;
		}
		return isTrue;
		
	}
	
    /**
     * A to string method that will return all the components that make up a movie.
     */
	@Override
	public String toString() {
		return "Movie [name=" + name + ", directorName=" + directorName + ", earnings= $" + earnings + ", genre=" + genre
				+ "]";
	}
	
	

}
