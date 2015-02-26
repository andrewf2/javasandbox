package myMVC;



public class MyMVCDemo {
	public static void main(String[] args) {

		//Instantiates the DVD model and updates the information contained in it with the information in the retrieveDVD method below.
		DVD model  = retriveDVD();

		//Instantiates "DVDView" to print results of demo to Console. 
		DVDView view = new DVDView();

		//Instantiates the controller and passes it the new model a view to allow the view to be updated with the new information. 
		DVDController controller = new DVDController(model, view);

		//Calls the update view method in the DVDController class to allow the new information to be displayed in the view.
		controller.updateView();

	}
	// A method that grabs an DVD from a hypothetical database (the model) and assigns it the below information.
	private static DVD retriveDVD(){
		DVD dvd = new DVD("Star Wars", 13);
		
		return dvd;
	}
}
