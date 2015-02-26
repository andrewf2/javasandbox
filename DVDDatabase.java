package myMVC;

import java.util.ArrayList;

public class DVDDatabase {
	DVD starwars = new DVD("Star Wars", 13);
	DVD avengers = new DVD("Avengers", 13);
	DVD alien = new DVD("Alien", 13);
	DVD jurassic = new DVD("Jurassic Park", 13);
	
	ArrayList<DVD> list = new ArrayList<DVD>();
	list.add(starwars);
	list.add(avengers);
	list.add(alien);
	
	
}

