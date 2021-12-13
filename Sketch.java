import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(147, 255, 134);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    fill(83, 240, 238);
	  stroke(147, 255, 134);
	  rect(0, 0, width, height/2);
	    



	  fill(127, 72, 41);
	  stroke(114, 74, 56);
	    

	  rect(width/4, height/4, width/4, height/4);
	    
	  triangle(width/4, height/4, width/2, height/6, width/2, height/4);
	    

	    
	  fill(133, 75, 50);
	    
	  rect(width/4+width/8, height/3, width/10, height/6);



	  fill(0);
	    
	  ellipse(width/4 + width/5, height/3 + height/10, width/100, width/100);

	    

	  stroke(0);
	  fill(225);
	    
	  rect(width/6 + width/10, height/3, width/15, width/15);



	  stroke(255, 211, 0);
	  fill(255, 211, 0);
	    
	  ellipse(width - width/5, height/5, width/10, width/10);

  }
  

  // define other methods down here.
}