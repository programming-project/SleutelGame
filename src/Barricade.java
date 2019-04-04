import javax.swing.*;

public class Barricade extends VeldObject{

	private int sleutelNummer;

	/**
	 * Constructor voor Barricade
	 * @param sleutelNummer is de waarde van de Barricade
	 * @param rij is positierij van Barricade
	 * @param kolom is positiekolom van Barricade
	 */
	public Barricade(int sleutelNummer, int rij, int kolom) {
		super(rij, kolom);
		this.sleutelNummer = sleutelNummer;

		if(sleutelNummer == 100){
			super.setIcon(new JLabel(new ImageIcon("src/icons/ironore.png")));
		}else if(sleutelNummer == 200){
			super.setIcon(new JLabel(new ImageIcon("src/icons/goldore.png")));
		}else if(sleutelNummer == 300){
			super.setIcon(new JLabel(new ImageIcon("src/icons/diamondore.png")));
		}
	}

	/**
	 * Methode om de barricade te verwijderen
	 * @param veldObject is de barricade
	 */
	public static void removeBarricade(VeldObject veldObject){
		veldObject = null;
	}

	/**
	 * Methode om te kijken of de sleutel past bij de barricade
	 * @param sleutel is de sleutel die wordt gebruikt om de barricade te verwijderen
	 * @return is true als de sleutelnummer van barricade gelijk is aan steutelnummer van sleutel, anders false
	 */
	public boolean checkSleutel(Sleutel sleutel) {
		if(sleutelNummer == sleutel.getSleutelNummer()){
			return true;
		}else{
			return false;
		}
	}
}
