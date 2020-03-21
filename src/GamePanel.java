import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements KeyListener, ActionListener {
	
	final int First_State = 0;
	final int Second_State = 1;
	final int Third_State = 2;//Add more if needed
	final int TotalNumberOfStates = 3;//Set based on the amount of states
	int currentState = 0;//Sets the game to start on the first state, also is the variable to tell the game what state it is in
	int frameRate = 60;//Sets the frame rate of the game
	int keyToChangeState = 10;// The key code value of the key required to change states, currently set to the enter key
	int MainObjectStartX = 0;//starting location of the main object, x value
	int MainObjectStartY = 0;//starting location of the main object, y value
	int MainObjectWidth = 10;//Width of the main object 
	int MainObjectHeight = 10;//Height of the main object
	MainObject mainObject = new MainObject(MainObjectStartX, MainObjectStartY, MainObjectWidth, MainObjectHeight);//Create the main object, there can only be one of these
	ObjectManager objectManager;
	Timer timer;
	
	
	
	
	public void startGame() {
		//actions that start when the game starts
		timer.start();
	}

	
	
	GamePanel() {
		//Initializes the Game
		objectManager = new ObjectManager(mainObject);//Initializes the object manger
		timer = new Timer(1000 / frameRate, this);//Sets the frame rate to 60 fps
	}
	
	
	
	void updateFirstState() {
		//updates everything that will happen in the first state
	}
	
	
	
	void updateSecondState() {
		//updates everything that will happen in the second state
	}
	
	
	
	void updateThirdState() {
		//updates everything that will happen in the third state
	}
	
	
	
	void drawFirstState(Graphics g) {
		//draws everything that needs to be drawn in the first state
		g.setColor(Color.white);
		g.fillRect(0, 0, ProjectName.width, ProjectName.height);
	}
	
	
	
	void drawSecondState(Graphics g) {
		//draws everything that needs to be drawn in the second state
		g.setColor(Color.blue);
		g.fillRect(0, 0, ProjectName.width, ProjectName.height);
	}

	
	
	void drawThirdState(Graphics g) {
		//draws everything that needs to be drawn in the third state
		g.setColor(Color.red);
		g.fillRect(0, 0, ProjectName.width, ProjectName.height);
	}

	
	
	public void paintComponent(Graphics g) {

		if (currentState == First_State) {//checks if it is the first state and if so draws the first state
			drawFirstState(g);

		} else if (currentState == Second_State) {//checks if it is the second state and if so draws the second state

			drawSecondState(g);

		} else if (currentState == Third_State) {//checks if it is the third state and if so draws the third state

			drawThirdState(g);

		}
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		if(currentState == First_State) {//checks if it is the first state and if so updates the first state
			updateFirstState();
		}
		else if(currentState == Second_State) {//checks if it is the second state and if so updates the second state
			updateSecondState();
		}
		else if(currentState == Third_State) {//checks if it is the third state and if so updates the third state
			updateThirdState();
		}
	}

	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	
	@Override
	public void keyPressed(KeyEvent e) {
	}

	
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == keyToChangeState) {//checks if the key released is the key to change the state
			if(currentState<TotalNumberOfStates-1) {//checks if the state is not the third and if so increases the state to the next one
				currentState++;
			}
			else {//changes from the last state to the first
				currentState = First_State;
			}
		}
	}
	
}
