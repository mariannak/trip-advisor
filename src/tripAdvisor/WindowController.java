package tripAdvisor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.swing.JOptionPane;

// This class controls actions and saves user selections.
// how to use queue - http://tutorials.jenkov.com/java-collections/queue.html. 
// https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/LinkedBlockingQueue.html


public class WindowController {

	private AdvisorWindow window;
	private QuestionModel model;
	private Queue<Question> unansweredQuestions;

	public WindowController(AdvisorWindow window, QuestionModel model) {
		this.window = window;
		this.model = model;
		window.setContentPane(new StartupScreen(this));
	}

	private void startQuestioning() {
		unansweredQuestions = new LinkedBlockingQueue<Question>();
		unansweredQuestions.addAll(model.getQuestions());

		Question question = unansweredQuestions.poll(); // removes the head of this queue, or returns null if this queue is empty.
		if (question != null) {
			showQuestion(question);
			return;
		}
	}

	public void showQuestion(Question question) {
		QuestionScreen screen = new QuestionScreen(this, question);
		window.getContentPane().removeAll();
		window.setContentPane(screen);
		window.revalidate();
	}

	private void showNextQuestion() { //shows questions till the queue is empty
		Question question = unansweredQuestions.poll();
		if (question != null) {
			showQuestion(question);
			return;
		}

	}

	public ActionListener showNextQuestionAction() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showNextQuestion();
			}
		};
	}

	public ActionListener startAction() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startQuestioning();
			}
		};
	}

	public void saveSelectedValue(Question question, String answer) { //saves users answer
		model.addAnswer(question, answer);
		showNextQuestion();
	}
}
