import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener  {

	private Speelveld speelveld = new Speelveld();
	private JMenu reset = new JMenu("Reset");

	/**
	 * Constructor voor game
	 */
	private Game() {
		setTitle("SleutelGame");
		setDefaultCloseOperation(Game.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(new Dimension(500, 500));
		speelveld.updateVeldObjecten();
		add(speelveld);

		JMenuBar mb=new JMenuBar();

		reset.addMenuListener(new MenuListener() {

			@Override
			public void menuSelected(MenuEvent e) {
				speelveld.reset();
			}

			@Override
			public void menuDeselected(MenuEvent e) {
			}
			@Override
			public void menuCanceled(MenuEvent e) {
			}
		}

		);
		mb.add(reset);
		this.setJMenuBar(mb);
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.addKeyListener(game);
		game.setVisible(true);
	}

	/**
	 *KeyTyped override een methode in KeyListener
	 *
	 * @param e
	 */
	@Override
	public void keyTyped(KeyEvent e) {
	}

	/**
	 * KeyPressed override een methode in KeyListener
	 *
	 * @param e
	 */
	@Override
	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			speelveld.getSpeler().lopen(-1, "N");
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			speelveld.getSpeler().lopen(1,"Z");
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			speelveld.getSpeler().lopen(-1, "W");
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			speelveld.getSpeler().lopen(1, "O");
		}
	}

	/**
	 *KeyReleased override een methode in KeyListener
	 *
	 * @param e
	 */
	@Override
	public void keyReleased(KeyEvent e){
	}
}
