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
			panelGrid,
			panelLegend = new JPanel(new GridLayout(1, 3))

	public Speelveld() {
		speler = new Speler(0, 0);
		super.setLayout(new BorderLayout());

		this.panelLegend.setPreferredSize(new Dimension(500, 55));

		setLevel(1);
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

	public void setLevel(int level) {
		updateLegend();

		this.level = new Level(level);

		speler = new Speler(0, 0);

		panelGrid = new JPanel(new GridLayout(this.level.boardSize.width, this.level.boardSize.height));

		super.add(panelGrid, BorderLayout.CENTER);
		super.add(panelLegend, BorderLayout.PAGE_START);

		vakjes = new Vakje[this.level.boardSize.width][this.level.boardSize.height];

		for (int counter = 0; counter < this.level.boardSize.width; counter++) {
			for (int counter2 = 0; counter2 < this.level.boardSize.width; counter2++) {
				vakjes[counter][counter2] = new Vakje(counter, counter2);
			}
		}

		for (int[] honderdSleutel : this.level.getSleutelHonderd()) {
			vakjes[honderdSleutel[0]][honderdSleutel[1]].setBoardObject(new Sleutel(honderdSleutel[0], honderdSleutel[1], 200));
		}

		for (int[] tweehonderdSleutel : this.level.getSleutelTweeHonderd()) {
			vakjes[tweehonderdSleutel[0]][tweehonderdSleutel[1]].setBoardObject(new Sleutel(tweehonderdSleutel[0], tweehonderdSleutel[1], 100));
		}

		for (int[] driehonderSleutel : this.level.getSleutelDrieHonderd()) {
			vakjes[driehonderSleutel[0]][driehonderSleutel[1]].setBoardObject(new Sleutel(driehonderSleutel[0], driehonderSleutel[1], 300));
		}

		for (int[] honderdBarricade : this.level.getBarricadeHonderd()) {
			vakjes[honderdBarricade[0]][honderdBarricade[1]].setBoardObject(new Barricade(honderdBarricade[0], honderdBarricade[1], 300));
		}

		for (int[] tweehonderdBarricade : this.level.getSleutelTweeHonderd()) {
			vakjes[tweehonderdBarricade[0]][tweehonderdBarricade[1]].setBoardObject(new Barricade(tweehonderdBarricade[0], tweehonderdBarricade[1], 200));
		}

		for (int[] driehonderdBarricade : this.level.getSleutelDrieHonderd()) {
			vakjes[driehonderdBarricade[0]][driehonderdBarricade[1]].setBoardObject(new Barricade(driehonderdBarricade[0], driehonderdBarricade[1], 100));
		}

		for (int[] muur : this.level.getMuren()) {
			vakjes[muur[0]][muur[1]].setBoardObject(new Muur(muur[0], muur[1]));
		}

		vakjes[speler.getRij()][speler.getKolom()].setBoardObject(speler);

		vakjes[this.level.finish.getRij()][this.level.finish.getKolom()] = this.level.finish;

		updateBoardObjects();
	}

}