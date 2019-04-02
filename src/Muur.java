import javax.swing.*;

public class Muur extends VeldObject {

	public Muur(int rij, int kolom) {
		super(rij , kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/muur.png")));
	}

	/**
	 * Methode die kijkt of je door het VeldObject kan door heen lopen
	 * @return is true als je wel door heen kan lopen, false als je niet door heen kan lopen
	 */
	@Override
	public boolean padVrij() {
		return false;
	}
}