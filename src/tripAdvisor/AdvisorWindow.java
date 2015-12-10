package tripAdvisor;

import java.awt.Dimension;

import javax.swing.JFrame;

//Window parameters


public class AdvisorWindow extends JFrame {


	public AdvisorWindow() {
		setTitle("Welcome to the Trip Advisor");
		setSize(new Dimension(400, 400)); //window size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close the program with the x button
	}
}
