package myMVC;

public class DVDController {
	//These control which class is the model and which class is the view, hence this class is the "conter".
	//The below code assigns the Title of the class to a variable: model, or view. 
	private DVD model;
	private DVDView view;

	//This calls the Model and View classes and assigns them to variables in the conter.
	//The this keyword qualifies them to this particular method in this class.   
	public DVDController(DVD model, DVDView view){
		this.model = model;
		this.view = view;
	}
	//This sets a new employee Title using the DVD model class. 
	public void setDVDTitle(String Title){
		model.setTitle(Title);		
	}
	//This is a getter for the DVDTitle method.
	public String getDVDTitle(){
		return model.getTitle();		
	}
	//This sets a new empoyee ID using the DVD model class.
	public void setDVDCost(int cost){
		model.setCost(cost);		
	}
	//This is a getter for the DVDCost method, which is their ID.
	public int getDVDCost(){
		return model.getCost();		
	}
	//This updates the view class.
	public void updateView(){				
		view.printDVDDetails(model.getTitle(), model.getCost());
	}	
}