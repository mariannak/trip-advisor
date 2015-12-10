package tripAdvisor;

import java.util.Arrays;
import java.util.List;

public class Question {
	private String question;
	private List<String> choices;
	
	public Question(String question, String ... strings) {
		this.question = question;
		this.choices = Arrays.asList(strings); //creates a list of choices
	}
	
	public String getQuestion() {
		return question;
	}
	
	public List<String> getChoices() {
		return choices;
	}
}
