import javax.swing.*;
import java.awt.*;

public class Speelveld extends JPanel {

	private Level level;
	private Speler speler;
	private Vakje[][] vakjes;

	public JPanel veldGrid = new JPanel(new GridLayout(10, 10));

	public Speelveld() {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(500, 100));
		setLevel();
	}

	public void reset() {
	}

	public void aflsuiten() {
	}

	public void lopen(int i, String richting) {
		if(richting == "N"){
			speler.setKolom(i);
		}
		else if(richting == "Z"){
			speler.setKolom(i);
		}
		else if(richting == "W"){
			speler.setRij(i);
		}
		else if(richting == "O"){
			speler.setRij(i);
		}
	}

	public void updateSpeeldveld() {
	}

	public void updateVeldObjecten() {
		veldGrid.removeAll();

		for (Vakje[] vakVeld : vakjes) {
			for (Vakje vak : vakVeld) {
				if (vak.bevatObject()) {
					veldGrid.add(vak.getVeldObject().getIcon());
				} else {
					veldGrid.add(vak.getIcon());
				}
			}
		}

		veldGrid.repaint();
		veldGrid.revalidate();
	}

	public void setLevel() {
		level = new Level();
		speler = new Speler(0, 0);

		add(veldGrid);

		vakjes = new Vakje[this.level.veldGrootte.width][this.level.veldGrootte.height];

		for (int i = 0; i < this.level.veldGrootte.width; i++) {
			for (int j = 0; j < this.level.veldGrootte.width; j++) {
				vakjes[i][j] = new Vakje(i, j);
			}
		}

		vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);

		for (int[] barricadeHonderd : this.level.getBarricadeHonderd()) {
			vakjes[barricadeHonderd[0]][barricadeHonderd[1]].setVeldObject(new Barricade(100, barricadeHonderd[0], barricadeHonderd[1]));
		}

        for (int[] muren : this.level.getMuren()) {
            vakjes[muren[0]][muren[1]].setVeldObject(new Muur(muren[0], muren[1]));
        }
	}
}