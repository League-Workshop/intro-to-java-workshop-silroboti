package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
      	        JOptionPane.showMessageDialog(jFrame, " If you find yourself having to cross a piranha-infested river, here's how to do it...");

		JFrame jFrame_1 = new JFrame();
      	 	String getMessage = JOptionPane.showInputDialog(jFrame_1, "Enter an adjective");
		
		String getMessage_1 = JOptionPane.showInputDialog(jFrame_1, "Enter a type of liquid");
		String getMessage_2 = JOptionPane.showInputDialog(jFrame_1, "Enter a body part");
      	 	String getMessage_3 = JOptionPane.showInputDialog(jFrame_1, "Enter a verb");
      	 	String getMessage_4 = JOptionPane.showInputDialog(jFrame_1, "Enter a place");


		JOptionPane.showMessageDialog(jFrame_1, "Piranahas are more "+getMessage+"during the day, so cross the river at night. Piranhas are attracted to fresh"+getMessage_2+"and will most likely take a bit out of your
+getMessage_3+"if you"+getMessage_3+". Whatever you do, if you have an open wound, try to find another way to get back to the+"getMessage_4+". Good luck!");

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective

		// Get the user to enter a type of liquid

		// Get the user to enter a body part

		// Get the user to enter a verb

		// Get the user to enter a place

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

