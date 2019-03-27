import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

	Speelveld speelveld = new Speelveld();

	public Game() {
		setTitle("SleutelGame");
		setDefaultCloseOperation(Game.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(new Dimension(500, 500));
		add(speelveld);

	}

	public static void main(String[] args) {
		Game game = new Game();
		game.setVisible(true);
	}

	public class ClickListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {

		}
	}

}