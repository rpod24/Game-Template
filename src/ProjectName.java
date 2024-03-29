import java.awt.Dimension;

import javax.swing.JFrame;

public class ProjectName {
	
	JFrame frame;
	GamePanel GamePanel;
	static final int width = 500;// Sets the width of the game
	static final int height = 800;// Sets the height of the game
	
	public static void main(String[] args) {
		new ProjectName().setup();
		
	}
	
	ProjectName(){
		frame = new JFrame();
		GamePanel = new GamePanel(); 
	}
	
	void setup() {//default setup for the game
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Set the program to close when the window is closed
		frame.setVisible(true);//Shows the game
		frame.setSize(new Dimension(width, height));//Sets the size of the window
		frame.add(GamePanel);//Adds the panel that the game is in
		frame.getContentPane().setPreferredSize(new Dimension(width, height));//sets the preferred size of the window
		frame.addKeyListener(GamePanel);// Adds a key listener to the game panel
		frame.pack();// Packs the frame
		GamePanel.startGame();// Starts the entire game
	}
	
}
