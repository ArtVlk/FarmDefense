package main;

import java.awt.*;
import javax.swing.*;

import inputs.KeyboardListener;
import inputs.MyMouseListener;

public class GameScreen extends JPanel {

	private Game game;
	private Dimension size;

	public GameScreen(Game game) {
		this.game = game;
		setPanelSize();
		initInputs();
	}

	public void initInputs() {
		setFocusable(true);
		MyMouseListener myMouseListener = new MyMouseListener(game);
		KeyboardListener keyboardListener = new KeyboardListener(game);

		addMouseListener(myMouseListener);
		addMouseMotionListener(myMouseListener);
		addKeyListener(keyboardListener);

		requestFocus();
	}

	private void setPanelSize() {
		size = new Dimension(640, 800);
		setPreferredSize(size);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.getRender().render(g);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Game Window");
		Game game = new Game();

		GameScreen gameScreen = new GameScreen(game);
		frame.add(gameScreen);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();

		// Set the location of the frame on the screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - frame.getWidth()) / 2;  // Center horizontally
		int y = (screenSize.height - frame.getHeight()) / 2;  // Center vertically
		frame.setLocation(x, y);

		frame.setVisible(true);
	}
}
