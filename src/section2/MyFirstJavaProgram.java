package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
    	// This code makes a new Robot
    	Robot rob = new Robot();
    	rob.setSpeed(6);
    	rob.penDown();
    	rob.setRandomPenColor();
    	//rob.move(100);
    	//rob.turn(225);
    	//rob.move(150);
    	//rob.turn(220);
    	//rob.move(100);
    	
    	int count_2 = 0;
    	
    	while (count_2 < 8) {
    		rob.move(100);
        	rob.turn(45);
        	count_2 +=1; 
       
    	}
      
    	
    	rob.move(100);
    	rob.turn(90);
    	rob.move(100);
    	rob.turn(90);
    	rob.move(100);
    	rob.turn(90);
    	rob.move(100);
    	
    	int count = 0; 
    
    	while (count < 4) {
    		rob.move(100);
    		rob.turn(90);
    		count +=1 ;
    	}
    	// COUNT. Create an int variable that will count how many sides of the square we have drawn.
    	//        The start value will be zero because no sides have yet been drawn. Use this code:
		  /**     int count = 0;    **/
    	

        // DRAW.  Draw a line. Use this command:
    		  /**     rob.move();    **/
  

	// TURN.  Turn 90 degrees. Use this command:
    		  /**     rob.turn();    **/

    	
    	// INCREASE COUNT. Add one to the number of sides that have now been drawn like this:
    		  /**     count += 1;    **/

    	
    	// Run the program. Did the Robot draw a line and turn?
    	 
    	
        // LOOP.  Make a while loop and move the DRAW, TURN, and INCREASE COUNT code 
    	//        so it is between the curly braces like the example below. 
    	//        The code in the loop will now repeat 4 times to draw a square.
    	
    	/**     while ( count < 4 ) { 
    	 *            DRAW
    	 *            TURN
    	 *            INCREASE COUNT
    	 *      }
    	 **/
    	
    	
    	// Run the program again. Did your Robot draw a square?
		
	}
}
