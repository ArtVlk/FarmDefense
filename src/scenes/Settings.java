package scenes;

import java.awt.Color;
import java.awt.Graphics;

import language.Translator;
import main.Game;
import ui.MyButton;

import static main.GameStates.*;

public class Settings extends GameScene implements SceneMethods {

	private MyButton bMenu, bLanguage;
	public Translator lanButton = new Translator();

	public Settings(Game game) {
		super(game);
		initButtons();

	}

	private void initButtons() {
		int w = 150;
		int h = w / 3;
		int x = 640 / 2 - w / 2;
		int y = 250;
		int yOffset = 100;

		bMenu = new MyButton(lanButton.getMenu(), x, y, w, h);
		bLanguage = new MyButton(lanButton.getLanguage(), x, y + yOffset, w, h);

	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 640, 640);

		drawButtons(g);
	}

	private void drawButtons(Graphics g) {
		bMenu.draw(g);
		bLanguage.draw(g);
	}

	@Override
	public void mouseClicked(int x, int y) {
		if (bMenu.getBounds().contains(x, y))
			SetGameState(MENU);
		else if (bLanguage.getBounds().contains(x,y)) {
			SetGameState(LANGUAGE);
		}


	}

	@Override
	public void mouseMoved(int x, int y) {
		bMenu.setMouseOver(false);
		bLanguage.setMouseOver(false);
		if (bMenu.getBounds().contains(x, y))
			bMenu.setMouseOver(true);
		else if (bLanguage.getBounds().contains(x,y))
			bLanguage.setMouseOver(true);

	}

	@Override
	public void mousePressed(int x, int y) {
		if (bMenu.getBounds().contains(x, y))
			bMenu.setMousePressed(true);
		else if (bLanguage.getBounds().contains(x,y))
			bLanguage.setMousePressed(true);
	}

	@Override
	public void mouseReleased(int x, int y) {
		resetButtons();
	}

	private void resetButtons() {
		bMenu.resetBooleans();
		bLanguage.resetBooleans();

	}

	@Override
	public void mouseDragged(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
