// replace this with your name
// Section 10
// Quiz 1

import java.awt.*;

public class quiz1_ extends Animator {

    // set ball size
    private final int ballDiameter = 30;
    
    public void draw(int clock,int x, int y, Graphics g) {

    
	// get scene sizes
	int sceneW = Animator.getSceneWidth();
	int sceneH = Animator.getSceneHeight();
        
        // set border rectangle sizes

	int rectLeftW = 20;
	int rectLeftH = sceneH;
	int rectTopW = sceneW;
	int rectTopH = 20;
	int rectRightW = 20;
	int rectRightH = sceneH;
	int rectBottomW = sceneW;
	int rectBottomH = 20;
		    
	// draw the borders
    
	    // left border

	g.setColor(Color.black);
	g.fillRect(0,0,rectLeftW, rectLeftH);

	    // top border
	
	g.setColor(Color.black);
	g.fillRect(0,0,rectTopW,rectTopH);

	    // right border
	
	g.setColor(Color.black);
	g.fillRect(sceneW-20,0,rectRightW,rectRightH);

	    // bottom border
	
	g.setColor(Color.black);
	g.fillRect(0,sceneH-20,rectBottomW,rectBottomH);

	// cycle the colors and draw the ball

	    // beginning of color cycle if/else statement
	
		int c = 255;
	
	//Color light = new Color(c,0,0);
	
	if (clock%20 <= 10) {		
		c = 255;
		}
	else {
		if (clock%20 > 10) {
			c = 0;
		}
	//	if (clock%30 > 20) {
	//		c = 255;
	//	}
	};

	Color light = new Color(c,0,0);
	
/*	if (clock%48 <= 16) { // set color to yellow for the first 16 seconds
	g.setColor(Color.yellow);
		    }
	
	else { 
	    
	    if (clock%48 > 16) { // set color to blue for the next 16 seconds
	    g.setColor(Color.blue);
			}
		
	    if (clock%48 > 32) { // set color to red for the last 16 seconds
	    g.setColor(Color.red);
		    } // reset counter at 48 and start with yellow again
		};
		*/
	    // draw call for the ball
	g.setColor(light);
	g.fillOval((sceneW/2)-(ballDiameter/2),y-ballDiameter/2,ballDiameter/2,ballDiameter/2);

	
	
        } // end of draw method

    } // end of quiz1 class
