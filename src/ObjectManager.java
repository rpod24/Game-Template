import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	MainObject mainobject;
	ArrayList<SecondaryObject> secondaryObjects = new ArrayList<SecondaryObject>();//Creates an array list of the Secondary Objects 
	
	ObjectManager(MainObject object){
		mainobject = object;//Initializes the main object
	}
	
	void update() {
		mainobject.update();//updates the main object
		for (int i = 0; i < secondaryObjects.size(); i++) {//Updates all the secondary objects
			secondaryObjects.get(i).update();
		}
	}
	
	void draw(Graphics g) {
		mainobject.draw(g);//Draws the main object
		for (int i = 0; i < secondaryObjects.size(); i++) {//Draws all the secondary objects
			secondaryObjects.get(i).draw(g);
		}
	}
	
	void addSecondaryObject(SecondaryObject object){
		secondaryObjects.add(object);//Adds more secondary objects
	}
	
	void manageSecondaryObjects() {
		//here is where you can control adding secondary objects
	}
	
	void purgeObjects() {
		for (int i = 0; i < secondaryObjects.size(); i++) {//goes though the list of the secondary objects and removes any dead ones
			if(secondaryObjects.get(i).isAlive == false) {
				secondaryObjects.remove(i);// Removes the dead secondary objects from the array list
				i--;// Changes the counter back one to not skip over the next one
			}
		} 
	}
	void checkCollision() {//checks for collisions of objects
    	
    }
	
}
