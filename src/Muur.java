import javax.swing.*;

public class Muur extends VeldObject {

	public Muur(int rij, int kolom) {
		super(rij , kolom);
		super.setIcon(new JLabel(new ImageIcon("src/icons/muur.png")));
	}
}