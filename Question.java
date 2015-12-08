package tripAdvisor;

import java.util.ArrayList;

/**
 * 
 * @author Marianna Karm IA18A
 *
 */

public class Question {

	private static int CURRENT_ID = 1;

	private int id;
	private String questionBody;
	private ArrayList<String> answers;

	public Question() {
		this.id = CURRENT_ID;
		CURRENT_ID++;
		answers = new ArrayList<String>();
	}

	public ArrayList<String> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}
}