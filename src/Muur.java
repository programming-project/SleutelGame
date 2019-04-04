import javax.swing.*;

public class Muur extends VeldObject {

	/**
	 * Constructor voor Muur
	 * @param rij positierij van muur
	 * @param kolom positiekolom van muur
	 */
	public Muur(int rij, int kolom) {
		super(rij , kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/muur.png")));
	}
}