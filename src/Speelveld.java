import javax.swing.*;
import java.awt.*;

public class Speelveld extends JPanel {

	private Level level;
	private Speler speler;
    private Finish finish;
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
		if(richting.equals("W") || richting.equals("O")){
			if((richting.equals("W") && speler.getKolom() != 0) ||(richting.equals("O") && speler.getKolom() != 9)){
				if(checkVeldObject(i, richting)){
					vakjes[speler.getRij()][speler.getKolom()].setVeldObject(null);
					speler.setKolom(i);
					vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);
					updateVeldObjecten();
				}
			}
		}
		else if(richting.equals("N")|| richting.equals("Z")){
			if((richting.equals("N") && speler.getRij() != 0 )||(richting.equals("Z") && speler.getRij() != 9)){
				if(checkVeldObject(i, richting)){
					vakjes[speler.getRij()][speler.getKolom()].setVeldObject(null);
					speler.setRij(i);
					vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);
					updateVeldObjecten();
				}
			}

		}
	}


	/**
	 * Methode om het speelveld te updaten/refresh
	 */
	public boolean checkVeldObject(int i, String richting){
		if(richting.equals("W") || richting.equals("O")){
		if(vakjes[speler.getRij()][(speler.getKolom()+i)].getVeldObject() == null){
			return true;
		}else if(vakjes[speler.getRij()][(speler.getKolom()+i)].getVeldObject() instanceof Sleutel){
			speler.setZak((Sleutel) vakjes[speler.getRij()][(speler.getKolom()+i)].getVeldObject());
			return true;
		}else{
			return false;
		}
		}else if(richting.equals("N") || richting.equals("Z")){
			if(vakjes[speler.getRij()+i][(speler.getKolom())].getVeldObject() == null){
				return true;
			}else if(vakjes[speler.getRij()+i][(speler.getKolom())].getVeldObject() instanceof Sleutel){
				speler.setZak((Sleutel) vakjes[speler.getRij()+i][(speler.getKolom())].getVeldObject());
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
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

		veldGrid.revalidate();
		veldGrid.repaint();
	}

	/**
	 * Methode om de level op het speelveld te painten
	 */
	public void setLevel() {
		level = new Level();
		speler = new Speler(0, 0);
		finish = new Finish(9,9);

		//voeg de grid toe aan de jpanel
		add(veldGrid);

		vakjes = new Vakje[this.level.veldGrootte.width][this.level.veldGrootte.height];

		//for loop om vakjes aan te maken met behulp van de grootte van het veld
		for (int i = 0; i < this.level.veldGrootte.width; i++) {
			for (int j = 0; j < this.level.veldGrootte.height; j++) {
				vakjes[i][j] = new Vakje(i, j);
				vakjes[i][j].setLabel(i,j);
			}
		}

		//zet de speler op een vakje
		vakjes[speler.getRij()][speler.getKolom()].setVeldObject(speler);

        vakjes[level.finish.getRij()][level.finish.getKolom()].setVeldObject(finish);

		//for loop om de objecten uit de array barricade te maken en te plaatsen op hun vakjes

		for (int[] barricadeHonderd : this.level.getBarricadeHonderd()) {
			vakjes[barricadeHonderd[0]][barricadeHonderd[1]].setVeldObject(new Barricade(100, barricadeHonderd[0], barricadeHonderd[1]));
		}

        for (int[] sleutelHonderd : this.level.getSleutelHonderd()) {
            vakjes[sleutelHonderd[0]][sleutelHonderd[1]].setVeldObject(new Sleutel(100, sleutelHonderd[0], sleutelHonderd[1]));
        }

        for (int[] barricadeTweehonderd : this.level.getBarricadeTweeHonderd()) {
            vakjes[barricadeTweehonderd[0]][barricadeTweehonderd[1]].setVeldObject(new Barricade(200, barricadeTweehonderd[0], barricadeTweehonderd[1]));
        }

        for (int[] sleutelTweehonderd : this.level.getSleutelTweeHonderd()) {
            vakjes[sleutelTweehonderd[0]][sleutelTweehonderd[1]].setVeldObject(new Sleutel(200, sleutelTweehonderd[0], sleutelTweehonderd[1]));
        }

        for (int[] barricadeDriehonderd : this.level.getBarricadeDrieHonderd()) {
            vakjes[barricadeDriehonderd[0]][barricadeDriehonderd[1]].setVeldObject(new Barricade(300, barricadeDriehonderd[0], barricadeDriehonderd[1]));
        }

        for (int[] sleutelDriehonderd : this.level.getSleutelDrieHonderd()) {
            vakjes[sleutelDriehonderd[0]][sleutelDriehonderd[1]].setVeldObject(new Sleutel(300, sleutelDriehonderd[0], sleutelDriehonderd[1]));
        }

		//for loop om object muur op de vakjes te plaatsen

        for (int[] muren : this.level.getMuren()) {
            vakjes[muren[0]][muren[1]].setVeldObject(new Muur(muren[0], muren[1]));
        }
	}
}