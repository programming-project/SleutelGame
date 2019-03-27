import javax.swing.*;
import java.awt.*;

public class Speelveld extends JPanel {

	private Level level;
	private Speler speler;
	private Vakje[][] vakjes;
	private JPanel GameComponent;
	private JMenu jMenuReset;
	private JMenu jMenuAfsluiten;

	public Speelveld() {
		speler = new Speler(0, 0);
		super.setLayout(new BorderLayout());
	}

	public void reset() {
	}

	public void aflsuiten() {
	}

	public void lopen(int rij, int kolom) {
	}

	public void updateSpeeldveld() {
	}

	public void operation() {
	}

}