package tripAdvisor;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import tripAdvisor.Question;
import tripAdvisor.QuestionList;

/**
 * 
 * @author Marianna Karm IA18
 *
 */

public class Start implements Runnable {

	JFrame window = new JFrame();
	private ButtonGroup group;

	@Override
	public void run() {

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // make it go
																// away on close
		window.setVisible(true); // show the frame
		window.setSize(600, 400); // set size
		window.setTitle("Trip Advisor"); // title of the window
		window.setLayout(new FlowLayout());

		JLabel mylabel = new JLabel("Welcome to the Trip Advisor!");// Make a
																	// label
		mylabel.setPreferredSize(new Dimension(400, 100));

		mylabel.setFont(new Font("Serif", Font.PLAIN, 30));
		window.add(mylabel);

		JButton button = new JButton("Sart");
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nextQuestion();
			}
		});

		window.add(button);

		JLabel name = new JLabel("Marianna Karm. IA18");

		name.setFont(new Font("Serif", Font.PLAIN, 15));
		window.add(name);

	}

	public void nextQuestion() {
		window.getContentPane().removeAll();

		JPanel panel = new JPanel();
		panel.add(new Label());
		JLabel label = new JLabel("Make your choice!");
		label.setFont(new Font("Serif", Font.PLAIN, 25));
		panel.add(label);

		ArrayList<String> answers = new ArrayList<>();
		answers.add("200 - 500 $");
		answers.add("500 - 1000 $");
		answers.add("1000 - 2000 $");
		answers.add("over 2000 $");

		group = new ButtonGroup();
		for (String answer : answers) {
			JRadioButton answerButton = new JRadioButton(answer);
			panel.add(answerButton);
		}

		JButton button = new JButton("Next");
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nextQuestion();
			}
		});

		panel.add(button);

		window.setContentPane(panel);
		window.revalidate();
		window.repaint();
		window.setLayout(new FlowLayout());

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Start());
	}

}