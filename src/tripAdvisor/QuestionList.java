package tripAdvisor;

import java.util.ArrayList;

/**
 *
 *
 * @author Marianna Karm, IA18
 *
 */

public class QuestionList {
	private ArrayList<Question> questions;

	public QuestionList() {
		this.questions = new ArrayList<Question>();
	}

	public static QuestionList getQuestionList() {
		QuestionList list = new QuestionList();

		Question q = new Question();
		q.setQuestionBody("What is the purpose of your trip?");
		ArrayList<String> ans = new ArrayList<String>();
		ans.add("Shopping"); // UK
		ans.add("Sightseeings"); // Germany
		ans.add("Beach"); // Spain
		ans.add("Food");// Italy
		q.setAnswers(ans);
		list.questions.add(q);

		q = new Question();
		q.setQuestionBody("What kind of beverage do you prefer?");
		ans = new ArrayList<String>();
		ans.add("Cider");
		ans.add("Beer");
		ans.add("Wine");
		ans.add("Coffee");
		q.setAnswers(ans);
		list.questions.add(q);

		q = new Question();
		q.setQuestionBody("What kind of breakfast do you prefer?");
		ans = new ArrayList<String>();
		ans.add("English breakfast");
		ans.add("Sauerkraut");
		ans.add("Omelet");
		ans.add("Pizza");
		q.setAnswers(ans);
		list.questions.add(q);

		q = new Question();
		q.setQuestionBody("What kind of people do you like?");
		ans = new ArrayList<String>();
		ans.add("Polite");
		ans.add("Punctual");
		ans.add("Temperamental");
		ans.add("Loud");
		q.setAnswers(ans);
		list.questions.add(q);

		q = new Question();
		q.setQuestionBody("Choose an animal:");
		ans = new ArrayList<String>();
		ans.add("Lion");
		ans.add("Eagle");
		ans.add("Bull");
		ans.add("Wolf");
		q.setAnswers(ans);
		list.questions.add(q);

		return list;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
}