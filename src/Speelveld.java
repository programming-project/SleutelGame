import javax.swing.*;
import java.awt.*;

public class Speelveld extends JPanel {

	private Level level;
	private Speler speler;
	private Vakje[][] vakjes;
	private JPanel GameComponent;



	public JPanel veldGrid = new JPanel(new GridLayout(10, 10));

	public Speelveld() {
		super.setLayout(new BorderLayout());
		setPreferredSize(new Dimension(500, 100));
		setLevel();
	}

	public void reset() {
	}

	public void aflsuiten() {
	}

	public void lopen(int rij, int kolom) {
	}

	public void updateSpeeldveld() {
        removeAll();
        repaint();
        revalidate();
	}

	public void updateVeldObjecten() {
		veldGrid.removeAll();

		veldGrid.repaint();
		veldGrid.revalidate();
	}

	public void setLevel() {
		updateSpeeldveld();

		this.level = new Level();
		speler = new Speler(0, 0);

		veldGrid = new JPanel(new GridLayout(this.level.veldGrootte.width, this.level.veldGrootte.height));

		super.add(veldGrid, BorderLayout.CENTER);

		vakjes = new Vakje[this.level.veldGrootte.width][this.level.veldGrootte.height];

		for (int i = 0; i < this.level.veldGrootte.width; i++) {
			for (int j = 0; j < this.level.veldGrootte.width; j++) {
				vakjes[i][j] = new Vakje(i, j);
			}
		}

		updateVeldObjecten();
	}

}