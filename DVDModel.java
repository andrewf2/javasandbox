package myMVC;

import java.util.ArrayList;

public class DVDModel {
	private static DVD starwars = new DVD("Star Wars", 13);
	private static DVD avengers = new DVD("Avengers", 13);
	private static DVD alien = new DVD("Alien", 13);
	
	private static DVDDatabase db = new DVDDatabase(starwars,avengers,alien);
	private static ArrayList<DVD> list = db.getList();
	
	public static ArrayList<DVD> all(){
		return list;
		
	}
	
	public static DVD find(String name){
		DVD returnedDvd = null;
		for(DVD dvd:list){
			if(dvd.getTitle() == name){
				returnedDvd = dvd;
			}
		}
		return returnedDvd;
	}
	public static void remove(String name){
		for(DVD dvd:list){
			if(dvd.getTitle()== name){
				list.remove(dvd);
			}
		}
		
	}

}
