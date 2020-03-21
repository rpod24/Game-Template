import java.awt.Graphics;

public class SecondaryObject extends GameObject {
	
	SecondaryObject(int x, int y, int width, int height){
		//can change the last four variables to different values to change collision box
		super(x, y, width, height, x, y, width, height);
	}
	
	void update(){
		// updates the secondary object
	}
	
	void draw(Graphics g) {
		//draw the secondary object in here
	}
	
}
