package tripAdvisor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

// how to use actionlistener - https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html

public class QuestionScreen extends JPanel {

	private WindowController controller;
	
	public class SelectionListener implements ActionListener {	// inner class. An actionlistener that listens to the radio button
		private String selectedValue;	
		
		public String getSelectedValue() {
			return this.selectedValue;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof JRadioButton) {
				JRadioButton button = (JRadioButton) e.getSource();
				this.selectedValue = button.getText();
			}
		}	
	}
	
	public QuestionScreen(WindowController windowController, Question question) {
		this.controller = windowController;
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS); //components are laid out top to bottom
		this.setLayout(layout);
		showQuestion(question);
	}

	public void showQuestion(Question question) {
		JLabel questionText = new JLabel(question.getQuestion());
		this.add(questionText);
		ButtonGroup buttonGroup = new ButtonGroup();
		SelectionListener listener = new SelectionListener();
		for(String choice : question.getChoices()) { //adds choices and radio buttons
			JRadioButton radioButton = new JRadioButton(choice);
			buttonGroup.add(radioButton);
			radioButton.addActionListener(listener);
			this.add(radioButton);
		}
		JButton nextQuestion = new JButton("next"); //opens new question 
		nextQuestion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.saveSelectedValue(question, listener.selectedValue); // saves users answer
			}	
		});	
		add(nextQuestion);
	}	
}
