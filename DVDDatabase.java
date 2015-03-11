package myMVC;

import java.util.ArrayList;

public class DVDDatabase {
	
	ArrayList<DVD> list = new ArrayList<DVD>();
	
	public DVDDatabase(DVD dvd1,DVD dvd2,DVD dvd3){
		this.list.add(dvd1);
		this.list.add(dvd2);
		this.list.add(dvd3);
	}
	public ArrayList<DVD> getList(){
		return list;
	}
}

