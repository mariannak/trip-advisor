package tripAdvisor;

//This class contains linked list to store and add questions and choices. 

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class QuestionModel {
	private List<Question> questions;
	private Map<Question, String> answers; // maps keys to the value

	public QuestionModel() {
		questions = new LinkedList<>();
		answers = new HashMap<>();
		initModel();
	}

	private void initModel() {
		addQuestion(new Question("What is the purpose of your trip?", "Shopping", "Sightseeings", "Beach", "Food"));
		addQuestion(new Question("What kind of beverage do you prefer?", "Cider", "Beer", "Wine", "Coffee"));
		addQuestion(new Question("What kind of breakfast do you prefer?", "English breakfast", "Sauerkraut", "Omelet","Pizza"));
		addQuestion(new Question("What kind of people do you like?", "Polite", "Punctual", "Temperamental", "Loud"));
		addQuestion(new Question("Choose an animal:", "Lion", "Eagle", "Bull", "Wolf"));
	}

	public void addQuestion(Question question) { // adding new question
		this.questions.add(question);
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void addAnswer(Question question, String answer) { // adding user answer
		answers.put(question, answer); // associates answer with the question
	}

	public Map<Question, String> getAnswers() {
		return this.answers;
	}
}
