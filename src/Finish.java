import javax.swing.*;

public class Finish extends VeldObject {

	/**
	 * Constructor voor finish
	 * @param rij positierij van finish
	 * @param kolom positiekolom van finish
	 */
	public Finish(int rij, int kolom) {
		super(rij, kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/finish.png")));
	}

	/**
	 * Geeft melding als de speler op de finish komt
	 */
	public void spelGewonnen() {
		JOptionPane.showMessageDialog(null, "Je hebt het spel gewonnen hoera! Bedankt voor het spelen!");
	}

}