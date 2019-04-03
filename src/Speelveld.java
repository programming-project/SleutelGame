import javax.swing.*;
import java.awt.*;

public class Speelveld extends JPanel {

	private Level level;
	private Speler speler;
	private Vakje[][] vakjes;

	/**
	 * Maakt een gridlayout voor de vakjes aan
	 */
	public JPanel veldGrid = new JPanel(new GridLayout(10, 10));

	/**
	 * Constructor voor speelveld
	 */
	public Speelveld() {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(500, 500));
		setLevel();
	}

	/**
	 * Methode die de game laat herstarten
	 */
	public void reset() {
	}

	/**
	 * Methodie die de game laat afsluiten
	 */
	public void aflsuiten() {
	}

	/**
	 * Methode om te lopen zodat de speler kan bewegen op de speelveld
	 * @param i	is de afstand die de speler gaat afleggen
	 * @param richting is de kant waar de speler naar toe gaat, de speler kan naar het noorden, zuiden, oosten en westen
	 */
	public void lopen(int i, String richting) {
		if(richting.equals("N")){
			if(speler.getKolom() != 0){
				vakjes[speler.getRij()][speler.getKolom()].setVeldObject(null);
				speler.setKolom(i);
				vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);
				updateVeldObjecten();
			}
		}
		else if(richting.equals("Z")){
			if(speler.getKolom() != 9){
				vakjes[speler.getRij()][speler.getKolom()].setVeldObject(null);
				speler.setKolom(i);
				vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);
				updateVeldObjecten();			}
		}
		else if(richting.equals("W")){
			if(speler.getRij() != 0){
				vakjes[speler.getRij()][speler.getKolom()].setVeldObject(null);
				speler.setRij(i);
				vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);
				updateVeldObjecten();
			}

		}
		else if(richting.equals("O")){
			if(speler.getRij() != 9){
				vakjes[speler.getRij()][speler.getKolom()].setVeldObject(null);
				speler.setRij(i);
				vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);
				updateVeldObjecten();
			}
		}
	}

	/**
	 * Methode om het speelveld te updaten/refresh
	 */
	public void updateSpeeldveld() {

	}

	/**
	 * Methode die de Veld Objecten ververst
	 */
	public void updateVeldObjecten() {

		veldGrid.removeAll();

		//for loop om de objecten iconen op het veld te krijgen
		for (Vakje[] vakVeld : vakjes) {
			for (Vakje vak : vakVeld) {
				if (vak.bevatObject()) {
					veldGrid.add(vak.getVeldObject().getIcon());
				} else {
					veldGrid.add(vak.getIcon());
				}
			}
		}

		revalidate();
		repaint();
	}

	/**
	 * Methode om de level op het speelveld te painten
	 */
	public void setLevel() {
		level = new Level();
		speler = new Speler(0, 0);

		//voeg de grid toe aan de jpanel
		add(veldGrid, BorderLayout.CENTER);

		vakjes = new Vakje[this.level.veldGrootte.width][this.level.veldGrootte.height];

		//for loop om vakjes aan te maken met behulp van de grootte van het veld
		for (int i = 0; i < this.level.veldGrootte.width; i++) {
			for (int j = 0; j < this.level.veldGrootte.height; j++) {
				vakjes[i][j] = new Vakje(i, j);
			}
		}

		//zet de speler op een vakje
		vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);

		//for loop om de objecten uit de array barricade te maken en te plaatsen op hun vakjes

		/*for (int[] barricadeHonderd : this.level.getBarricadeHonderd()) {
			vakjes[barricadeHonderd[0]][barricadeHonderd[1]].setVeldObject(new Barricade(100, barricadeHonderd[0], barricadeHonderd[1]));
		}*/

		//for loop om object muur op de vakjes te plaatsen

        /*for (int[] muren : this.level.getMuren()) {
            vakjes[muren[0]][muren[1]].setVeldObject(new Muur(muren[0], muren[1]));
        }*/
	}
}