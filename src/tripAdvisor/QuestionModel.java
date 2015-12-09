package tripAdvisor;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class QuestionModel {
	private List<Question> questions;
	private Map<Question, String> answers;
	
	public QuestionModel() {
		questions = new LinkedList<>();
		answers = new HashMap<>();
		initModel();
	}

	private void initModel() {
		addQuestion(new Question("question 1", "option 1", "option 2", "option 3"));
		addQuestion(new Question("question 2", "answer 1", "answer 2", "answer 3"));
	}
	
	public void addQuestion(Question question) {
		this.questions.add(question);
	}
	
	public void addAnswer(Question question, String answer) {
		answers.put(question, answer);
	}
	
	public List<Question> getQuestions() {
		return this.questions;
	}
	
	public Map<Question, String> getAnswers() {
		return this.answers;
	}
}
