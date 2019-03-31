import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame {

	Speelveld speelveld = new Speelveld();

	public Game() {
		setTitle("SleutelGame");
		setDefaultCloseOperation(Game.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(new Dimension(500, 500));

		speelveld.updateVeldObjecten();
		add(speelveld);
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.setVisible(true);
	}

	public class ClickListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyPressed(KeyEvent e) {

		}

		@Override
		public void keyReleased(KeyEvent e) {

		}
	}

}