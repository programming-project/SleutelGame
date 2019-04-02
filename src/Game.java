import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame {

	Speelveld speelveld = new Speelveld();
	KeyListener listener;

	public Game() {
		setTitle("SleutelGame");
		setDefaultCloseOperation(Game.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(new Dimension(500, 500));
		listener = new ClickListener();
		this.addKeyListener(listener);

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
			if(e.getKeyCode() == KeyEvent.VK_UP){
				speelveld.lopen(-1,"N");
			}

			if(e.getKeyCode() == KeyEvent.VK_DOWN){
				speelveld.lopen(1,"Z");
			}

			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				speelveld.lopen(-1,"W");
			}

			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				speelveld.lopen(1,"O");
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {

		}
	}

}