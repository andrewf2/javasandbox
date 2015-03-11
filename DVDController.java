package myMVC;

import java.util.ArrayList;

public class DVDController {
	//These control which class is the model and which class is the view, hence this class is the "controller".
	//The below code assigns the Title of the class to a variable: model, or view. 
	

	//This calls the Model and View classes and assigns them to variables in the controller.
	//The this keyword qualifies them to this particular method in this class.   
	
	//This sets a new employee Title using the DVD model class. 
	
	public static void dvdView(String Title){
		DVD dvd = DVDModel.find(Title);
		System.out.println(dvd.getTitle()+" "+"costs"+" "+dvd.getCost());
	}
	
	public static void dvdIndex(){
		ArrayList<DVD> list = DVDModel.all();
		for(DVD dvd:list){
			System.out.println(dvd.getTitle()+" "+ "costs"+" "+dvd.getCost());
		}
	}

	
	//This updates the view class.
		
}