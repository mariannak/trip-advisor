package tripAdvisor;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//This class sets parameters and label texts (welcome text and author name) on the first screen

public class StartupScreen extends JPanel {

	private WindowController controller;
	
	public StartupScreen(WindowController controller) {
		this.controller = controller;
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);//prints out on the next line
		this.setLayout(layout);
		addTitle();
		addAuthorName();
		addQuestioningStarter();
	}

	private void addQuestioningStarter() { 
		JPanel startButtonWrapper = new JPanel();
		JButton start = new JButton("Start!");
		start.addActionListener(controller.startAction());// start questioning
		startButtonWrapper.add(start);
		this.add(startButtonWrapper);
	}
	
	private void addAuthorName() {
		JPanel authorWrapper = new JPanel();
		JLabel authorInfo = new JLabel("Marianna Karm. IA18.");
		authorWrapper.add(authorInfo);
		this.add(authorWrapper);
	}

	private void addTitle() {
		JLabel title = new JLabel("Welcome to the Trip Advisor");
		title.setFont(new Font("Serif", Font.PLAIN, 30));
		title.setAlignmentX(0.5F); //sets label to the middle
		this.add(title);
	}	
}
