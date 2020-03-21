import java.awt.Graphics;

public class MainObject  extends GameObject{
	

	MainObject(int x, int y, int width, int height){
		//can change the last four variables to different values to change collision box
		super(x, y, width, height, x, y, width, height);
	}
	
	void update(){
		// updates the main object
	}
	
	void draw(Graphics g) {
		//draw the main object in here
	}
	
}
