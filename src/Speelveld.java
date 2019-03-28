import javax.swing.*;
import java.awt.*;

public class Speelveld extends JPanel {

	private Level level;
	private Speler speler;
	private Vakje[][] vakjes;
	private JPanel GameComponent;
	private JMenu jMenuReset;
	private JMenu jMenuAfsluiten;

	public JPanel
			veldGrid,
			veldPaneel = new JPanel(new GridLayout(1, 3))

	public Speelveld() {
		super.setLayout(new BorderLayout());

		this.veldPaneel.setPreferredSize(new Dimension(500, 55));

		setLevel(1);
	}

	public void reset() {
	}

	public void aflsuiten() {
	}

	public void lopen(int rij, int kolom) {
	}

	public void updateSpeeldveld() {
        this.veldPaneel.removeAll();
	}

	public void updateBoardObjects() {
		veldGrid.removeAll();

		veldGrid.repaint();
		veldGrid.revalidate();
	}

	public void setLevel(int level) {
		updateSpeeldveld();

		this.level = new Level(level);

		speler = new Speler(0, 0);

		veldGrid = new JPanel(new GridLayout(this.level.veldGrootte.width, this.level.veldGrootte.height));

		super.add(veldGrid, BorderLayout.CENTER);
		super.add(veldPaneel, BorderLayout.PAGE_START);

		vakjes = new Vakje[this.level.veldGrootte.width][this.level.veldGrootte.height];

		for (int i = 0; i < this.level.veldGrootte.width; i++) {
			for (int j = 0; j < this.level.veldGrootte.width; j++) {
				vakjes[i][j] = new Vakje(i, j);
			}
		}

		for (int[] honderdSleutel : this.level.getSleutelHonderd()) {
			vakjes[honderdSleutel[0]][honderdSleutel[1]].setVeldObject(new Sleutel(honderdSleutel[0], honderdSleutel[1], 200));
		}

		for (int[] tweehonderdSleutel : this.level.getSleutelTweeHonderd()) {
			vakjes[tweehonderdSleutel[0]][tweehonderdSleutel[1]].setVeldObject(new Sleutel(tweehonderdSleutel[0], tweehonderdSleutel[1], 100));
		}

		for (int[] driehonderSleutel : this.level.getSleutelDrieHonderd()) {
			vakjes[driehonderSleutel[0]][driehonderSleutel[1]].setVeldObject(new Sleutel(driehonderSleutel[0], driehonderSleutel[1], 300));
		}

		for (int[] honderdBarricade : this.level.getBarricadeHonderd()) {
			vakjes[honderdBarricade[0]][honderdBarricade[1]].setVeldObject(new Barricade(honderdBarricade[0], honderdBarricade[1], 300));
		}

		for (int[] tweehonderdBarricade : this.level.getSleutelTweeHonderd()) {
			vakjes[tweehonderdBarricade[0]][tweehonderdBarricade[1]].setVeldObject(new Barricade(tweehonderdBarricade[0], tweehonderdBarricade[1], 200));
		}

		for (int[] driehonderdBarricade : this.level.getSleutelDrieHonderd()) {
			vakjes[driehonderdBarricade[0]][driehonderdBarricade[1]].setVeldObject(new Barricade(driehonderdBarricade[0], driehonderdBarricade[1], 100));
		}

		for (int[] muur : this.level.getMuren()) {
			vakjes[muur[0]][muur[1]].setVeldObject(new Muur(muur[0], muur[1]));
		}

		vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);

		vakjes[this.level.finish.getRij()][this.level.finish.getKolom()] = this.level.finish;

		updateBoardObjects();
	}

}