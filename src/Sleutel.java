import javax.swing.*;

public class Sleutel extends VeldObject {

	private int sleutelNummer;

	/**
	 * Constructor voor Sleutel
	 * @param sleutelNummer is de sleutelnummer voor sleutel
	 * @param rij is positierij van sleutel
	 * @param kolom is positiekolom van sleutel
	 */
	public Sleutel(int sleutelNummer, int rij, int kolom) {
		super(rij , kolom);
		this.sleutelNummer = sleutelNummer;

		if(sleutelNummer == 100){
			super.setIcon(new JLabel(new ImageIcon("src/icons/ironaxe.png")));
		}else if(sleutelNummer == 200){
			super.setIcon(new JLabel(new ImageIcon("src/icons/goldaxe.png")));
		}else if(sleutelNummer == 300){
			super.setIcon(new JLabel(new ImageIcon("src/icons/diamondaxe.png")));
		}
	}

	/**
	 * Getter voor de sleutelnummer
	 * @return geeft de sleutelnummer van de sleutel terug
	 */
	public int getSleutelNummer() {
		return this.sleutelNummer;
	}
}