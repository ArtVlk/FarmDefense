package scenes;

import java.awt.Color;
import java.awt.Graphics;

import language.Translator;
import main.Game;
import ui.MyButton;

import static main.GameStates.*;


public class Language extends GameScene implements SceneMethods {
    private MyButton bMenu, bRu, bEn;
    public Translator lanButton = new Translator();
    public Language(Game game) {
        super(game);
        initButtons();
    }
    private void initButtons() {
        int w = 150;
        int h = w / 3;
        int x = 640 / 2 - w / 2;
        int y = 150;
        int yOffset = 100;

        bRu = new MyButton(lanButton.getRu(), x, y, w, h);
        bEn = new MyButton(lanButton.getEn(), x, y + yOffset, w, h);
        bMenu = new MyButton(lanButton.getMenu(), x, y + yOffset * 2, w, h);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 640, 800);

        drawButtons(g);
    }

    private void drawButtons(Graphics g) {
        bMenu.draw(g);
        bRu.draw(g);
        bEn.draw(g);
    }

    @Override
    public void mouseClicked(int x, int y) {
        if (bMenu.getBounds().contains(x, y)) {
            SetGameState(MENU);
        }
        else if (bRu.getBounds().contains(x,y)) {
            lanButton.setLanguage("ru");
            game.getInitClasses();
            SetGameState(MENU);
        }
        else if (bEn.getBounds().contains(x,y)) {
            lanButton.setLanguage("en");
            game.getInitClasses();
            SetGameState(MENU);
        }
    }

    @Override
    public void mouseMoved(int x, int y) {
        bMenu.setMouseOver(false);
        bEn.setMouseOver(false);
        bRu.setMouseOver(false);
        if (bMenu.getBounds().contains(x, y))
            bMenu.setMouseOver(true);
        else if (bRu.getBounds().contains(x,y))
            bRu.setMouseOver(true);
        else if (bEn.getBounds().contains(x,y))
            bEn.setMouseOver(true);

    }

    @Override
    public void mousePressed(int x, int y) {
        if (bMenu.getBounds().contains(x, y))
            bMenu.setMousePressed(true);
        else if (bEn.getBounds().contains(x,y))
            bEn.setMousePressed(true);
        else if (bRu.getBounds().contains(x,y))
            bRu.setMousePressed(true);
    }

    @Override
    public void mouseReleased(int x, int y) {
        resetButtons();
    }

    private void resetButtons() {
        bMenu.resetBooleans();
        bRu.resetBooleans();
        bEn.resetBooleans();

    }

    @Override
    public void mouseDragged(int x, int y) {
        // TODO Auto-generated method stub

    }
}
