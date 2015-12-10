package tripAdvisor;



public class Main {
	
	//Starts the program that asks various questions and suggests travel destination according to the users preferences

	public static void main(String ... args) {
		AdvisorWindow window = new AdvisorWindow();
		QuestionModel model = new QuestionModel();
		WindowController controller = new WindowController(window, model);
		window.setVisible(true);
	}
}
