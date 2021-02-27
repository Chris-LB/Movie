
public class Driver {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie avengers = new Movie("Avengers", "Ruso Brothers",2);
		Movie darkKnight = new Movie("The Dark Knight","Christopher Nolan",1);
		Movie logan = new Movie("Logan","James Mangold",1);
		Movie jumanji = new Movie("Jumanji","Jake Kasdan",0);
		Movie plantOfApes = new Movie("Rise of the plant of the Apes","Rupert Wyatt",2);
		Movie rideAlong = new Movie("Ride Along","Tim Story",0);
		System.out.println(darkKnight.equals(logan));
		
		Distributor warner = new Distributor("Max", "112 10th ave", "123-456-5678");
		Distributor disney = new Distributor("Alex", "132 10th ave", "123-486-5678");
		
		avengers.addEarning(25.67);
		darkKnight.addEarning(56.88);
		logan.addEarning(44.55);
		jumanji.addEarning(10.06);
		rideAlong.addEarning(8.78);
		System.out.println(logan.equals(plantOfApes));
		System.out.println(avengers.toString());
		
		
		warner.addMovie(logan);
		warner.addMovie(rideAlong);
		warner.addMovie(plantOfApes);
		warner.addMovie(darkKnight);
		disney.addMovie(jumanji);
		disney.addMovie(avengers);
		disney.addMovie("Rogue one", "Gareth Edwards", 2, 34.56);
		disney.addEarnings("Avengers", 50.00);
		System.out.println(warner.totalNumberOfMovies());
		System.out.println(disney.findTotalEarnings());
		System.out.println(disney.equals(warner));
		System.out.println(warner.getNumGenre(1));
		System.out.println(warner.toString());
		System.out.println(disney.toString());
		
		rideAlong.setName("Bot ");
		System.out.println(rideAlong.getName());
		
		
		

	}

}
